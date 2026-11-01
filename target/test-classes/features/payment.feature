
@Reg
Feature: Verify Payement Functionality 


Scenario: Verify payment with valid pament 

Given user lanch site Url
When user navigate to payment page 
And user enterd valid payment 
And  user enterd valid amount 
And user entered valid passcode 
Then payment has been transfered Succesfully 




