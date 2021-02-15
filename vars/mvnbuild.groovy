#!/usr/bin/env groovy

def call(String name) {
node('master') {
				echo 'maven clean'
	bat "mvn -f ${name}/pom.xml clean install"
}
