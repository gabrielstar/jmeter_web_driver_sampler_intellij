# jmeter_web_driver_sampler_intellij
This projects contains a recipe for writing jmeter WebDriverSampler directly in Intellij IDE 

Contents:

wds.jmx - jmeter scenario
jmeter-wds
  resources/wds_jmeter.groovy - version of WDS sampler for copy-paste to jmeter
  src/
      wds.groovy - jmeter sampler with necessary mocks alloweing to use IntelliJ IDE (or any other)
      convert.groovy - converter to clean up wds.groovy to a version understandable by jmeter
      chromedriver.exe - browser driver used in this repo
