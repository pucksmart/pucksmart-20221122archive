package net.pucksmart.apps;

import org.springframework.web.servlet.function.ServerRequest;
import org.springframework.web.servlet.function.ServerResponse;

import static org.springframework.web.servlet.function.ServerResponse.ok;

public class TemplateHandler {
    public ServerResponse template(ServerRequest request) {
        return ok().body("response");
    }
}
