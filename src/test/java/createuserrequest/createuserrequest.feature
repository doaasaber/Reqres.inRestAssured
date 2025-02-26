Feature: Create new user to reqresIn

  Scenario Outline: Create new user and verify the response
    Given the base URL is set
    When read data from csv file and send them to the request: "<row>" "<column1>" "<column2>"
    And user send a POST request to : "<EndPoint>"
    Then validate on response status code: "<StatusCode>"
    And validate on response data
    And logging response time

    Examples:
      | EndPoint  |row |column1| column2  | StatusCode |
      | api/users/|0   | 0     |   1      | 201        |
      | api/users/|0   | 0     |   1      | 201        |





