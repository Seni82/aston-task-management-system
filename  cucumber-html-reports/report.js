$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Test/Feature/AddTask.feature");
formatter.feature({
  "name": "Add Tasks",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "I want to verify task can be added",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I populate all required fields",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I fire event to generate task",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I check the taskArray object",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "task should be added",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("Test/Feature/ClearField.feature");
formatter.feature({
  "name": "Ensure all fields are empty when clear method is called.",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Clear field function sets all fields to empty.",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I enter data into the application",
  "keyword": "Given "
});
formatter.step({
  "name": "I simulate \u0027\u003cnameOfButton\u003e\u0027 action button by calling \"events\" added to button",
  "keyword": "And "
});
formatter.step({
  "name": "all data in field should be empty",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "nameOfButton"
      ]
    },
    {
      "cells": [
        "clear"
      ]
    },
    {
      "cells": [
        "add"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Clear field function sets all fields to empty.",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I enter data into the application",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I simulate \u0027clear\u0027 action button by calling \"events\" added to button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "all data in field should be empty",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Clear field function sets all fields to empty.",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I enter data into the application",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I simulate \u0027add\u0027 action button by calling \"events\" added to button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "all data in field should be empty",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("Test/Feature/EnsureMandatoryFieldsAreFilled.feature");
formatter.feature({
  "name": "Ensure validation stops task generation until form is filled",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Ensure validation works.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@StepDefAnnotation"
    }
  ]
});
formatter.step({
  "name": "I attempt to add a new task",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I simulate add action",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the new task is not created.",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});