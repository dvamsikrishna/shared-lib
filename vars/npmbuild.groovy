#!/usr/bin/env groovy

def call(String name) {
				echo 'npm install'
				bat ' cd ${WORKSPACE}/${name}; npm install' 
}
