package net.pucksmart.apps;

import org.springframework.fu.jafu.Jafu;
import org.springframework.fu.jafu.JafuApplication;
import org.springframework.web.servlet.function.RequestPredicates;

import static org.springframework.fu.jafu.Jafu.webApplication;
import static org.springframework.fu.jafu.webmvc.WebMvcServerDsl.webMvc;

public abstract class TemplateApplication {
    public static JafuApplication app = webApplication(app -> app
            .beans(b -> b.bean(TemplateHandler.class))
            .enable(webMvc(s -> s.router(r -> r.route(RequestPredicates.all(), s.ref(TemplateHandler.class)::template)))));

    public static void main(String[] args) {
        app.run();
    }
}
