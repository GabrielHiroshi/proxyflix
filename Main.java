public class Main {
    public static void main(String[] args) {

        Streaming userComum = new StreamingProxy("comum");
        userComum.assistirFilme("Filme 1");
        userComum.assistirFilme("Filme Premium");

        System.out.println("-------------------------------");

        Streaming userPremium = new StreamingProxy("premium");
        userPremium.assistirFilme("Filme Premium");
        userPremium.assistirFilme("Filme Premium");
    }
}