package pageObjects.meiosHospedagem.negociacao.convenio;

import java.awt.AWTException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import core.BasePage;
import core.DriverFactory;


public class IncluirConvenioPage extends BasePage {

	public void incluirNovaProposta() {
		scrollElementoClicar(By.xpath("//a[contains(text(),'Nova Proposta')]"));
	}

	public void setCnpj(String cnpj) {
		escrever(By.name("codigoCpfCnpj"), cnpj); 
	}

	public void setNome(String nome) {
		escrever(By.name("nomeFantasia"), nome);
	}

	public void setRazaoSocial(String razaoSocial) {
		escrever(By.name("razaoSocial"), razaoSocial);
	}

	public void setInscMunicipal(String inscricaoMunicipal) {
		escrever(By.name("inscricaoMunicipal"), inscricaoMunicipal);
	}

	public void setInscEstadual(String inscricaoEstadual) {
		escrever(By.name("inscricaoEstadual"), inscricaoEstadual);
	}

	public void setRede(String rede) {
		escrever(By.xpath("//div[@formgroupname='rede']//input[@placeholder='Digite a Rede']"), rede);
		esperarElementoFicarVisivel2(By.xpath("(//ul//li//a//strong[contains(text(),'" + rede + "')])[1]"));
		scrollElementoClicar(By.xpath("(//ul//li//a//strong[contains(text(),'" + rede + "')])[1]"));
	}

	public void selecionarTipoMeioHospedagem(String tipoMeioHospedagem) {
		selecionarComboBox(By.xpath("//div[@formgroupname='tipoMeioHospedagem']//select"), tipoMeioHospedagem);
	}

	public void selecionarTipoAdministracao(String tipoAdministracao) {
		selecionarComboBox(By.xpath("//div[@formgroupname='tipoAdministracao']//select"), tipoAdministracao);
	}

	public void setSite(String site) {
		scrollElementoClicar(By.xpath("(//div//button[contains(text(),'Novo Contato')])[2]"));
		selecionarComboBox(By.name("tipoContato"), "Site");
		escrever(By.xpath("//label[contains(text(),'Site')]//parent::div//input"), site);
		scrollElementoClicar(By.xpath("//button[contains(text(),'Adicionar')]"));

	}

	public void setTelefoneComercial(String telefoneComercial) {
		escrever(By.xpath("(//label[contains(text(),'Telefone Comercial')]//parent::div//input)[2]"), telefoneComercial);
	}

	public void setResponsavel(String responsavel) {
		escrever(By.xpath("(//label[contains(text(),'Responsável')]//parent::div//input)[2]"), responsavel);
	}

	public void setEmail(String email) {
		escrever(By.xpath("(//label[contains(text(),'E-mail')]//parent::div//input)[2]"), email);
	}

	public void setCep(String cep) {
		escrever(By.xpath("(//enderecos-meios-hospedagem//input[@name='endereco_cep'])[1]"), cep);
	}

	public void setBanco(String banco) {
		sleep(1);
		scrollElementoClicar(By.xpath("(//div[@formgroupname='instituicao']//span[contains(text(),'Selecione o banco desejado')])"));
		selecionarComboBox(By.xpath("(//div[@formgroupname='instituicao']//select)[2]"), banco);
	}

	public void setAgencia(String agenciaNumero) {
		escrever(By.xpath("(//input[@name='agenciaNumero'])[2]"), agenciaNumero);
	}

	public void setAgenciaDigito(String agenciaDigito) {
		escrever(By.xpath("(//input[@name='agenciaDigito'])[2]"), agenciaDigito);
	}

	public void setConta(String contaNumero) {
		escrever(By.xpath("(//input[@name='debito_conta'])[2]"), contaNumero);
	}

	public void setContaDigito(String contaDigito) {
		escrever(By.xpath("(//input[@name='contaDigito'])[2]"), contaDigito);
	}

	public void setDescricao(String descricao) {
		escrever(By.name("descricao"), descricao);
	}

	public void setPontoInteresse(String pontoInteresse) {
		scrollElementoClicar(By.xpath("//a[contains(text(),'Pontos de interesse')]"));
		sleep(1);
		escrever(By.name("pontoInteresse"), pontoInteresse);
	}
	
	public void salvarProximo() {
		scrollElementoClicar(By.xpath("//button[contains(text(),'SALVAR E AVANÇAR')]"));
	}

	public void selecionarAcademia(String academia) {
		scrollElementoClicar(By.xpath("//ul//li[contains(text(),'" + academia + "')]"));
		scrollElementoClicar(By.xpath("(//div//label[contains(text(),'" + academia + "')]//span)[1]"));
	}

	public void selecionarAberta24Hr(String aberta24Horas) {
		scrollElementoClicar(By.xpath("(//div//label[contains(text(),'" + aberta24Horas + "')]//span)[1]"));
	}

	public void selecionarBarcoNoLocal(String barcoNoLocal) {
		scrollElementoClicar(By.xpath("//ul//li[contains(text(),'Atividades aquáticas')]"));
		scrollElementoClicar(By.xpath("(//div//label[contains(text(),'" + barcoNoLocal + "')]//span)[1]"));
	}

	public void selecionarBarcoRemoNoLocal(String barcoRemoNoLocal) {
		scrollElementoClicar(By.xpath("(//div//label[contains(text(),'" + barcoRemoNoLocal + "')]//span)[1]"));
	}

	public void adicionarAlbum() {
		scrollElementoClicar(By.xpath("//button[@class='btn green']"));
	}

	public void selecionarTipoAlbum(String tipoAlbum) {
		selecionarComboBox(By.xpath("//select[@name='tipoAlbum']"), tipoAlbum);
	}

	public void botaoUpload() {
		sleep(4);
		scrollElementoClicar(By.xpath("(//input[@class='upload']//parent::div//i)[1]"));
	}

	public void selecionarFoto() throws AWTException {
		fileUpload(By.xpath("//input[@class='upload']"), "\\src\\test\\resources\\arquivos\\imagens\\imagemTeste1.jpg");
		fileUpload(By.xpath("//input[@class='upload']"), "\\src\\test\\resources\\arquivos\\imagens\\imagemTeste2.jpg");
		fileUpload(By.xpath("//input[@class='upload']"), "\\src\\test\\resources\\arquivos\\imagens\\imagemTeste3.jpg");
		//aqui coloquei o arquivo dentro dos resources
	}
	
	public void incluirAlbum() {
		clicar(By.xpath("//button[contains(text(),'Adicionar Álbum')]"));
	}

	public void selecionarTipoUh(String tipoUh) {
		esperarPresencaDoLoading();
		sleep(5);
		selecionarComboBox(By.xpath("//label[contains(text(),'Tipo de Unidade Habitacional')]//parent::div//select"), tipoUh);
	}

	public void setQuantidade(String quantidadeUh) {
		escrever(By.xpath("//touchspin[@name='quantidade']//input"), quantidadeUh);
	}

	public void selecionarUnidadeHabitacionalAtende(String unidadeHabitacionalAtende) {
		scrollElementoClicar(By.id("categoriaQuarto"));
		scrollElementoClicar(By.xpath("//multiselect//label[contains(text(),'"+unidadeHabitacionalAtende+"')]"));
	}

	public void clicarAtendePCD() {
		scrollElementoClicar(By.id("pcdf"));
	}

//	public void clicarContratado() {
//		scrollElementoClicar(By.id("contratado"));
//	}

	public void selecionarConfigCama(String configCama) {
		scrollElementoClicar(By.name("configCamaSIMPLES"));
		scrollElementoClicar(By.xpath("//multiselect//label[contains(text(),'"+configCama+"')]//input"));
	}

	public void setMaximoAdultos(String maximoAdulto) {
		escrever(By.xpath("//div//h4[text()='Ocupação máxima da acomodação']//parent::div//parent::div//touchspin//input"), maximoAdulto);
	}

	public void setMaximoCriancas(String maximoCriancas) {
	escrever(By.xpath("//div//h5[text()='Numero máximo de crianças (0 a 17 anos)']//parent::div//parent::div//touchspin//input"), maximoCriancas);	
	}

	public void clicarGratuidadeCrianca(String cell) {
		scrollElementoClicar(By.id("gratuidade"));
		sleep(1);
	}

	public void setQtdGratuidadeCrianca(String qtdGratuidadeCrianca) {
		escrever(By.xpath("(//label[contains(text(),'Quantidade')])[2]//parent::div//touchspin//input"), qtdGratuidadeCrianca);
	}

	public void setIdadeMaxCrianca(String idadeMaxCrianca) {
		escrever(By.xpath("//label[contains(text(),'Idade Máxima')]//parent::div//touchspin//input"), idadeMaxCrianca);
	}

	public void selecionarUnidadeHabitacional(String unidadeHabitacional) {
		scrollElementoClicar(By.id("categorias"));
		scrollElementoClicar(By.xpath("(//multiselect//label[contains(text(),'"+unidadeHabitacional+"')])[2]"));
	}
	
	public void acomodada(String acomodada) {
		selecionarComboBox(By.id("camaCortesia"), acomodada);
	}

	public void selecionarCama() {
		scrollElementoClicar(By.xpath("//questionario//li[text()='Cama']"));	
	}

	public void clicarAberturaCamaDormir(String aberturaCamaDormir) {
		scrollElementoClicar(By.xpath("//questionario//label[contains(text(),'"+aberturaCamaDormir+"')]//span"));
	}

	public void clicarRoupasCamaAntialergicasDisp(String roupasCamaAntialergicasDisp) {
		scrollElementoClicar(By.xpath("//questionario//label[contains(text(),'"+roupasCamaAntialergicasDisp+"')]//span"));
	}

	public void selecionarCaracteristicasBanheiros() {
		scrollElementoClicar(By.xpath("//questionario//li[text()='Características dos Banheiros']"));
	}

	public void clicarRoupoesBanho(String roupoesBanho) {
		scrollElementoClicar(By.xpath("//questionario//label[contains(text(),'"+roupoesBanho+"')]//span"));
	}

	public void clicarRoupoesBanhoInfantis(String roupoesBanhoInfantis) {
		scrollElementoClicar(By.xpath("//questionario//label[contains(text(),'"+roupoesBanhoInfantis+"')]//span"));
	}
	
	public void selecionarFoto1() throws AWTException {
		fileUpload(By.xpath("//input[@class='upload']"), "\\src\\test\\resources\\arquivos\\imagens\\imagemTeste4.jpg");
		fileUpload(By.xpath("//input[@class='upload']"), "\\src\\test\\resources\\arquivos\\imagens\\imagemTeste5.jpg");
		fileUpload(By.xpath("//input[@class='upload']"), "\\src\\test\\resources\\arquivos\\imagens\\imagemTeste6.jpg");
	}

	public void adicionarUh() {
		scrollElementoClicar(By.xpath("//div//button[text()='ADICIONAR UH']"));
	}

	public void setInicioVigencia(String dataInicioContrato) {
		esperarPresencaDoLoading();
		scrollElementoClicar(By.xpath("//bs-datepicker[@formcontrolname='inicioContrato']//input"));
		escrever(By.xpath("//bs-datepicker[@formcontrolname='inicioContrato']//input"), dataInicioContrato);
		scrollElementoClicar(By.xpath("//bs-datepicker[@name='fimContrato']"));
	}

	public void selecionarFormaPagamento(String formaPagamento) {
		esperarPresencaDoLoading();
		selecionarComboBox(By.name("formaPagamento"), formaPagamento);
	}

	public void forcarVigencia() {
		scrollElementoClicar(By.xpath("//div[contains(text(),'4 - Condições de Contrato')]"));
		clicar(By.xpath("//div[contains(text(),'4 - Condições de Contrato')]"));
	}
	
	public void selecionarTipoUnidHabitacional(String unidadeHabitacional) {
		esperarPresencaDoLoading();
		selecionarComboBox(By.xpath("//div[@formgroupname='unidadeHabitacional']//select"), unidadeHabitacional);
	}

	public void selecionarNivelUtilizacao(String nivelUtilizacao) {
		selecionarComboBox(By.name("nivelUtilizacao"), nivelUtilizacao);
	}

	public void selecionarNomeTemporada() {
		esperarPresencaDoLoading();
		clicar(By.xpath("//div[@formgroupname='tipoTemporada']//select"));
		clicar(By.xpath("(//div[@formgroupname='tipoTemporada']//option)[2]"));
	}

	public void selecionarRegime(String regime) {
		selecionarComboBox(By.xpath("//select[@name='regimePensao']"), regime);
	}

	public void setInicioPeriodo(String inicioTemporada) {
		scrollElementoClicar(By.xpath("//bs-datepicker[@name='inicioTemporada']//input"));
		escrever(By.xpath("//bs-datepicker[@name='inicioTemporada']//input"), inicioTemporada);
	}

	public void setFimPeriodo(String fimTemporada) {
		scrollElementoClicar(By.xpath("//bs-datepicker[@name='fimTemporada']//input"));
		escrever(By.xpath("//bs-datepicker[@name='fimTemporada']//input"), fimTemporada);
	}

	public void clicarAdicionarTemporada() {
		scrollElementoClicar(By.xpath("//button[@class='btn blue btn-stton add-periodo']//i"));
		clicar(By.xpath("//button[@class='btn blue btn-stton add-periodo']//i"));
	}

	public void setValorSGL(String valorSGL) {
		escrever(By.xpath("//label[contains(text(),'SGL')]//parent::div//input"), valorSGL);
	}

	public void setValorCHD(String valorCHD) {
		escrever(By.xpath("//label[contains(text(),'CHD')]//parent::div//input"), valorCHD);
	}

	public void setBloqueio(String bloqueio) {
		escrever(By.xpath("//touchspin[@name='quantidadeBloqueio']//input"), bloqueio);
	}

	public void setDiaDeadline(String diaDeadline) {
		escrever(By.xpath("//touchspin[@name='diaDevolucao']//input"), diaDeadline);
	}

	public void setDiaCancelamento(String diaCancelamento) {
		escrever(By.xpath("//touchspin[@name='diaCancelamento']//input"), diaCancelamento);
	}

	public void clicarRestricoes() {
		clicar(By.xpath("//div//h4[contains(text(),'Restrições')]//em"));
	}

	public void setMininoDiarias(String minimoDiaria) {
		escrever(By.xpath("//touchspin[@name='minimoDiaria']//input"), minimoDiaria);
	}

	public void selecionarDiasMinimoDiarias(String cell) {
		clicar(By.name("minimo_diarias"));
		clicar(By.xpath("//multiselect[@name='minimo_diarias']//label[contains(text(),'Selecionar todos')]//input"));
	}

	public void clicarAdicionar() {
		clicar(By.xpath("//button[contains(text(),'ADICIONAR')]"));
	}

	public void salvarFinalizar() {
		esperarPresencaDoLoading();
		sleep(2);
		clicar(By.xpath("//button[contains(text(),'SALVAR E FINALIZAR')]"));
	}

	
	

}