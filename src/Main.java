public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String nome = "Jon";

        Thread threadAssinatura1 = new Thread(new TarefaBuscaTextual("assinaturas1.txt" , nome));



    }
}