Feature: Delete a created user from reqres.in

  Scenario Outline: Delete a created user and verify the response
    Given the base URL is set
    When send a POST request to "<EndPoint>"
    And the user sends a DELETE request to "<EndPoint>" "<UserId>"
    Then validate response status code "<StatusCode>"
    And log response time

    Examples:
      | EndPoint   | UserId | StatusCode |
      | api/users/ | 2      | 204        |
