Feature: LeafTaps TestCase
Background:
#Launch the Browser
#Get URL
Given Enter Username as 'demosalesmanager'
Given Enter Password as 'crmsfa'
Then Click on Login
And Click on 'CRM/SFA'


@EditLead
Scenario Outline: TC_01_EditLead_Positive
When Verify 'My Home' page
Then Click on 'Leads'
When Verify 'My Leads' page
Then Click on 'Find Leads'
When Verify 'Find Leads' page
Then Click Phone
Given Enter "<mobno>"
Then Click on 'Find Leads'
Then Click first data
And Click on 'Edit'
And Clear companyName
And Update companyName "<cname>"
And Click the submitButton
And Verify

Examples:
|mobno|cname|
|99|Valero|
|12345|CTS|

