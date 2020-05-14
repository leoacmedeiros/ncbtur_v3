#language: pt
Funcionalidade: Incluir Taxa

  Contexto: Autenticar Novo CBTUR
    Dado esteja na página de login
    Quando informar os dados de logon
      | Usuário | 005.838.141-40 |
      | Senha   |           0000 |
    E clicar em [Entrar]
    Então deverá se exibido a tela inicial do sistema

  Cenário: Realizar cadastro de taxa
    Dado que acesse o modulo de produto para criar um registro
    Quando clicar em [Nova Taxa]
    E preencher o formulário para cadastro de taxa
      | Tipo taxa                    | Manutenção         |
      | Nome taxa                    | Taxa de Manutenção |
      | Permite comissão?            | Sim                |
      | Desconto política de vendas? | Sim                |
      | Desconto convênio?           | Sim                |
      | Descrição                    | Taxa de Manutenção |
      | Situação                     | Ativo              |
    E salvar os dados do formulário de cadastro da taxa
    Então será cadastrado a taxa
