#!/usr/bin/env groovy

def call(String name) {
				echo 'npm install'
	cd "${name}"
				bat 'npm install' 
}
