#language: pt
Funcionalidade: Incluir Rede

  Contexto: Autenticar Novo CBTUR
    Dado esteja na página de login
    Quando informar os dados de logon
      | Usuário | 002.747.501-80 |
      | Senha   |           0000 |
    E clicar em [Entrar]
    Então deverá se exibido a tela inicial do sistema

  Cenário: Incluir Rede
    Dado que acesse o Menu Rede
    E clique no botão de Nova Rede
    E preencha o nome da Rede
      | Nome | Rede Automação |
    E clique para a Rede ficar ativa
    E preencha o cep da Rede
      | CEP | 27115540 |
    E marque para usar o mesmo endereço para correspondências
    E clique para incluir um Novo Contato
      | Contato Email | Email                  |
      | Email         | Gerado automaticamente |
    Quando clicar no botão Salvar Rede
    Então o sistema irá incluir uma nova Rede com os dados informados
