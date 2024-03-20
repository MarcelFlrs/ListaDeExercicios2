public class Exercicio03 {
    public static void executar() {
        int vetor1[] = new int[Prompt.lerInteiro("Digite o tamanho do vetor: ")];
        int vetor2[] = new int[vetor1.length];

        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = Prompt.lerInteiro("Digite o "+ (i+1) +"° número");
            for (int j = 0; j < vetor2.length; j++) {
                vetor2[i] = (vetor1[i])*2;
            }
        }

        for (int i = 0; i < vetor2.length; i++) {
         System.out.println("Vetor com os valores duplicados: " + vetor2[i]);
        }
        
    }
}
