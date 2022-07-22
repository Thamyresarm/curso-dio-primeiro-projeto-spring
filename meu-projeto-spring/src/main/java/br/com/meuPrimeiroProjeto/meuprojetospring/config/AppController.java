package br.com.meuPrimeiroProjeto.meuprojetospring.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Value("${app.message}")
    private String appMessage;

    @Value("${ENV_DB_URL:NENHUMA}")
    private String dbEnvironmentVariable;

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

    @GetMapping("/envVariable")
    public String getDbEnvironmentVariable(){
        return "A seguinte variável de ambiente foi passada: " + dbEnvironmentVariable;
    }
}

>>>>>>> 39a5fb899ae95c3dd9d7ea1f8186afccd4dbb866
