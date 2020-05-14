#language: pt
Funcionalidade: Incluir Administradora de Meios de Hospedagem

  Contexto: Autenticar Novo CBTUR
    Dado esteja na página de login
    Quando informar os dados de logon
      | Usuário | 002.747.501-80 |
      | Senha   |           0000 |
    E clicar em [Entrar]
    Então deverá se exibido a tela inicial do sistema

  Cenário: Incluir Administradora de Meio de Hospedagem
    Dado acesse o Menu Administradora de Meio de Hospedagem
    E clique no botao de Nova Administradora de Meios de Hospedagem
    Quando preencher os dados da Administradora
      | Nome                | Administradora Automação   |
      | CNPJ                | Gerado automaticamente     |
      | Razão Social        | Razão Social ADM Automação |
      | CEP Endereço        |                   12245800 |
      | CEP Correspondência |                   08761240 |
    E preencher os campos de Contato
      | Telefone Comercial |             6133187254 |
      | Responsável        | Responsável automação  |
      | Email              | gerado automaticamente |
    E preencher os campos de Dados Bancários
      | Banco          | Banco do Brasil S.A.   |
      | Agência        | gerado automaticamente |
      | Dígito Agência |                      9 |
      | Conta          | gerado automaticamente |
      | Dígito Conta   |                      2 |
    E clicar na opção para Faturar NF na Administradora
    Quando clicar no botao Salvar Administradora de Meios de Hospedagem
    Então o sistema ira incluir uma nova Administradora de Meios de Hospedagem com os dados inseridos
