package stepDefinitions.produto.canalVendas;

import java.awt.AWTException;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pageObjects.menu.MenuPage;
import pageObjects.produto.canalVendas.IncluirCanalVendasPage;
import pageObjects.produto.canalVendas.ListarCanalVendasPage;
import utils.GerarDocumentos;

public class IncluirCanalVendasSteps {

	MenuPage menu = new MenuPage();
	ListarCanalVendasPage listarCanalVendas = new ListarCanalVendasPage();
	IncluirCanalVendasPage incluirCanalVendas = new IncluirCanalVendasPage();
	GerarDocumentos gerarDocumentos = new GerarDocumentos();

	@Dado("que queira criar um novo canal de vendas")
	public void queQueiraCriarUmNovoCanalDeVendas() {
		menu.acessarCanalVendas();
	}

	@Quando("clicar em [Novo Canal de Vendas]")
	public void clicarEmNovoCanalDeVendas() {
		listarCanalVendas.novoCanalVendas();
	}

	@Quando("preencher o formulário para cadastro de canal de vendas")
	public void preencherOFormulárioParaCadastroDeCanalDeVendas(DataTable dataTable) {
		String cnpj = gerarDocumentos.cnpj(true);
		incluirCanalVendas.setTipoCanalVendas			(dataTable.cell(0, 1));
		incluirCanalVendas.setNomeCanalVendas			(dataTable.cell(1, 1));
		incluirCanalVendas.setDescricaoCanalVendas		(dataTable.cell(2, 1));
		incluirCanalVendas.setParametrosVinculo			(dataTable.cell(3, 1));
		incluirCanalVendas.setRazaoSocialCanalVendas	(dataTable.cell(4, 1) + " " + cnpj);
		incluirCanalVendas.setCnpjCanalVendas			(cnpj);
		incluirCanalVendas.setEmpresaCanalVendas		(dataTable.cell(6, 1));
		incluirCanalVendas.setFilialCanalVendas			(dataTable.cell(7, 1));
		incluirCanalVendas.setSiteCanalVendas			(dataTable.cell(8, 1));
		incluirCanalVendas.setCaptadoCanalVendas		(dataTable.cell(9, 1));
		incluirCanalVendas.setCoreCanalVendas			(dataTable.cell(10, 1));
	}
	
	@Quando("adicionar contatos")
	public void adicionarContatos(DataTable dataTable) {
		incluirCanalVendas.setContatosObrigatoriosCanalVendas(dataTable.cell(0, 1), dataTable.cell(1, 1));
	}
	
	@Quando("preencher endereço")
	public void preencherEndereço(DataTable dataTable) {
		incluirCanalVendas.setCepCanalVendas		(dataTable.cell(0, 1));
		incluirCanalVendas.setTaxaIssCanalVendas	(dataTable.cell(1, 1));
	}
	
	@Quando("escolher a situação do canal de vendas")
	public void escolherASituaçãoDoCanalDeVendas(DataTable dataTable) {
		incluirCanalVendas.setSituacaoCanalVendas					(dataTable.cell(0, 1));
		incluirCanalVendas.setRecebeRemuneracaoComissaoCanalVendas	(dataTable.cell(1, 1));
	}
	
	@Então("clicar em [Próximo]")
	public void clicarEmPróximo() {
		incluirCanalVendas.proximaAba();
	}

	@Quando("preencher a vigência do canal de vendas")
	public void preencherAVigênciaDoCanalDeVendas(DataTable dataTable) {
		incluirCanalVendas.setTempoIndeterminadoVigenciaCanalVendas	(dataTable.cell(0, 1));
		incluirCanalVendas.setInicioVigenciaCanalVendas				(dataTable.cell(1, 1));
		incluirCanalVendas.setFimVigenciaCanalVendas				(dataTable.cell(2, 1));
	}
	
	@Quando("informar os dados para envio de notificações")
	public void informarOsDadosParaEnvioDeNotificações(DataTable dataTable) {
		incluirCanalVendas.setAreaResponsavelNotificacaoCanalVendas	(dataTable.cell(0, 1));
		incluirCanalVendas.setEmailNotificacaoCanalVendas			(dataTable.cell(1, 1));
	}
	
	@Quando("clicar em [Novo Responsável]")
	public void clicarEmNovoResponsável() {
		incluirCanalVendas.setResponsavelCanalVendas();
	}
	
	@Quando("preencher os dados do responsável do canal de vendas")
	public void preencherOsDadosDoResponsávelDoCanalDeVendas(DataTable dataTable) {
		String cpf = gerarDocumentos.cpf(true);
		incluirCanalVendas.setNomeResponsavelCanalVendas			(dataTable.cell(0, 1));
		incluirCanalVendas.setSexoResponsavelCanalVendas			(dataTable.cell(1, 1));
		incluirCanalVendas.setCpfResponsavelCanalVendas				(cpf);
		incluirCanalVendas.setRgResponsavelCanalVendas				(dataTable.cell(3, 1));
		incluirCanalVendas.setOrgaoExpedidorResponsavelCanalVendas	(dataTable.cell(4, 1));
		incluirCanalVendas.setProfissaoResponsavelCanalVendas		(dataTable.cell(5, 1));
		incluirCanalVendas.setCargoResponsavelCanalVendas			(dataTable.cell(6, 1));
		incluirCanalVendas.setNacionalidadeResponsavelCanalVendas	(dataTable.cell(7, 1));
		incluirCanalVendas.setEstadoCivilResponsavelCanalVendas		(dataTable.cell(8, 1));
		incluirCanalVendas.setDataNascimentoResponsavelCanalVendas	(dataTable.cell(9, 1));
		incluirCanalVendas.setEmailResponsavelCanalVendas			(dataTable.cell(10, 1));
		incluirCanalVendas.setTelefoneResponsavelCanalVendas		(dataTable.cell(11, 1));
		incluirCanalVendas.setCepResponsavelCanalVendas				(dataTable.cell(12, 1));
		incluirCanalVendas.setResponsavelTemporarioCanalVendas		(dataTable.cell(13, 1));
		incluirCanalVendas.setSituacaoResponsavelCanalVendas		(dataTable.cell(14, 1));
	}

	@Quando("adicionar responsável do canal de vendas")
	public void adicionarResponsávelDoCanalDeVendas() {
		incluirCanalVendas.adicionarResponsavelCanalVendas();
	}
	
	@Quando("clicar em [Novo Vendedor]")
	public void clicarEmNovoVendedor() {
		incluirCanalVendas.setVendedorCanalVendas();
	}

	@Quando("preencher os dados do vendedor")
	public void preencherOsDadosDoVendedor(DataTable dataTable) {
		incluirCanalVendas.setCpfVendedorCanalVendas		(dataTable.cell(0, 1));
		incluirCanalVendas.setVendedorPromotorCanalVendas	(dataTable.cell(1, 1));
	}

	@Quando("adicionar vendedor")
	public void adicionarVendedor() {
		incluirCanalVendas.adicionarVendedorCanalVendas();
	}
	
	@Quando("clicar em [Novo Conveniado]")
	public void clicarEmNovoConveniado() {
		incluirCanalVendas.setConveniadoCanalVendas();
	}

	@Quando("preencher os dados do conveniado")
	public void preencherOsDadosDoConveniado(DataTable dataTable) {
		incluirCanalVendas.setNomeConveniadoCanalVendas				(dataTable.cell(0, 1));
		incluirCanalVendas.setIdentificadorConveniadoCanalVendas	(dataTable.cell(1, 1));
		incluirCanalVendas.setIdentificador2ConveniadoCanalVendas	(dataTable.cell(2, 1));
	}
	
	@Quando("adicionar conveniado")
	public void adicionarConveniado() {
		incluirCanalVendas.adicionarConveniadoCanalVendas();
	}
	
	@Quando("informar os dados da oferta")
	public void informarOsDadosDaOferta(DataTable dataTable) {
		incluirCanalVendas.setPercentualOfertaCanalVendas						(dataTable.cell(0, 1));
		incluirCanalVendas.setPeriodoPromocionalCanalVendas						(dataTable.cell(1, 1));
		incluirCanalVendas.setDescontoPeriodoPromocionalCanalVendas				(dataTable.cell(2, 1));
		incluirCanalVendas.setDataInicioPeriodoPromocionalCanalVendas			(dataTable.cell(3, 1));
		incluirCanalVendas.setDataFimPeriodoPromocionalCanalVendas				(dataTable.cell(4, 1));
		incluirCanalVendas.setAreaResponsavelNotificacaoPromocionalCanalVendas	(dataTable.cell(5, 1));
		incluirCanalVendas.setEmailNotificacaoPromocionalCanalVendas			(dataTable.cell(6, 1));
		incluirCanalVendas.setNovoDescontoCanalVendas							(dataTable.cell(7, 1));
		incluirCanalVendas.setEmpresaDescontoCanalVendas						(dataTable.cell(8, 1));
		incluirCanalVendas.setDescontoCanalVendas								(dataTable.cell(9, 1));
		incluirCanalVendas.setObservacoesDescontoCanalVendas					(dataTable.cell(10, 1));
	}

	@Quando("adicionar novo desconto")
	public void adicionarNovoDesconto() {
		incluirCanalVendas.adicionarDescontoCanalVendas();
	}
	
	@Quando("preencher os dados bancários")
	public void preencherOsDadosBancários(DataTable dataTable) {
		incluirCanalVendas.setInstituicaoBancariaCanalVendas	(dataTable.cell(0, 1));
		incluirCanalVendas.setNumeroAgenciaBancariaCanalVendas	(dataTable.cell(1, 1));
		incluirCanalVendas.setNumeroContaBancariaCanalVendas	(dataTable.cell(2, 1));
	}
	
	@Quando("anexar documentação")
	public void anexarDocumentação(DataTable dataTable) throws AWTException {
		incluirCanalVendas.setDocumentacaoNecessariaCanalVendas(dataTable.cell(0, 1));
		incluirCanalVendas.adicionarDocumentacaoNecessariaCanalVendas();
	}

	@Quando("clicar em [Salvar Canal de Vendas]")
	public void clicarEmSalvarCanalDeVendas() {
		incluirCanalVendas.salvarCanalVendas();
	}

	@Então("será criado o Canal de Vendas")
	public void seráCriadoOCanalDeVendas() {
		listarCanalVendas.verificarMensagemSucesso();
	}
	
}
