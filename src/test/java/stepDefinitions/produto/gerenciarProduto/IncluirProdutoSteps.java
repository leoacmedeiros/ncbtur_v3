package stepDefinitions.produto.gerenciarProduto;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pageObjects.menu.MenuPage;
import pageObjects.produto.gerenciarProduto.IncluirProdutoPage;
import pageObjects.produto.gerenciarProduto.ListarProdutoPage;

public class IncluirProdutoSteps {

	MenuPage menu = new MenuPage();
	ListarProdutoPage listarProduto = new ListarProdutoPage();
	IncluirProdutoPage incluirProduto = new IncluirProdutoPage();

	@Dado("que queira criar um novo produto")
	public void queQueiraCriarUmNovoProduto() {
		menu.acessarGerenciarProduto();
	}

	@Quando("clicar em [Novo Produto]")
	public void clicarEmNovoProduto() {
		listarProduto.novoProduto();
	}

	@Quando("preencher o formulário para cadastro de produto")
	public void preencherOFormulárioParaCadastroDeProduto(DataTable dataTable) {
		incluirProduto.setNomeProduto				(dataTable.cell(0, 1));
		incluirProduto.setTipoProduto				(dataTable.cell(1, 1));
		incluirProduto.setNivelUtilizacaoProduto	(dataTable.cell(2, 1));
		incluirProduto.setCategoriaProduto			(dataTable.cell(3, 1));
		incluirProduto.setMensalidadeProduto		(dataTable.cell(4, 1));
		incluirProduto.setSituacaoProduto			(dataTable.cell(5, 1));
		incluirProduto.setDiariasProduto			(dataTable.cell(6, 1));
		incluirProduto.setQtdEstoqueProduto			(dataTable.cell(7, 1));
		incluirProduto.setDescricaoProduto			(dataTable.cell(8, 1));
		incluirProduto.setPeriodoUtilizacaoProduto	(dataTable.cell(9, 1));
		incluirProduto.setFeriadoProlongado			(dataTable.cell(10, 1));
		incluirProduto.setAltaTemporada				(dataTable.cell(11, 1));
		incluirProduto.setDespesasAdicionais		(dataTable.cell(12, 1), dataTable.cell(13, 1));
		incluirProduto.setViradaPeriodo				(dataTable.cell(14, 1));
		incluirProduto.setRegrasCarencia			(dataTable.cell(15, 1), dataTable.cell(16, 1), dataTable.cell(17, 1));
		incluirProduto.setConversaoDiarias			(dataTable.cell(18, 1));
	}

	@Quando("salvar os dados do formulário de cadastro do produto")
	public void salvarOsDadosDoFormulárioDeCadastroDoProduto() {
//		incluirProduto.salvarProduto();
	}

	@Então("será cadastrado o produto")
	public void seráCadastradoOProduto() {
//		listarProduto.verificarMensagemSucesso();
	}

}
