public class Exercicio05 {
    public static void executar() {
        int vetor[] = new int[5];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Prompt.lerInteiro("Digite o "+ (i+1) +"° número");
        }
        int n = Prompt.lerInteiro("Agora digite um valor qualquer: ");
        int quantidadeN = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == n) {
                 quantidadeN++;
            }
        }
        System.out.println("O número "+ n +" aparece "+ quantidadeN +" vezes no vetor" );
    }
}
