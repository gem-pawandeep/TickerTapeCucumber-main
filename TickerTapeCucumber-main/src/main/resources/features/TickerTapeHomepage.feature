Feature: TickerTapeHomepage

  Scenario Outline:Launch Tickertape and search for <STOCK>

    Given Search Stock in the search box <Stock>
    Then Verify If its Stock Type
    Then Click on It
    Then Show the analytic for one day
    Then Show the analytic for one Week
    Then Show the analytic for one Month
    Then Show the analytic for one year
    Then Show the analytic for five year

    Examples:
      | Stock    |
      | TCS      |
      | wipro    |
      | niit     |
      | sbin     |
      | reliance |






