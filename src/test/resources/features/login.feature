#language:pt

Funcionalidade: login OC

  Cenario: Realizar login do sistema OC
    Dado que esteja na pagina do OC
    Quando o login for realizado com os seguintes dados
      | usuario | admin |
      | senha   | admin |
    E clicar no botao continuar
    E selecionar Empresa
    E clicar no botao Ok
    Entao valido que a pagina incial e exibida



