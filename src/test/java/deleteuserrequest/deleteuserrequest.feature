Feature: Delete a created user from reqres.in

  Scenario Outline: Delete a created user and verify the response
    Given the base URL is set
    When the user sends a POST request to "<EndPoint>"
    And the user sends a DELETE request to "<EndPoint>/<UserId>"
    Then the response status code should be "<StatusCode>"
    And log the response time

    Examples:
      | EndPoint   | UserId | StatusCode |
      | api/users/ | 2      | 204        |
