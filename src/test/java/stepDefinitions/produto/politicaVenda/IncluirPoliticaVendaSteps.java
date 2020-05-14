package stepDefinitions.produto.politicaVenda;

import core.BasePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pageObjects.menu.MenuPage;
import pageObjects.produto.politicaVenda.IncluirPoliticaVendaPage;
import pageObjects.produto.politicaVenda.ListarPoliticaVendaPage;

public class IncluirPoliticaVendaSteps {

	MenuPage menu = new MenuPage();
	ListarPoliticaVendaPage listarPoliticaVenda = new ListarPoliticaVendaPage();
	IncluirPoliticaVendaPage incluirPoliticaVenda = new IncluirPoliticaVendaPage();

	@Dado("que queira criar uma nova política de vendas")
	public void queQueiraCriarUmaNovaPolíticaDeVendas() {
		menu.acessarPoliticaVenda();
	}

	@Quando("clicar em [Nova Política de Venda]")
	public void clicarEmNovaPolíticaDeVenda() {
		listarPoliticaVenda.novaPoliticaVenda();
	}

	@Quando("preencher o formulário para cadastro de política de vendas")
	public void preencherOFormulárioParaCadastroDePolíticaDeVendas(DataTable dataTable) {
		incluirPoliticaVenda.setCodigoPromocionalPoliticaVenda	(dataTable.cell(0, 1));
		incluirPoliticaVenda.setNomePoliticaVenda				(dataTable.cell(1, 1));
		incluirPoliticaVenda.setTipoPoliticaVenda				(dataTable.cell(2, 1));
		incluirPoliticaVenda.setDescricaoPoliticaVenda			(dataTable.cell(3, 1));
		incluirPoliticaVenda.setSituacaoPoliticaVenda			(dataTable.cell(4, 1));
		incluirPoliticaVenda.setRestricoesPoliticaVenda			(dataTable.cell(5, 1));
	}

	@Quando("preencher a vigência da política de venda")
	public void preencherAVigênciaDaPolíticaDeVenda(DataTable dataTable) {
		String dataAtual = BasePage.obterDataAtual();
		incluirPoliticaVenda.setTempoIndeterminadoVigenciaCanalVendas	(dataTable.cell(0, 1));
		incluirPoliticaVenda.setTipoVigenciaPoliticaVenda				(dataTable.cell(1, 1));
		incluirPoliticaVenda.setInicioVigenciaPoliticaVenda				(dataAtual);
		incluirPoliticaVenda.setFimVigenciaPoliticaVenda				(dataTable.cell(3, 1));
		incluirPoliticaVenda.setQtdMesesVigenciaPoliticaVenda			(dataTable.cell(4, 1));
		incluirPoliticaVenda.setEstoqueProdutoPoliticaVenda				(dataTable.cell(5, 1));
	}
	
	@Quando("selecionar os produtos para a política de venda")
	public void selecionarOsProdutosParaAPolíticaDeVenda(DataTable dataTable) {
		incluirPoliticaVenda.setProdutoPoliticaVenda(dataTable.cell(0, 1));
	}
	
	@Quando("escolher o convênio para aplicar desconto")
	public void escolherOConvênioParaAplicarDesconto(DataTable dataTable) {
		incluirPoliticaVenda.setDescontoConvenioPoliticaVenda(dataTable.cell(0, 1));
	}
	
	@Quando("selecionar o canal de vendas para política de venda")
	public void selecionarOCanalDeVendasParaPolíticaDeVenda(DataTable dataTable) {
		incluirPoliticaVenda.setCanalVendaPoliticaVenda(dataTable.cell(0, 1));
	}

	@Quando("selecionar a abrangência para política de venda")
	public void selecionarAAbrangênciaParaPolíticaDeVenda(DataTable dataTable) {
		incluirPoliticaVenda.setEstadosPoliticaVendas(dataTable.cell(0, 1));
	}
	
	@Quando("clicar em [Salvar Política de Vendas]")
	public void clicarEmSalvarPolíticaDeVendas() {
//		incluirPoliticaVenda.salvarPoliticaVendas();
	}

	@Então("será criado a Política de Vendas")
	public void seráCriadoAPolíticaDeVendas() {
//		listarPoliticaVenda.verificarMensagemSucesso();
	}

}
