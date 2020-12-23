node {
    stage('Clone Git Project') {
        git 'https://github.com/thiethaa/jenkins-ci-build-push-docker-image.git'
    }

    stage('Maven Build Install') {
        def MAVEN_HOME = ''
// specified Maven HOME directory by typing $ which mvn on the Command line and specified the path to def MAVEN_HOME
// or using pipeline syntax "tool" like ex below:
        MAVEN_HOME = tool name: 'Maven', type: 'maven'
        sh "${MAVEN_HOME}/bin/mvn clean install"
    }

   stage('Build Docker Image') {
// specified Docker HOME directory by typing $ which docker on the Command line and specified the path to def docker_home:
 //       def docker_home = '/usr/local/bin/docker'
// or using "tool" pipeline syntax:
        def DOCKER_HOME = tool name: 'Docker', type: 'dockerTool'
        def DOCKER_NAME = 'jenkins-ci-build-push-docker-image'
        def DOCKER_VERSION = 'v.jenkinsfile.6.0'
        sh """
            echo "login to docker"
            ${DOCKER_HOME} login
            ${DOCKER_HOME} build -t jenkins-ci-build-push-docker-image .
            ${DOCKER_HOME} tag jenkins-ci-build-push-docker-image thiethaa/${DOCKER_NAME}:${DOCKER_VERSION}
            ${DOCKER_HOME} push thiethaa/${DOCKER_NAME}:${DOCKER_VERSION}
        """
    }
}

