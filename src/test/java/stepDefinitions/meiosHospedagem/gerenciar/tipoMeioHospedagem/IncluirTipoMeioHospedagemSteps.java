package stepDefinitions.meiosHospedagem.gerenciar.tipoMeioHospedagem;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import pageObjects.meiosHospedagem.gerenciar.tipoMeioHospedagem.IncluirTipoMeioHospedagemPage;
import pageObjects.menu.MenuPage;
import utils.GeraCpfCnpj;
import core.BasePage;


public class IncluirTipoMeioHospedagemSteps extends BasePage{

	MenuPage menu = new MenuPage();
	GeraCpfCnpj gerador = new GeraCpfCnpj();
	IncluirTipoMeioHospedagemPage incluirTipo = new IncluirTipoMeioHospedagemPage();

	
	@Dado("que acesse o Menu Tipo de Meios de Hospedagem")
	public void queAcesseOMenuTipoDeMeiosDeHospedagem() {
	    menu.acessarTipoMeioHospedagem();
	}
	
	@Dado("clique no botão Novo Tipo")
	public void cliqueNoBotãoNovoTipo() {
	    incluirTipo.novoTipoMeioHospedagem();
	}
	
	@Dado("preencha a descrição do Novo Tipo de Meio de Hospedagem")
	public void preenchaADescriçãoDoNovoTipoDeMeioDeHospedagem(DataTable dataTable) {
		String cnpj = gerador.cnpj(false);
	    incluirTipo.setDescricaoTipoMeioHospedagem(dataTable.cell(0,1)+ " - " + cnpj);
	}
	
	@Dado("clique no botão para salvar o registro")
	public void cliqueNoBotãoParaSalvarORegistro() {
	    incluirTipo.salvarTipoMeioHospedagem();
	}
	
	@Dado("clique em Sim para confirmar a inclusão")
	public void cliqueEmSimParaConfirmarAInclusão() {
	    incluirTipo.clicarSimConfirmarInclusao();
	}
	
	@Então("irá salvar o Novo Tipo de Meio de Hospedagem")
	public void iráSalvarONovoTipoDeMeioDeHospedagem() {
	    incluirTipo.mensagemSucesso();
	}


	
}
