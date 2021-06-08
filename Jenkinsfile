pipeline {
    agent any
    /* insert Declarative Pipeline here */
    stages {
        stage('run-test') {
            /* when {
                anyOf {
                    branch 'master'
                    branch 'dev'
                }
            } */
            stage('sonarqube-analysis'){
                environment {
                    SONAR_TOKEN = credentials('sonarqube_token')
                }
                steps {
                    sh '''./gradlew sonarqube \
                        -Dsonar.projectKey=D0611181_homework_7_3 \
                        -Dsonar.host.url=http://140.134.26.54:10990 \
                        -Dsonar.login=$SONAR_TOKEN
                    '''
                }

            }
            steps {
                sh 'chmod +x ./gradlew'
                sh './gradlew test'
                jacoco(
                    classPattern: 'app/build/classes',
                    inclusionPattern: '**/*.class',
                    exclusionPattern: '**/*Test*.class',
                    execPattern: 'app/build/jacoco/**/*.exec'
                )
            }
        }
    }
}