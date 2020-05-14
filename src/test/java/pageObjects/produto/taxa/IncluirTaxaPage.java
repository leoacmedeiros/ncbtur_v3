package pageObjects.produto.taxa;

import org.openqa.selenium.By;

import core.BasePage;

public class IncluirTaxaPage extends BasePage {

	private static final String TIPO_TAXA = "//select[@name='tipo']";
	private static final String NOME_TAXA = "//input[@name='nome']";
	private static final String PERMITE_COMISSAO = "//label[contains(text(),'Permitir comissão?')]//span[@class='box']";
	private static final String DESCONTO_POLITICA_VENDAS = "//label[contains(text(),'Desc. política de vendas?')]//span[@class='box']";
	private static final String DESCONTO_CONVENIO = "//label[contains(text(),'Desc. Convênio?')]//span[@class='box']";
	private static final String DESCRICAO = "//textarea[@name='descricao']";
	private static final String SITUACAO = "//label[contains(text(),'Taxa ativa?')]//span[@class='box']";
	private static final String SALVAR_TAXA = "//button[contains(text(),'Salvar Taxa')]";
	
	private String tipoTaxa;

	public void setTipoTaxa(String tipoTaxa) {
		this.tipoTaxa = tipoTaxa;
		selecionarComboBox(By.xpath(TIPO_TAXA), tipoTaxa);
	}

	public void setNomeTaxa(String nomeTaxa) {
		escrever(By.xpath(NOME_TAXA), nomeTaxa);
	}

	public void setPermiteComissao(String permiteComissao) {
		if (tipoTaxa.trim().equals("Adesão") && permiteComissao.trim().equals("Sim")) {
			clicar(By.xpath(PERMITE_COMISSAO));
		} else if (tipoTaxa.trim().equals("Manutenção") && permiteComissao.trim().equals("Sim")) {
		} else if (tipoTaxa.trim().equals("Taxa") && permiteComissao.trim().equals("Sim")) {
			clicar(By.xpath(PERMITE_COMISSAO));
		}
	}

	public void setDescontoCampanha(String descontoCampanha) {
		if (tipoTaxa.trim().equals("Adesão") && descontoCampanha.trim().equals("Sim")) {
			clicar(By.xpath(DESCONTO_POLITICA_VENDAS));
		} else if (tipoTaxa.trim().equals("Manutenção") && descontoCampanha.trim().equals("Sim")) {
		} else if (tipoTaxa.trim().equals("Taxa") && descontoCampanha.trim().equals("Sim")) {
			clicar(By.xpath(DESCONTO_POLITICA_VENDAS));
		}
	}

	public void setDescontoConvenio(String descontoConvenio) {
		if (tipoTaxa.trim().equals("Adesão") && descontoConvenio.trim().equals("Sim")) {
			clicar(By.xpath(DESCONTO_CONVENIO));
		} else if (tipoTaxa.trim().equals("Manutenção") && descontoConvenio.trim().equals("Sim")) {
		} else if (tipoTaxa.trim().equals("Taxa") && descontoConvenio.trim().equals("Sim")) {
			clicar(By.xpath(DESCONTO_CONVENIO));
		}
	}

	public void setDescricao(String descricao) {
		escrever(By.xpath(DESCRICAO), descricao);
	}

	public void setSituacao(String situacao) {
		if (situacao.trim().equals("Ativo")) {
			clicar(By.xpath(SITUACAO));
		}
	}

	public void salvarTaxa() {
		clicar(By.xpath(SALVAR_TAXA));
	}

}
