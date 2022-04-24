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


#Feature: Login into Application

#Scenario: Positive test validation login
#Given Initialize the Browser with Chrome
#And Navigated to "https:qaclickacademy.com/" size
#And Click on login link in homepage and land to secure sign in page
#When User enter "test99@gmail.com" and "123456"
#Then Verify the user is successfully logged in

# Feature file template for parametized test

Feature: Login into Application
Scenario Outline: Positive test validation login
Given Initialize the Browser with Chrome
And Navigated to "https:qaclickacademy.com/" size
And Click on login link in homepage and land to secure sign in page
When User enter <username> and <password>
Then Verify the user is successfully logged in

Examples:
|username             |password |
|test99@gmail.com     |123456   | 
|test20@gmail.com     |600000   |




 

 

