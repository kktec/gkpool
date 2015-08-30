import org.openqa.selenium.htmlunit.HtmlUnitDriver

baseUrl = 'http://localhost:8080/'

driver = {
    new HtmlUnitDriver()
}

reportsDir = new File('build/geb-reports')
