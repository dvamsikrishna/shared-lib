#!/usr/bin/env groovy

def call(String name) {
node('master12') {
				echo 'maven clean'
	bat "mvn -f pom.xml clean install"
}
}
