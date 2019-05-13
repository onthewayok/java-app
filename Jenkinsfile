pipeline{
    agent {label 'Master'}
    tools{
        maven 'maven-3.5.2'
    }
    stages{
        stage("Initialize"){
            steps{
                sh '''
                    echo "PATH=${PATH}"
                    echo "MAVEN_HOME=${MAVEN_HOME}"
                '''
            }
        }
        stage("Clone source code"){
            steps{
                git 'https://github.com/wangwenjun/java-app.git'
            }
        }
        stage("check style"){
            steps{
                sh 'mvn checkstyle:checkstyle'
            }
        }
        stage("pmd"){
            steps{
                sh 'mvn pmd:check'
            }
        }
        stage("Build"){
            steps{
                sh 'mvn clean package -P prod'
            }
            post{
                success{
                    junit '**/target/surefire-reports/*.xml'
                }
            }
        }
    }

    post{
        failure{
            script{
                currentBuild.result ='FAILURE'
            }
        }
        always{
            step([$class: 'Mailer',
                notifyEveryUnstableBuild: true,
                recipients: "wangwenjun0609@sina.cn",
                sendToIndividuals: true])
        }
    }
}