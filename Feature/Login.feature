Feature: Login
#Background: SetUp
#Given User launch required brawser
#And User opens portal "https://admin-demo.nopcommerce.com/"


#Scenario: User should successful login with valid credentials with Background function
#Given User launch required brawser
#And User opens portal "https://admin-demo.nopcommerce.com/"
#When User add email "admin@yourstore.com" & password "admin"
#Then Login pagetitle capture by user
#And User hit the login button
#And Dashboard pagetitle capture by user
#And User click the logout button


Scenario Outline: User should successful login with valid credentials
Given User launch required brawser
And User opens portal "<portal>"
When User add email "<email>" & password "<password>"
Then Login pagetitle capture by user
And User hit the login button
And Dashboard pagetitle capture by user
And User click the logout button

Examples: 

|email|password|portal|
|abc@gmail.com|abcde|https://admin-demo.nopcommerce.com/|
|admin@yourstore.com|admin|https://admin-demo.nopcommerce.com/|

#@BddCucumberP1
#Scenario: User should successful login with valid credentials with dataTable
#Given User launch required brawser
#And User opens portal "https://admin-demo.nopcommerce.com/"
#When User add email & password
#|admin@yourstore.com|
#|admin|
#Then Login pagetitle capture by user
#And User hit the login button
#And Dashboard pagetitle capture by user
#And User click the logout button

