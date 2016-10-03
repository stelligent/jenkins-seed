# Overview
This project contains Jenkins Job DSL for defining the jobs.  For more information on the available DSL syntax, check out [API Viewer](https://jenkinsci.github.io/job-dsl-plugin/)

# Use

* Install `Job DSL` Jenkins plugin
* Create a new job with the Git SCM of this repo and a step to `Process Job DSLs` with `Look on Filesystem` and `DSL Scripts` set to `jobs/*_job.groovy`