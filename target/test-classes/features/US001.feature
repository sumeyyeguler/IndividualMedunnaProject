@wip
Feature: US001 Register


  Background: US001 ortak adimlar
    Given Kullanici medunna sayfasına gider
    When Kullanici sag ustte yer alan account ikonuna tiklar
    And Kullanici register butonuna tiklar


  Scenario Outline: TC01 SSN girisleri Positive
    And Kullanici gecerli "<SSN>" girer
    Then Kullanici "<uyari>" yazisinin gorunmedigini test eder
    Examples:
      | SSN        | uyari |
      | 124-23-555 |       |
      | 124-78-500 |       |
      | 129-73-342 |       |

  Scenario Outline: TC02 SSN girisleri Negative
    And Kullanici gecersiz "<SSN>" girer
    Then Kullanici "<uyari>" yazisinin gorunur oldugunu test eder
    Examples:
      | SSN         | uyari                 |
      | 12423555    | Your SSN is required. |
      | 124-78500   | Your SSN is required. |
      | 129-73-3421 | Your SSN is required. |
