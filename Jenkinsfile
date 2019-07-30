#!/usr/bin/env groovy

@Library('lco-shared-libs@0.0.15') _

pipeline {
	agent any
	stages {
		stage('Build') {
			steps {
				sh 'mvn compile'
			}
		}
		stage('Update pom.xml version ') {
			when { buildingTag() }
			steps {
				// TODO: Get the current git tag and update the pom.xml
				sh ':'
			}
		}
		stage('Deploy') {
			steps {
				sh 'mvn deploy'
			}
		}
	}
	post {
		always { postBuildNotify() }
	}
}
