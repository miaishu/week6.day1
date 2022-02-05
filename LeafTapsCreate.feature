Feature: LeafTaps TestCase

Background:
#Launch the Browser
#Get URL
Given Enter Username as 'demosalesmanager'
Given Enter Password as 'crmsfa'
Then Click on Login
And Click on 'CRM/SFA'


@CreateLead
Scenario Outline: TC01_CreateLead_Positive
When Verify 'My Home' page
Then Click on 'Leads'
When Verify 'My Leads' page
Then Click on 'Create Lead'
When Verify 'Create Lead' page
When Enter Companyname "<cname>"
When Enter Firstname "<fname>"
When Enter Lastname "<lname>"
When Click on Submit

Examples:

|cname|fname|lname|
|Apple|Connie|Lin|
