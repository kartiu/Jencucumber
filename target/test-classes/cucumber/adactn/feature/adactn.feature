Feature: User able to book the hotel via adactinhotel 
Scenario: User can be able login the login page
Given User invoke the adactin hotel page
And user enter the username in texbox field
And user enter the password in textbox field
Then The login page navigate to the Search hotel page
 
Scenario: To check The Search Hotel Functionality
When User can able to pick desired location
And User can able to pick the Hotel
And User can able to pick the Room Type
And User can able to pick the Number of rooms
And User can able to send the check in date
And User can able to send the valid Check out date
And User can able to select adults per room
And User can able to select childrens per room
Then User can navigate to selected hotel page

Scenario: To check The Select Hotel Functionality
When user able to select the selected Hotel
Then user can navigate to book hotel page

Scenario: To check Book hotel page Functionality
And user can be able to send firstname and lasename
And user can be able to send billing address
And user can be able to send valid credit card details
And user can be able to send valid credit card type
And user can be able to send valid card expiry date and month
And user can be able to send valid ccv number
Then user can be able to navigate to Booking confirmation page

Scenario: to check the booking confirmation page functionality
And user can be able to select myitnery
Then user can able to navigate the Booked Itinerary page and logout


