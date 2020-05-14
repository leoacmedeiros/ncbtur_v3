package pageObjects.produto.politicaVenda;

import org.openqa.selenium.By;

import core.BasePage;

public class IncluirPoliticaVendaPage extends BasePage {

	private static final String CODIGO_PROMOCIONAL_POLITICA_VENDA = "//input[@name='codigoPromocional']";
	private static final String NOME_POLITICA_VENDA = "//input[@name='nome']";
	private static final String TIPO_POLITICA_VENDA = "//select[@name='tipo']";
	private static final String DESCRICAO_POLITICA_VENDA = "//textarea[@name='descricao']";
	private static final String SITUACAO_POLITICA_VENDA = "//label[contains(text(),'Política de venda ativa')]//span[@class='box']";
	private static final String RESTRICOES_POLITICA_VENDA = "//textarea[@name='observacoes']";
	private static final String TEMPO_INDETERMINADO_VIGENCIA_POLITICA_VENDA = "//label[contains(text(),'Tempo Indeterminado')]//span";
	private static final String PERIODO_DEFINIDO_POLITICA_VENDA = "//label[contains(text(),'Período definido')]/span";
	private static final String INICIO_VIGENCIA_POLITICA_VENDA = "//input[@name='inicioVigencia']";
	private static final String FIM_VIGENCIA_POLITICA_VENDA = "//input[@name='fimVigencia']";
	private static final String PERIODO_MESES_POLITICA_VENDA = "//label[contains(text(),'Meses')]/span";
	private static final String QTD_MESES_POLITICA_VENDA = "//input[@class='touchspin-input']";
	private static final String ESTOQUE_PRODUTO_POLITICA_VENDA = "//label[contains(text(),'Enquanto houver estoque')]//span";
	private static final String TODOS_PRODUTO_POLITICA_VENDA = "//label[contains(text(),'Selecionar todos')]//span[@class='box']";
	private static final String TODOS_DESCONTO_CONVENIO_POLITICA_VENDA = "//input[@id='selecionado']//parent::div//span[@class='box']";
	private static final String CANAL_VENDA_POLITICA_VENDA = "//button[@class='btn green']";
	private static final String PESQUISAR_CANAL_VENDA_POLITICA_VENDA = "(//button[@name='pesquisar'])[2]";
	private static final String TODOS_CANAIS_VENDA_POLITICA_VENDA = "//table[@class='table table-striped table-bordered table-advance table-hover']//thead//tr//th//span";
	private static final String ADICIONAR_CANAIS_VENDA_POLITICA_VENDA = "//button[@name='adicionar']";
	private static final String NOME_CANAL_VENDAS_POLITICA_VENDA = "(//input[@name='nome'])[2]";
	private static final String SELECIONAR_CANAL_VENDA_POLITICA_VENDA = "//tbody//label[@class='mt-checkbox mt-checkbox-outline']//span";
	private static final String TODOS_ESTADOS_POLITICA_VENDA = "//label[contains(text(),'Selecionar tudo')]//span[@class='box']";
	private static final String SALVAR_POLITICA_VENDAS = "//button[contains(text(),'Salvar política de vendas')]";

	private String tipoPoliticaVenda;
	private String tipoVigenciaPoliticaVenda;
	private String tempoIndeterminadoVigenciaPoliticaVenda;

	public void setCodigoPromocionalPoliticaVenda(String codigoPromocionalPoliticaVenda) {
		if (codigoPromocionalPoliticaVenda == null) {
			escrever(By.xpath(CODIGO_PROMOCIONAL_POLITICA_VENDA), "");
		} else {
			escrever(By.xpath(CODIGO_PROMOCIONAL_POLITICA_VENDA), codigoPromocionalPoliticaVenda);
		}
	}

	public void setNomePoliticaVenda(String nomePoliticaVenda) {
		escrever(By.xpath(NOME_POLITICA_VENDA), nomePoliticaVenda);
	}

	public void setTipoPoliticaVenda(String tipoPoliticaVenda) {
		this.tipoPoliticaVenda = tipoPoliticaVenda;
		selecionarComboBox(By.xpath(TIPO_POLITICA_VENDA), tipoPoliticaVenda);
	}

	public void setDescricaoPoliticaVenda(String descricaoPoliticaVenda) {
		escrever(By.xpath(DESCRICAO_POLITICA_VENDA), descricaoPoliticaVenda);
	}

	public void setSituacaoPoliticaVenda(String situacaoPoliticaVenda) {
		if (!isCheckMarcado(By.xpath(SITUACAO_POLITICA_VENDA)) && situacaoPoliticaVenda.trim().equals("Ativa")) {
			clicar(By.xpath(SITUACAO_POLITICA_VENDA));
		} else if (isCheckMarcado(By.xpath(SITUACAO_POLITICA_VENDA))
				&& situacaoPoliticaVenda.trim().equals("Inativa")) {
			clicar(By.xpath(SITUACAO_POLITICA_VENDA));
		}
	}

	public void setRestricoesPoliticaVenda(String restricoesPoliticaVenda) {
		escrever(By.xpath(RESTRICOES_POLITICA_VENDA), restricoesPoliticaVenda);
	}

	public void setTempoIndeterminadoVigenciaCanalVendas(String tempoIndeterminadoVigenciaPoliticaVenda) {
		this.tempoIndeterminadoVigenciaPoliticaVenda = tempoIndeterminadoVigenciaPoliticaVenda;
		if (!isCheckMarcado(By.xpath(TEMPO_INDETERMINADO_VIGENCIA_POLITICA_VENDA))
				&& tempoIndeterminadoVigenciaPoliticaVenda.trim().equals("Sim")) {
			clicar(By.xpath(TEMPO_INDETERMINADO_VIGENCIA_POLITICA_VENDA));
		} else if (isCheckMarcado(By.xpath(TEMPO_INDETERMINADO_VIGENCIA_POLITICA_VENDA))
				&& tempoIndeterminadoVigenciaPoliticaVenda.trim().equals("Não")) {
			clicar(By.xpath(TEMPO_INDETERMINADO_VIGENCIA_POLITICA_VENDA));
		}
	}

	public void setTipoVigenciaPoliticaVenda(String tipoVigenciaPoliticaVenda) {
		this.tipoVigenciaPoliticaVenda = tipoVigenciaPoliticaVenda;
		if (tipoVigenciaPoliticaVenda.trim().equals("Período definido")) {
			clicar(By.xpath(PERIODO_DEFINIDO_POLITICA_VENDA));
		} else if (tipoVigenciaPoliticaVenda.trim().equals("Meses")) {
			clicar(By.xpath(PERIODO_MESES_POLITICA_VENDA));
		}
	}

	public void setInicioVigenciaPoliticaVenda(String inicioVigenciaPoliticaVenda) {
		if (tipoVigenciaPoliticaVenda.trim().equals("Período definido")) {
			escrever(By.xpath(INICIO_VIGENCIA_POLITICA_VENDA), inicioVigenciaPoliticaVenda);
		}
	}

	public void setFimVigenciaPoliticaVenda(String fimVigenciaPoliticaVenda) {
		if (tipoVigenciaPoliticaVenda.trim().equals("Período definido")
				&& tempoIndeterminadoVigenciaPoliticaVenda.trim().equals("Não")) {
			escrever(By.xpath(FIM_VIGENCIA_POLITICA_VENDA), fimVigenciaPoliticaVenda);
		}
	}

	public void setQtdMesesVigenciaPoliticaVenda(String qtdMesesPoliticaVensda) {
		if (tipoVigenciaPoliticaVenda.trim().equals("Meses")) {
			escrever(By.xpath(QTD_MESES_POLITICA_VENDA), qtdMesesPoliticaVensda);
		}
	}

	public void setEstoqueProdutoPoliticaVenda(String estoqueProdutoPoliticaVenda) {
		if (tipoPoliticaVenda.trim().equals("Promocional") && estoqueProdutoPoliticaVenda.trim().equals("Sim")) {
			clicar(By.xpath(ESTOQUE_PRODUTO_POLITICA_VENDA));
		}
	}

	public void setProdutoPoliticaVenda(String produtosPoliticaVenda) {
		scrollPageUP();
		sleep(2);
		if (produtosPoliticaVenda.trim().equals("Todos")) {
			clicar(By.xpath(TODOS_PRODUTO_POLITICA_VENDA));
		} else {
			for (String produtoPoliticaVenda : produtosPoliticaVenda.split(","))
				clicar(By.xpath("//label[contains(text(),'" + produtoPoliticaVenda.trim() + "')]//span[@class='box']"));
		}
	}

	public void setDescontoConvenioPoliticaVenda(String descontosConvenioPoliticaVenda) {
		if (descontosConvenioPoliticaVenda.trim().equals("Todos")) {
			clicar(By.xpath(TODOS_DESCONTO_CONVENIO_POLITICA_VENDA));
		} else {
			for (String descontoConvenioPoliticaVenda : descontosConvenioPoliticaVenda.split(","))
				clicar(By.xpath("//div[contains(text(),'" + descontoConvenioPoliticaVenda.trim()
						+ "')]//ancestor::tr//div[@class='md-checkbox']//span[@class='box']"));
		}
	}

	public void setCanalVendaPoliticaVenda(String canalVendaPoliticaVendas) {
		scrollPageUP();
		clicar(By.xpath(CANAL_VENDA_POLITICA_VENDA));
		if (canalVendaPoliticaVendas.trim().equals("Todos")) {
			clicar(By.xpath(PESQUISAR_CANAL_VENDA_POLITICA_VENDA));
			esperarElementoFicarVisivel(By.xpath(TODOS_CANAIS_VENDA_POLITICA_VENDA));
			clicar(By.xpath(TODOS_CANAIS_VENDA_POLITICA_VENDA));
			clicar(By.xpath(ADICIONAR_CANAIS_VENDA_POLITICA_VENDA));
		} else {
			for (String canalVendaPoliticaVenda : canalVendaPoliticaVendas.split(",")) {
				escrever(By.xpath(NOME_CANAL_VENDAS_POLITICA_VENDA), canalVendaPoliticaVenda);
				clicar(By.xpath(PESQUISAR_CANAL_VENDA_POLITICA_VENDA));
				esperarElementoFicarVisivel(By.xpath(SELECIONAR_CANAL_VENDA_POLITICA_VENDA));
				clicar(By.xpath(SELECIONAR_CANAL_VENDA_POLITICA_VENDA));
				clicar(By.xpath(ADICIONAR_CANAIS_VENDA_POLITICA_VENDA));
			}
		}
	}

	public void setEstadosPoliticaVendas(String estadosPoliticaVendas) {
		if (estadosPoliticaVendas.trim().equals("Todos")) {
			clicar(By.xpath(TODOS_ESTADOS_POLITICA_VENDA));
		} else {
			for (String estadosPoliticaVenda : estadosPoliticaVendas.split(",")) {
				clicar(By.xpath("//label[contains(text(),'" + estadosPoliticaVenda.trim() + "')]"));
			}
		}
	}

	public void salvarPoliticaVendas() {
		clicar(By.xpath(SALVAR_POLITICA_VENDAS));
	}

}