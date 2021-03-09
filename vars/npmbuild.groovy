#!/usr/bin/env groovy

def call(String name) {
				echo 'npm install'
	bat """ cd s{WORKSPACE}\${name}
		npm install
	  """
}
