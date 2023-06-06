@All
Feature: User Booking Feature

@Smoke
Scenario: Booking Cab Sedan
Given User wants to select a car type "sedan" from uber app
When User select car "sedan" & pick up point "Banglore" & drop location "Pune"
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD

@Regression
Scenario: Booking Cab SUV
Given User wants to select a car type "SUV" from uber app
When User select car "SUV" & pick up point "Banglore" & drop location "Hyderabad"
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD

@Functional
Scenario: Booking Cab Mini
Given User wants to select a car type "Mini" from uber app
When User select car "Mini" & pick up point "Mumbai" & drop location "Pune"
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD
