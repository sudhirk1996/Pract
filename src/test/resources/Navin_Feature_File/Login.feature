Feature: Login feature

Scenario Outline: Login fail - possible combination
Given user is on login page
When user clicks on sign in button
Then user is displyed login screen
When user enters "<UserName>" in username field
And user enters "<Password>" in password field
And user clicks on sign in button
Then user gets login failed error message

Examples: 
|UserName					|Password					|
|incorrectusername|133456						|
|naveenauomation	|incorrectpassword|
|incorrectusername|incorrectpassword|

