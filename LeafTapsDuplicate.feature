Feature: LeafTaps TestCase
Background:
#Launch the Browser
#Get URL
Given Enter Username as 'demosalesmanager'
Given Enter Password as 'crmsfa'
Then Click on Login
And Click on 'CRM/SFA'


@DuplicateLead
Scenario: TC_01 DuplicateLead Positive
When Verify 'My Home' page
Then Click on 'Leads'
When Verify 'My Leads' page
Then Click on 'Find Leads'
When Verify 'Find Leads' page
Then Click Phone
Given Enter "<mobno>"
Then Click on 'Find Leads'
Then Click first data
When Click on 'Duplicate Lead'
Then Click the submitButton

|mobno|
|012|