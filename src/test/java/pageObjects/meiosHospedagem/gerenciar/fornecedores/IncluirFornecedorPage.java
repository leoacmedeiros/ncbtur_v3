package pageObjects.meiosHospedagem.gerenciar.fornecedores;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import core.BasePage;


public class IncluirFornecedorPage extends BasePage {

	public void clicarNovoFornecedor() {
		sleep(2);
		scrollElementoClicar(By.xpath("//a[contains(text(),'Novo Fornecedor')]"));
	}

	public void setCNPJ(String cnpj) {
		escrever(By.name("cnpj"), cnpj);
	}
	
	public void setNome(String nome) {
		escrever(By.name("nomeFantasia"), nome);
	}
		
	public void setRazaoSocial(String razaoSocial) {
		escrever(By.xpath("//input[@formcontrolname='razaoSocial']"), razaoSocial);
	}

	public void setCep(String cepEndereco) {
		escrever(By.xpath("(//input[@name='endereco_cep'])[1]"), cepEndereco);
	}
	
	public void setTelefoneComercial(String telComercial) {
		escrever(By.xpath("//label[contains(text(),'Telefone Comercial')]//parent::div//input"), telComercial);
	}
	
	public void setResponsavel(String responsavel) {
		escrever(By.xpath("//label[contains(text(),'Responsável')]//parent::div//input"), responsavel);
	}
	
	public void setEmail(String email) {
		escrever(By.xpath("//label[contains(text(),'E-mail')]//parent::div//input"), email);
	}
	
	public void setBanco(String banco) {
		sleep(1);
		scrollElementoClicar(By.xpath("(//div[@formgroupname='instituicao']//span[contains(text(),'Selecione o banco desejado')])"));
		selecionarComboBox(By.xpath("//div[@formgroupname='instituicao']//select"), banco);
	}

	public void setAgencia(String agenciaNumero) {
		escrever(By.name("agenciaNumero"), agenciaNumero);
	}

	public void setAgenciaDigito(String agenciaDigito) {
		escrever(By.name("agenciaDigito"), agenciaDigito);
	}

	public void setConta(String contaNumero) {
		escrever(By.name("debito_conta"), contaNumero);
	}

	public void setContaDigito(String contaDigito) {
		escrever(By.name("contaDigito"), contaDigito);
	}
	
	public void salvarFornecedor() {
		scrollElementoClicar(By.xpath("//div//button[contains(text(),'Salvar Fornecedor')]"));
	}
	
	public void mensagemSucesso() {
		esperarElementoFicarVisivel2(By.xpath("//div[@class='toast-message']"));
		Assertions.assertEquals("Dados gravados com sucesso.", obterTexto(By.xpath("//div[@class='toast-message']")));
	}

	 
	
}