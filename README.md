# jmeter_web_driver_sampler_intellij
This projects contains a recipe for writing jmeter WebDriverSampler directly in Intellij IDE 

You can develop sampler in IDE and make sure it is fully transferable to Jmeter.

Contents:


````wds/
resources/
        wds.jmx - jmeter scenario
        wds_jmeter.groovy - version of WDS sampler for copy-paste to jmeter
  src/
        wds.groovy - jmeter sampler with necessary mocks allowing to use IntelliJ IDE (or any other)
        convert.groovy - converter to clean up wds.groovy to a version understandable by jmeter
        chromedriver.exe - browser driver used in this repo (update to your browser version)
````
#### Usage

##### in JMeter:

1. Checkout this repo
2. Copy chromedriver to your JMETER_HOME/bin directory
3. Open wds.jmx scenario in jmeter and run.

##### in IntelliJ:

0. Download zip to a folder. Unpack.
1. In IDE click New -> Project -> From Exisiting Souces. Pick your folder.
2. Keep clicking next until .. Source folders screen.
3. Unmark resources directory as source folders. Keep clicking next until SDK selection screen.
4. in SDK page make sure JDK 1.8 is chosen. Click on "+" button to your right and groovy folder to class path.
5. Click Next and Finish.
6. Open wds.groovy. Set Groovy SDK when prompted.
7. Run wds.groovy. You are all set! See my video for more.

#### How to make it work together ?

See my video here: https://youtu.be/ppkYbeYeBUk 
You can follow my video to build the solution from scratch on your machine.

Or read my article on medium: https://medium.com/@gabriel.starczewski/jmeter-web-driver-sampler-how-to-develop-it-with-ide-a50f6e228c51?source=friends_link&sk=acdd96f7ace3dbb6245c3e290e381c55 
 
