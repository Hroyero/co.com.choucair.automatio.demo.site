#language: es
#Autor: Hollmans Royero Mendoza

  @historia
  Característica: Automation web,
    Como usario quiero registrarme en la pagina de automation demo

  Esquema del escenario: buscar opción de registro en Utest
    Dado que carlos quiere acceder a la Web Automation Demo Site
    Cuando el realiza el registro en la pagina
    | firstName   | lastName   | address   | emailAddress   | phone   | skill   | country   | countryTwo   |   year  | month   | day   | password   | confirmPassword |
    | <firstName> | <lastName> | <address> | <emailAddress> | <phone> | <skill> | <country> | <countryTwo> |  <year> | <month> | <day> | <password> | <confirmPassword> |
    Entonces el verifica que se carga la pantalla con texto Double Click on Edit Icon to EDIT the Table Row
    | respuestas   |
    | <respuestas> |

    Ejemplos:
      | firstName   | lastName   | address         | emailAddress            | phone      | skill          | country        | countryTwo | year | month | day | password    | confirmPassword | respuestas                                      |
      | Hollmans    | Royero     | Cra 27 #44 C 31 | yowohiv450@pigicorn.com | 3043423748 | APIs           | Select Country | Australia  | 1996 | July  |  22 | Contr#12345 | Contr#12345     |Double Click on Edit Icon to EDIT the Table Row  |