#language:pt

Funcionalidade: login OC
  Cenario: Realizar login do sistema OC
  Dado que esteja na página do OC
  Quando o login for realizado com os seguintes dados
  |usuario|admin|
  |senha |admin|
  Entao valido que o login foi realizado