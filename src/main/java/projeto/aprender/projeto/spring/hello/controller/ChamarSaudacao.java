package projeto.aprender.projeto.spring.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import projeto.aprender.projeto.spring.hello.model.Saudacao;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class ChamarSaudacao {

    private static final String template = "Hello, %s!";
    private final AtomicLong contator = new AtomicLong();

    @RequestMapping("/saudacao")
    public Saudacao saudacao(@RequestParam(value="nome", defaultValue = "World") String nome){
        return new Saudacao(contator.incrementAndGet(), String.format(template, nome));
    }

}
