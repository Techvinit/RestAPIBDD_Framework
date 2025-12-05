Feature: Validate login API

Scenario Outline: Verify if user is able to login when call login API
  Given Add login request payload with "<userEmail>" "<userPassword>"
  When User call "LoginAPI" with post http request
  Then message is "Login Successfully"

Examples:
     |userEmail         | userPassword |
     |vinit12@gmail.com | Vinit@123    |