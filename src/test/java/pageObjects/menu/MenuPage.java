package pageObjects.menu;

import org.openqa.selenium.By;

import core.BasePage;

public class MenuPage extends BasePage {

	private static final String MENU_PRODUTO = "//span[contains(text(),'Produto')]";
	private static final String TAXA = "//span[contains(text(),'Taxa')]";
	private static final String GERENCIAR_PRODUTO = "//span[contains(text(),'Gerenciar Produtos')]";
	private static final String LISTA_PRECO = "//span[contains(text(),'Lista de Preço')]";
	private static final String CANAL_VENDAS = "//span[contains(text(),'Canal de Vendas')]";
	private static final String POLITICA_VENDA = "//span[contains(text(),'Política de Venda')]";
	private static final String MENU_MEIOS_HOSPEDAGEM = "//span[contains(text(),'Meios de Hospedagem')]";
	private static final String NEGOCIACAO = "//span[contains(text(),'Negociação')]";
	private static final String NOVO_CONVENIO = "//span[contains(text(),'Novo convênio')]";
	private static final String MENU_CLIENTE = "//span[contains(text(),'Cliente')]";
	private static final String PROPOSTA_ADESAO = "//span[contains(text(),'Proposta de adesão')]";
	private static final String GERENCIAR = "//span[contains(text(),'Meios de Hospedagem')]//parent::a//parent::li//span[contains(text(),'Gerenciar')]";
	private static final String ADM_MEIO_HOSPEDAGEM = "//span[contains(text(),'Administradora de Meio de Hospedagem')]";
	private static final String FORNECEDORES = "//span[contains(text(),'Fornecedores')]";
	private static final String REDE = "//span[contains(text(),'Rede')]";
	private static final String TIPO_MEIO_HOSPEDAGEM = "//span[contains(text(),'Tipo de Meio de Hospedagem')]";
		

	public void acessarTaxa() {
		clicar(By.xpath(MENU_PRODUTO));
		clicar(By.xpath(TAXA));
	}

	public void acessarGerenciarProduto() {
		clicar(By.xpath(MENU_PRODUTO));
		clicar(By.xpath(GERENCIAR_PRODUTO));
	}

	public void acessarListaPreco() {
		clicar(By.xpath(MENU_PRODUTO));
		clicar(By.xpath(LISTA_PRECO));
	}

	public void acessarCanalVendas() {
		clicar(By.xpath(MENU_PRODUTO));
		clicar(By.xpath(CANAL_VENDAS));
	}

	public void acessarPoliticaVenda() {
		clicar(By.xpath(MENU_PRODUTO));
		clicar(By.xpath(POLITICA_VENDA));
	}

	public void acessarNovoConvenio() {
		esperarPresencaDoLoading();
		scrollElementoClicar(By.xpath(MENU_MEIOS_HOSPEDAGEM));
		scrollElementoClicar(By.xpath(NEGOCIACAO));
		scrollElementoClicar(By.xpath(NOVO_CONVENIO));
	}

	public void acessarAdministradoraMeioHospedagem() {
		esperarPresencaDoLoading();
		scrollElementoClicar(By.xpath(MENU_MEIOS_HOSPEDAGEM));
		scrollElementoClicar(By.xpath(GERENCIAR));
		scrollElementoClicar(By.xpath(ADM_MEIO_HOSPEDAGEM));
	}

	public void acessarFornecedores() {
		esperarPresencaDoLoading();
		scrollElementoClicar(By.xpath(MENU_MEIOS_HOSPEDAGEM));
		scrollElementoClicar(By.xpath(GERENCIAR));
		scrollElementoClicar(By.xpath(FORNECEDORES));
	}
	
	public void acessarRede() {
		esperarPresencaDoLoading();
		scrollElementoClicar(By.xpath(MENU_MEIOS_HOSPEDAGEM));
		scrollElementoClicar(By.xpath(GERENCIAR));
		scrollElementoClicar(By.xpath(REDE));
	}

	public void acessarTipoMeioHospedagem() {
		esperarPresencaDoLoading();
		scrollElementoClicar(By.xpath(MENU_MEIOS_HOSPEDAGEM));
		scrollElementoClicar(By.xpath(GERENCIAR));
		scrollElementoClicar(By.xpath(TIPO_MEIO_HOSPEDAGEM));
	}
	
	public void acessarPropostaAdesao() {
		clicar(By.xpath(MENU_CLIENTE));
		clicar(By.xpath(PROPOSTA_ADESAO));
	}
	
	

}
