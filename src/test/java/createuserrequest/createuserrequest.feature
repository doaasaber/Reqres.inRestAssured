Feature: Create new user to reqres.in

  Scenario Outline: Create a new user and verify the response
    Given the base URL is set
    When read data from CSV and send "<row>" "<column1>" "<column2>"
    And the user sends a POST request to "<EndPoint>"
    Then the response status code should be "<StatusCode>"
    And the response data should be valid
    And log the response time

    Examples:
      | EndPoint   | row | column1 | column2 | StatusCode |
      | api/users/ | 0   | 0       | 1       | 201        |
      | api/users/ | 0   | 0       | 1       | 201        |

