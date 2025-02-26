Feature: Delete created user to reqresIn

  Scenario Outline: Delete created user and verify the response
    Given the base URL is set
    When user send a POST request to : "<EndPoint>"
    And user send a Delete request to : "<EndPoint>""<UserId>"
    Then validate on response status code: "<StatusCode>"
    And validate on response

    Examples:
      | EndPoint   |UserId | StatusCode|
      | api/users/ |2     | 204        |