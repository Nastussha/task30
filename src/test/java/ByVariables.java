import org.openqa.selenium.By;

public class ByVariables {
    private static final String URL = "https://www.tut.by/";
    private static final By CLASSNAME = By.className("enter");
    private static final By NAME = By.name("login");
    private static final By XPATH = By.xpath(".//input[contains(@class, 'button auth__enter')]");
    private static final By CSSSELECTOR = By.cssSelector("b-topbar");
    private static final By ID = By.id("r5104com");
    private static final By LINKTEXT = By.linkText("Почта");
    private static final By PARTIALLINKTEXT = By.partialLinkText("Афиш");
    private static final By TAGNAME = By.tagName("input");
}
