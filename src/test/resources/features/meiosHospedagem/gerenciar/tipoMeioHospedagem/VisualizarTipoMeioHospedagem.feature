#language: pt
@VisualizarTipoMeiosHospedagem
Funcionalidade: VisualizarTipoMeiosHospedagem

  #Contexto: Como usuário desejo Visualizar um Tipo de Meio de Hospedagem
    #Dado que eu acesse o sistema CBTUR
    #Quando informar os dados de logon
      #| Usuário | 002.747.501-80 |
      #| Senha   |           0000 |
    #Então deverá exibir a tela inicial do sistema

  Cenário: Visualizar Tipo de Meio de Hospedagem
   # Dado que acesse o Menu Meios de Hospedagem
   # E acesse o sub-menu Tipo de Meios de Hospedagem
    Dado clique no botão Filtrar
    E realize uma pesquisa pelo Tipo de Meio de Hospedagem
      | Descrição | Novo Tipo de Meio de Hospedagem - Teste Auto 1 |
    E realize outra busca pelo código do Tipo de Meio de Hospedagem
    E clique no botão para Visualizar o registro
    Então irá ser exibido o registro pesquisado
