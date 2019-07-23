package run;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="feature1.feature",
glue="stepdef",
//plugin="html:target\\HtmlReport"
plugin="json:target\\jsonreport.json"
     )
public class runner {

}
