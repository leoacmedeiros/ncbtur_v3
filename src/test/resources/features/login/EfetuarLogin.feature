#language: pt
Funcionalidade: Efetuar Login

  Cenário: Autenticar Novo CBTUR
    Dado esteja na página de login
    Quando informar os dados de logon
      | Usuário | 005.838.141-40 |
      | Senha   |           0000 |
    E clicar em [Entrar]
    Então deverá se exibido a tela inicial do sistema
