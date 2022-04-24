#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template


Feature: Application Login

#Scenario: Home page default login
#Given User is on landing page
#When  User log into application using username and password
#Then Home page is populated
#And Cards are displayed

Scenario: Home page default login
Given User is on landing page
When User log into application with username "Jim" and password "1234"
Then Home page is populated
And Cards displayed are "true"


Scenario: Home page default login
Given User is on landing page
When User log into application with username "John" and password "5678"
Then Home page is populated
And Cards displayed are "false"

 

 

