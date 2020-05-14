package pageObjects.produto.gerenciarProduto;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import core.BasePage;

public class ListarProdutoPage extends BasePage {

	private static final String NOVO_PRODUTO = "//a[contains(text(),'Novo Produto')]";
	private static final String MENSAGEM = "toast-container";

	public void novoProduto() {
		clicar(By.xpath(NOVO_PRODUTO));
	}

	public void verificarMensagemSucesso() {
		esperarElementoFicarVisivel(By.id(MENSAGEM));
		Assertions.assertEquals("Dados gravados com sucesso!", obterTexto(By.id(MENSAGEM)));
	}

}
