Feature: User Registration

Scenario: user registration with different data
Given user is on registration page
When user enters following user details
|naveen|automation|nav@gmail.com|6568532|Banglore|
|peter|parker|parker@gmail.com|63258532|Manglore|
|tony|stark|mack@mail.com|6999732|Bali|
Then user registration should be successful


#Scenario: user registration with different data with columns
#Given user is on registration page
#When user enters following user details
#|firstname|lastname|email|phone|city|
#|naveen|automation|nav@gmail.com|6568532|Banglore|
#|peter|parker|parker@gmail.com|63258532|Manglore|
#|tony|stark|mack@mail.com|6999732|Bali|
#Then user registration should be successful