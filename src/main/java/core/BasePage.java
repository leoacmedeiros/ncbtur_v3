package core;

import static core.DriverFactory.getDriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	WebDriverWait wait = new WebDriverWait(getDriver(), 10);

	/********** TextField e TextArea **********/

	public void escrever(By by, String text) {
		esperarPresencaDoLoading();
		waitForLoad(getDriver());
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		wait.until(ExpectedConditions.elementToBeClickable(getDriver().findElement(by)));

		getDriver().findElement(by).clear();
		getDriver().findElement(by).sendKeys(text);
	}

	public void forcarLimpar(By by) {
		getDriver().findElement(by).sendKeys(Keys.CONTROL + "A");
		getDriver().findElement(by).sendKeys(Keys.DELETE);
	}

	public String obterValorCampo(By by) {
		return getDriver().findElement(by).getAttribute("value");
	}

	/********** ComboBox **********/

	public void selecionarComboBox(By by, String valor) {
		waitForLoad(getDriver());
		Select comboBox = new Select(getDriver().findElement(by));
		wait.until(ExpectedConditions.elementToBeClickable(by));
		comboBox.selectByVisibleText(valor);
	}

	/********** Clique **********/

	public void clicar(By by) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		wait.until(ExpectedConditions.elementToBeClickable(by)).click();
	}

	/********** Obter Informações **********/

	public String obterTexto(By by) {
		return getDriver().findElement(by).getText();
	}

	public boolean isCheckMarcado(By by) {
		return getDriver().findElement(by).isSelected();
	}

	public String obterValorSelecionadoComboBox(By by) {
		WebElement element = getDriver().findElement(by);
		Select comboBox = new Select(element);
		return comboBox.getFirstSelectedOption().getText();
	}

	/********** Frames, Janelas e Abas **********/

	public void entrarFrame(String id) {
		getDriver().switchTo().frame(id);
	}

	public void sairFrame() {
		getDriver().switchTo().defaultContent();
	}

	public void trocarJanela(String id) {
		getDriver().switchTo().window(id);
	}

	public void trocarAba(int indiceAba) {
		ArrayList<String> abas = new ArrayList<>(getDriver().getWindowHandles());
		getDriver().switchTo().window(abas.get(indiceAba));
	}

	/********** JavaScript **********/

	public Object executarJS(String cmd, Object... param) {
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		return jse.executeScript(cmd, param);
	}

	public static void scrollPageUP() {
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("scroll(0, -250);");
	}

	public static void scrollPageDOWN() {
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("window.scrollBy(0,250)");
	}

	public static void scrollAteElemento(By by) {
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		WebElement Project = getDriver().findElement(by);
		jse.executeScript("arguments[0].scrollIntoView();", Project);
	}

	public static void scrollElementoClicar(By by) {
		esperarPresencaDoLoading();
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		WebElement Project = getDriver().findElement(by);
		jse.executeScript("arguments[0].click();", Project);
	}

	public static void clicarElementoScrollVisivel(By by) {
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		WebElement Project = getDriver().findElement(by);
		jse.executeScript("arguments[0];", Project);

		WebDriverWait wait = new WebDriverWait(getDriver(), 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		wait.until(ExpectedConditions.elementToBeClickable(by)).click();
	}

	/********** Upload **********/

	public void fileUpload(By by, String diretorio) throws AWTException {
		String diretorioRaiz = System.getProperty("user.dir");

		try {
			getDriver().findElement(by).click();

			StringSelection ss = new StringSelection(diretorioRaiz + diretorio);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

			Robot robot = new Robot();
			robot.delay(1000);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (Exception e) {
			getDriver().findElement(by).sendKeys(diretorioRaiz + diretorio);
		}
	}

	/********** Waits **********/

	private void waitForLoad(WebDriver driver) {
		new WebDriverWait(driver, 30).until((ExpectedCondition<Boolean>) webDriver -> ((JavascriptExecutor) webDriver)
				.executeScript("return document.readyState").equals("complete"));
	}

	public static void esperarElementoFicarVisivel(By by) throws TimeoutException {
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	public static void sleep(Integer tempoEmSegundos) {
		try {
			Thread.sleep((long) tempoEmSegundos * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/********** Geradores Randômicos **********/

	public static String gerarEmailRandomico() {
		int i, vogalAleatoria, consoanteAleatoria;

		String vogal[] = { "a", "e", "i", "o", "u" }, vogalConsoante = "", email = "", consoante[] = { "b", "c", "d",
				"f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "w", "x", "y", "z" };
		Random random = new Random();

		for (i = 0; i <= 8; i++) {
			vogalAleatoria = 0 + random.nextInt(4);
			consoanteAleatoria = 0 + random.nextInt(19);
			vogalConsoante = vogal[vogalAleatoria] + consoante[consoanteAleatoria];
			email = email + vogalConsoante;
		}
		return email + "@emailaleatorio.com";
	}

	public static String gerarNumeroRandomico() {
		int i;

		Random random = new Random();
		i = random.nextInt();
		if (i < 0) {
			i = i * (-1);
		}
		return String.valueOf(i);
	}

	/*********** Gera Número Automático - 4 Números ***********/
	public String gera4NumAuto() {
		String numAuto = LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME).substring(15, 21).replace(".", "")
				.replace(":", "");
		return numAuto;
	}
	
	/*********** Gera Número Automático ***********/
	public String geraNumAuto() {
		String numAuto = LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME).substring(7, 21).replace(".", "")
				.replace(":", "");
		return numAuto;
	}
	
	/********** Data e Hora **********/

	public static String obterHoraMinuto() {
		String hora = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
		return hora;
	}

	public static String obterDataAtual() {
		String data = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		return data;
	}

	public static String adicionarMinutos(String somaMinuto) {
		int numero = Integer.parseInt(somaMinuto);

		String minuto = LocalTime.now().plusMinutes(numero).format(DateTimeFormatter.ofPattern("mm"));
		return minuto;
	}

	public static String adicionarHora(String somaHora) {
		int numero = Integer.parseInt(somaHora);

		String hora = LocalTime.now().plusHours(numero).format(DateTimeFormatter.ofPattern("HH"));
		return hora;
	}

	public static String adicionarDias(String somaDia) {
		int dia = Integer.parseInt(somaDia);

		String data = LocalDate.now().plusDays(dia).format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		return data;
	}

	
	/********** Espera - Loading **********/
	
	private static boolean hasVisibleElementAtList(List<WebElement> lista) {
		for (WebElement element : lista) {
			// System.out.println("\n Is displayed: " + element.isDisplayed()
			// + "\n Is enabled: " + element.isEnabled() + "\n Is selected: " +
			// element.isSelected() + "\n get size: " + element.getSize());
			if (element.isDisplayed()) {
				// final WebDriverWait wait = new WebDriverWait(driver, 1);
				// wait.until(ExpectedConditions.invisibilityOf(element));
				// sleep(1);
				return true;
			}
		}
		return false;
	}

	public static void esperarElementoFicarVisivel2(By by) throws TimeoutException {
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	
	public static void setaTempoDeEsperaDriver(int tempo) {
		getDriver().manage().timeouts().implicitlyWait(tempo, TimeUnit.SECONDS);
	}
	
	
	private static final int TEMPO_ESPERA_LOADING = 1;
	private static final int TEMPO_ESPERA_DEFAULT = 5;
	private static final String UrlArquivo = null;

	
	public static void esperarPresencaDoLoading() {
		try {
			// System.out.println("Loading...");
			int i = 300;
			boolean aguarde = true;
			while (--i > 0 && aguarde) {
				setaTempoDeEsperaDriver(TEMPO_ESPERA_LOADING);
				sleep(1);
				// List<WebElement> lista =
				// getDriver().findElements(By.className("block-ui-message ng-binding"));
				List<WebElement> lista = getDriver().findElements(By.xpath("//div[@class='page-spinner-bar']"));
				// System.out.println("Loading size: " + lista.size());
				setaTempoDeEsperaDriver(TEMPO_ESPERA_DEFAULT);
				aguarde = hasVisibleElementAtList(lista);

				if (aguarde)
					lista.clear();
			}
		} catch (Exception e) {
			return;
		}
	}
	
	
	
	
}
