package com.tutorialsninja.automation.runner;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features={"classpath:FeatureFiles\\Register.feature"},
glue={"classpath:com.tutorialsninja.automation.stepdef"},
plugin={"html:target\\Cucumber_html_report"},
tags={"@Register","@one"})
public class Runner {

}
