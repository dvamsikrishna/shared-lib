#!/usr/bin/env groovy

def call(String name) {
				echo 'maven clean'
	bat "mvn -f ${WORKSPACE}/${name}/pom.xml clean install"
}
