Feature: Login functionality for LeafTaps application
Background: 
Given open the chrome browser
And Load the application url

Scenario Outline: Login using positive credential
And Enter the username as <username>
And Enter the password as <password>
When CLick on Login button
Then Homepage should be displayed
When click on CRMSFA
When click on Leads
And click on FindLeads
And click on Pnone
Given Enter the given number
When click on FindLeads Button
And CLick
And Click on DuplicateLead
And Click on Submit

Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|