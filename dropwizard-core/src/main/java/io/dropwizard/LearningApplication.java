package io.dropwizard;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class LearningApplication extends Application<LearningConfiguration> {

    public static void main(final String[] args) throws Exception {
        new LearningApplication().run(args);
    }

    @Override
    public String getName() {
        return "Learning DropWizard";
    }

    @Override
    public void initialize(final Bootstrap<LearningConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final LearningConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
