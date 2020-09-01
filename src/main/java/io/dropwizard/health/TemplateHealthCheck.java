package io.dropwizard.health;

import com.codahale.metrics.health.HealthCheck;

public class TemplateHealthCheck extends HealthCheck {

	private String template;

	public TemplateHealthCheck(String template) {
		this.template = template;
	}

	@Override
	protected Result check() throws Exception {

		String say = String.format(template, "TEST");

		if (say.contains("TEST")) {
			
			return Result.healthy();
			
		} else {
			
			return Result.unhealthy("TEMPLATE DOES NOT INCLUDE NAME");

		}

	}

}
