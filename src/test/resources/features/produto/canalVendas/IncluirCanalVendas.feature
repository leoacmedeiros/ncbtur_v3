#language: pt
Funcionalidade: Incluir Canal de Vendas

  Contexto: Autenticar Novo CBTUR
    Dado esteja na página de login
    Quando informar os dados de logon
      | Usuário | 005.838.141-40 |
      | Senha   |           0000 |
    E clicar em [Entrar]
    Então deverá se exibido a tela inicial do sistema

  Cenário: Realizar cadastro de canal de vendas
    Dado que queira criar um novo canal de vendas
    Quando clicar em [Novo Canal de Vendas]
    E preencher o formulário para cadastro de canal de vendas
      | Tipo                         | Filial                  |
      | Nome do canal de vendas      | Canal Filial 0001       |
      | Descrição do canal de vendas | Este é um canal         |
      | Parâmetros de vínculo        | Matrícula ou CPF        |
      | Razão social                 | Canal Filial 0001       |
      | CNPJ                         | 01.234.578/0001-89      |
      | Empresa                      | BAC                     |
      | Filial                       | BAC - 503 SUL           |
      | Site                         | www.canalfilial0001.com |
      | Captado por                  | Daniel Santos           |
      | Core                         |                      10 |
    E adicionar contatos
      | Email              | canalfilial0001@canal.com |
      | Telefone Comercial | (61) 3004-9912            |
    E preencher endereço
      | CEP      | 70304-909 |
      | Taxa ISS | 5%        |
    E escolher a situação do canal de vendas
      | Situação                        | Ativo |
      | Recebe remuneração por comissão | Não   |
    Então clicar em [Próximo]
    Quando preencher a vigência do canal de vendas
      | Tempo indeterminado | Não        |
      | Data inicio         | 01/01/2020 |
      | Data fim            | 31/12/2020 |
    E informar os dados para envio de notificações
      | Área reponsável | Canal Filial              |
      | E-mail          | canalfilial0001@canal.com |
    Então clicar em [Próximo]
    Quando clicar em [Novo Responsável]
    E preencher os dados do responsável do canal de vendas
      | Nome               | Responsável                 |
      | Sexo               | Masculino                   |
      | CPF                | 012.345.678-90              |
      | RG                 | 012.345.678-9               |
      | Órgão expedidor    | SSP                         |
      | Profissão          | Assistente administrativo   |
      | Cargo              | Não informado               |
      | Nacionalidade      | Brasileira                  |
      | Estado civil       | Casado                      |
      | Data de nascimento | 01/01/1990                  |
      | E-mail             | responsavel@responsavel.com |
      | Telefone           | (61) 1234-5678              |
      | CEP                | 70304-909                   |
      | Temporário         | Não                         |
      | Situação           | Ativo                       |
    E adicionar responsável do canal de vendas
    Então clicar em [Próximo]
    Quando clicar em [Novo Vendedor]
    E preencher os dados do vendedor
      | CPF                | 005.838.141-40 |
      | Promotor de vendas | Não            |
    E adicionar vendedor
    Então clicar em [Próximo]
    Quando clicar em [Novo Conveniado]
    E preencher os dados do conveniado
      | Nome            | Conveniado     |
      | Identificador 1 |           0123 |
      | Identificador 2 | 012.345.678-90 |
    E adicionar conveniado
    Então clicar em [Próximo]
    Quando informar os dados da oferta
      | Percentual          | 10%                   |
      | Período promocional | Não                   |
      | Valor desconto      | 5%                    |
      | Data início         | 01/01/2020            |
      | Data fim            | 31/12/2020            |
      | Área reponsável     | ABCD                  |
      | E-mail              | oferta@oferta.com     |
      | Novo desconto       | Não                   |
      | Empresa             | CLUBE BANCORBRAS      |
      | Desconto            | 1%                    |
      | Observações         | Este é uma observação |
    E adicionar novo desconto
    Então clicar em [Próximo]
    Quando preencher os dados bancários
      | Banco            | Banco do Brasil S.A. |
      | Agencia Bancaria | 1234-0               |
      | Conta Bancaria   | 0123456-0            |
    Então clicar em [Próximo]
    Quando anexar documentação
      | Nome do arquivo | documentoTeste.pdf |
    E clicar em [Salvar Canal de Vendas]
    Então será criado o Canal de Vendas
