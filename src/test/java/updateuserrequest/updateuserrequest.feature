Feature: Update user in reqresIn

  Scenario Outline: Update user and verify the response
    Given the base URL is set
    When read data from csv file and send them to the request: "<row>" "<column1>" "<column2>"
    And user send a Update request to : "<EndPoint>""<UserID>"
    Then validate on response status code: "<StatusCode>"
    And validate on response data

    Examples:
      | EndPoint  |row |column1|column2| UserID| StatusCode |
      | api/users/|   0|     0 |1      |2     | 200        |