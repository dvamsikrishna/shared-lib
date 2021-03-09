#!/usr/bin/env groovy

def call(String name) {
				echo 'npm install'
	cd "${WORKSPACE}/git_url"
				bat 'npm install' 
}
