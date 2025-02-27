Feature: Create new user to reqres.in

  Scenario Outline: Create new user and verify the response
    Given the base URL is set
    When read data from CSV and send "<row>" "<column1>" "<column2>"
    And send a POST request to "<EndPoint>"
    Then validate response status code "<StatusCode>"
    And validate response data
    And log response time

    Examples:
      | EndPoint   | row | column1 | column2 | StatusCode |
      | api/users/ | 0   | 0       | 1       | 201        |
      | api/users/ | 0   | 0       | 1       | 201        |
