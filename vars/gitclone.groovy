#!/usr/bin/env groovy

def call(String reponame, String branch) {
dir ('git_url'){
				git( url: "${reponame}", credentialsid: 'gitaccess', branch: "${branch}") 
        }
}
