#!/usr/bin/env groovy

def call(String name) {
				echo 'npm install'
	bat """
	cd "${WORKSPACE}\\git_url"
	npm install
	"""
}
