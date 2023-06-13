public class StringSearch {
    public static void main(String[] args) {
        StringSearch s = new StringSearch();
        s.test();
    }

    public void insertionSort(String vetor[]) {
        int size = vetor.length;
        for (int i = 1; i < size; i++) {
            String key = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j].compareTo(key) > 0) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = key;
        }
    }

    public String BuscaBinaria(String x, String[] vetor) {
        int esquerda = 0;
        int direita = vetor.length - 1;

        while (esquerda <= direita) {
            int meio = esquerda + (direita - esquerda) / 2;
            int compara = x.compareTo(vetor[meio]);

            if (compara == 0) {
                return "Encontrado";
            } else if (compara < 0) {
                direita = meio - 1;
            } else {
                esquerda = meio + 1;
            }
        }

        return "Não encontrado";
    }

    public void test() {
        String[] nomeStrings = {"Gustavo", "Ana", "Marcela", "Carlos", "Fernanda", "João"};

        // Vetor desordenado
        System.out.print("Lista desordenada: ");
        for (String i : nomeStrings) {
            System.out.print(i + ", ");
        }
        System.out.println();

        // Vetor ordenado
        insertionSort(nomeStrings);
        System.out.print("Lista ordenada: ");
        for (String i : nomeStrings) {
            System.out.print(i + ", ");
        }
        System.out.println();

        // Busca de um valor inexistente
        System.out.println("Resultado da busca para Pedro: " + BuscaBinaria("Pedro", nomeStrings));

        // Busca de um valor existente
        System.out.println("Resultado da busca para Fernanda: " + BuscaBinaria("Fernanda", nomeStrings));
    }
}
