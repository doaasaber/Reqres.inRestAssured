Feature: Update user in reqres.in

  Scenario Outline: Update user and verify the response
    Given the base URL is set
    When read data from CSV and send "<row>" "<column1>" "<column2>"
    And the user sends an update request to "<EndPoint>/<UserID>"
    Then the response status code should be "<StatusCode>"
    And the response data should be valid
    And log the response time

    Examples:
      | EndPoint   | row | column1 | column2 | UserID | StatusCode |
      | api/users/ | 0   | 0       | 1       | 2      | 200        |
