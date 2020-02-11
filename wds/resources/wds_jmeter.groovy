
import org.openqa.selenium.WebDriver


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