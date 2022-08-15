#language: en
Feature:  Busqueda de 5 productos en la caja de texto de Adidas

  Scenario Outline: <Caso><Producto>
    Given que me encuentro en adidas <url>
    When quiero buscar producto en la caja de texto <Producto>
    Then encuentro el producto <Validar>

    Examples:
      | Caso            | Producto   | url                    | Validar    |
      | Buscar producto | BOLSOS     | https://www.adidas.co/ | BOLSOS     |
      | Buscar producto | TENNIS     | https://www.adidas.co/ | TENNIS     |
      | Buscar producto | FÚTBOL     | https://www.adidas.co/ | FÚTBOL     |
      | Buscar producto | MEDIAS     | https://www.adidas.co/ | MEDIAS     |
      | Buscar producto | STAN SMITH | https://www.adidas.co/ | STAN SMITH |