public class Exercicio07 {
    public static void executar() {
        int vetor1[] = new int[5];
        int vetor2[] = new int[5];

        System.out.println("\n\nValores vetor 1");
        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = Prompt.lerInteiro("Digite o "+(i+1)+"° valor do vetor 1");
        }
        System.out.println("\n\nValores vetor 2");
        for (int i = 0; i < vetor2.length; i++) {
            vetor2[i] = Prompt.lerInteiro("Digite o "+(i+1)+"° valor do vetor 2");
        }

        int elementosIguais = 0;
        for (int i = 0; i < vetor1.length; i++) {
            if (vetor1[i] == vetor2[i]) {
                elementosIguais++;
            }
        }

        if (elementosIguais == 5) {
            System.out.println("\nOs dois vetores são iguais\n\n");
        }else{
            System.out.println("\nOs dois vetores são diferentes!!\n\n");
        }
    }
}
