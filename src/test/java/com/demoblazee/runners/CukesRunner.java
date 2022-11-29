package com.demoblazee.runners;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import javax.xml.catalog.CatalogFeatures;
import java.awt.*;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin= {"json:target/cucumber.json",
                "html:target/cucumber-report.html"},
      features ="src/test/resources/features",
        glue = "com/demoblazee/step_definitions",
        dryRun = false,
        tags = "@wip"


)
public class CukesRunner {

}
