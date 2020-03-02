Feature: Hotel booking functionality in adactin application


Background: 
Given User launch the application 
 And User login the application
 

@login
Scenario: Registration for the New User
Given User launch the adactin application
 When User enter the user name "pratheesh123"
 And User enter the password "sreejaya90"
 Then click the login Button
 
 @hotelsearch
 Scenario: Search Hotel
 When User select the location by using dropdown
 When User select the hotel by using dropdown
 And User select the roomtype by using dropdown
 And User select the Number of room by using dropdown
 And User enter the check in date
 And User enter the Check out date
 And User Select Adultsper roon by using drop down
 And User Select number of childern in room using drop down
 Then User click the searchButton for search
 Then user Click the radio button to confirm booking
 Then User click the continue Button to proceed the hotel booking

 @confirm
 Scenario: User Details to confirm Booking
 When User enter the Firstname,last name and billing address
 And User enter the  Credit Card the detail 
 Then User click the Book now button to confirm the booking