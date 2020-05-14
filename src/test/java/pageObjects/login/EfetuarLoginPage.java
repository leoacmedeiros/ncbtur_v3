package pageObjects.login;

import org.junit.Assert;
import org.openqa.selenium.By;

import core.BasePage;
import core.DriverFactory;

public class EfetuarLoginPage extends BasePage {

	private static String DEV = "http://ncbtur-dev.bancorbras.com.br/";
	private static String TST = "http://ncbtur-tst.bancorbras.com.br/";
	private static String HML = "http://ncbtur-hml.bancorbras.com.br/";
	private static String HML2 = "http://ncbtur-hml2.bancorbras.com.br/";

	public void acessarNCBTUR() {
		DriverFactory.getDriver().get(TST);
	}

	public void setUsuario(String usuario) {
		escrever(By.id("iptUser"), usuario);
	}

	public void setSenha(String senha) {
		escrever(By.id("iptpass"), senha);
	}

	public void botaoEntrar() {
		clicar(By.xpath("//button[@class='btn btnEnviar']"));
	}

	public void verificaPaginaInicial() {
//		String cabecalho = obterTexto(By.xpath("//span[contains(text(),'Ínício')]"));
//		return cabecalho.contains("Ínício");
		esperarElementoFicarVisivel(By.xpath("//span[contains(text(),'Ínício')]"));
		Assert.assertEquals("ÍNÍCIO", obterTexto(By.xpath("//span[contains(text(),'Ínício')]")));
		sleep(5);
	}

}
