public class Exercicio15 {
    public static void executar() {
        int vetor[] = new int[5];

        System.out.println("\nDigite 5 números: ");
        for (int i = 0; i < 1; i++) {
            vetor[i] = Prompt.lerInteiro("Valor do "+ (i+1) +"° número do vetor");
        }
        for (int i = 1; i < vetor.length; i++) {
            vetor[i] = Prompt.lerInteiro("Valor do "+ (i+1) +"° número do vetor");
            if (vetor[i] > vetor[i-1]) {  
            } else {
                System.out.println("\nO número digitado é inválido, digite um número maior que " + vetor[i-1]);
                vetor[i] = vetor[i-1];
                i--;
            }
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(" " + vetor[i]);
        }
    }
}
