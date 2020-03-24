Feature: Carrito Compras

  Background: Precondiciones
    Given que el usuario se encuntra en la pagina
    When ingrese en la pagina logueandose
      |nombreUsuario|contrasena|
      |LasoBerry|2003Duvan|

  Scenario: Agregar articulo a carrito de compras exitoso
    When agregue un articulo en el carrito de compra
    Then podra verlo en la lista de compras