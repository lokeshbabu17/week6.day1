Feature: DeleteLead functionality in leaftaps

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
And click on FindLeads
And click on Pnone
Given Enter the number
When click on FindLeads Button

Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|