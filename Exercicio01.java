public class Exercicio01 {
    public static void executar() {
        System.out.println("Digite 5 números: \n");
        int vetor[] = new int[5];

        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Prompt.lerInteiro((i+1) + "° número:");
            soma += vetor[i];
        }
        
        int media = soma/5;
        System.out.println("Média: " + media);
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < media) {
                System.out.println("Número abaixo da média: " + vetor[i]);
            }else if(vetor[i] == media){
                System.out.println("Número igual a média: " + vetor[i]);
            }else if(vetor[i] > media){
                System.out.println("Número acima da média: " + vetor[i]);
            }
        }
        

    }
}
