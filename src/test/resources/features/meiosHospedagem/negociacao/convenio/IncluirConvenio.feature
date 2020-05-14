#language: pt
Funcionalidade: Incluir Convênio

  Contexto: Autenticar Novo CBTUR
    Dado esteja na página de login
    Quando informar os dados de logon
      | Usuário | 002.747.501-80 |
      | Senha   |           0000 |
    E clicar em [Entrar]
    Então deverá se exibido a tela inicial do sistema

  Cenário: Incluir Convênio do Meio de Hospedagem
    Dado que acesse o menu Novo convênio
    E clique para incluir uma [Nova Proposta]
    E preencha os dados da Etapa um Dados do Meio de Hospedagem
      | CNPJ                    | geraCnpjAuto                                 |
      | Nome                    | Empresa Teste Automação                      |
      | Razão Social            | ETA                                          |
      | Inscrição Municipal     |                                  15084840987 |
      | Inscrição Estadual      |                                  61084901700 |
      | Rede                    | rede                                         |
      | Tipo Meio de Hospedagem | Hotel                                        |
      | Tipo Administração      | Própria                                      |
      | Administradora          | Administradora 1                             |
      | Site                    | www.sitemuitobomelegal.com.br                |
      | Responsável             | Responsável automação                        |
      | Email                   | geraEmailAuto                                |
      | Telefone Comercial      |                                   6133315890 |
      | Cep Endereço            |                                     20725210 |
      | Banco                   | Banco do Brasil S.A.                         |
      | Agencia                 |                                         1570 |
      | Digito agencia          |                                            5 |
      | Conta                   |                                     51084977 |
      | Digito Conta            |                                            9 |
      | Descrição               | Inclusão de empresa teste fruto da automação |
      | Pontos de interesse     | Teste inserção de pontos de interesse...     |
    E avançar para a Etapa dois Instalação e Serviço
    E preencher a lista de comodidades
      | Academia             | Academia               |
      | Academia             | Aberta 24 horas        |
      | Atividades aquáticas | Barco no local         |
      | Atividades aquáticas | Barco e remos no local |
    E incluir uma foto do hotel
      | Tipo de album | Fachada |
    E avançar para a Etapa três Tipos de UH
    E preencher os campos de uma nova Unidade Habitacional
      | Tipo de UH                          | STD           |
      | Quantidade                          |           250 |
      | Unidade Habitacional Atende         | Single        |
      | Atende PCDF                         | Sim           |
      | Contratado                          | Sim           |
      | Single                              | Solteiro      |
      | Ocupação Máxima Adulto              |             2 |
      | Ocupação Máxima Criança             |             1 |
      | Política de Gratuidade para Criança | Sim           |
      | Quantidade                          |             1 |
      | Idade Máxima                        |             5 |
      | Unidade Habitacional                | Single        |
      | Acomodada                           | Cama dos pais |
    E selecionar as características da Unidade Habitacional
      | Cama                          | Abertura de cama para dormir             |
      | Cama                          | Roupas de cama antialérgicas disponíveis |
      | Características dos Banheiros | Roupões de banho                         |
      | Características dos Banheiros | Roupões de banho infantis                |
    E selecionar as fotos da Unidade Habitacional
    E Salvar a Unidade Habitacional
    E avançar para a Etapa quatro Condições de Contrato
    E preencher os dados referente as condições de contrato
      | Vigência                     |         01012020 |
      | Forma de Pagamento           | Faturado         |
      | Tipo de Unidade Habitacional | STD              |
      | Nível de Utilização          | Executivo        |
      | Nome da Temporada            | Alta Temporada   |
      | Regime                       | Café da manhã    |
      | Período Inicial              |         01012020 |
      | Período Final                |         31122020 |
      | Valor SGL                    |            10000 |
      | Valor CHD                    |             5000 |
      | Bloqueio                     |              100 |
      | Deadline                     |                1 |
      | Cancelamento                 |                1 |
      | Mínimo de diárias            |                2 |
      | Dias                         | Selecionar todos |
    Quando clicar para Salvar a Proposta
    Então a Proposta ficará com a situação Para Aprovação
