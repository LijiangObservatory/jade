#!/usr/bin/env groovy

@Library('lco-shared-libs@0.0.15') _

pipeline {
	agent any
	stages {
		stage('Deploy') {
			steps {
				sh 'mvn clean deploy'
			}
		}
	}
	post {
		always { postBuildNotify() }
	}
}
