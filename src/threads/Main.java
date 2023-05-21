package threads;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String nome = "da";

        Thread threadAssinatura1 = new Thread(new TarefaBuscaTextual("C:\\Users\\Wellington\\Curso Alura\\Java Spring\\api\\busca-textual\\src\\assinaturas1.txt" , nome));
        Thread threadAssinatura2 = new Thread(new TarefaBuscaTextual("C:\\Users\\Wellington\\Curso Alura\\Java Spring\\api\\busca-textual\\src\\assinaturas2.txt" , nome));
        Thread threadAutores = new Thread(new TarefaBuscaTextual("C:\\Users\\Wellington\\Curso Alura\\Java Spring\\api\\busca-textual\\src\\autores.txt" , nome));

        threadAssinatura1.start();
        threadAssinatura2.start();
        threadAutores.start();



    }
}