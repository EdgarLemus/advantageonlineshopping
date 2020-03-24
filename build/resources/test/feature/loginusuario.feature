  Feature: Loguear Usuario

  Scenario Outline: Loguear usuario nuevo exitoso
    Given que el usuario se encuntra en la pagina
    When ingrese en la pagina logueandose
      |nombreUsuario|contrasena|
      |<Nombre Usuario>|<Contrasena>|
    Then podra verse logueado en el sistema <Nombre Usuario>
    Examples:
    |Nombre Usuario|Contrasena|
    |LasoBerry|2003Duvan|

    Scenario Outline: Loguear usuario nuevo exitoso a traves de la pagina registro
      Given que el usuario se encuntra en la pagina
      When ingrese en la pagina logueandose a traves de la pagina de registro
        |nombreUsuario|contrasena|
        |<Nombre Usuario>|<Contrasena>|
      Then podra verse logueado en el sistema <Nombre Usuario>
      Examples:
        |Nombre Usuario|Contrasena|
        |LasoBerry|2003Duvan|

    Scenario Outline: Loguear usuario nuevo no exitoso
      Given que el usuario se encuntra en la pagina
      When ingrese en la pagina logueandose
        |nombreUsuario|contrasena|
        |<Nombre Usuario>|<Contrasena>|
      Then podra en pantalla el mensaje de error
      Examples:
        |Nombre Usuario|Contrasena|
        |LasBerry|2003Duvan|