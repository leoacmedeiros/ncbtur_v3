package pageObjects.produto.taxa;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import core.BasePage;

public class ListarTaxaPage extends BasePage {

	private static final String NOVA_TAXA = "//a[contains(text(),'Nova Taxa')]";
	private static final String MENSAGEM = "toast-container";

	public void novaTaxa() {
		clicar(By.xpath(NOVA_TAXA));
	}

	public void verificarMensagemSucesso() {
		esperarElementoFicarVisivel(By.id(MENSAGEM));
		Assertions.assertEquals("Dados gravados com sucesso!", obterTexto(By.id(MENSAGEM)));
	}

}
