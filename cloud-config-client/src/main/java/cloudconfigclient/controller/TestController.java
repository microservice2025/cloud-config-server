package cloudconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class TestController {

    // Inject the value of the 'serviceInfo' property from the cloud-config-server configuration
    @Value("${service.name}")
    private String serviceInfo;

    @GetMapping
    public String getMessage() {
        return "server name: " + serviceInfo;
    }
}
