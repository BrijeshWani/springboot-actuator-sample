package springboot.custom;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.actuate.endpoint.Endpoint;
import org.springframework.stereotype.Component;

@Component
public class CustomActuatorEndpoint implements Endpoint<List<String>> {

    @Override
    public String getId() {
        return "developers";
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public boolean isSensitive() {
        return false;
    }

    @Override
    public List<String> invoke() {
        return Arrays.asList("Brijesh-1", "Brijesh-2", "Brijesh-3");
    }

}
