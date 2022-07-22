package br.com.meuPrimeiroProjeto.meuprojetospring.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Value("${app.message}")
    private String appMessage;

    @GetMapping("/")
<<<<<<< HEAD
    public String getAppMessage(){
        return appMessage;
    }
}
=======
    public String getAppMessage() {
        return appMessage;
    }
}

>>>>>>> 39a5fb899ae95c3dd9d7ea1f8186afccd4dbb866
