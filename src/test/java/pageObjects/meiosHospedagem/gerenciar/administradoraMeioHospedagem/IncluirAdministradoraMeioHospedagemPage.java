package pageObjects.meiosHospedagem.gerenciar.administradoraMeioHospedagem;

import org.openqa.selenium.By;
import core.BasePage;


public class IncluirAdministradoraMeioHospedagemPage extends BasePage {

	public void clicarNovaAdministradora() {
		scrollElementoClicar(By.xpath("//div//a[contains(text(),'Nova Administradora')]"));
	}

	public void setNome(String nomeFantasia) {
		escrever(By.name("nomeFantasia"), nomeFantasia);
	}
	
	public void setCNPJ(String cnpj) {
		escrever(By.name("codigoCpfCnpj"), cnpj);
	}
	
	public void setRazaoSocial(String razaoSocial) {
		escrever(By.name("razaoSocial"), razaoSocial);
	}

	public void setCep(String cep) {
		escrever(By.xpath("//h4[text()='Endereço']//parent::div//input[@name='endereco_cep']"), cep);
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

	public void selecionarFaturarNf() {
		scrollElementoClicar(By.xpath("//label[contains(text(),'Faturar NF na Administradora')]//span"));
	}

	public void salvarAdministradora() {
		scrollElementoClicar(By.xpath("//button[contains(text(),'Salvar Administradora')]"));
	}
	
	
	
	
}