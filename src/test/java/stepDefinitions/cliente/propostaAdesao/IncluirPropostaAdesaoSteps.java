package stepDefinitions.cliente.propostaAdesao;

import core.BasePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pageObjects.cliente.propostaAdesao.IncluirPropostaAdesaoPage;
import pageObjects.cliente.propostaAdesao.ListarPropostaAdesaoPage;
import pageObjects.menu.MenuPage;
import utils.GerarDocumentos;

public class IncluirPropostaAdesaoSteps {
	
	MenuPage menu = new MenuPage();
	ListarPropostaAdesaoPage listarPropostaAdesao = new ListarPropostaAdesaoPage();
	IncluirPropostaAdesaoPage incluirPropostaAdesao = new IncluirPropostaAdesaoPage();
	GerarDocumentos gerarDocumentos = new GerarDocumentos();
	BasePage basePage = new BasePage();

	@Dado("que queria cadastrar uma proposta de adesão")
	public void queQueriaCadastrarUmaPropostaDeAdesão() {
		menu.acessarPropostaAdesao();
	}

	@Quando("clicar em [Nova Proposta de Adesão]")
	public void clicarEmNovaPropostaDeAdesão() {
		listarPropostaAdesao.novaPropostaAdesao();
	}

	@Quando("preecher o formulário para cadastro de uma proposta de adesão")
	public void preecherOFormulárioParaCadastroDeUmaPropostaDeAdesão(DataTable dataTable) {
		String cpf = gerarDocumentos.cpf(true);
		String cnpj = gerarDocumentos.cnpj(true);
		String email = BasePage.gerarEmailRandomico();
		incluirPropostaAdesao.setTipoPessoa					(dataTable.cell(0, 1));
		incluirPropostaAdesao.setCpf						(cpf);
		incluirPropostaAdesao.setCnpj						(cnpj);
		incluirPropostaAdesao.setNomePessoFisica			(dataTable.cell(2, 1) + " " + cpf);
		incluirPropostaAdesao.setNomePessoJuridica			(dataTable.cell(2, 1) + " " + cnpj);
		incluirPropostaAdesao.setRazaoSocialPessoJuridica	(dataTable.cell(3, 1) + " " + cnpj);
		incluirPropostaAdesao.setRg							(dataTable.cell(4, 1));
		incluirPropostaAdesao.setOrgaoEmissor				(dataTable.cell(5, 1));
		incluirPropostaAdesao.setGenero						(dataTable.cell(6, 1));
		incluirPropostaAdesao.setNacionalidade				(dataTable.cell(7, 1));
		incluirPropostaAdesao.setEstadoCivil				(dataTable.cell(8, 1));
		incluirPropostaAdesao.setDataNascimento				(dataTable.cell(9, 1));
		incluirPropostaAdesao.setMenorEmancipado			(dataTable.cell(10, 1));
		incluirPropostaAdesao.setTelefoneComercial			(dataTable.cell(11, 1));
		incluirPropostaAdesao.setTelefoneResidencial		(dataTable.cell(12, 1));
		incluirPropostaAdesao.setEmail						(email);
		incluirPropostaAdesao.setTelefoneCelular			(dataTable.cell(14, 1));
		incluirPropostaAdesao.setProfissao					(dataTable.cell(15, 1));
		incluirPropostaAdesao.setGrauInstrucao				(dataTable.cell(16, 1));
		incluirPropostaAdesao.setRendaMensal				(dataTable.cell(17, 1));
		incluirPropostaAdesao.setCep						(dataTable.cell(18, 1));
	}
	
	@Quando("caso proposta seja para pessoa jurídica preenhcer os dados de sócio administrador")
	public void casoPropostaSejaParaPessoaJurídicaPreenhcerOsDadosDeSócioAdministrador(DataTable dataTable) {
		String cpf = gerarDocumentos.cpf(true);
		incluirPropostaAdesao.setNovoSocioAdministrador();
		incluirPropostaAdesao.setNomeSocioAdministrador				(dataTable.cell(0, 1) + " " + cpf);
		incluirPropostaAdesao.setCpfSocioAdministrador				(cpf);
		incluirPropostaAdesao.setCargoSocioAdministrador			(dataTable.cell(2, 1));
		incluirPropostaAdesao.setDataNascimentoSocioAdministrador	(dataTable.cell(3, 1));
		incluirPropostaAdesao.setGeneroSocioAdministrador			(dataTable.cell(4, 1));
		incluirPropostaAdesao.setEstadoCivilSocioAdministrador		(dataTable.cell(5, 1));
		incluirPropostaAdesao.setEmailSocioAdministrador			(dataTable.cell(6, 1));
		incluirPropostaAdesao.setTelefoneCelularSocioAdministrador	(dataTable.cell(7, 1));
		incluirPropostaAdesao.adicionarSocioAdministrador();
	}

	@Então("clicar em [Salvar Proposta & Próximo]")
	public void clicarEmSalvarPropostaPróximo() {
		incluirPropostaAdesao.salvarAvancarProposta();
	}

	@Quando("selecionar o vendedor")
	public void selecionarOVendedor(DataTable dataTable) {
		incluirPropostaAdesao.setCanalVendasVendedor	(dataTable.cell(0, 1));
		incluirPropostaAdesao.setDescontoVendedor		(dataTable.cell(1, 1));
		incluirPropostaAdesao.setIndicador				(dataTable.cell(2, 1));
		incluirPropostaAdesao.setCanalVendasIndicador	(dataTable.cell(3, 1));
		incluirPropostaAdesao.setVendedorIndicador		(dataTable.cell(4, 1));
	}
	
	@Quando("selecionar os títulos")
	public void selecionarOsTítulos(DataTable dataTable) {
		incluirPropostaAdesao.setPoliticaVenda			(dataTable.cell(0, 1));
		incluirPropostaAdesao.setProdutosPoliticaVenda	(dataTable.cell(1, 1));
	}

	@Quando("preecher os dados financeiros")
	public void preecherOsDadosFinanceiros(DataTable dataTable) {
		incluirPropostaAdesao.setQtdParcelasTaxaAdesao	(dataTable.cell(0, 1));
		incluirPropostaAdesao.setMesmaFormaPagamento	(dataTable.cell(1, 1));
		incluirPropostaAdesao.setFormaPagamento			(dataTable.cell(2, 1));
		incluirPropostaAdesao.setDiaDebito				(dataTable.cell(3, 1));
		incluirPropostaAdesao.setBanco					(dataTable.cell(4, 1));
		incluirPropostaAdesao.setAgencia				(dataTable.cell(5, 1));
		incluirPropostaAdesao.setDigitoAgencia			(dataTable.cell(6, 1));
		incluirPropostaAdesao.setConta					(dataTable.cell(7, 1));
		incluirPropostaAdesao.setDigitoConta			(dataTable.cell(8, 1));
		incluirPropostaAdesao.setOperacao				(dataTable.cell(9, 1));
		incluirPropostaAdesao.setBandeira				(dataTable.cell(10, 1));
		incluirPropostaAdesao.setNomeImpressoCartao		(dataTable.cell(11, 1));
		incluirPropostaAdesao.setNumeroCartao			(dataTable.cell(12, 1));
		incluirPropostaAdesao.setCodigoSeguranca		(dataTable.cell(13, 1));
		incluirPropostaAdesao.setValidadeCartao			(dataTable.cell(14, 1));
	}

	@Quando("clicar em [Salvar Proposta]")
	public void clicarEmSalvarProposta() {
		incluirPropostaAdesao.salvarProposta();
	}

	@Então("será criada a proposta de adesão")
	public void seráCriadaAPropostaDeAdesão() {
		listarPropostaAdesao.verificarMensagemSucesso();
	}

}
