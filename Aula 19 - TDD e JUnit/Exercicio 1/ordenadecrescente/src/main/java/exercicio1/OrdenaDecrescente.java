package exercicio1;

public class OrdenaDecrescente {
    int vetor[] = new int[] {5,6,8,2,1};
    
    
    public OrdenaDecrescente(){
        this.Decrescente();
    }

    public int[] Decrescente() {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (vetor[j] > vetor[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = vetor[maxIndex];
            vetor[maxIndex] = vetor[i];
            vetor[i] = temp;
        }
        return vetor;
    }
}
