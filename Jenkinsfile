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
        //withDockerRegistry(credentialsId: 'dockerHub', toolName: 'Docker', url: 'docker.io') {
        def docker_home = '/usr/local/bin/docker'
        sh """
            echo "initializing..."
            echo "login to docker"
            ${docker_home} login
            ${docker_home} build -t jenkins-ci-build-push-docker-image .
            ${docker_home} tag jenkins-ci-build-push-docker-image thiethaa/jenkins-ci-build-push-docker-image:v.jenkinsfile
            ${docker_home} push thiethaa/jenkins-ci-build-push-docker-image:v.jenkinsfile
        """
        //}
    }
}

