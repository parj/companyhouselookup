![CircleCI](https://img.shields.io/circleci/build/github/parj/companyhouselookup) [![DepShield Badge](https://depshield.sonatype.org/badges/parj/companyhouselookup/depshield.svg)](https://depshield.github.io) [![codecov](https://codecov.io/gh/parj/companyhouselookup/branch/master/graph/badge.svg)](https://codecov.io/gh/parj/companyhouselookup) [![Kritika Analysis Status](https://kritika.io/users/parj/repos/6543672415945162/heads/master/status.svg)](https://kritika.io/users/parj/repos/6543672415945162/heads/master/)

[![FOSSA Status](https://app.fossa.com/api/projects/git%2Bgithub.com%2Fparj%2Fcompanyhouselookup.svg?type=large)](https://app.fossa.com/projects/git%2Bgithub.com%2Fparj%2Fcompanyhouselookup?ref=badge_large)

## Introduction

This is a pet project that I have written to integrate with the UK company house -> https://beta.companieshouse.gov.uk/search/companies

## To get this compiled on your PC

### Pre-requisities

You need 

* java 8+ installed 
* API key from company house. This can be obtained from https://developer.companieshouse.gov.uk/api/docs/

### Compilation steps

 * Clone the code
 * Set environment variable - `API_COMPANYHOUSE_KEY` with the api key. Example for Unix - `export API_COMPANYHOUSE_KEY='mylovelykey'`. For Windows - `set API_COMPANYHOUSE_KEY="mylovelykey"`
 * Run `./mvnw package`. 

