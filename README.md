# jmeter_web_driver_sampler_intellij
This projects contains a recipe for writing jmeter WebDriverSampler directly in Intellij IDE 

You can develop sampler in IDE and make sure it is fully transferable to Jmeter.

Contents:


````wds/
resources/
        **wds.jmx** - jmeter scenario
        **wds_jmeter.groovy** - version of WDS sampler for copy-paste to jmeter
  src/
        **wds.groovy** - jmeter sampler with necessary mocks alloweing to use IntelliJ IDE (or any other)
        **convert.groovy** - converter to clean up wds.groovy to a version understandable by jmeter
        **chromedriver.exe** - browser driver used in this repo (update to your browser version)'''`
````
#### Usage

######in JMeter:

1. Checkout this repo
2. Copy chromedriver to your JMETER_HOME/bin directory
3. Open wds.jmx scenario in jmeter and run.

######in IntelliJ:

1. Open folder 
2. Set Groovy SDK to 2+
3. Run and develop WDS sampler in wds.groovy
4. Convert to jmeter version by running convert.groovy
5. Copy contents of wds_jmeter.groovy to jmeter
5. Run

######How to make it work together ?

See my video:
 