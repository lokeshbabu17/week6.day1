Feature: CreateLead functionality in leaftaps

Background: 
Given open the chrome browser
And Load the application url

Scenario Outline: Login using mandatory credential
And Enter the username as <username>
And Enter the password as <password>
When CLick on Login button
Then Homepage should be displayed
When click on CRMSFA
When click on Leads
When click  on create lead
Given type company name
Given type first name 
And type last name
When click create lead button
Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|