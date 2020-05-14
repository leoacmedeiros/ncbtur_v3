package pageObjects.cliente.propostaAdesao;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import core.BasePage;

public class ListarPropostaAdesaoPage extends BasePage {
	
	private static final String NOVA_PROPOSTA_ADESAO = "//a[contains(text(),'Nova Proposta Adesão')]";
	private static final String MENSAGEM = "toast-container";

	public void novaPropostaAdesao() {
		scrollElementoClicar(By.xpath(NOVA_PROPOSTA_ADESAO));
		sleep(10);
	}

	public void verificarMensagemSucesso() {
		esperarElementoFicarVisivel(By.id(MENSAGEM));
		Assertions.assertEquals("Dados gravados com sucesso!", obterTexto(By.id(MENSAGEM)));
	}


}
