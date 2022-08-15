#language: en
Feature: Entrar en adidas y buscar 3 productos desde Excel

 Scenario Outline: Buscar producto desde Excel
    Given que me encuentro en adidas https://www.adidas.co/
    When quiero comprar productos<Validar>
    Then selecciono una lista de productos<Validar>
    Examples:
      | Validar |
      | BOLSOS  |
      | FÚTBOL  |
      | MEDIAS  |
