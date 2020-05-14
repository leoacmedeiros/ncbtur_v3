package pageObjects.cliente.propostaAdesao;

import org.openqa.selenium.By;

import core.BasePage;

public class IncluirPropostaAdesaoPage extends BasePage {

	private static final String TIPO_PESSOA = "//select[@placeholder='Selecione o tipo de pessoa']";
	private static final String CPF_CNPJ = "//input[@name='numeroDocumento']";
	private static final String NOME_EMPRESA = "//input[@name='nome']";
	private static final String RAZAO_SOCIAL = "//input[@name='razaoSocial']";
	private static final String RG = "//input[@name='rg']";
	private static final String ORGAO_EMISSOR = "//input[@name='orgaoEmissor']";
	private static final String GENERO = "//select[@name='genero']";
	private static final String NACIONALIDADE = "//select[@name='nacionalidade']";
	private static final String ESTADO_CIVIL = "//select[@name='estadoCivil']";
	private static final String DATA_NASCIMENTO = "//input[@name='nascimento']";
	private static final String MENOR_EMANCIPADO = "//label[@class='mt-checkbox mt-checkbox-outline']//span";
	private static final String TELEFONE_COMERCIAL = "//input[@name='telefoneComercial']";
	private static final String TELEFONE_RESIDENCIAL = "//input[@name='telefoneResidencial']";
	private static final String EMAIL = "//input[@name='email']";
	private static final String CONFIRMA_EMAIL = "//input[@name='confirmeEmail']";
	private static final String NOVO_TELEFONE_CELULAR = "//a[contains(text(),'Novo telefone')]";
	private static final String TELEFONE_CELULAR = "//div[@class='col-md-12']//input[@class='form-control ng-untouched ng-pristine ng-valid']";
	private static final String ADICIONAR_TELEFONE_CELULAR = "//button[contains(text(),'Adicionar')]";
	private static final String PROFISSAO = "//select[@name='profissao']";
	private static final String GRAU_INSTRUCAO = "//select[@name='grauInstrucao']";
	private static final String RENDA_MENSAL = "//select[@name='rendaMensal']";
	private static final String CEP = "//input[@name='endereco_cep']";
	private static final String NOVO_SOCIO_ADMINISTRADOR = "//button[contains(text(),'Novo Sócio Administrador')]";
	private static final String NOME_SOCIO_ADMINISTRADOR = "(//input[@name='nome'])[2]";
	private static final String CPF_SOCIO_ADMINISTRADOR = "(//input[@name='numeroDocumento'])[2]";
	private static final String CARGO_SOCIO_ADMINISTRADOR = "//input[@formcontrolname='cargo']";
	private static final String DATA_NASCIMENTO_SOCIO_ADMINISTRADOR = "//input[@class='form-control']";
	private static final String GENERO_SOCIO_ADMINISTRADOR = "//select[@name='genero']";
	private static final String ESTADO_CIVIL_SOCIO_ADMINISTRADOR = "//select[@name='estadoCivil']";
	private static final String EMAIL_SOCIO_ADMINISTRADOR = "(//input[@name='email'])[2]";
	private static final String TELEFONE_CELULAR_SOCIO_ADMINISTRADOR = "//input[@name='inptContato1']";
	private static final String ADICIONAR_SOCIO_ADMINISTRADOR = "//button[contains(text(),'Adicionar')]";
	private static final String SALVAR_AVANCAR_PROPOSTA = "//button[contains(text(),'SALVAR PROPOSTA & PRÓXIMO')]";
	private static final String CANAL_VENDAS_VENDEDOR = "//select[@name='canalVendaVendedor']";
	private static final String DESCONTO_VENDEDOR = "//input[@name='descontoVendedor']";
	private static final String INDICADOR = "//input[@name='btSelectItem']//parent::label/span";
	private static final String CANAL_VENDAS_INDICADOR = "//select[@name='canalVendaIndicador']";
	private static final String VENDEDOR_INDICADOR = "//select[@name='indicador']";
	private static final String POLITICA_VENDA = "//select[@name='idPoliticaVenda']";
	private static final String QTD_PARCELAS_TAXA_ADESAO = "//select[@name='quantidadeParcelas']";
	private static final String MESMA_FORMA_PAGAMENTO = "//input[@formcontrolname='todasFormas']//parent::label/span";
	private static final String DIA_DEBITO = "//select[@name='diaDebito']";
	private static final String BANCO = "//label[text()='Banco: ']//parent::div//select";
	private static final String AGENCIA = "//input[@name='agenciaNumero']";
	private static final String DIGITO_AGENCIA = "//input[@name='agenciaDigito']";
	private static final String CONTA = "//input[@name='debito_conta']";
	private static final String DIGITO_CONTA = "//input[@name='contaDigito']";
	private static final String OPERACAO = "//input[@name='debito_operacao']";
	private static final String BANDEIRA = "//select[@name='cartao_bandeira']";
	private static final String NOME_IMPRESSO_CARTAO = "//input[@name='nomeImpresso']";
	private static final String NUMERO_CARTAO = "//input[@name='cartao_numero']";
	private static final String CODIGO_SEGURANCA = "//input[@name='cvc']";
	private static final String VALIDADE_CARTAO = "//input[@name='dataValidade']";
	private static final String SALVAR_PROPOSTA = "//button[contains(text(),'Salvar proposta')]";

	private String tipoPessoa;
	private String indicador;
	private String formaPagamento;
	private String banco;

	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
		selecionarComboBox(By.xpath(TIPO_PESSOA), tipoPessoa);
	}

	public void setCpf(String cpf) {
		if (tipoPessoa.trim().equals("Física")) {
			escrever(By.xpath(CPF_CNPJ), cpf);
		}
	}

	public void setCnpj(String Cnpj) {
		if (tipoPessoa.trim().equals("Jurídica")) {
			escrever(By.xpath(CPF_CNPJ), Cnpj);
		}
	}

	public void setNomePessoFisica(String nome) {
		if (tipoPessoa.trim().equals("Física")) {
			escrever(By.xpath(NOME_EMPRESA), nome);
		}
	}

	public void setNomePessoJuridica(String nome) {
		if (tipoPessoa.trim().equals("Jurídica")) {
			escrever(By.xpath(NOME_EMPRESA), nome);
		}
	}

	public void setRazaoSocialPessoJuridica(String razaoSocial) {
		if (tipoPessoa.trim().equals("Jurídica")) {
			escrever(By.xpath(RAZAO_SOCIAL), razaoSocial);
		}
	}

	public void setRg(String rg) {
		if (tipoPessoa.trim().equals("Física")) {
			escrever(By.xpath(RG), rg);
		}
	}

	public void setOrgaoEmissor(String orgaoEmissor) {
		if (tipoPessoa.trim().equals("Física")) {
			escrever(By.xpath(ORGAO_EMISSOR), orgaoEmissor);
		}
	}

	public void setGenero(String genero) {
		if (tipoPessoa.trim().equals("Física")) {
			selecionarComboBox(By.xpath(GENERO), genero);
		}
	}

	public void setNacionalidade(String nacionalidade) {
		if (tipoPessoa.trim().equals("Física")) {
			selecionarComboBox(By.xpath(NACIONALIDADE), nacionalidade);
		}
	}

	public void setEstadoCivil(String estadoCivil) {
		if (tipoPessoa.trim().equals("Física")) {
			selecionarComboBox(By.xpath(ESTADO_CIVIL), estadoCivil);
		}
	}

	public void setDataNascimento(String dataNascimento) {
		if (tipoPessoa.trim().equals("Física")) {
			escrever(By.xpath(DATA_NASCIMENTO), dataNascimento);
		}
	}

	public void setMenorEmancipado(String menorEmancipado) {
		if (tipoPessoa.trim().equals("Física") && menorEmancipado.trim().equals("Sim")) {
			clicar(By.xpath(MENOR_EMANCIPADO));
		}
	}

	public void setTelefoneComercial(String telefoneComercial) {
		escrever(By.xpath(TELEFONE_COMERCIAL), telefoneComercial);
	}

	public void setTelefoneResidencial(String telefoneResidencial) {
		if (tipoPessoa.trim().equals("Física")) {
			escrever(By.xpath(TELEFONE_RESIDENCIAL), telefoneResidencial);
		}
	}

	public void setEmail(String email) {
		escrever(By.xpath(EMAIL), email);
		escrever(By.xpath(CONFIRMA_EMAIL), email);
	}

	public void setTelefoneCelular(String telefoneCelular) {
		clicar(By.xpath(NOVO_TELEFONE_CELULAR));
		escrever(By.xpath(TELEFONE_CELULAR), telefoneCelular);
		clicar(By.xpath(ADICIONAR_TELEFONE_CELULAR));
	}

	public void setProfissao(String profissao) {
		if (tipoPessoa.trim().equals("Física")) {
			selecionarComboBox(By.xpath(PROFISSAO), profissao);
		}
	}

	public void setGrauInstrucao(String grauInstrucao) {
		if (tipoPessoa.trim().equals("Física")) {
			selecionarComboBox(By.xpath(GRAU_INSTRUCAO), grauInstrucao);
		}
	}

	public void setRendaMensal(String rendaMensal) {
		if (tipoPessoa.trim().equals("Física")) {
			selecionarComboBox(By.xpath(RENDA_MENSAL), rendaMensal);
		}
	}

	public void setCep(String cep) {
		escrever(By.xpath(CEP), cep);
		sleep(10);
	}

	public void setNovoSocioAdministrador() {
		if (tipoPessoa.trim().equals("Jurídica")) {
			clicar(By.xpath(NOVO_SOCIO_ADMINISTRADOR));
		}
	}

	public void setNomeSocioAdministrador(String nomeSocioAdministrador) {
		if (tipoPessoa.trim().equals("Jurídica")) {
			escrever(By.xpath(NOME_SOCIO_ADMINISTRADOR), nomeSocioAdministrador);
		}
	}

	public void setCpfSocioAdministrador(String cpfSocioAdministrador) {
		if (tipoPessoa.trim().equals("Jurídica")) {
			escrever(By.xpath(CPF_SOCIO_ADMINISTRADOR), cpfSocioAdministrador);
		}
	}

	public void setCargoSocioAdministrador(String cargoSocioAdministrador) {
		if (tipoPessoa.trim().equals("Jurídica")) {
			escrever(By.xpath(CARGO_SOCIO_ADMINISTRADOR), cargoSocioAdministrador);
		}
	}

	public void setDataNascimentoSocioAdministrador(String dataNascimentoSocioAdministrador) {
		if (tipoPessoa.trim().equals("Jurídica")) {
			escrever(By.xpath(DATA_NASCIMENTO_SOCIO_ADMINISTRADOR), dataNascimentoSocioAdministrador);
		}
	}

	public void setGeneroSocioAdministrador(String generoSocioAdministrador) {
		if (tipoPessoa.trim().equals("Jurídica")) {
			selecionarComboBox(By.xpath(GENERO_SOCIO_ADMINISTRADOR), generoSocioAdministrador);
		}
	}

	public void setEstadoCivilSocioAdministrador(String estadoCivilSocioAdministrador) {
		if (tipoPessoa.trim().equals("Jurídica")) {
			selecionarComboBox(By.xpath(ESTADO_CIVIL_SOCIO_ADMINISTRADOR), estadoCivilSocioAdministrador);
		}
	}

	public void setEmailSocioAdministrador(String emailSocioAdministrador) {
		if (tipoPessoa.trim().equals("Jurídica")) {
			escrever(By.xpath(EMAIL_SOCIO_ADMINISTRADOR), emailSocioAdministrador);
		}
	}

	public void setTelefoneCelularSocioAdministrador(String telefoneCelularSocioAdministrador) {
		if (tipoPessoa.trim().equals("Jurídica")) {
			escrever(By.xpath(TELEFONE_CELULAR_SOCIO_ADMINISTRADOR), telefoneCelularSocioAdministrador);
		}
	}

	public void adicionarSocioAdministrador() {
		if (tipoPessoa.trim().equals("Jurídica")) {
			clicar(By.xpath(ADICIONAR_SOCIO_ADMINISTRADOR));
		}
	}

	public void salvarAvancarProposta() {
		clicar(By.xpath(SALVAR_AVANCAR_PROPOSTA));
	}

	public void setCanalVendasVendedor(String canalvendasVendedor) {
		selecionarComboBox(By.xpath(CANAL_VENDAS_VENDEDOR), canalvendasVendedor);
	}

	public void setDescontoVendedor(String descontoVendedor) {
		escrever(By.xpath(DESCONTO_VENDEDOR), descontoVendedor);
	}

	public void setIndicador(String indicador) {
		this.indicador = indicador;
		if (!isCheckMarcado(By.xpath(INDICADOR)) && indicador.trim().equals("Sim")) {
			clicar(By.xpath(INDICADOR));
		} else if (isCheckMarcado(By.xpath(INDICADOR)) && indicador.trim().equals("Não")) {
			clicar(By.xpath(INDICADOR));
		}
	}

	public void setCanalVendasIndicador(String canalVendasIndicador) {
		if (indicador.trim().equals("Sim")) {
			selecionarComboBox(By.xpath(CANAL_VENDAS_INDICADOR), canalVendasIndicador);
		}
	}

	public void setVendedorIndicador(String vendedorIndicador) {
		if (indicador.trim().equals("Sim")) {
			selecionarComboBox(By.xpath(VENDEDOR_INDICADOR), vendedorIndicador);
		}
	}

	public void setPoliticaVenda(String politicaVenda) {
		selecionarComboBox(By.xpath(POLITICA_VENDA), politicaVenda);
	}

	public void setProdutosPoliticaVenda(String produtosPoliticaVenda) {
		for (String produtoPoliticaVenda : produtosPoliticaVenda.split(","))
			clicar(By.xpath("//div[contains(text(),'" + produtoPoliticaVenda.trim()
					+ "')]//parent::div//parent::div//parent::div//button"));
	}

	public void setQtdParcelasTaxaAdesao(String qtdParcelasTaxaAdesao) {
		scrollPageUP();
		selecionarComboBox(By.xpath(QTD_PARCELAS_TAXA_ADESAO), qtdParcelasTaxaAdesao);
	}

	public void setMesmaFormaPagamento(String mesmaFormaPagamento) {
		if (isCheckMarcado(By.xpath(MESMA_FORMA_PAGAMENTO)) && mesmaFormaPagamento.trim().equals("Não")) {
			clicar(By.xpath(MESMA_FORMA_PAGAMENTO));
		}
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
		clicar(By.xpath("//label[contains(text(),'" + formaPagamento + "')]/span"));
	}

	public void setDiaDebito(String diaDebito) {
		selecionarComboBox(By.xpath(DIA_DEBITO), diaDebito);
	}

	public void setBanco(String banco) {
		this.banco = banco;
		if (formaPagamento.trim().equals("Débito em conta")) {
			selecionarComboBox(By.xpath(BANCO), banco);
		}
	}

	public void setAgencia(String agencia) {
		if (formaPagamento.trim().equals("Débito em conta")) {
			escrever(By.xpath(AGENCIA), agencia);
		}
	}

	public void setDigitoAgencia(String digitoAgencia) {
		if (formaPagamento.trim().equals("Débito em conta")) {
			escrever(By.xpath(DIGITO_AGENCIA), digitoAgencia);
		}
	}

	public void setConta(String conta) {
		if (formaPagamento.trim().equals("Débito em conta")) {
			escrever(By.xpath(CONTA), conta);
		}
	}

	public void setDigitoConta(String digitoConta) {
		if (formaPagamento.trim().equals("Débito em conta")) {
			escrever(By.xpath(DIGITO_CONTA), digitoConta);
		}
	}

	public void setOperacao(String operacao) {
		if (formaPagamento.trim().equals("Débito em conta") && banco.trim().equals("Caixa Econômica Federal")) {
			escrever(By.xpath(OPERACAO), operacao);
		}
	}

	public void setBandeira(String bandeira) {
		if (formaPagamento.trim().equals("Cartão de crédito")) {
			selecionarComboBox(By.xpath(BANDEIRA), bandeira);
		}
	}

	public void setNomeImpressoCartao(String nomeImpressoCartao) {
		if (formaPagamento.trim().equals("Cartão de crédito")) {
			escrever(By.xpath(NOME_IMPRESSO_CARTAO), nomeImpressoCartao);
		}
	}

	public void setNumeroCartao(String numeroCartao) {
		if (formaPagamento.trim().equals("Cartão de crédito")) {
			escrever(By.xpath(NUMERO_CARTAO), numeroCartao);
		}
	}

	public void setCodigoSeguranca(String codigoSegurancao) {
		if (formaPagamento.trim().equals("Cartão de crédito")) {
			escrever(By.xpath(CODIGO_SEGURANCA), codigoSegurancao);
		}
	}

	public void setValidadeCartao(String validadeCartao) {
		if (formaPagamento.trim().equals("Cartão de crédito")) {
			escrever(By.xpath(VALIDADE_CARTAO), validadeCartao);
		}
	}

	public void salvarProposta() {
		clicar(By.xpath(SALVAR_PROPOSTA));
	}

}
