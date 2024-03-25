public class Exercicio12 {
    public static void executar() {
        int vetor[] = new int[12];
        System.out.println("Digite 12 elementos para o vetor");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Prompt.lerInteiro("Valor do "+ (i+1)+"° elemento do vetor");
        }
        int produto = 1;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != 0 && vetor[i] > 0 && vetor[i] % 2 == 0 ) {
                produto *= vetor[i];
            }
        }

        System.out.println("Produto do vetor: " + produto);
        
    }
}
