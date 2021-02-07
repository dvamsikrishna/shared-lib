#!/usr/bin/env groovy

def call(String name = 'maven') {
				echo 'maven clean'
				bat ' mvn -f pom.xml clean install' 
}
