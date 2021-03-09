#!/usr/bin/env groovy

def call(String reponame, String branch) {

				git( url: "${reponame}", branch: "${branch}") 
       
}
