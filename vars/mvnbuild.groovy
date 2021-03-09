#!/usr/bin/env groovy

def call(String name) {
node('master') {
				echo 'maven clean'
	bat """
	cd "C:\\Program Files (x86)\\Jenkins\\workspace\\Shared-lib-Pipeline\\git_url"
	mvn -f pom.xml clean install"
}
}
