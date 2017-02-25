Feature: Verifying few first values for Fibonacci sequence

  Scenario: Check corner case for 0
    Given number is 0
    Then value is 0

  Scenario Outline: Verify values for few first numbers
    Given number is <num>
    Then value is <value>
    Examples:
      | num | value |
      | 0   | 0     |
      | 1   | 1     |
      | 2   | 1     |
      | 3   | 2     |
      | 4   | 3     |
      | 5   | 5     |
      | 6   | 8     |