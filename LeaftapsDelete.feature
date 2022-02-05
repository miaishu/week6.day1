Feature: LeafTaps TestCase
Background:
#Launch the Browser
#Get URL
Given Enter Username as 'demosalesmanager'
Given Enter Password as 'crmsfa'
Then Click on Login
And Click on 'CRM/SFA'
@DeleteLead
Scenario Outline: TC_01 DeleteLead Positive
When Verify 'My Home' page
Then Click on 'Leads'
When Verify 'My Leads' page
Then Click on 'Find Leads'
When Verify 'Find Leads' page
Then Click Phone
Given Enter "<mobno>"
Then Click 'Find Leads'

And Get the id
And Click first data
And Click on 'Delete'
And Click on 'Find Leads'
When Enter LeadID no
And Click 'Find Leads'
Then Verify 'No records to display'

Examples:
|mobno|
|99|