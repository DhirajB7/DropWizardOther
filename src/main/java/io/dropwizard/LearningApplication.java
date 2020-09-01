package io.dropwizard;

import io.dropwizard.health.TemplateHealthCheck;
import io.dropwizard.resources.SayingResource;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class LearningApplication extends Application<LearningConfiguration> {

    public static void main(final String[] args) throws Exception {
        new LearningApplication().run(args);
    }


    @Override
    public void initialize(final Bootstrap<LearningConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final LearningConfiguration configuration,
                    final Environment environment) {

    	SayingResource resource = new SayingResource(configuration.getTemplate(), configuration.getDefaultName());
    	
    	
    	TemplateHealthCheck thc = new TemplateHealthCheck(configuration.getTemplate());
    	
    	
    	
    	environment.healthChecks().register("template", thc);
    	environment.jersey().register(resource);
    	
    }

}
