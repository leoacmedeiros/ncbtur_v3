#language: pt
Funcionalidade: IncluirTipoMeioHospedagem

  Contexto: Autenticar Novo CBTUR
    Dado esteja na página de login
    Quando informar os dados de logon
      | Usuário | 002.747.501-80 |
      | Senha   |           0000 |
    E clicar em [Entrar]
    Então deverá se exibido a tela inicial do sistema

  Cenário: Incluir Tipo de Meio de Hospedagem
    Dado que acesse o Menu Tipo de Meios de Hospedagem
    E clique no botão Novo Tipo
    E preencha a descrição do Novo Tipo de Meio de Hospedagem
      | Descrição | Tipo MH - Teste Automação |
    E clique no botão para salvar o registro
    E clique em Sim para confirmar a inclusão
    Então irá salvar o Novo Tipo de Meio de Hospedagem
