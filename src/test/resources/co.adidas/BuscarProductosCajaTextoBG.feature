#language: en

Feature:  Busqueda de 3 productos en la caja de texto de Adidas

  Background:
    Given que me encuentro en adidas https://www.adidas.co/

  Scenario: Buscar tenis HARDEN en la caja de texto
    When quiero buscar el producto
      | producto |
      | HARDEN   |
    Then valido el producto
      | validar |
      | HARDEN  |

  Scenario: Buscar Medias en la caja de texto
    When quiero buscar el producto
      | producto |
      | MEDIAS   |
    Then valido el producto
      | validar |
      | MEDIAS  |

  Scenario: Buscar tenis Running en la caja de texto
    When quiero buscar el producto
      | producto |
      | RUNNING  |
    Then valido el producto
      | validar |
      | RUNNING |