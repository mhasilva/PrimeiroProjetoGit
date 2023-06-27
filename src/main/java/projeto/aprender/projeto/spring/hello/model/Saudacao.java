package projeto.aprender.projeto.spring.hello.model;

public class Saudacao {

    private final long id;
    private final String texto;

    public Saudacao(long id, String texto) {
        this.id = id;
        this.texto = texto;
    }

    public long getId() {
        return id;
    }

    public String getTexto() {
        return texto;
    }

}

