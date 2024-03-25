public class Exercicio13 {
    public static void executar() {
        int n = Prompt.lerInteiro("Digite um número: ");
        int seqFibonacci[] = new int[n];

        seqFibonacci[0] = 1;
        seqFibonacci[1] = 1;
        for (int i = 2; i < n; i++) {
            seqFibonacci[i] = seqFibonacci[i-1] + seqFibonacci[i-2];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(seqFibonacci[i] + " ");
        }

    }
}
