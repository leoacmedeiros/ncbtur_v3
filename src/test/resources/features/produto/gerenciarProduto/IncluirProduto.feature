#language: pt
Funcionalidade: Incluir Produto

  Contexto: Autenticar Novo CBTUR
    Dado esteja na página de login
    Quando informar os dados de logon
      | Usuário | 005.838.141-40 |
      | Senha   |           0000 |
    E clicar em [Entrar]
    Então deverá se exibido a tela inicial do sistema

  Cenário: Realizar cadastro de produto
    Dado que queira criar um novo produto
    Quando clicar em [Novo Produto]
    E preencher o formulário para cadastro de produto
      | Nome                                      | Superior Triplo     |
      | Tipo                                      | Venda               |
      | Nível de utilização                       | Superior            |
      | Categoria                                 | Triplo              |
      | Mensalidade                               |                  12 |
      | Situação                                  | Ativo               |
      | Diárias do produto                        |                   7 |
      | Qtd. em estoque                           | Ilimitado           |
      | Descrição                                 | Superior Triplo     |
      | Período utilização                        |                  12 |
      | Exceto feriados prolongados?              | Não                 |
      | Exceto alta temporada?                    | Não                 |
      | Permite reservas com despesas adicionais? | Sim                 |
      | Tipo de cobranca                          | Despesas adicionais |
      | Habilitar virada do período?              | Sim                 |
      | Habilitar regras de carência?             | Sim                 |
      | Taxas de manutenção                       |                   2 |
      | Parcelas da taxa de adesão                |                   4 |
      | Permite conversão de diárias              | Sim                 |
    E salvar os dados do formulário de cadastro do produto
    Então será cadastrado o produto
