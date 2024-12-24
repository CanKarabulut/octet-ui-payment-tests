Feature: Octet Payment Check Tests

  Background:
    Given Select Browser As "chrome"
    When User get "https://testotomasyon.octet.com.tr/giris" address
    And The user fills in the email and password fields and clicks the continue button.
    And The user fills TFA code and click confirm button

    @Test
    Scenario: Payment Check
    Then The user first defines a POS, if membership information is not received, defines a bank.
      | Ad         | Açıklama      | Veri Tipi | Parametre Tipi | Sıra İndex'i |
      | Test Banka | Bank Name     |  Metin    | Görünür        | 1            |
      | Password   | Password Desc | Şifre     | Görünür        | 2            |
      | ClientId   | Client ID     | Sayı      | Görünür        | 3            |
      | Date       |  Date         | Tarih     | Görünür        | 4            |
    And By entering POS information, the user determines the installment commission rate for individual cards and commercial cards, starting from tomorrow.
    And The user selects a card information and attempts to make payment.