@wip
Feature: US001 Register


  Background: US001 ortak adimlar
    Given Kullanici medunna sayfasina gider
    When Kullanici sag ustte yer alan account ikonuna tiklar
    And Kullanici register butonuna tiklar

  @wip1
  Scenario Outline: TC01 SSN girisleri Positive
    And Kullanici gecerli "<SSN>" girer
    Then Kullanici "<uyari>" yazisinin gorunmedigini test eder
    And sayfayi kapatir.
    Examples:
      | SSN        | uyari |
      | 124-23-555 | SSN   |
      | 124-78-500 | SSN   |
      | 129-73-342 | SSN   |

  @wip2
  Scenario Outline: TC02 SSN girisleri Negative
    And Kullanici gecersiz "<SSN>" girer
    Then Kullanici "<uyari>" yazisinin gorunur oldugunu test eder
    And sayfayi kapatir.
    Examples:
      | SSN          | uyari               |
      | 12423555     | Your SSN is invalid |
      | 124-78500    | Your SSN is invalid |
      | 129-73-34218 | Your SSN is invalid |

    @wip3
    Scenario: TC03 SSN bos birakilamaz
    And Kullanici SSN'i bos biraktiginda Your SSN is invalid. uyarisinin gorunur oldugunu test eder.
