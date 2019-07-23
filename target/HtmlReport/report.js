$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("feature1.feature");
formatter.feature({
  "name": "Registration",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "validation for reg",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "open browser",
  "keyword": "Given "
});
formatter.match({
  "location": "step.open_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter username \"susan\"",
  "keyword": "And "
});
formatter.match({
  "location": "step.enter_username(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter firstname \"susan\"",
  "keyword": "And "
});
formatter.match({
  "location": "step.enter_firstname(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter lastname \"rekha\"",
  "keyword": "And "
});
formatter.match({
  "location": "step.enter_lastname(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter password \"qwerty\"",
  "keyword": "And "
});
formatter.match({
  "location": "step.enter_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter confirm password \"qwerty\"",
  "keyword": "And "
});
formatter.match({
  "location": "step.enter_confirm_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter gender female",
  "keyword": "And "
});
formatter.match({
  "location": "step.enter_gender_female()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter email \"rekha@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "step.enter_email(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "mobile number \"1234567890\"",
  "keyword": "And "
});
formatter.match({
  "location": "step.mobile_number(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "DOB \"13/03/1998\"",
  "keyword": "And "
});
formatter.match({
  "location": "step.dob(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Address \"abc\"",
  "keyword": "And "
});
formatter.match({
  "location": "step.address(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "choose security question",
  "keyword": "And "
});
formatter.match({
  "location": "step.choose_security_question()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "type \"blue\"",
  "keyword": "Then "
});
formatter.match({
  "location": "step.type(String)"
});
formatter.result({
  "status": "passed"
});
});