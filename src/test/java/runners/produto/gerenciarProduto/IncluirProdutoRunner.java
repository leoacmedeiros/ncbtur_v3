package runners.produto.gerenciarProduto;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
//		dryRun = true,
		strict = true
		,monochrome = true
		,stepNotifications = true
		,features = {"src/test/resources/features/produto/gerenciarProduto/IncluirProduto.feature"}
		,glue = {"stepDefinitions"}
		,plugin = {"pretty"}
		,snippets = SnippetType.CAMELCASE
		)

public class IncluirProdutoRunner {

}
