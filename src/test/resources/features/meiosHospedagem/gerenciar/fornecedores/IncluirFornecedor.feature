#language: pt
Funcionalidade: Incluir Fornecedor

  Contexto: Autenticar Novo CBTUR
    Dado esteja na página de login
    Quando informar os dados de logon
      | Usuário | 002.747.501-80 |
      | Senha   |           0000 |
    E clicar em [Entrar]
    Então deverá se exibido a tela inicial do sistema

  Cenário: Incluir Fornecedor
    Dado acesse o Menu Fornecedores
    E clique no botão Novo Fornecedor
    E preencha os campos de Fornecedor com dados válidos
      | CNPJ         | Gerado automaticamente            |
      | Nome         | Fornecedor Automação              |
      | Razão Social | Razão Social Fornecedor Automação |
      | CEP          | 02225-200                         |
    E preencher os campos referente a Contatos
      | Responsável        | Responsável automação  |
      | Email              | gerado automaticamente |
      | Telefone Comercial |             6152148960 |
    E preencher os dados bancários de Fornecedores
      | Banco          | BRB - Banco de Brasília S.A. |
      | Agência        | gerado automaticamente       |
      | Dígito Agência |                            1 |
      | Conta          | gerado automaticamente       |
      | Dígito Conta   |                            5 |
    Quando clicar no botao Salvar Fornecedor
    Então o sistema irá incluir um novo Fornecedor
