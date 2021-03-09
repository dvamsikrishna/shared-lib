#!/usr/bin/env groovy

def call(String name) {

				echo 'maven clean'
	bat """
	cd "${WORKSPACE}\\git_url"
	mvn clean install
	"""
}
