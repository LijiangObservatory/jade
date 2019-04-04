#!/usr/bin/env groovy

@Library('lco-shared-libs@0.0.15') _

pipeline {
	agent any
	stages {
		stage('Deploy snapshot') {
			steps {
				sh 'mvn -DnewVersion=${GIT_BRANCH} && mvn deploy'
			}
		}
		stage('Deploy release') {
			when {
				buildingTag()
			}
			steps {
				sh 'mvn -DnewVersion=$(git describe) && mvn deploy'
			}
		}
	}
	post {
		always { postBuildNotify() }
	}
}
