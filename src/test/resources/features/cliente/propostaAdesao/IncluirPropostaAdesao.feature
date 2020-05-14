#language: pt
Funcionalidade: Incluir Proposta de Adesão

  Contexto: Autenticar Novo CBTUR
    Dado esteja na página de login
    Quando informar os dados de logon
      | Usuário | 005.838.141-40 |
      | Senha   |           0000 |
    E clicar em [Entrar]
    Então deverá se exibido a tela inicial do sistema

  Cenário: Realizar o cadastro de uma proposta de adesão
    Dado que queria cadastrar uma proposta de adesão
    Quando clicar em [Nova Proposta de Adesão]
    E preecher o formulário para cadastro de uma proposta de adesão
      | Tipo pessoa          | Física                     |
      | CPF/CNPJ             | 012.345.678-90             |
      | Nome/Empresa         | Pessoa Física              |
      | Razão social         | Pessoa Jurídica            |
      | RG                   |                  0.123.457 |
      | Órgão Emissor        | SSP                        |
      | Gênero               | Masculino                  |
      | Nacionalidade        | Brasileira                 |
      | Estado civil         | Casado(a)                  |
      | Data de nascimento   | 01/01/1990                 |
      | Menor emancipado     | Não                        |
      | Telefone comercial   | (61) 3004-1516             |
      | Telefone residencial | (61) 3314-1227             |
      | E-mail               | pessoajuridica@pj.com      |
      | Telefone celular     | (61) 9 9876-5432           |
      | Profissão            | Assistente administrativo  |
      | Grau de instrução    | Ensino superior completo   |
      | Renda mensal         | De 5 a 10 salários mínimos |
      | CEP                  | 70304-909                  |
    E caso proposta seja para pessoa jurídica preenhcer os dados de sócio administrador
      | Nome sócio administrador               | Sócio Administrador          |
      | CPF sócio administrador                | 012.345.678-90               |
      | Cargo sócio administrador              | Não informado                |
      | Data de nascimento sócio administrador | 01/01/1990                   |
      | Gênero sócio administrador             | Masculino                    |
      | Estado civil                           | Casado(a)                    |
      | E-mail sócio administrador             | socioadministrador@socio.com |
      | Telefone celular sócio administrador   | (61) 9 9876-5432             |
    Então clicar em [Salvar Proposta & Próximo]
    Quando selecionar o vendedor
      | Canal de vendas           | Canal Representante |
      | Desconto do vendedor      | 0%                  |
      | Indicador                 | Não                 |
      | Canal de vendas indicador | Canal Cooperado     |
      | Vendedor indicador        | N/A                 |
    E selecionar os títulos
      | Política de venda | Bancorbrás - Desc. 0%             |
      | Produtos          | Executivo Duplo, Executivo Triplo |
    Então clicar em [Próximo]
    Quando preecher os dados financeiros
      | Qtd. Parcelas                             |                                         4 |
      | Mesma forma de pagamento para os produtos | Sim                                       |
      | Forma de pagamento                        | Débito em conta                           |
      | Dia de débito                             |                                        30 |
      | Banco                                     | Banco do Estado do Rio Grande do Sul S.A. |
      | Agência                                   |                                      0207 |
      | Dígito agência                            |                                         1 |
      | Conta                                     |                                 350361990 |
      | Dígito conta                              |                                         6 |
      | Operação                                  |                                       001 |
      | Bandeira                                  | MASTERCARD                                |
      | Nome impresso no cartão                   | Pessoa                                    |
      | Número do cartão                          |                          5218019523471156 |
      | Código de segurança                       |                                       369 |
      | Validade do cartão                        | 12/2020                                   |
    E clicar em [Salvar Proposta]
    Então será criada a proposta de adesão
