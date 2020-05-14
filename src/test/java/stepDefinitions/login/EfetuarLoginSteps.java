package stepDefinitions.login;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pageObjects.login.EfetuarLoginPage;

public class EfetuarLoginSteps {

	EfetuarLoginPage efetuarLogin = new EfetuarLoginPage();

	@Dado("esteja na página de login")
	public void estejaNaPáginaDeLogin() {
		efetuarLogin.acessarNCBTUR();
	}

	@Quando("informar os dados de logon")
	public void informarOsDadosDeLogon(DataTable dataTable) {
		efetuarLogin.setUsuario	(dataTable.cell(0, 1));
		efetuarLogin.setSenha	(dataTable.cell(1, 1));
	}

	@Quando("clicar em [Entrar]")
	public void clicarEmEntrar() {
		efetuarLogin.botaoEntrar();
	}

	@Então("deverá se exibido a tela inicial do sistema")
	public void deveráSeExibidoATelaInicialDoSistema() {
		efetuarLogin.verificaPaginaInicial();
	}

}
