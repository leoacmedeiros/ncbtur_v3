package pageObjects.meiosHospedagem.gerenciar.tipoMeioHospedagem;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import core.BasePage;


public class IncluirTipoMeioHospedagemPage extends BasePage {

	public void novoTipoMeioHospedagem() {
		scrollElementoClicar(By.xpath("//div//a[contains(text(),'Novo Tipo')]"));
	}
	
	public void setDescricaoTipoMeioHospedagem(String descricao) {
		escrever(By.name("descricao"), descricao);
	}
	
	public void salvarTipoMeioHospedagem() {
		clicar(By.xpath("//button[contains(text(),'Salvar tipo Meio de hospedagem')]"));
	}
	
	public void clicarSimConfirmarInclusao() {
		clicar(By.xpath("//div[@class='modal-content']//button[contains(text(),'Sim')]"));
	}

	public void mensagemSucesso() {
		Assertions.assertEquals("Dados gravados com sucesso!", obterTexto(By.xpath("//div[@class='toast-message']")));
	}
	
	
	
}