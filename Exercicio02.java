public class Exercicio02 {
    public static void executar() {
        int vetor[] = new int[Prompt.lerInteiro("Digite o tamanho do vetor: ")];

        System.out.println("Digite 5 números: \n");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Prompt.lerInteiro((i+1) + "° número:");
        }

        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] > 0){
                System.out.println("O número da posição " + i +" é positivo");
            }else if(vetor[i] < 0){
                System.out.println("O número da posição " + i +" é negativo");
            }else if(vetor[i] == 0){
                System.out.println("O número da posição " + i + " é igual a zero");
            }
        }


    }
}
