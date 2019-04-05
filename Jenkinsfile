#!/usr/bin/env groovy

@Library('lco-shared-libs@0.0.15') _

pipeline {
	agent any
	stages {
		stage('Push image') {
			steps {
				sh 'mvn compile jib:build'
			}
		}
		stage('Deploy snapshot') {
			when {
				not { buildingTag() }
			}
			steps {
				sh '''
					mvn versions:set -DnewVersion=${GIT_BRANCH//\\//-}-SNAPSHOT
					mvn deploy
				'''
			}
		}
		stage('Deploy release') {
			when { buildingTag() }
			steps {
				sh '''
					mvn versions:set -DnewVersion=$(git describe)
					mvn deploy
				'''
			}
		}
	}
	post {
		always { postBuildNotify() }
	}
}
