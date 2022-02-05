Feature: LeafTaps TestCase
Background:
#Launch the Browser
#Get URL
Given Enter Username as 'demosalesmanager'
Given Enter Password as 'crmsfa'
Then Click on Login
And Click on 'CRM/SFA'


@MergeLead
Scenario: TC_01_MergeLead_Positive
When Verify 'My Home' page
Then Click on 'Leads'
Then Click on 'Merge Leads'
When Verify 'Merge Leads' page
When Go to Lookup Table from lead
Then Search the FirstName as 'Hari'
Then Click Find Leads
And Select the first row 
When Go to Lookup Table to lead
Then Search the MergeName as 'is' 
And Click Find Leads
And Select the first row  
Then Click on 'Merge'
Then Click on Popup Alert
And Verify the FirstName in ViewLead

