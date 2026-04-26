import java.util.HashMap;
import java.util.Map;

public class StreamingProxy implements Streaming{
    private String tipoUsuario;
    private Map<String, StreamingReal> cache = new HashMap<>();

    public StreamingProxy(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public void assistirFilme(String nome) {

        if (nome.equals("Filme Premium") && !tipoUsuario.equals("premium")) {
            System.out.println("Acesso negado: conteúdo premium");
            return;
        }

        StreamingReal filme = cache.get(nome);

        if (filme == null) {
            filme = new StreamingReal(nome);
            cache.put(nome, filme);
        }

        filme.assistirFilme(nome);
    }
}
