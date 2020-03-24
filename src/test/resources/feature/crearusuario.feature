  Feature: Crear Usuario Nuevo

  Scenario Outline: Crear usuario nuevo exitoso
    Given que el usuario se encuntra en la pagina
    When cree un usuario nuevo en la pagina
      |nombreUsuario|correoElectronico|contrasena|primerNombre|primerApellido|numeroTelefono|paisResidencia|ciudadResisdencia|direccionResidencia|departamentoResidencia|codigoPostal|
      |<Nombre Usuario>|<Correo Electronico>|<Contrasena>|<Primer Nombre>|<Primer Apellido>|<Numero Telefono>|<Pais Residencia>|<Ciudad Resisdencia>|<Direccion Residencia>|<Departamento Residencia>|<Codigo Postal>|
    Then podra verse logueado en el sistema <Nombre Usuario>
    Examples:
    |Nombre Usuario|Correo Electronico|Contrasena|Primer Nombre|Primer Apellido|Numero Telefono|Pais Residencia|Ciudad Resisdencia|Direccion Residencia|Departamento Residencia|Codigo Postal|
    |LasoBery|edgar_duvan_l_r@hotmail.com |2003Duvan|Edgar|Lemus|3113198129|Colombia|Medellin|Carrera 89 #68A - 126|Antioquia|050050|

    Scenario Outline: Crear usuario existente
      Given que el usuario se encuntra en la pagina
      When cree un usuario nuevo en la pagina
        |nombreUsuario|correoElectronico|contrasena|primerNombre|primerApellido|numeroTelefono|paisResidencia|ciudadResisdencia|direccionResidencia|departamentoResidencia|codigoPostal|
        |<Nombre Usuario>|<Correo Electronico>|<Contrasena>|<Primer Nombre>|<Primer Apellido>|<Numero Telefono>|<Pais Residencia>|<Ciudad Resisdencia>|<Direccion Residencia>|<Departamento Residencia>|<Codigo Postal>|
      Then podra ver en pantalla el mensaje de error
      Examples:
        |Nombre Usuario|Correo Electronico|Contrasena|Primer Nombre|Primer Apellido|Numero Telefono|Pais Residencia|Ciudad Resisdencia|Direccion Residencia|Departamento Residencia|Codigo Postal|
        |LasoBerry|edgar_duvan_l_r@hotmail.com |2003Duvan|Edgar|Lemus|3113198129|Colombia|Medellin|Carrera 89 #68A - 126|Antioquia|050050|