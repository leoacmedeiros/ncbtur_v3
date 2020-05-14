package runners.meiosHospedagem.gerenciar.tipoMeioHospedagem;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
//		dryRun = true,
		strict = false
		,monochrome = true
		,stepNotifications = true
		,features = {"src/test/resources/features/meiosHospedagem/gerenciar/tipoMeioHospedagem/IncluirTipoMeioHospedagem.feature"}
		,glue = {"stepDefinitions"}
		,plugin = "pretty"
		,snippets = SnippetType.CAMELCASE
		)

public class IncluirTipoMeioHospedagemRunner {

}
