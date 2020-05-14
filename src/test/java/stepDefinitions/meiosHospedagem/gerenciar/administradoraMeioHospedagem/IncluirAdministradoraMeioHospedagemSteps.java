package stepDefinitions.meiosHospedagem.gerenciar.administradoraMeioHospedagem;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pageObjects.meiosHospedagem.gerenciar.administradoraMeioHospedagem.IncluirAdministradoraMeioHospedagemPage;
import pageObjects.menu.MenuPage;
import utils.GeraCpfCnpj;
import core.BasePage;


public class IncluirAdministradoraMeioHospedagemSteps extends BasePage{

	MenuPage menu = new MenuPage();
	GeraCpfCnpj gerador = new GeraCpfCnpj();
	IncluirAdministradoraMeioHospedagemPage incluirAdm = new IncluirAdministradoraMeioHospedagemPage();
	

	@Dado("acesse o Menu Administradora de Meio de Hospedagem")
	public void acesseOMenuAdministradoraDeMeioDeHospedagem() {
	    menu.acessarAdministradoraMeioHospedagem();
	}

	@Dado("clique no botao de Nova Administradora de Meios de Hospedagem")
	public void cliqueNoBotaoDeNovaAdministradoraDeMeiosDeHospedagem() {
	    incluirAdm.clicarNovaAdministradora();
	}

	@Quando("preencher os dados da Administradora")
	public void preencherOsDadosDaAdministradora(DataTable dataTable) {
		String cnpj = gerador.cnpj(false);
	    incluirAdm.setNome(dataTable.cell(0,1) + " - " + cnpj);
	    incluirAdm.setCNPJ(cnpj);
	    incluirAdm.setRazaoSocial(dataTable.cell(2,1)+ " - " + cnpj);
	    incluirAdm.setCep(dataTable.cell(3,1));
	}

	@Quando("preencher os campos de Contato")
	public void preencherOsCamposDeContato(DataTable dataTable) {
	    incluirAdm.setTelefoneComercial(dataTable.cell(0,1));
	    incluirAdm.setResponsavel(dataTable.cell(1,1));
	    incluirAdm.setEmail(gerarEmailRandomico());
	}

	@Quando("preencher os campos de Dados Bancários")
	public void preencherOsCamposDeDadosBancários(DataTable dataTable) {
	    incluirAdm.setBanco(dataTable.cell(0,1));
	    incluirAdm.setAgencia(gera4NumAuto());
	    incluirAdm.setAgenciaDigito(dataTable.cell(2,1));
	    incluirAdm.setConta(gera4NumAuto());
	    incluirAdm.setContaDigito(dataTable.cell(4,1));
	}

	@Quando("clicar na opção para Faturar NF na Administradora")
	public void clicarNaOpçãoParaFaturarNFNaAdministradora() {
	    incluirAdm.selecionarFaturarNf();
	}

	@Quando("clicar no botao Salvar Administradora de Meios de Hospedagem")
	public void clicarNoBotaoSalvarAdministradoraDeMeiosDeHospedagem() {
	   incluirAdm.salvarAdministradora();
	}

	@Então("o sistema ira incluir uma nova Administradora de Meios de Hospedagem com os dados inseridos")
	public void oSistemaIraIncluirUmaNovaAdministradoraDeMeiosDeHospedagemComOsDadosInseridos() {
	   
	}
	
	
}
