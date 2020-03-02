$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel booking functionality in adactin application",
  "description": "",
  "id": "hotel-booking-functionality-in-adactin-application",
  "keyword": "Feature"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User login the application",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition1.user_launch_the_application()"
});
formatter.result({
  "duration": 138477500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.user_login_the_application()"
});
formatter.result({
  "duration": 238900,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Registration for the New User",
  "description": "",
  "id": "hotel-booking-functionality-in-adactin-application;registration-for-the-new-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "User launch the adactin application",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "User enter the user name \"pratheesh123\"",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User enter the password \"sreejaya90\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "click the login Button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_launch_the_adactin_application()"
});
formatter.result({
  "duration": 1855800,
  "error_message": "java.lang.NullPointerException\r\n\tat com.adactin.baseclass.Baseclass.geturl(Baseclass.java:54)\r\n\tat com.adactin.stepdefinition.StepDefinition.user_launch_the_adactin_application(StepDefinition.java:25)\r\n\tat ✽.Given User launch the adactin application(Adactin.feature:11)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "pratheesh123",
      "offset": 26
    }
  ],
  "location": "StepDefinition.user_enter_the_user_name(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "sreejaya90",
      "offset": 25
    }
  ],
  "location": "StepDefinition.user_enter_the_password(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.click_the_login_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User login the application",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition1.user_launch_the_application()"
});
formatter.result({
  "duration": 413900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.user_login_the_application()"
});
formatter.result({
  "duration": 214500,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Search Hotel",
  "description": "",
  "id": "hotel-booking-functionality-in-adactin-application;search-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@hotelsearch"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "User select the location by using dropdown",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "User select the hotel by using dropdown",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "User select the roomtype by using dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User select the Number of room by using dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User enter the check in date",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User enter the Check out date",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User Select Adultsper roon by using drop down",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User Select number of childern in room using drop down",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "User click the searchButton for search",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "user Click the radio button to confirm booking",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "User click the continue Button to proceed the hotel booking",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition1.user_select_the_location_by_using_dropdown()"
});
formatter.result({
  "duration": 56822700,
  "error_message": "java.lang.NullPointerException\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy16.getTagName(Unknown Source)\r\n\tat org.openqa.selenium.support.ui.Select.\u003cinit\u003e(Select.java:45)\r\n\tat com.adactin.baseclass.Baseclass.selectOption(Baseclass.java:230)\r\n\tat com.adactin.stepdefinition.StepDefinition1.user_select_the_location_by_using_dropdown(StepDefinition1.java:36)\r\n\tat ✽.When User select the location by using dropdown(Adactin.feature:18)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinition1.user_select_the_hotel_by_using_dropdown()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition1.user_select_the_roomtype_by_using_dropdown()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition1.user_select_the_Number_of_room_by_using_dropdown()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition1.user_enter_the_check_in_date()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition1.user_enter_the_Check_out_date()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition1.user_Select_Adultsper_roon_by_using_drop_down()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition1.user_Select_number_of_childern_in_room_using_drop_down()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition1.user_click_the_searchButton_for_search()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition1.user_Click_the_radio_button_to_confirm_booking()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition1.user_click_the_continue_Button_to_proceed_the_hotel_booking()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User login the application",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition1.user_launch_the_application()"
});
formatter.result({
  "duration": 69300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.user_login_the_application()"
});
formatter.result({
  "duration": 200000,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "User Details to confirm Booking",
  "description": "",
  "id": "hotel-booking-functionality-in-adactin-application;user-details-to-confirm-booking",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 30,
      "name": "@confirm"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "User enter the Firstname,last name and billing address",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "User enter the  Credit Card the detail",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "User click the Book now button to confirm the booking",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition3.user_enter_the_Firstname_last_name_and_billing_address()"
});
formatter.result({
  "duration": 3110300,
  "error_message": "java.lang.NullPointerException\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy16.sendKeys(Unknown Source)\r\n\tat com.adactin.baseclass.Baseclass.inputValueElement(Baseclass.java:153)\r\n\tat com.adactin.stepdefinition.StepDefinition3.user_enter_the_Firstname_last_name_and_billing_address(StepDefinition3.java:30)\r\n\tat ✽.When User enter the Firstname,last name and billing address(Adactin.feature:32)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefinition3.user_enter_the_Credit_Card_the_detail()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition3.user_click_the_Book_now_button_to_confirm_the_booking()"
});
formatter.result({
  "status": "skipped"
});
});