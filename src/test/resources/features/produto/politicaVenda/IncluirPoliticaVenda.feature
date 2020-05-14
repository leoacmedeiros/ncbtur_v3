#language: pt
Funcionalidade: Incluir Política Venda

  Contexto: Autenticar Novo CBTUR
    Dado esteja na página de login
    Quando informar os dados de logon
      | Usuário | 005.838.141-40 |
      | Senha   |           0000 |
    E clicar em [Entrar]
    Então deverá se exibido a tela inicial do sistema

  Cenário: Realizar inclusão de uma política de vendas
    Dado que queira criar uma nova política de vendas
    Quando clicar em [Nova Política de Venda]
    E preencher o formulário para cadastro de política de vendas
      | Código promocional              |                   |
      | Nome                            | Bancorbrás        |
      | Tipo                            | Venda             |
      | Descrição                       | Política de venda |
      | Situação                        | Ativa             |
      | Restrições da política de venda | Política de venda |
    Então clicar em [Próximo]
    Quando preencher a vigência da política de venda
      | Tempo indeterminado     | Não              |
      | Tipo vigência           | Período definido |
      | Data inicio             | 01/01/2020       |
      | Data fim                | 31/12/2020       |
      | Qtd. meses              |                6 |
      | Enquanto houver estoque | Sim              |
    Então clicar em [Próximo]
    Quando selecionar os produtos para a política de venda
      | Produtos | Todos |
    Então clicar em [Próximo]
    Quando escolher o convênio para aplicar desconto
      | Convênio | Todos |
    Então clicar em [Próximo]
    Quando selecionar o canal de vendas para política de venda
      | Canal venda | Todos |
    E selecionar a abrangência para política de venda
      | Estados | Todos |
    E clicar em [Salvar Política de Vendas]
    Então será criado a Política de Vendas
