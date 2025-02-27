Feature: Update user in reqresIn

  Scenario Outline: Update user and verify the response
    Given the base URL is set
    When read data from CSV and send "<row>" "<column1>" "<column2>"
    And user send a Update request to  "<EndPoint>" "<UserID>"
    Then validate response status code "<StatusCode>"
    And validate response data
    And log response time


    Examples:
      | EndPoint  |row |column1|column2| UserID| StatusCode |
      | api/users/|   0|     0 |1      |2      | 200        |