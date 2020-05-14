package pageObjects.produto.canalVendas;

import org.junit.Assert;
import org.openqa.selenium.By;

import core.BasePage;

public class ListarCanalVendasPage extends BasePage {

	private static final String NOVO_CANAL_VENDAS = "//a[contains(text(),'Novo Canal de Venda')]";
	private static final String MENSAGEM = "toast-container";

	public void novoCanalVendas() {
		clicar(By.xpath(NOVO_CANAL_VENDAS));
		sleep(15);
	}

	public void verificarMensagemSucesso() {
		esperarElementoFicarVisivel(By.id(MENSAGEM));
		Assert.assertEquals("Dados gravados com sucesso!", obterTexto(By.id(MENSAGEM)));
	}

}
