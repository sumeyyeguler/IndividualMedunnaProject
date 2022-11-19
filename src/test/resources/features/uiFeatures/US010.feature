Feature: US010 Doktor (Physician) randevulari

  Background: US010_ortak_adimlar
    Given Kullanici medunna sayfasina gider
    When Kullanici sag ustte yer alan account ikonuna tiklar
    And Kullanici signin butonuna tiklar
    And Kullanici Doktor olarak gecerli username girer
    And Kullanici Doktor olarak gecerli password girer
    And Kullanici Login icin signin butonuna tiklar
    And 3 sn beklenir.
    Then Kullanici basarili hesap girisi oldugunu dogrular
    And Kullanici  MY Pages'e tiklar
    And Kullanici MY Appointments'e tiklar

  Scenario: TC001 Doktor, randevu listesini ve zaman dilimlerini "My Appointments" sekmesinden gorebilmelidir.
    Then Kullanici randevu listesinin gorunur oldugunu test eder
    Then Kullanici zaman dilimlerinin gorunur oldugunu test eder
    And 3 sn beklenir.
    And sayfayi kapatir.

  Scenario: TC002 Doktor, "patient id, start date, end date, status" bilgilerini gorebilmeli
    Then Kullanici patient id, start date, end date, status bilgilerini gorunur oldugunu test eder
    And 3 sn beklenir
    And sayfayi kapatir.