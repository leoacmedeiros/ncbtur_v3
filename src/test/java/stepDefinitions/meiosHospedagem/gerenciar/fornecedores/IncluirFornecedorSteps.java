package stepDefinitions.meiosHospedagem.gerenciar.fornecedores;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pageObjects.meiosHospedagem.gerenciar.fornecedores.IncluirFornecedorPage;
import pageObjects.menu.MenuPage;
import utils.GeraCpfCnpj;

import core.BasePage;


public class IncluirFornecedorSteps extends BasePage{

	MenuPage menu = new MenuPage();
	GeraCpfCnpj gerador = new GeraCpfCnpj();
	IncluirFornecedorPage incluirFornecedor = new IncluirFornecedorPage();
	
	@Dado("acesse o Menu Fornecedores")
	public void acesseOMenuFornecedores() {
	    menu.acessarFornecedores();
	}

	@Dado("clique no botão Novo Fornecedor")
	public void cliqueNoBotãoNovoFornecedor() {
		incluirFornecedor.clicarNovoFornecedor();
	}

	@Dado("preencha os campos de Fornecedor com dados válidos")
	public void preenchaOsCamposDeFornecedorComDadosVálidos(DataTable dataTable) {
		String cnpj = gerador.cnpj(false);
		incluirFornecedor.setCNPJ(cnpj);
		incluirFornecedor.setNome(dataTable.cell(1,1) + " - " + cnpj);
		incluirFornecedor.setRazaoSocial(dataTable.cell(2,1)+ " - " + cnpj);
		incluirFornecedor.setCep(dataTable.cell(3,1));
	}

	@Dado("preencher os campos referente a Contatos")
	public void preencherOsCamposReferenteAContatos(DataTable dataTable) {
		incluirFornecedor.setTelefoneComercial(dataTable.cell(2,1));
		incluirFornecedor.setResponsavel(dataTable.cell(0,1));
		incluirFornecedor.setEmail(gerarEmailRandomico());
	}

	@Dado("preencher os dados bancários de Fornecedores")
	public void preencherOsDadosBancáriosDeFornecedores(DataTable dataTable) {
		incluirFornecedor.setBanco(dataTable.cell(0,1));
		incluirFornecedor.setAgencia(gera4NumAuto());
		incluirFornecedor.setAgenciaDigito(dataTable.cell(2,1));
		incluirFornecedor.setConta(gera4NumAuto());
		incluirFornecedor.setContaDigito(dataTable.cell(4,1));
	}
	
	@Quando("clicar no botao Salvar Fornecedor")
	public void clicarNoBotaoSalvarFornecedor() {
		incluirFornecedor.salvarFornecedor();
	}

	@Então("o sistema irá incluir um novo Fornecedor")
	public void oSistemaIráIncluirUmNovoFornecedor() {
	    incluirFornecedor.mensagemSucesso();
	}
	
	
}
