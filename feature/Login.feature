Feature: Login functionality for LeafTaps application
Background: 
Given open the chrome browser
And Load the application url

Scenario Outline: Login using positive credential
And Enter the username as <username>
And Enter the password as <password>
When CLick on Login button
Then Homepage should be displayed

Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|
#|'DemoCSR'|'crmsfa'|
#
#Scenario: Login using negative credential
#And Enter the username as 'Demo'
#And Enter the password as 'crmsfa'
#When CLick on Login button