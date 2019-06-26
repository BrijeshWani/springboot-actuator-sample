package springboot.custom;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomizedHealthEndpoint implements HealthIndicator {

    @Override
    public Health health() {
        return Health.down().withDetail("Some resource is not reachable.", "Some resourse is down.").build();
    }

}
