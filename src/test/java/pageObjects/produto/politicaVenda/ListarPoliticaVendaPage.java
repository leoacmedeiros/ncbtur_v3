package pageObjects.produto.politicaVenda;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import core.BasePage;

public class ListarPoliticaVendaPage extends BasePage {

	private static final String NOVA_POLITICA_VENDA = "//a[contains(text(),'Nova Política de venda')]";
	private static final String MENSAGEM = "toast-container";

	public void novaPoliticaVenda() {
		clicar(By.xpath(NOVA_POLITICA_VENDA));
		sleep(15);
	}

	public void verificarMensagemSucesso() {
		esperarElementoFicarVisivel(By.id(MENSAGEM));
		Assertions.assertEquals("Dados gravados com sucesso!", obterTexto(By.id(MENSAGEM)));
	}

}
