Feature: Checking the Registration
 
@RegisterAccount
Scenario: Register an user in Para Bank
 
Given User in the Register Page
When  User clicks Register option
And   User enters firstname,lastname,address,city,state,zipcode,Phone,ssn
And   User enters Username,password and Confirm-Password
And   User clicks Register button
Then  User able to see login page and able to logout account
 