Feature: Validate login API

Scenario Outline: Verify if user is able to login when call login API
  Given Add login request payload
  When User call login API with post http request
  Then message is "Login Successfully"