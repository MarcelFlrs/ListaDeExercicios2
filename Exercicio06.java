public class Exercicio06 {
    public static void executar() {
        double notas[] = new double[5];
        int pesos[] = new int[5];

        System.out.println("\n\nDigite 5 notas");
        for (int i = 0; i < pesos.length; i++) {
            notas[i] = Prompt.lerDecimal("Valor da "+ (i+1) +"° nota: ");
        }
        System.out.println("\n\nDigite 5 pesos para o cálculo da média ponderada");
        for (int i = 0; i < pesos.length; i++) {
            pesos[i] = Prompt.lerInteiro("Valor do "+ (i+1)+"° peso: ");
        }

        double somaNotas = 0;
        int somaPesos= 0;
        for (int i = 0; i < pesos.length; i++) {
            somaNotas += (notas[i]*pesos[i]);
            somaPesos += pesos[i];
        }
        double mediaPonderada = somaNotas / somaPesos;
        
        System.out.printf("Média Ponderada: %.2f",mediaPonderada);
        
    }
}
