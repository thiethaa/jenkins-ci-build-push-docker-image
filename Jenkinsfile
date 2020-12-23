node {
    stage('clone git project') {
        git 'https://github.com/thiethaa/jenkins-ci-build-push-docker-image.git'
    }

    stage('maven build docker image') {
        def MAVEN_HOME = ''
// specified Maven HOME directory by typing $ which mvn on the Command line and specified the path to def MAVEN_HOME
// or using pipeline syntax "tool" like ex below:
        MAVEN_HOME = tool name: 'Maven', type: 'maven'
        sh "${MAVEN_HOME}/bin/mvn clean install"
    }

   stage('Build image') {
// specified Docker HOME directory by typing $ which docker on the Command line and specified the path to def docker_home:
//         def docker_home = '/usr/local/bin/docker'
// or using "tool" pipeline syntax:
         def docker_home = ''
         docker_home = tool name: 'Docker', type: 'dockerTool'
        sh """
            echo "initializing..."
            echo "login to docker"
            ${docker_home}/bin/docker login
            ${docker_home}/bin/docker build -t jenkins-ci-build-push-docker-image .
            ${docker_home}/bin/docker tag jenkins-ci-build-push-docker-image thiethaa/jenkins-ci-build-push-docker-image:v.jenkinsfile
            ${docker_home}/bin/docker push thiethaa/jenkins-ci-build-push-docker-image:v.jenkinsfile
        """
    }
}

