node {
    stage('clone git project') {
        git 'https://github.com/thiethaa/jenkins-ci-build-push-docker-image.git'
    }

    stage('maven build docker image') {
        def MAVEN_HOME = ''
        MAVEN_HOME = tool name: 'Maven', type: 'maven'
        sh "${MAVEN_HOME}/bin/mvn clean install"
    }

   stage('Build image') {
        sh """
            echo "initializing..."
            echo "login to docker"
            docker login
            docker build -t jenkins-ci-build-push-docker-image .
            docker tag jenkins-ci-build-push-docker-image thiethaa/jenkins-ci-build-push-docker-image:v.jenkinsfile
            docker push thiethaa/jenkins-ci-build-push-docker-image:v.jenkinsfile
        """
    }
}

