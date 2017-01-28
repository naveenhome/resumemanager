Feature: Login 
As a jobseeker I want to login to resumemanager
So that I can see all available jobs for me
Scenario: Valid login using username
Given I have enetered "naveenhome" as username and password is "xyz"
When click on "Login"
Then System display message "Login successful" on "home" page

Scenario: Valid login using username
Given I have enetered "naveenhome" as username and password is "xyz"
When click on "Cancel"
Then System display message do nothing and clear all data

Scenario: Valid login using username
Given I have enetered "naveenhome" as username and password is "abc"
When click on "Login"
Then System display message "Login failed" on "login" page