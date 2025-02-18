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
            }
        }

        stage('OHRM-SanityTest') {
            steps {
                bat "mvn -f ${ROOT_POM} clean test -D xmlSuiteFileName=SanityTest.xml"
            }
        }

        stage('OHRM-RegressionTest') {
            steps {
                bat "mvn -f ${ROOT_POM} clean test -D xmlSuiteFileName=RegressionTest.xml"
            }
        }
    }
}
