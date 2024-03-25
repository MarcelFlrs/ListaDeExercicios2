public class Exercicio09 {
    public static void executar() {
        int[] A = new int[5];
        int[] B = new int[5];
        int[] C = new int[10];

        System.out.println("Digite 5 números para o vetor A");
        for (int i = 0; i < A.length; i++) {
            A[i] = Prompt.lerInteiro("Valor do "+ (i+1) +"° número do vetor");
        }
        System.out.println("Digite mais 5 números para o vetor B");
        for (int i = 0; i < B.length; i++) {
            B[i] = Prompt.lerInteiro("Valor do "+ (i+1) +"° número do vetor");
        }
        
        int par = 0;
        int impar = 0;
        for (int i = 0; i < C.length; i++) {
            if (i % 2 == 0) {
                C[i] = A[par];
                par++;
            } else if(i % 2 == 1){
                C[i] = B[impar];
                impar++;
            }
        }

        for (int i = 0; i < C.length; i++) {
            System.out.print(" " + C[i]);
        }
    }
}
