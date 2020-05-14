package stepDefinitions.produto.taxa;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pageObjects.menu.MenuPage;
import pageObjects.produto.taxa.IncluirTaxaPage;
import pageObjects.produto.taxa.ListarTaxaPage;

public class IncluirTaxaSteps {

	MenuPage menu = new MenuPage();
	ListarTaxaPage listarTaxa = new ListarTaxaPage();
	IncluirTaxaPage cadastrarTaxa = new IncluirTaxaPage();

	@Dado("que acesse o modulo de produto para criar um registro")
	public void queAcesseOModuloDeProdutoParaCriarUmRegistro() {
		menu.acessarTaxa();
	}

	@Quando("clicar em [Nova Taxa]")
	public void clicarEmNovaTaxa() {
		listarTaxa.novaTaxa();
	}

	@Quando("preencher o formulário para cadastro de taxa")
	public void preencherOFormulárioParaCadastroDeTaxa(DataTable dataTable) {
		cadastrarTaxa.setTipoTaxa			(dataTable.cell(0, 1));
		cadastrarTaxa.setNomeTaxa			(dataTable.cell(1, 1));
		cadastrarTaxa.setPermiteComissao	(dataTable.cell(2, 1));
		cadastrarTaxa.setDescontoCampanha	(dataTable.cell(3, 1));
		cadastrarTaxa.setDescontoConvenio	(dataTable.cell(4, 1));
		cadastrarTaxa.setDescricao			(dataTable.cell(5, 1));
		cadastrarTaxa.setSituacao			(dataTable.cell(6, 1));
	}

	@Quando("salvar os dados do formulário de cadastro da taxa")
	public void salvarOsDadosDoFormulárioDeCadastroDaTaxa() {
//		cadastrarTaxa.salvarTaxa();
	}

	@Então("será cadastrado a taxa")
	public void seráCadastradoATaxa() {
//		listarTaxa.verificarMensagemSucesso();
	}

}
