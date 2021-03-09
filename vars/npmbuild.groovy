#!/usr/bin/env groovy

def call(String name) {
				echo 'npm install'
				bat 'npm ${WORKSPACE}/${name}/package.json/install' 
}
