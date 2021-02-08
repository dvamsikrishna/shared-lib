#!/usr/bin/env groovy

def call(String name) {
				echo 'maven clean'
	bat "mvn -f C:\Program Files (x86)\Jenkins\workspace\Shared-lib-Pipeline\git_url/${name}/pom.xml clean install"
}
