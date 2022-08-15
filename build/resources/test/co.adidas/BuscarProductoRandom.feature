#language: en

Feature:  Busqueda de producto aleatorio en la caja de texto de Adidas

  Background:
    Given que me encuentro en adidas https://www.adidas.co/

  Scenario: buscar producto aleatorio
      When quiero entrar en la tienda y comprar productos
      Then selecciono un prodcuto aleatorio