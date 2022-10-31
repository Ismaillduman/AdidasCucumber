package com.demoblazee.runners;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import javax.xml.catalog.CatalogFeatures;
import java.awt.*;

@RunWith(Cucumber.class)
@CucumberOptions(
      features ="src/test/resources/features",
        glue = "com/demoblazee/step_definitions",
        dryRun = true,
        tags = "@wip"


)
public class CukesRunner {
}
