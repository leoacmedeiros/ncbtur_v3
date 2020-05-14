#language: pt
@EditarTipoMeiosHospedagem
Funcionalidade: EditarTipoMeiosHospedagem

  #Contexto: Como usuário desejo Editar um Tipo de Meio de Hospedagem
    #Dado que eu acesse o sistema CBTUR
    #Quando informar os dados de logon
      #| Usuário | 002.747.501-80 |
      #| Senha   |           0000 |
    #Então deverá exibir a tela inicial do sistema

  Cenário: Editar Tipo de Meio de Hospedagem
   # Dado que acesse o Menu Meios de Hospedagem
   # E acesse o sub-menu Tipo de Meios de Hospedagem
    Dado clique no botão Filtrar
    E digite o nome do Tipo de Meio de Hospedagem para realizar a busca
      | Descrição | Novo Tipo de Meio de Hospedagem - Teste Auto 1 |
    E clique em Filtrar para confirmar a busca
    E no resultado da busca solicite a opção para Editar o registro
    E altere o nome do Tipo de Meio de Hospedagem
    |Desc. Alteração|Novo Tipo de Meio de Hospedagem - Teste Auto 1 - ALTERADO|
    Quando clicar em Salvar
    E clicar em Sim para confirmar a alteração da descrição
    Então a descrição do Tipo de Meio de Hospedagem irá ser alterada
