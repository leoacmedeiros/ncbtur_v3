package stepDefinitions.meiosHospedagem.negociacao.convenio;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pageObjects.meiosHospedagem.negociacao.convenio.IncluirConvenioPage;
import pageObjects.menu.MenuPage;
import utils.GeraCpfCnpj;

import java.awt.AWTException;

import core.BasePage;


public class IncluirConvenioSteps extends BasePage{

	MenuPage menu = new MenuPage();
	GeraCpfCnpj gerador = new GeraCpfCnpj();
	IncluirConvenioPage incluirConvenio = new IncluirConvenioPage();
	
	
	@Dado("que acesse o menu Novo convênio")
	public void queAcesseOMenuNovoConvênio() {
		 menu.acessarNovoConvenio();
	}

	@Dado("clique para incluir uma [Nova Proposta]")
	public void cliqueParaIncluirUmaNovaProposta() {
	    incluirConvenio.incluirNovaProposta(); 
	}

	@Dado("preencha os dados da Etapa um Dados do Meio de Hospedagem")
	public void preenchaOsDadosDaEtapaUmDadosDoMeioDeHospedagem(DataTable dataTable) {
		String cnpj = gerador.cnpj(false);
		incluirConvenio.setCnpj(cnpj);
		incluirConvenio.setNome(dataTable.cell(1,1) +" - "+cnpj);
		incluirConvenio.setRazaoSocial(dataTable.cell(2,1) +" - "+cnpj);
		incluirConvenio.setInscMunicipal(geraNumAuto());
		incluirConvenio.setInscEstadual(geraNumAuto());
		incluirConvenio.setRede(dataTable.cell(5,1));
		incluirConvenio.selecionarTipoMeioHospedagem(dataTable.cell(6,1));
		incluirConvenio.selecionarTipoAdministracao(dataTable.cell(7,1));
		incluirConvenio.setSite(dataTable.cell(9,1));
		incluirConvenio.setResponsavel(dataTable.cell(10,1));
		incluirConvenio.setEmail(gerarEmailRandomico());
		incluirConvenio.setTelefoneComercial(dataTable.cell(12,1));
		incluirConvenio.setCep(dataTable.cell(13,1));
		incluirConvenio.setBanco(dataTable.cell(14,1));
		incluirConvenio.setAgencia(gera4NumAuto());
		incluirConvenio.setAgenciaDigito(dataTable.cell(16,1));
		incluirConvenio.setConta(gera4NumAuto());
		incluirConvenio.setContaDigito(dataTable.cell(18,1));
		incluirConvenio.setDescricao(dataTable.cell(19,1));
		incluirConvenio.setPontoInteresse(dataTable.cell(20,1));
	}

	@Dado("avançar para a Etapa dois Instalação e Serviço")
	public void avançarParaAEtapaDois() {
	    incluirConvenio.salvarProximo();
	}

	@Dado("preencher a lista de comodidades")
	public void preencherAListaDeComodidades(DataTable dataTable) {
	   incluirConvenio.selecionarAcademia(dataTable.cell(0, 1));
	   incluirConvenio.selecionarAberta24Hr(dataTable.cell(1, 1));
	   incluirConvenio.selecionarBarcoNoLocal(dataTable.cell(2,1));
	   incluirConvenio.selecionarBarcoRemoNoLocal(dataTable.cell(3,1));
	}

	@Dado("incluir uma foto do hotel")
	public void incluirUmaFotoDoHotel(DataTable dataTable) throws AWTException {
	    incluirConvenio.adicionarAlbum();
	    incluirConvenio.selecionarTipoAlbum(dataTable.cell(0, 1));
	    incluirConvenio.botaoUpload();
	    incluirConvenio.selecionarFoto();
	    incluirConvenio.incluirAlbum();
	}

	@Dado("avançar para a Etapa três Tipos de UH")
	public void avançarParaAEtapaTrêsTiposDeUH() {
		incluirConvenio.salvarProximo();
	}

	@Dado("preencher os campos de uma nova Unidade Habitacional")
	public void preencherOsCamposDeUmaNovaUnidadeHabitacional(DataTable dataTable) {
	    incluirConvenio.selecionarTipoUh(dataTable.cell(0,1));
	    incluirConvenio.setQuantidade(dataTable.cell(1,1));
	    incluirConvenio.selecionarUnidadeHabitacionalAtende(dataTable.cell(2,1));
	    incluirConvenio.clicarAtendePCD();
	    //incluirConvenio.clicarContratado();
	    incluirConvenio.selecionarConfigCama(dataTable.cell(5,1));
	    incluirConvenio.setMaximoAdultos(dataTable.cell(6,1));
	    incluirConvenio.setMaximoCriancas(dataTable.cell(7,1));
	    incluirConvenio.clicarGratuidadeCrianca(dataTable.cell(8,1));
	    incluirConvenio.setQtdGratuidadeCrianca(dataTable.cell(9,1));
	    incluirConvenio.setIdadeMaxCrianca(dataTable.cell(10,1));
	    incluirConvenio.selecionarUnidadeHabitacional(dataTable.cell(11,1));
	    incluirConvenio.acomodada(dataTable.cell(12,1));
	}

	@Dado("selecionar as características da Unidade Habitacional")
	public void selecionarAsCaracterísticasDaUnidadeHabitacional(DataTable dataTable) {
	    incluirConvenio.selecionarCama();
	    incluirConvenio.clicarAberturaCamaDormir(dataTable.cell(0,1));
	    incluirConvenio.clicarRoupasCamaAntialergicasDisp(dataTable.cell(1,1));
	    incluirConvenio.selecionarCaracteristicasBanheiros();
	    incluirConvenio.clicarRoupoesBanho(dataTable.cell(2,1));
	    incluirConvenio.clicarRoupoesBanhoInfantis(dataTable.cell(3,1));
	}

	@Dado("selecionar as fotos da Unidade Habitacional")
	public void selecionarAsFotosDaUnidadeHabitacional() throws AWTException {
	    incluirConvenio.botaoUpload();
	    incluirConvenio.selecionarFoto1();
	    incluirConvenio.incluirAlbum();
	}

	@Dado("Salvar a Unidade Habitacional")
	public void salvarAUnidadeHabitacional() {
	    incluirConvenio.adicionarUh();
	}

	@Dado("avançar para a Etapa quatro Condições de Contrato")
	public void avançarParaAEtapaQuatroCondiçõesDeContrato() {
		incluirConvenio.salvarProximo();
	}
	
	@Dado("preencher os dados referente as condições de contrato")
	public void preencherOsDadosReferenteAsCondiçõesDeContrato(DataTable dataTable) {
		incluirConvenio.selecionarFormaPagamento(dataTable.cell(1,1));
		incluirConvenio.setInicioVigencia(dataTable.cell(0,1));
		incluirConvenio.forcarVigencia();
	    incluirConvenio.selecionarTipoUnidHabitacional(dataTable.cell(2,1));
	    incluirConvenio.selecionarNivelUtilizacao(dataTable.cell(3,1));
	    incluirConvenio.selecionarNomeTemporada();
	    incluirConvenio.selecionarRegime(dataTable.cell(5,1));
	    incluirConvenio.setInicioPeriodo(dataTable.cell(6,1));
	    incluirConvenio.setFimPeriodo(dataTable.cell(7,1));
	    incluirConvenio.clicarAdicionarTemporada();
	    incluirConvenio.setValorSGL(dataTable.cell(8,1));
	    incluirConvenio.setValorCHD(dataTable.cell(9,1));
	    incluirConvenio.setBloqueio(dataTable.cell(10,1));
	    incluirConvenio.setDiaDeadline(dataTable.cell(11,1));
	    incluirConvenio.setDiaCancelamento(dataTable.cell(12,1));
	    incluirConvenio.clicarRestricoes();
	    incluirConvenio.setMininoDiarias(dataTable.cell(13,1));
	    incluirConvenio.selecionarDiasMinimoDiarias(dataTable.cell(14,1));
	    incluirConvenio.clicarAdicionar();
	}

	@Quando("clicar para Salvar a Proposta")
	public void clicarParaSalvarAProposta() {
	    incluirConvenio.salvarFinalizar();
	}

	@Então("a Proposta ficará com a situação Para Aprovação")
	public void aPropostaFicaráComASituaçãoParaAprovação() {
	   
	}
	
	
	
	
}
