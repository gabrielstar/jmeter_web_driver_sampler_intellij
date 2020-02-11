@Grab(group = 'org.seleniumhq.selenium', module = 'selenium-support', version = '3.7.1') //TOKEN_REMOVE
@Grab(group = "org.seleniumhq.selenium", module = "selenium-java", version = "3.7.1") //TOKEN_REMOVE
@Grab(group = 'org.apache.commons', module = 'commons-lang3', version = '3.9') //TOKEN_REMOVE

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver //TOKEN_REMOVE

//TOKEN_REMOVE_BLOCK_START
//START MOCK
class WebDriverSampler {
    SampleResult sampleResult
    WebDriver browser
    final static String CHROME_DRIVER_PATH = 'chromedriver.exe'
    final static String WEBDRIVER_CHROME_PROPERTY = "webdriver.chrome.driver"
    def chromeDriverSelectedOptions = ['--verbose', '--ignore-certificate-errors']

    WebDriverSampler() {
        System.setProperty(WEBDRIVER_CHROME_PROPERTY, CHROME_DRIVER_PATH);
        browser = new ChromeDriver()
        sampleResult = new SampleResult(browser)
    }
}

class SampleResult {
    WebDriver browser

    SampleResult(WebDriver browser) {
        this.browser = browser
    }

    void sampleStart() {}

    void sampleEnd() { browser.quit() }
}

WDS = new WebDriverSampler()
//-------------------------- END MOCK
//TOKEN_REMOVE_BLOCK_END

class JMeterPage {
    WebDriver driver

    JMeterPage(WebDriver driver) {
        this.driver = driver
    }
    def getTitle(){
        return driver.getTitle()
    }

}

WDS.sampleResult.sampleStart()
WDS.browser.get('http://jmeter-plugins.org')
JMeterPage jMeterPage = new JMeterPage(WDS.browser)
assert jMeterPage.getTitle()!=null;
WDS.sampleResult.sampleEnd()