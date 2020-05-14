package pageObjects.produto.canalVendas;

import java.awt.AWTException;
import java.util.StringTokenizer;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;

import core.BasePage;

public class IncluirCanalVendasPage extends BasePage {

	private static final String TIPO_CANAL_VENDAS = "//select[@name='tipo']";
	private static final String NOME_CANAL_VENDAS = "//input[@name='nome']";
	private static final String DESCRICAO_CANAL_VENDAS = "//textarea[@name='descricao']";
	private static final String PARAMETROS_VINCULO_CANAL_VENDAS = "//select[@name='parametro']";
	private static final String RAZAO_SOCIAL_CANAL_VENDAS = "//input[@name='razaoSocial']";
	private static final String CNPJ_CANAL_VENDAS = "//input[@formcontrolname='cnpj']";
	private static final String EMPRESA_CANAL_VENDAS = "//select[@name='empresa']";
	private static final String FILIAL_CANAL_VENDAS = "//select[@name='filial']";
	private static final String SITE_CANAL_VENDAS = "//input[@name='site']";
	private static final String CAPTADO_CANAL_VENDAS = "//input[@name='buscaCliente']";
	private static final String LISTA_CAPTADO_CANAL_VENDAS = "//ul[@id='dropdownBuscaCliente']";
	private static final String CORE_CANAL_VENDAS = "//input[@name='core']";
	private static final String EMAIL_CANAL_VENDAS = "//input[@name='inptContato2']";
	private static final String TELEFONE_COMERCIAL_CANAL_VENDAS = "//input[@name='inptContato1']";
	private static final String CEP_CANAL_VENDAS = "//input[@name='endereco_cep']";
	private static final String UF_CANAL_VENDAS = "//select[@name='endereco_estado']";
	private static final String TAXA_ISS_CANAL_VENDAS = "//input[@name='taxaISS']";
	private static final String SITUACAO_CANAL_VENDAS = "//label[contains(text(),'Canal de vendas ativo')]//span[@class='box']";
	private static final String RECEBE_REMUNERACAO_COMISSAO_CANAL_VENDAS = "//label[contains(text(),'Recebe Remuneração por Comissão')]//span[@class='box']";
	private static final String PROXIMO = "//button[contains(text(),'PRÓXIMO')]";
	private static final String TEMPO_INDETERMINADO_VIGENCIA_CANAL_VENDAS = "//label[contains(text(),'Tempo Indeterminado')]//span[@class='box']";
	private static final String INICIO_VIGENCIA_CANAL_VENDAS = "//input[@name='inicioEm']";
	private static final String FIM_VIGENCIA_CANAL_VENDAS = "//input[@name='fimEm']";
	private static final String AREA_RESPONSAVEL_NOTIFICACAO_CANAL_VENDAS = "(//input[@name='nome'])[2]";
	private static final String EMAIL_NOTIFICACAO_CANAL_VENDAS = "//input[@name='email']";
	private static final String NOVO_REPONSAVEL_CANAL_VENDAS = "//button[contains(text(),'Novo Responsável')]";
	private static final String NOME_RESPONSAVEL_CANAL_VENDAS = "(//input[@name='nome'])[3]";
	private static final String SEXO_RESPONSAVEL_CANAL_VENDAS = "//select[@name='sexo']";
	private static final String CPF_RESPONSAVEL_CANAL_VENDAS = "//input[@name='cpf']";
	private static final String RG_RESPONSAVEL_CANAL_VENDAS = "//input[@name='rg']";
	private static final String ORGAO_EXPEDIDOR_RESPONSAVEL_CANAL_VENDAS = "//input[@name='orgaoExpedidor']";
	private static final String PROFISSAO_RESPONSAVEL_CANAL_VENDAS = "//select[@name='profissao']";
	private static final String CARGO_RESPONSAVEL_CANAL_VENDAS = "//select[@name='nome']";
	private static final String ADICIONAR_CARGO_RESPONSAVEL_CANAL_VENDAS = "//div[@class='input-group-btn']//button[@class='btn default']";
	private static final String NOVO_CARGO_RESPONSAVEL_CANAL_VENDAS = "//button[contains(text(),'Novo')]";
	private static final String NOME_CARGO_RESPONSAVEL_CANAL_VENDAS = "//input[@name='keyView1']";
	private static final String SALVAR_CARGO_RESPONSAVEL_CANAL_VENDAS = "//button[@title='Salvar']";
	private static final String FECHAR_CARGO_RESPONSAVEL_CANAL_VENDAS = "//button[contains(text(),'Fechar')]";
	private static final String NACIONALIDADE_RESPONSAVEL_CANAL_VENDAS = "//select[@name='nacionalidade']";
	private static final String ESTADO_CIVIL_RESPONSAVEL_CANAL_VENDAS = "//select[@name='estadoCivil']";
	private static final String DATA_NASCIMENTO_RESPONSAVEL_CANAL_VENDAS = "//input[@name='dataNascimento']";
	private static final String EMAIL_RESPONSAVEL_CANAL_VENDAS = "(//input[@name='email'])[2]";
	private static final String NOVO_TELEFONE_RESPONSAVEL_CANAL_VENDAS = "//a[contains(text(),'Novo telefone')]";
	private static final String TELEFONE_RESPONSAVEL_CANAL_VENDAS = "(//label[contains(text(),'Telefone')]//parent::div//input)[2]";
	private static final String ADICIONAR_TELEFONE_RESPONSAVEL_CANAL_VENDAS = "//button[contains(text(),'Adicionar')]";
	private static final String CEP_RESPONSAVEL_CANAL_VENDAS = "(//input[@name='endereco_cep'])[2]";
	private static final String RESPONSAVEL_TEMPORARIO_CANAL_VENDAS = "//label[contains(text(),'Temporário')]//span[@class='box']";
	private static final String SITUACAO_RESPONSAVEL_CANAL_VENDAS = "//label[contains(text(),'Responsável ativo')]//span[@class='box']";
	private static final String ADICIONAR_RESPONSAVEL_CANAL_VENDAS = "//button[contains(text(),'Adicionar Responsável')]";
	private static final String NOVO_VENDEDOR_CANAL_VENDAS = "//button[contains(text(),'Novo vendedor(A)')]";
	private static final String CPF_VENDEDOR_CANAL_VENDAS = "//input[@name='cpf']";
	private static final String VENDEDOR_PROMOTOR_CANAL_VENDAS = "//label[contains(text(),'Promotor de vendas')]//span[@class='box']";
	private static final String ADICIONAR_VENDEDOR_CANAL_VENDAS = "//button[contains(text(),'Adicionar vendedor')]";
	private static final String NOVO_CONVENIADO_CANAL_VENDAS = "//button[contains(text(),'Novo conveniado')]";
	private static final String NOME_CONVENIADO_CANAL_VENDAS = "(//input[@name='nome'])[3]";
	private static final String IDENTIFICADOR_CONVENIADO_CANAL_VENDAS = "//input[@name='tiposParametrosVinculo']";
	private static final String IDENTIFICADOR2_CONVENIADO_CANAL_VENDAS = "//input[@name='tiposParametrosVinculo2']";
	private static final String ADICIONAR_CONVENIADO_CANAL_VENDAS = "//button[contains(text(),'Adicionar conveniado')]";
	private static final String PERCENTUAL_OFERTA_CANAL_VENDAS = "//touchspin[@name='valorDesconto']//input";
	private static final String PERIODO_PROMOCIONAL_CANAL_VENDAS = "//label[contains(text(),'Período promocional')]//span";
	private static final String DESCONTO_PERIODO_PROMOCIONAL_CANAL_VENDAS = "//touchspin[@name='valorDescontoPeriodoPromocional']//input";
	private static final String DATA_INICIO_PERIODO_PROMOCIONAL_CANAL_VENDAS = "//input[@name='inicioPeriodoPromocional']";
	private static final String DATA_FIM_PERIODO_PROMOCIONAL_CANAL_VENDAS = "//input[@name='fimPeriodoPromocional']";
	private static final String AREA_RESPONSAVEL_NOTIFICACAO_PROMOCIONAL_CANAL_VENDAS = "(//input[@name='nome'])[3]";
	private static final String EMAIL_NOTIFICACAO_PROMOCIONAL_CANAL_VENDAS = "(//input[@name='email'])[2]";
	private static final String NOVO_DESCONTO_CANAL_VENDAS = "//button[contains(text(),'Novo desconto')]";
	private static final String EMPRESA_DESCONTO_CANAL_VENDAS = "//select[@name='nome']";
	private static final String DESCONTO_CANAL_VENDAS = "//touchspin[@name='desconto']//input";
	private static final String OBSERVACOES_DESCONTO_CANAL_VENDAS = "//textarea[@name='observacao']";
	private static final String ADICIONAR_DESCONTO_CANAL_VENDAS = "//button[contains(text(),'Adicionar')]";
	private static final String INSTITUICAO_BANCARIA_CANAL_VENDAS = "//label[contains(text(),'Banco:')]//parent::div//select";
	private static final String NUMERO_AGENCIA_CANAL_VENDAS = "//input[@name='agenciaNumero']";
	private static final String DIGITO_AGENCIA_CANAL_VENDAS = "//input[@name='agenciaDigito']";
	private static final String NUMERO_CONTA_CANAL_VENDAS = "//input[@name='debito_conta']";
	private static final String DIGITO_CONTA_CANAL_VENDAS = "//input[@name='contaDigito']";
	private static final String DOCUMENTACAO_NECESSARIA_CANAL_VENDAS = "//input[@name='anexar']";
	private static final String ADICIONAR_DOCUMENTACAO_NECESSARIA_CANAL_VENDAS = "//button[contains(text(),'Adicionar')]";
	private static final String SALVAR_CANAL_VENDAS = "//button[contains(text(),'Salvar Canal de Vendas')]";

	private String tipoCanalVendas;
	private String parametrosVinculoCanalVendas;
	private String recebeRemuneracaoComissaoCanalVendas;
	private String tempoIndeterminadoVigenciaCanalVendas;
	private String periodoPromocionalCanalVendas;
	private String novoDescontoCanalVendas;

	public void setTipoCanalVendas(String tipoCanalVendas) {
		this.tipoCanalVendas = tipoCanalVendas;
		selecionarComboBox(By.xpath(TIPO_CANAL_VENDAS), tipoCanalVendas);
	}

	public void setNomeCanalVendas(String nomeCanalVendas) {
		escrever(By.xpath(NOME_CANAL_VENDAS), nomeCanalVendas);
	}

	public void setDescricaoCanalVendas(String descricaoCanalVendas) {
		escrever(By.xpath(DESCRICAO_CANAL_VENDAS), descricaoCanalVendas);
	}

	public void setParametrosVinculo(String parametrosVinculoCanalVendas) {
		this.parametrosVinculoCanalVendas = parametrosVinculoCanalVendas;
		if (tipoCanalVendas.trim().equals("Convênio")) {
			selecionarComboBox(By.xpath(PARAMETROS_VINCULO_CANAL_VENDAS), parametrosVinculoCanalVendas);
		}
	}

	public void setRazaoSocialCanalVendas(String razaoSocialCanalVendas) {
		if (tipoCanalVendas.trim().equals("Representante") || tipoCanalVendas.trim().equals("Cooperado")
				|| tipoCanalVendas.trim().equals("Convênio")) {
			escrever(By.xpath(RAZAO_SOCIAL_CANAL_VENDAS), razaoSocialCanalVendas);
		}
	}

	public void setCnpjCanalVendas(String cnpjCanalVendas) {
		if (tipoCanalVendas.trim().equals("Representante") || tipoCanalVendas.trim().equals("Cooperado")
				|| tipoCanalVendas.trim().equals("Convênio")) {
			escrever(By.xpath(CNPJ_CANAL_VENDAS), cnpjCanalVendas);
		}
	}

	public void setEmpresaCanalVendas(String empresaCanalVendas) {
		if (tipoCanalVendas.trim().equals("Matriz") || tipoCanalVendas.trim().equals("Filial")) {
			selecionarComboBox(By.xpath(EMPRESA_CANAL_VENDAS), empresaCanalVendas);
		}
	}

	public void setFilialCanalVendas(String filialCanalVendas) {
		if (tipoCanalVendas.trim().equals("Filial")) {
			selecionarComboBox(By.xpath(FILIAL_CANAL_VENDAS), filialCanalVendas);
		}
	}

	public void setSiteCanalVendas(String siteCanalVendas) {
		escrever(By.xpath(SITE_CANAL_VENDAS), siteCanalVendas);
	}

	public void setCaptadoCanalVendas(String captadoCanalVendas) {
		if (tipoCanalVendas.trim().equals("Representante") || tipoCanalVendas.trim().equals("Cooperado")
				|| tipoCanalVendas.trim().equals("Convênio")) {
			escrever(By.xpath(CAPTADO_CANAL_VENDAS), captadoCanalVendas);
			sleep(15);
			clicar(By.xpath(CAPTADO_CANAL_VENDAS));
			sleep(10);
//			esperarElementoFicarVisivel(By.xpath(LISTA_CAPTADO_CANAL_VENDAS));
			clicar(By.xpath("//a[contains(text(),'" + captadoCanalVendas + "')]"));
		}
	}

	public void setCoreCanalVendas(String coreCanalVendas) {
		if (tipoCanalVendas.trim().equals("Representante")) {
			escrever(By.xpath(CORE_CANAL_VENDAS), coreCanalVendas);
		}
	}

	public void setContatosObrigatoriosCanalVendas(String emailCanalVendas, String telefoneComercialCanalVendas) {
		escrever(By.xpath(EMAIL_CANAL_VENDAS), emailCanalVendas);
		escrever(By.xpath(TELEFONE_COMERCIAL_CANAL_VENDAS), telefoneComercialCanalVendas);
	}

	public void setCepCanalVendas(String cepCanalVendas) {
		escrever(By.xpath(CEP_CANAL_VENDAS), cepCanalVendas);
		sleep(15);
	}

	public void setTaxaIssCanalVendas(String taxaIssCanalVendas) {
		if (obterValorSelecionadoComboBox(By.xpath(UF_CANAL_VENDAS)).trim().equals("DF")) {
			escrever(By.xpath(TAXA_ISS_CANAL_VENDAS), taxaIssCanalVendas);
		}
	}

	public void setSituacaoCanalVendas(String situacaoCanalVendas) {
		if (!isCheckMarcado(By.xpath(SITUACAO_CANAL_VENDAS)) && situacaoCanalVendas.trim().equals("Ativo")) {
			clicar(By.xpath(SITUACAO_CANAL_VENDAS));
		} else if (isCheckMarcado(By.xpath(SITUACAO_CANAL_VENDAS)) && situacaoCanalVendas.trim().equals("Inativo")) {
			clicar(By.xpath(SITUACAO_CANAL_VENDAS));
		}
	}

	public void setRecebeRemuneracaoComissaoCanalVendas(String recebeRemuneracaoComissaoCanalVendas) {
		this.recebeRemuneracaoComissaoCanalVendas = recebeRemuneracaoComissaoCanalVendas;
		if (!isCheckMarcado(By.xpath(RECEBE_REMUNERACAO_COMISSAO_CANAL_VENDAS))
				&& recebeRemuneracaoComissaoCanalVendas.trim().equals("Sim")) {
			clicar(By.xpath(RECEBE_REMUNERACAO_COMISSAO_CANAL_VENDAS));
		} else if (isCheckMarcado(By.xpath(RECEBE_REMUNERACAO_COMISSAO_CANAL_VENDAS))
				&& recebeRemuneracaoComissaoCanalVendas.trim().equals("Não")) {
			clicar(By.xpath(RECEBE_REMUNERACAO_COMISSAO_CANAL_VENDAS));
		}
	}

	public void proximaAba() {
		try {
			clicar(By.xpath(PROXIMO));
		} catch (TimeoutException e) {
		}
	}

	public void setTempoIndeterminadoVigenciaCanalVendas(String tempoIndeterminadoVigenciaCanalVendas) {
		this.tempoIndeterminadoVigenciaCanalVendas = tempoIndeterminadoVigenciaCanalVendas;
		if (!isCheckMarcado(By.xpath(TEMPO_INDETERMINADO_VIGENCIA_CANAL_VENDAS))
				&& tempoIndeterminadoVigenciaCanalVendas.trim().equals("Sim")) {
			clicar(By.xpath(TEMPO_INDETERMINADO_VIGENCIA_CANAL_VENDAS));
		} else if (isCheckMarcado(By.xpath(TEMPO_INDETERMINADO_VIGENCIA_CANAL_VENDAS))
				&& tempoIndeterminadoVigenciaCanalVendas.trim().equals("Não")) {
			clicar(By.xpath(TEMPO_INDETERMINADO_VIGENCIA_CANAL_VENDAS));
		}
	}

	public void setInicioVigenciaCanalVendas(String inicioVigenciaCanalVendas) {
		escrever(By.xpath(INICIO_VIGENCIA_CANAL_VENDAS), inicioVigenciaCanalVendas);
	}

	public void setFimVigenciaCanalVendas(String fimVigenciaCanalVendas) {
		if (tempoIndeterminadoVigenciaCanalVendas.trim().equals("Não")) {
			escrever(By.xpath(FIM_VIGENCIA_CANAL_VENDAS), fimVigenciaCanalVendas);
		} else {
		}
	}

	public void setAreaResponsavelNotificacaoCanalVendas(String areaResponsavelNotificacaoCanalVendas) {
		escrever(By.xpath(AREA_RESPONSAVEL_NOTIFICACAO_CANAL_VENDAS), areaResponsavelNotificacaoCanalVendas);
	}

	public void setEmailNotificacaoCanalVendas(String emailNotificacaoCanalVendas) {
		escrever(By.xpath(EMAIL_NOTIFICACAO_CANAL_VENDAS), emailNotificacaoCanalVendas);
	}

	public void setResponsavelCanalVendas() {
		scrollPageUP();
		clicar(By.xpath(NOVO_REPONSAVEL_CANAL_VENDAS));
	}

	public void setNomeResponsavelCanalVendas(String nomeResponsavelCanalVendas) {
		escrever(By.xpath(NOME_RESPONSAVEL_CANAL_VENDAS), nomeResponsavelCanalVendas);
	}

	public void setSexoResponsavelCanalVendas(String sexoResponsavelCanalVendas) {
		selecionarComboBox(By.xpath(SEXO_RESPONSAVEL_CANAL_VENDAS), sexoResponsavelCanalVendas);
	}

	public void setCpfResponsavelCanalVendas(String cpfResponsavelCanalVendas) {
		escrever(By.xpath(CPF_RESPONSAVEL_CANAL_VENDAS), cpfResponsavelCanalVendas);
	}

	public void setRgResponsavelCanalVendas(String rgResponsavelCanalVendas) {
		escrever(By.xpath(RG_RESPONSAVEL_CANAL_VENDAS), rgResponsavelCanalVendas);
	}

	public void setOrgaoExpedidorResponsavelCanalVendas(String orgaoExpedidorResponsavelCanalVendas) {
		escrever(By.xpath(ORGAO_EXPEDIDOR_RESPONSAVEL_CANAL_VENDAS), orgaoExpedidorResponsavelCanalVendas);
	}

	public void setProfissaoResponsavelCanalVendas(String profissaoResponsavelCanalVendas) {
		selecionarComboBox(By.xpath(PROFISSAO_RESPONSAVEL_CANAL_VENDAS), profissaoResponsavelCanalVendas);
	}

	public void setCargoResponsavelCanalVendas(String cargoResponsavelCanalVendas) {
		try {
			selecionarComboBox(By.xpath(CARGO_RESPONSAVEL_CANAL_VENDAS), cargoResponsavelCanalVendas);
		} catch (NoSuchElementException e) {
			clicar(By.xpath(ADICIONAR_CARGO_RESPONSAVEL_CANAL_VENDAS));
			clicar(By.xpath(NOVO_CARGO_RESPONSAVEL_CANAL_VENDAS));
			escrever(By.xpath(NOME_CARGO_RESPONSAVEL_CANAL_VENDAS), cargoResponsavelCanalVendas);
			clicar(By.xpath(SALVAR_CARGO_RESPONSAVEL_CANAL_VENDAS));
			clicar(By.xpath(FECHAR_CARGO_RESPONSAVEL_CANAL_VENDAS));
			selecionarComboBox(By.xpath(CARGO_RESPONSAVEL_CANAL_VENDAS), cargoResponsavelCanalVendas);
		}
	}

	public void setNacionalidadeResponsavelCanalVendas(String nacionalidadeResponsavelCanalVendas) {
		selecionarComboBox(By.xpath(NACIONALIDADE_RESPONSAVEL_CANAL_VENDAS), nacionalidadeResponsavelCanalVendas);
	}

	public void setEstadoCivilResponsavelCanalVendas(String estadoCivilResponsavelCanalVendas) {
		selecionarComboBox(By.xpath(ESTADO_CIVIL_RESPONSAVEL_CANAL_VENDAS), estadoCivilResponsavelCanalVendas);
	}

	public void setDataNascimentoResponsavelCanalVendas(String dataNascimentoResponsavelCanalVendas) {
		escrever(By.xpath(DATA_NASCIMENTO_RESPONSAVEL_CANAL_VENDAS), dataNascimentoResponsavelCanalVendas);
	}

	public void setEmailResponsavelCanalVendas(String emailResponsavelCanalVendas) {
		escrever(By.xpath(EMAIL_RESPONSAVEL_CANAL_VENDAS), emailResponsavelCanalVendas);
	}

	public void setTelefoneResponsavelCanalVendas(String telefoneResponsavelCanalVendas) {
		clicar(By.xpath(NOVO_TELEFONE_RESPONSAVEL_CANAL_VENDAS));
		escrever(By.xpath(TELEFONE_RESPONSAVEL_CANAL_VENDAS), telefoneResponsavelCanalVendas);
		clicar(By.xpath(ADICIONAR_TELEFONE_RESPONSAVEL_CANAL_VENDAS));
	}

	public void setCepResponsavelCanalVendas(String cepResponsavelCanalVendas) {
		if (tipoCanalVendas.trim().equals("Representante") || tipoCanalVendas.trim().equals("Cooperado")
				|| tipoCanalVendas.trim().equals("Convênio")) {
			escrever(By.xpath(CEP_RESPONSAVEL_CANAL_VENDAS), cepResponsavelCanalVendas);
			sleep(15);
		}
	}

	public void setResponsavelTemporarioCanalVendas(String responsavelTemporarioCanalVendas) {
		if (!isCheckMarcado(By.xpath(RESPONSAVEL_TEMPORARIO_CANAL_VENDAS))
				&& responsavelTemporarioCanalVendas.trim().equals("Sim")) {
			clicar(By.xpath(RESPONSAVEL_TEMPORARIO_CANAL_VENDAS));
		} else if (isCheckMarcado(By.xpath(RESPONSAVEL_TEMPORARIO_CANAL_VENDAS))
				&& responsavelTemporarioCanalVendas.trim().equals("Não")) {
			clicar(By.xpath(RESPONSAVEL_TEMPORARIO_CANAL_VENDAS));
		}
	}

	public void setSituacaoResponsavelCanalVendas(String situacaoResponsavelCanalVendas) {
		if (!isCheckMarcado(By.xpath(SITUACAO_RESPONSAVEL_CANAL_VENDAS))
				&& situacaoResponsavelCanalVendas.trim().equals("Ativo")) {
			clicar(By.xpath(SITUACAO_RESPONSAVEL_CANAL_VENDAS));
		} else if (isCheckMarcado(By.xpath(SITUACAO_RESPONSAVEL_CANAL_VENDAS))
				&& situacaoResponsavelCanalVendas.trim().equals("Inativo")) {
			clicar(By.xpath(SITUACAO_RESPONSAVEL_CANAL_VENDAS));
		}
	}

	public void adicionarResponsavelCanalVendas() {
		clicar(By.xpath(ADICIONAR_RESPONSAVEL_CANAL_VENDAS));
	}

	public void setVendedorCanalVendas() {
		clicar(By.xpath(NOVO_VENDEDOR_CANAL_VENDAS));
	}

	public void setCpfVendedorCanalVendas(String cpfVendedorCanalVendas) {
		escrever(By.xpath(CPF_VENDEDOR_CANAL_VENDAS), cpfVendedorCanalVendas);
		sleep(10);
	}

	public void setVendedorPromotorCanalVendas(String vendedorPromotroCanalVendas) {
		if (!isCheckMarcado(By.xpath(VENDEDOR_PROMOTOR_CANAL_VENDAS))
				&& vendedorPromotroCanalVendas.trim().equals("Sim")) {
			clicar(By.xpath(VENDEDOR_PROMOTOR_CANAL_VENDAS));
		} else if (isCheckMarcado(By.xpath(VENDEDOR_PROMOTOR_CANAL_VENDAS))
				&& vendedorPromotroCanalVendas.trim().equals("Não")) {
			clicar(By.xpath(VENDEDOR_PROMOTOR_CANAL_VENDAS));
		}
	}

	public void adicionarVendedorCanalVendas() {
		clicar(By.xpath(ADICIONAR_VENDEDOR_CANAL_VENDAS));
	}

	public void setConveniadoCanalVendas() {
		if (tipoCanalVendas.trim().equals("Convênio")) {
			clicar(By.xpath(NOVO_CONVENIADO_CANAL_VENDAS));
		}
	}

	public void setNomeConveniadoCanalVendas(String nomeConveniadoCanalVendas) {
		if (tipoCanalVendas.trim().equals("Convênio")) {
			escrever(By.xpath(NOME_CONVENIADO_CANAL_VENDAS), nomeConveniadoCanalVendas);
		}
	}

	public void setIdentificadorConveniadoCanalVendas(String identificadorConveniadoCanalVendas) {
		if (tipoCanalVendas.trim().equals("Convênio")) {
			escrever(By.xpath(IDENTIFICADOR_CONVENIADO_CANAL_VENDAS), identificadorConveniadoCanalVendas);
		}
	}

	public void setIdentificador2ConveniadoCanalVendas(String identificadorConveniado2CanalVendas) {
		if (tipoCanalVendas.trim().equals("Convênio") && parametrosVinculoCanalVendas.trim().equals("CPF ou CNPJ")) {
			escrever(By.xpath(IDENTIFICADOR2_CONVENIADO_CANAL_VENDAS), identificadorConveniado2CanalVendas);
		} else if (tipoCanalVendas.trim().equals("Convênio")
				&& parametrosVinculoCanalVendas.trim().equals("Matrícula ou CPF")) {
			escrever(By.xpath(IDENTIFICADOR2_CONVENIADO_CANAL_VENDAS), identificadorConveniado2CanalVendas);
		}
	}

	public void adicionarConveniadoCanalVendas() {
		if (tipoCanalVendas.trim().equals("Convênio")) {
			clicar(By.xpath(ADICIONAR_CONVENIADO_CANAL_VENDAS));
		}
	}

	public void setPercentualOfertaCanalVendas(String percentualOfertaCanalVendas) {
		if (tipoCanalVendas.trim().equals("Convênio")) {
			escrever(By.xpath(PERCENTUAL_OFERTA_CANAL_VENDAS), percentualOfertaCanalVendas);
		}
	}

	public void setPeriodoPromocionalCanalVendas(String periodoPromocionalCanalVendas) {
		this.periodoPromocionalCanalVendas = periodoPromocionalCanalVendas;
		if (tipoCanalVendas.trim().equals("Convênio")) {
			if (!isCheckMarcado(By.xpath(PERIODO_PROMOCIONAL_CANAL_VENDAS))
					&& periodoPromocionalCanalVendas.trim().equals("Sim")) {
				clicar(By.xpath(PERIODO_PROMOCIONAL_CANAL_VENDAS));
			} else if (isCheckMarcado(By.xpath(PERIODO_PROMOCIONAL_CANAL_VENDAS))
					&& periodoPromocionalCanalVendas.trim().equals("Não")) {
				clicar(By.xpath(PERIODO_PROMOCIONAL_CANAL_VENDAS));
			}
		}
	}

	public void setDescontoPeriodoPromocionalCanalVendas(String descontoPeriodoPromocionalCanalVendas) {
		if (tipoCanalVendas.trim().equals("Convênio") && periodoPromocionalCanalVendas.trim().equals("Sim")) {
			escrever(By.xpath(DESCONTO_PERIODO_PROMOCIONAL_CANAL_VENDAS), descontoPeriodoPromocionalCanalVendas);
		}
	}

	public void setDataInicioPeriodoPromocionalCanalVendas(String dataInicioPeriodoPromocionalCanalVendas) {
		if (tipoCanalVendas.trim().equals("Convênio") && periodoPromocionalCanalVendas.trim().equals("Sim")) {
			escrever(By.xpath(DATA_INICIO_PERIODO_PROMOCIONAL_CANAL_VENDAS), dataInicioPeriodoPromocionalCanalVendas);
		}
	}

	public void setDataFimPeriodoPromocionalCanalVendas(String datafIMPeriodoPromocionalCanalVendas) {
		if (tipoCanalVendas.trim().equals("Convênio") && periodoPromocionalCanalVendas.trim().equals("Sim")) {
			escrever(By.xpath(DATA_FIM_PERIODO_PROMOCIONAL_CANAL_VENDAS), datafIMPeriodoPromocionalCanalVendas);
		}
	}

	public void setAreaResponsavelNotificacaoPromocionalCanalVendas(
			String areaResponsavelPromocionalNotificacaoCanalVendas) {
		if (tipoCanalVendas.trim().equals("Convênio") && periodoPromocionalCanalVendas.trim().equals("Sim")) {
			escrever(By.xpath(AREA_RESPONSAVEL_NOTIFICACAO_PROMOCIONAL_CANAL_VENDAS),
					areaResponsavelPromocionalNotificacaoCanalVendas);
		}
	}

	public void setEmailNotificacaoPromocionalCanalVendas(String emailNotificacaoPromocionalNotificacaoCanalVendas) {
		if (tipoCanalVendas.trim().equals("Convênio") && periodoPromocionalCanalVendas.trim().equals("Sim")) {
			escrever(By.xpath(EMAIL_NOTIFICACAO_PROMOCIONAL_CANAL_VENDAS),
					emailNotificacaoPromocionalNotificacaoCanalVendas);
		}
	}

	public void setNovoDescontoCanalVendas(String novoDescontoCanalVendas) {
		this.novoDescontoCanalVendas = novoDescontoCanalVendas;
		if (tipoCanalVendas.trim().equals("Convênio") && novoDescontoCanalVendas.trim().equals("Sim"))
			clicar(By.xpath(NOVO_DESCONTO_CANAL_VENDAS));
	}

	public void setEmpresaDescontoCanalVendas(String empresaDescontoCanalVendas) {
		if (tipoCanalVendas.trim().equals("Convênio") && novoDescontoCanalVendas.trim().equals("Sim")) {
			selecionarComboBox(By.xpath(EMPRESA_DESCONTO_CANAL_VENDAS), empresaDescontoCanalVendas);
		}
	}

	public void setDescontoCanalVendas(String descontoCanalVendas) {
		if (tipoCanalVendas.trim().equals("Convênio") && novoDescontoCanalVendas.trim().equals("Sim")) {
			escrever(By.xpath(DESCONTO_CANAL_VENDAS), descontoCanalVendas);
		}
	}

	public void setObservacoesDescontoCanalVendas(String observacoesDescontoCanalVendas) {
		if (tipoCanalVendas.trim().equals("Convênio") && novoDescontoCanalVendas.trim().equals("Sim")) {
			escrever(By.xpath(OBSERVACOES_DESCONTO_CANAL_VENDAS), observacoesDescontoCanalVendas);
		}
	}

	public void adicionarDescontoCanalVendas() {
		if (tipoCanalVendas.trim().equals("Convênio") && novoDescontoCanalVendas.trim().equals("Sim")) {
			clicar(By.xpath(ADICIONAR_DESCONTO_CANAL_VENDAS));
		}
	}

	public void setInstituicaoBancariaCanalVendas(String instituicaoBancariaCanalVendas) {
		if (recebeRemuneracaoComissaoCanalVendas.trim().equals("Sim")) {
			selecionarComboBox(By.xpath(INSTITUICAO_BANCARIA_CANAL_VENDAS), instituicaoBancariaCanalVendas);
		}
	}

	public void setNumeroAgenciaBancariaCanalVendas(String numeroAgenciaBancariaCanalVendas) {
		if (recebeRemuneracaoComissaoCanalVendas.trim().equals("Sim")) {
			StringTokenizer numeroAgencia = new StringTokenizer(numeroAgenciaBancariaCanalVendas);
			escrever(By.xpath(NUMERO_AGENCIA_CANAL_VENDAS), numeroAgencia.nextToken("-"));
			escrever(By.xpath(DIGITO_AGENCIA_CANAL_VENDAS), numeroAgencia.nextToken("-"));
		}
	}

	public void setNumeroContaBancariaCanalVendas(String numeroContaBancariaCanalVendas) {
		if (recebeRemuneracaoComissaoCanalVendas.trim().equals("Sim")) {
			StringTokenizer numeroConta = new StringTokenizer(numeroContaBancariaCanalVendas);
			escrever(By.xpath(NUMERO_CONTA_CANAL_VENDAS), numeroConta.nextToken("-"));
			escrever(By.xpath(DIGITO_CONTA_CANAL_VENDAS), numeroConta.nextToken("-"));
		}
	}

	public void setDocumentacaoNecessariaCanalVendas(String arquivo) throws AWTException {
		fileUpload(By.xpath(DOCUMENTACAO_NECESSARIA_CANAL_VENDAS),
				"\\src\\test\\resources\\arquivos\\documentos\\" + arquivo);
	}

	public void adicionarDocumentacaoNecessariaCanalVendas() {
		clicar(By.xpath(ADICIONAR_DOCUMENTACAO_NECESSARIA_CANAL_VENDAS));
	}

	public void salvarCanalVendas() {
		clicar(By.xpath(SALVAR_CANAL_VENDAS));
	}

}