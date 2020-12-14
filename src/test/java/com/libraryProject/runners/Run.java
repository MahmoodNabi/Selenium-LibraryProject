package com.libraryProject.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue ="com/libraryProject/step_definition",
        dryRun =false,
        tags="@librarian",
         publish=true

)



public class Run {




}
