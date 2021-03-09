#!/usr/bin/env groovy

def call(String name) {
				echo 'npm install'
	bat """ 
	cd "C:\Program Files (x86)\Jenkins\workspace\Shared-lib-Pipeline\git_url"
		npm install
	  """
}
