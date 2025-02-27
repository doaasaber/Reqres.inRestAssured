Feature: Retrieve users from reqresIn

  Scenario Outline: Retrieve all posts and verify the response
    Given the base URL is set
    When user sends a GET request to "<EndPoint>"
    Then the response status code should be "<StatusCode>"
    And validate on response
    And log the response time

    Examples:
      | EndPoint   | StatusCode |
      | api/users/ | 200        |
