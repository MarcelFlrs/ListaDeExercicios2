public class Exercicio14 {
    public static void executar() {
        int vetor[] = new int[5];

        System.out.println("\nDigite 5 números: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Prompt.lerInteiro("Valor do "+ (i+1) +"° número do vetor");
        }

        for (int i = 0; i < vetor.length-1; i++) {
            if (vetor[i] > vetor[i+1] ) {
                int aux = vetor[i+1];
                vetor[i+1] = vetor[i];
                vetor[i] = aux;
            }
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(" "+vetor[i]);
        }

    }
}
