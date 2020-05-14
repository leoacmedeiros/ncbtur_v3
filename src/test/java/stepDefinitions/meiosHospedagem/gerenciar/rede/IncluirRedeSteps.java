package stepDefinitions.meiosHospedagem.gerenciar.rede;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pageObjects.meiosHospedagem.gerenciar.rede.IncluirRedePage;
import pageObjects.menu.MenuPage;
import utils.GeraCpfCnpj;

import core.BasePage;


public class IncluirRedeSteps extends BasePage{

	MenuPage menu = new MenuPage();
	GeraCpfCnpj gerador = new GeraCpfCnpj();
	IncluirRedePage incluirRede = new IncluirRedePage();
	

	@Dado("que acesse o Menu Rede")
	public void queAcesseOMenuRede() {
	    menu.acessarRede();
	}

	@Dado("clique no botão de Nova Rede")
	public void cliqueNoBotãoDeNovaRede() {
	    incluirRede.novaRede();
	}

	@Dado("preencha o nome da Rede")
	public void preenchaONomeDaRede(DataTable dataTable) {
		String cnpj = gerador.cnpj(false);
	    incluirRede.setNome(dataTable.cell(0,1) + " - " + cnpj);
	}

	@Dado("clique para a Rede ficar ativa")
	public void cliqueParaARedeFicarAtiva() {
	    incluirRede.clicarRedeAtiva();
	}

	@Dado("preencha o cep da Rede")
	public void preenchaOCepDaRede(DataTable dataTable) {
	    incluirRede.novoEndereco();
	    incluirRede.setCEP(dataTable.cell(0,1));
	}

	@Dado("marque para usar o mesmo endereço para correspondências")
	public void marqueParaUsarOMesmoEndereçoParaCorrespondências() {
	    incluirRede.usarEnderecoCorrespondencia();
	}

	@Dado("clique para incluir um Novo Contato")
	public void cliqueParaIncluirUmNovoContato(io.cucumber.datatable.DataTable dataTable) {
		incluirRede.novoContato();
		incluirRede.selecionarContatoEmail(dataTable.cell(0,1));
		incluirRede.setEmail(gerarEmailRandomico());
		incluirRede.selecionarContatoPrincipal();
		incluirRede.adicionarContato();
	}

	@Quando("clicar no botão Salvar Rede")
	public void clicarNoBotãoSalvarRede() {
	    incluirRede.salvarRede();
	}

	@Então("o sistema irá incluir uma nova Rede com os dados informados")
	public void oSistemaIráIncluirUmaNovaRedeComOsDadosInformados() {
	    incluirRede.mensagemSucesso();
	}
	
}
