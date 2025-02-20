pipeline {
    agent any

    environment {
        REPO_URL = 'https://github.com/mindfirePS/JenkinsSeleniumAutomationProject.git'
        BRANCH = 'main'
        ROOT_POM = 'JenkinsSeleniumAutomationProject/pom.xml'
    }

    triggers {
        pollSCM('H/2 * * * *')
    }

    stages {
        stage('Checkout Code') {
            steps {
                git branch: BRANCH, url: REPO_URL
            }
        }

        stage('OHRM-SmokeTest') {
            steps {
                bat "mvn -f ${ROOT_POM} clean test -D xmlSuiteFileName=SmokeTest.xml"
                slackSend channel: 'jenkins_job_notification', message: 'Smoke Test Started'
            }
        }

        stage('OHRM-SanityTest') {
            steps {
                bat "mvn -f ${ROOT_POM} clean test -D xmlSuiteFileName=SanityTest.xml"
                slackSend channel: 'jenkins_job_notification', message: 'Sanity Test Started'
            }
        }

        stage('OHRM-RegressionTest') {
            steps {
                bat "mvn -f ${ROOT_POM} clean test -D xmlSuiteFileName=RegressionTest.xml"
                slackSend channel: 'jenkins_job_notification', message: 'Regression Test Started'
            }
        }
    }
    post{
        always{
            echo "========always========"
        }
        success{
            echo "========pipeline executed successfully ========"
             slackSend channel: 'jenkins_job_notification', message: 'Success'
        }
        failure{
            echo "========pipeline execution failed========"
             slackSend channel: 'jenkins_job_notification', message: 'Job Failed'
        }
    }
}
