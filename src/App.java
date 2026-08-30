public class App {
    public static Integer[] vetorDeNumeros() {
        return new Integer[] {
                10, 14, 63, 29, 95
        };
    }

    public static Integer[] gerarVetorAleatorio(int tamanho) {
        Integer[] vetor = new Integer[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = (int) (Math.random() * 100);
        }
        return vetor;
    }

    public static void main(String[] args) throws Exception {
        int n = 1500;

        long inicio, fim, tempo;

        Integer[] numeros = gerarVetorAleatorio(n);
        Integer[] numerosBubbleSort = numeros.clone();
        Integer[] numerosInsertionSort = numeros.clone();
        
        // Selection Sort
        SelectionSort selectionSort = new SelectionSort<>();
        inicio = System.currentTimeMillis();
        selectionSort.sort(numeros);
        fim = System.currentTimeMillis();
        tempo = fim - inicio;
        System.out.println("Comparacoes Selection:" + selectionSort.getContaComparacoes());
        System.out.println("Trocas Selection:" + selectionSort.getContaTrocas());
        System.out.println("Tempo(ms) do Selection:" + tempo);
        System.out.println("*************************************************************");
        // Bubble Sort
        BubbleSort bubbleSort = new BubbleSort<>();
        inicio = System.currentTimeMillis();
        bubbleSort.sort(numerosBubbleSort);
        fim = System.currentTimeMillis();
        tempo = fim - inicio;
        System.out.println("Comparacoes Bubble:" + bubbleSort.getContaComparacoes());
        System.out.println("Trocas Bubble:" + bubbleSort.getContaTrocas());
        System.out.println("Tempo(ms) do Bubble:" + tempo);
        System.out.println("*************************************************************");

        // Insertion Sort
        InsertionSort insertionSort = new InsertionSort<>();
        inicio = System.currentTimeMillis();
        insertionSort.sort(numerosInsertionSort);
        fim = System.currentTimeMillis();
        tempo = fim - inicio;
        System.out.println("Comparacoes Insertion:" + insertionSort.getContaComparacoes());
        System.out.println("Trocas Insertion:" + insertionSort.getContaTrocas());
        System.out.println("Tempo(ms) do InsertionSort:" + tempo);
    }
}