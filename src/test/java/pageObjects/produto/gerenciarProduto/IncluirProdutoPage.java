package pageObjects.produto.gerenciarProduto;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import core.BasePage;
import core.DriverFactory;

public class IncluirProdutoPage extends BasePage {

	private static final String NOME_PRODUTO = "//input[@name='nome']";
	private static final String TIPO_PRODUTO = "//select[@name='tipo']";
	private static final String NIVEL_UTILIZACAO_PRODUTO = "//select[@name='nivelUtilizacao']";
	private static final String ADICIONAR_NIVEL_UTILIZACAO_PRODUTO = "(//button[@class='btn btn-success'])[1]";
	private static final String NOVO_NIVEL_UTILIZACAO_PRODUTO = "//button[contains(text(),'Novo Nível de Utilização')]";
	private static final String NOME_NIVEL_UTILIZACAO_PRODUTO = "//input[@name='nivelUtilizacao']";
	private static final String SALVAR_NIVEL_UTILIZACAO_PRODUTO = "//button[contains(text(),'Salvar')]";
	private static final String FECHAR_NIVEL_UTILIZACAO_PRODUTO = "(//button[contains(text(),'Fechar')])[2]";
	private static final String CATEGORIA_PRODUTO = "//select[@name='categoria']";
	private static final String ADICIONAR_CATEGORIA_PRODUTO = "(//button[@class='btn btn-success'])[2]";
	private static final String NOVA_CATEGORIA_PRODUTO = "//button[contains(text(),'Nova Categoria')]";
	private static final String NOME_CATEGORIA_PRODUTO = "//input[@name='nomeCategoria']";
	private static final String SALVAR_CATEGORIA_PRODUTO = "//button[contains(text(),'Salvar')]";
	private static final String FECHAR_CATEGORIA_PRODUTO = "//button[contains(text(),'Fechar')]";
	private static final String MENSALIDADE_PRODUTO = "//touchspin[@name='parcelasTM']//input";
	private static final String SITUACAO_PRODUTO = "//label[contains(text(),'Produto ativo?')]//span[@class='box']";
	private static final String DIARIAS_PRODUTO = "//touchspin[@name='diarias']//input";
	private static final String QTD_ESTOQUE_PRODUTO = "//touchspin[@name='estoque']//input";
	private static final String ESTOQUE_ILIMITADO_PRODUTO = "//label[contains(text(),'Ilimitado?')]";
	private static final String DESCRICAO_PRODUTO = "//textarea[@name='descricao']";
	private static final String PERIODO_UTILIZACAO_PRODUTO = "//span[contains(text(),'Por data limite:')]//span";
	private static final String DURACAO_UTILIZACAO_PRODUTO = "//touchspin[@name='duracao']//input";
	private static final String DATA_LIMITE_UTILIZACAO_PRODUTO = "//input[@name='dataLimite']";
	private static final String FERIADO_PROLONGADO = "//label[contains(text(),'Exceto feriados prolongados?')]//span[@class='box']";
	private static final String ALTA_TEMPORADA = "//label[contains(text(),'Exceto alta temporada?')]//span[@class='box']";
	private static final String DESPESAS_ADICIONAIS = "//label[contains(text(),'Permite reservas com despesas adicionais?')]//span[@class='box']";
	private static final String TIPO_COBRANCA = "//select[@name='tipoCobranca']";
	private static final String VIRADA_PERIODO = "//label[contains(text(),'Habilitar virada do período?')]//span[@class='box']";
	private static final String REGRAS_CARENCIA = "//label[contains(text(),'Habilitar regras de carência?')]//span[@class='box']";
	private static final String QTD_TAXA_MANUTENCAO = "//touchspin[@name='taxaManutencao']//input";
	private static final String QTD_TAXA_ADESAO = "//touchspin[@name='parcelasDaTaxaAdesao']//input";
	private static final String TODAS_TAXAS_ADESAO = "//label[contains(text(),'Todas')]/span[@class='check']";
	private static final String CONVERSAO_DIARIAS = "//label[contains(text(),'Permite conversão de diárias')]//span[@class='box']";
	private static final String SALVAR_PRODUTO = "//button[contains(text(),'Salvar Produto')]";
	private static final String MENSAGEM = "toast-container";

	private String tipoProduto;

	public void setNomeProduto(String nomeProduto) {
		escrever(By.xpath(NOME_PRODUTO), nomeProduto);
	}

	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
		selecionarComboBox(By.xpath(TIPO_PRODUTO), tipoProduto);
	}

	public void setNivelUtilizacaoProduto(String nivelUtilizacao) {
		try {
			selecionarComboBox(By.xpath(NIVEL_UTILIZACAO_PRODUTO), nivelUtilizacao);
		} catch (NoSuchElementException e) {
			clicar(By.xpath(ADICIONAR_NIVEL_UTILIZACAO_PRODUTO));
			clicar(By.xpath(NOVO_NIVEL_UTILIZACAO_PRODUTO));
			escrever(By.xpath(NOME_NIVEL_UTILIZACAO_PRODUTO), nivelUtilizacao);
			clicar(By.xpath(SALVAR_NIVEL_UTILIZACAO_PRODUTO));
			esperarElementoFicarVisivel(By.id(MENSAGEM));
			Assertions.assertEquals("Nível de Utilização salvo com sucesso!", obterTexto(By.id(MENSAGEM)));
			sleep(3);
			clicar(By.xpath(FECHAR_NIVEL_UTILIZACAO_PRODUTO));
			selecionarComboBox(By.xpath(NIVEL_UTILIZACAO_PRODUTO), nivelUtilizacao);
		}
	}

	public void setCategoriaProduto(String categoriaProduto) {
		try {
			selecionarComboBox(By.xpath(CATEGORIA_PRODUTO), categoriaProduto);
		} catch (NoSuchElementException e) {
			clicar(By.xpath(ADICIONAR_CATEGORIA_PRODUTO));
			clicar(By.xpath(NOVA_CATEGORIA_PRODUTO));
			escrever(By.xpath(NOME_CATEGORIA_PRODUTO), categoriaProduto);
			clicar(By.xpath(SALVAR_CATEGORIA_PRODUTO));
			esperarElementoFicarVisivel(By.id(MENSAGEM));
			Assertions.assertEquals("Categoria salva com sucesso!", obterTexto(By.id(MENSAGEM)));
			sleep(3);
			clicar(By.xpath(FECHAR_CATEGORIA_PRODUTO));
			selecionarComboBox(By.xpath(CATEGORIA_PRODUTO), categoriaProduto);
		}
	}

	public void setMensalidadeProduto(String mensalidadeProduto) {
		if (tipoProduto.trim().equals("Venda")) {
			escrever(By.xpath(MENSALIDADE_PRODUTO), mensalidadeProduto);
		}
	}

	public void setSituacaoProduto(String situacaoProduto) {
		boolean situacaoProdutoChecked = DriverFactory.getDriver().findElement(By.xpath(SITUACAO_PRODUTO)).isSelected();
		if (situacaoProdutoChecked == false && situacaoProduto.trim().equals("Inativo")) {
			clicar(By.xpath(SITUACAO_PRODUTO));
		}
	}

	public void setDiariasProduto(String diariasProduto) {
		if (tipoProduto.trim().equals("Bonificação") || tipoProduto.trim().equals("Promocional")
				|| tipoProduto.trim().equals("Venda")) {
			escrever(By.xpath(DIARIAS_PRODUTO), diariasProduto);
		}
	}

	public void setQtdEstoqueProduto(String qtdEstoqueProduto) {
		if (tipoProduto.trim().equals("Promocional")) {
			escrever(By.xpath(QTD_ESTOQUE_PRODUTO), qtdEstoqueProduto);
			if (qtdEstoqueProduto.trim().equals("Ilimitado")) {
				clicar(By.xpath(ESTOQUE_ILIMITADO_PRODUTO));
			}
		}
	}

	public void setDescricaoProduto(String descricaoProduto) {
		escrever(By.xpath(DESCRICAO_PRODUTO), descricaoProduto);
	}

	public void setPeriodoUtilizacaoProduto(String periodoUtilizacaoProduto) {
		if (tipoProduto.trim().equals("Promocional") && periodoUtilizacaoProduto.trim().contains("/")) {
			clicar(By.xpath(PERIODO_UTILIZACAO_PRODUTO));
			escrever(By.xpath(DATA_LIMITE_UTILIZACAO_PRODUTO), periodoUtilizacaoProduto);
		} else if (tipoProduto.trim().equals("Bonificação") || tipoProduto.trim().equals("Promocional")
				|| tipoProduto.trim().equals("Venda")) {
			escrever(By.xpath(DURACAO_UTILIZACAO_PRODUTO), periodoUtilizacaoProduto);
		}
	}

	public void setFeriadoProlongado(String feriadoProlongado) {
		if (tipoProduto.trim().equals("Bonificação") || tipoProduto.trim().equals("Promocional")
				|| tipoProduto.trim().equals("Venda")) {
			boolean feriadoProlongadoChecked = DriverFactory.getDriver().findElement(By.xpath(FERIADO_PROLONGADO))
					.isSelected();
			if (feriadoProlongadoChecked == false && feriadoProlongado.trim().equals("Sim")) {
				clicar(By.xpath(FERIADO_PROLONGADO));
			}
		}
	}

	public void setAltaTemporada(String altaTemporada) {
		if (tipoProduto.trim().equals("Bonificação") || tipoProduto.trim().equals("Promocional")
				|| tipoProduto.trim().equals("Venda")) {
			boolean altaTemporadaChecked = DriverFactory.getDriver().findElement(By.xpath(ALTA_TEMPORADA)).isSelected();
			if (altaTemporadaChecked == false && altaTemporada.trim().equals("Sim")) {
				clicar(By.xpath(ALTA_TEMPORADA));
			}
		}
	}

	public void setDespesasAdicionais(String despesasAdicionais, String tipoCobranca) {
		boolean despesasAdicionaisChecked = DriverFactory.getDriver().findElement(By.xpath(DESPESAS_ADICIONAIS))
				.isSelected();
		if (despesasAdicionaisChecked == false && despesasAdicionais.trim().equals("Sim")) {
			clicar(By.xpath(DESPESAS_ADICIONAIS));
			selecionarComboBox(By.xpath(TIPO_COBRANCA), tipoCobranca);
		} else if (despesasAdicionaisChecked == true && despesasAdicionais.trim().equals("Sim")) {
			selecionarComboBox(By.xpath(TIPO_COBRANCA), tipoCobranca);
		} else if (despesasAdicionaisChecked == true && despesasAdicionais.trim().equals("Não")) {
			clicar(By.xpath(DESPESAS_ADICIONAIS));
		}
	}

	public void setViradaPeriodo(String viradaPeriodo) {
		if (tipoProduto.trim().equals("Bonificação") || tipoProduto.trim().equals("Promocional")
				|| tipoProduto.trim().equals("Venda")) {
			boolean viradaPeriodoChecked = DriverFactory.getDriver().findElement(By.xpath(VIRADA_PERIODO)).isSelected();
			if (viradaPeriodoChecked == false && viradaPeriodo.trim().equals("Sim")) {
				clicar(By.xpath(VIRADA_PERIODO));
			}
		}
	}

	public void setRegrasCarencia(String regrasCarencia, String qtdTaxaManutencao, String qtdTaxaAdesao) {
		if (tipoProduto.trim().equals("Bonificação") || tipoProduto.trim().equals("Promocional")
				|| tipoProduto.trim().equals("Venda")) {
			boolean regrasCarenciaChecked = DriverFactory.getDriver().findElement(By.xpath(REGRAS_CARENCIA))
					.isSelected();
			if (regrasCarenciaChecked == false && regrasCarencia.trim().equals("Sim")) {
				clicar(By.xpath(REGRAS_CARENCIA));
				escrever(By.xpath(QTD_TAXA_MANUTENCAO), qtdTaxaManutencao);
				if (!(qtdTaxaAdesao.trim().equals("Todas"))) {
					System.out.println(TODAS_TAXAS_ADESAO);
					clicar(By.xpath(TODAS_TAXAS_ADESAO));
					escrever(By.xpath(QTD_TAXA_ADESAO), qtdTaxaAdesao);
				}
			}
		}
	}

	public void setConversaoDiarias(String conversaoDiarias) {
		if (tipoProduto.trim().equals("Bonificação") || tipoProduto.trim().equals("Promocional")
				|| tipoProduto.trim().equals("Venda")) {
			boolean botaoChecked = DriverFactory.getDriver().findElement(By.xpath(CONVERSAO_DIARIAS)).isSelected();
			if (botaoChecked == false && conversaoDiarias.trim().equals("Sim")) {
				clicar(By.xpath(CONVERSAO_DIARIAS));
			}
		}
	}

	public void salvarProduto() {
		clicar(By.xpath(SALVAR_PRODUTO));
	}

}
