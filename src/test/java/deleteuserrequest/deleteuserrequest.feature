Feature: Delete created user to reqresIn

  Scenario Outline: Delete created user and verify the response
    Given the base URL is set
    When send a POST request to "<EndPoint>"
    And user send a Delete request to  "<EndPoint>""<UserId>"
    Then validate response status code "<StatusCode>"
    And validate on response
    And log response time


    Examples:
      | EndPoint   |UserId | StatusCode|
      | api/users/ |2     | 204        |