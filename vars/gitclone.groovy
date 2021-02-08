#!/usr/bin/env groovy

def call(String reponame ) {
dir ('git_url'){
				git( url: "${reponame}", credentialsid: 'gitaccess', branch: 'master') 
        }
}
