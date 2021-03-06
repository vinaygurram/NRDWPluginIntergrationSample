# NRDWPluginIntergrationSample  
This project aims to integrate dropwizard application to [new relic drop wizard plugin]
[NRPlugin].   

### Sample Run

#### Requirements
* [Maven][Maven]
* [Newrelic][NewRelic] account 
* Basic knowledge about [Dropwizard][dropwizard]  

#### Setting up configurations
This project includes __config__ folder in root path. This direcotry contains __newrelic.json__ and 
__plugin.json__. __newrelic.json__ file contains [newrelic configuration][NRConfig] and 
__plugin.json__ contains [new relic drop wizard plugin configuration][NRPluginConfig].

#### Build the project
``mvn clean package``

#### Start App 
Start the application using the jar from project root directory.    

``java -jar target/nr-intgration-1.0-SNAPSHOT.jar server app-config.yaml``

You can view your app metrics in newrelic console under plugins.

[NewRelic]: https://newrelic.com/
[Maven]: https://maven.apache.org/download.cgi
[dropwizard]: https://dropwizard.github.io
[NRPlugin]: https://github.com/dbaggott/newrelic-dropwizard
[NRConfig]: https://github.com/dbaggott/newrelic-dropwizard/blob/master/src/main/resources/config/newrelic.template.json
[NRPluginConfig]: https://github.com/dbaggott/newrelic-dropwizard/blob/master/src/main/resources/config/plugin.template.json