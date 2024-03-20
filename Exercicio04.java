public class Exercicio04 {
    public static void executar() {
        int vetor[] = new int[5];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Prompt.lerInteiro("Digite o " + (i+1) + "° número: ");
        }

        int n = Prompt.lerInteiro("Digite o valor de n: "); 
        System.out.println("Índice dos elementos inferiores ao valor de n: ");

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < n){
                System.out.println("["+i+"]");
            }
        }
    }
}
