start all test devices or emmulators
add required devices session to config.toml
java -jar selenium-server-4.4.0.jar standalone  --config config.toml
run appium
appium --use-plugins=images --relaxed-security 
Add device name and platform to Run.xml

run mvn test -DsuiteXmlFile=run.xml
