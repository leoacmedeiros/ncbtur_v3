package pageObjects.meiosHospedagem.gerenciar.rede;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import core.BasePage;


public class IncluirRedePage extends BasePage {

	public void novaRede() {
		scrollElementoClicar(By.xpath("//div//a[contains(text(),'Nova Rede')]"));
	}

	public void setNome(String nomeRede) {
		escrever(By.name("nome"), nomeRede);
	}

	public void clicarRedeAtiva() {
		clicar(By.xpath("//label[contains(text(),'Rede ativa')]//span"));
	}
	
	public void novoEndereco() {
		scrollElementoClicar(By.xpath("//a[contains(text(),'Novo Endereço')]"));
	}
	
	public void setCEP(String cep) {
		escrever(By.name("endereco_cep"), cep);
	}
	
	public void usarEnderecoCorrespondencia() {
		scrollElementoClicar(By.xpath("//label[contains(text(),'Usar este endereço para correspondências?')]//span"));
	}
	
	public void novoContato() {
		scrollElementoClicar(By.xpath("//a[contains(text(),'Novo contato')]"));
	}
	
	public void selecionarContatoEmail(String tipoContato) {
		selecionarComboBox(By.name("tipoContato"), tipoContato);
	}
	
	public void setEmail(String email) {
		escrever(By.name("email"), email);
	}

	public void selecionarContatoPrincipal() {
		clicar(By.xpath("(//label[contains(text(),'Contato Principal ?')]//span)[3]"));
	}

	public void adicionarContato() {
		clicar(By.xpath("//button[contains(text(),'Adicionar')]"));
	}

	public void salvarRede() {
		clicar(By.xpath("//button[contains(text(),'Salvar Rede ')]"));
	}


	public void mensagemSucesso() {
		esperarElementoFicarVisivel2(By.xpath("//div[@class='toast-message']"));
		Assertions.assertEquals("Dados gravados com sucesso.", obterTexto(By.xpath("//div[@class='toast-message']")));
	}

	 
	
}