pipeline {
  environment {
    dockerImage = ''
    registry = "thiethaa/jenkins-ci-build-push-docker-image"
    registryCredential = 'dockerHub'
  }
  agent any
  stages {
    stage('Cloning Git') {
      steps {
        git 'https://github.com/thiethaa/jenkins-ci-build-push-docker-image.git'
      }
    }
    stage('Building image') {
      steps{
        script {
          dockerImage = docker.build registry + ":$BUILD_NUMBER"
        }
      }
    }

//     stage('Deploy Image') {
//       steps{
//         script {
//           docker.withRegistry( '', registryCredential ) {
//             dockerImage.push()
//           }
//         }
//       }
//     }
