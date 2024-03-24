public class Exercicio10 {
    public static void executar() {
        int A[] = new int[5];
        int B[] = new int[5];

        System.out.println("Digite 5 números para o vetor A");
        for (int i = 0; i < A.length; i++) {
        A[i] = Prompt.lerInteiro("Valor do "+ (i+1) +"° número do vetor");
        }
        int cont = 0;
        for (int i = 4; i > -1; i--) {
            B[i] = A[cont];
            cont++;
        }
        System.out.println("\n\nValores vetor A: ");
        for (int i = 0; i < A.length; i++) {
            System.out.print(" "+A[i]);
        }
        System.out.println("\n\nValores B do vetor A, mas invertidos: ");

        for (int i = 0; i < A.length; i++) {
            System.out.print(" "+B[i]);
        }
    }
}
