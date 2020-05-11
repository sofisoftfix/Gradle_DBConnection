$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/net/cucumber/features/helloworld.feature");
formatter.feature({
  "name": "Hello World",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Say hello to the world",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@skip_scenario"
    }
  ]
});
formatter.step({
  "name": "I say hello to the world",
  "keyword": "When "
});
formatter.match({
  "location": "HelloWorldStepDefinition.i_say_hello_to_the_world()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see \"Hello World\"",
  "keyword": "Then "
});
formatter.match({
  "location": "HelloWorldStepDefinition.i_should_see(String)"
});
formatter.result({
  "status": "passed"
});
});