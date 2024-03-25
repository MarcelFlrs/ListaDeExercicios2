public class Exercicio11 {
    public static void executar() {
        int A[] = new int[5];
        int B[] = new int[5];
        int C[] = new int[5];

        System.out.println("Digite 5 números para o vetor A");
        for (int i = 0; i < A.length; i++) {
        A[i] = Prompt.lerInteiro("Valor do "+ (i+1) +"° número do vetor");
        }
        System.out.println("Digite mais 5 números para o vetor B");
        for (int i = 0; i < B.length; i++) {
        B[i] = Prompt.lerInteiro("Valor do "+ (i+1) +"° número do vetor");
        }
        for (int i = 0; i < C.length; i++) {
            C[i] += A[i] * B[i];
        }

        int produtoEscalar = 0;
        System.out.println("");
        for (int i = 0; i < C.length; i++) {
            produtoEscalar += C[i];
        }
        System.out.println("Produto escalar: " + produtoEscalar);
    }
}
