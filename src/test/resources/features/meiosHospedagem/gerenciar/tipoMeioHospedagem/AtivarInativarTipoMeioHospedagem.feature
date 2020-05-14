#language: pt
@AtivarInativarTipoMeiosHospedagem
Funcionalidade: AtivarInativarTipoMeiosHospedagem

  #Contexto: Como usuário desejo Ativar e Inativar um Tipo de Meio de Hospedagem
    #Dado que eu acesse o sistema CBTUR
    #Quando informar os dados de logon
      #| Usuário | 002.747.501-80 |
      #| Senha   |           0000 |
    #Então deverá exibir a tela inicial do sistema

  Cenário: Ativar e Inativar Tipo de Meio de Hospedagem
   # Dado que acesse o Menu Meios de Hospedagem
   # E acesse o sub-menu Tipo de Meios de Hospedagem
   Dado clique no botão Filtrar
    E realize uma pesquisa pelo Tipo de Meio de Hospedagem
      | Descrição | Novo Tipo de Meio de Hospedagem - Teste Auto 1 |
    E no registro pesquisado acione a opção Ativar
    E clique em Sim para confirmar a ativação
    E clique no botão para Inativar o registro
    E clique em Sim para confirmar a inativação
    Então o registro irá ficar inativado
