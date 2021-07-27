package bubblesort;

import java.util.Scanner;

public class BubleSort {


	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
                int y = leitor.nextInt();
                int[] lugar=new int[y];

                for (int j=0; j<lugar.length; j++){
                    lugar[j]=leitor.nextInt(); 
                }
		int aux = 0;
		int i = 0;

		System.out.println("Vetor desordenado: ");
		for(i = 0; i<lugar.length; i++){
			System.out.println(" "+lugar[i]);
		}
		System.out.println(" ");
		
		BubleSort bs = new BubleSort();
		lugar = bs.sort(lugar);
		
		System.out.println("Vetor organizado:");
		for(i = 0; i<lugar.length; i++){
			System.out.println(" "+lugar[i]);
		}
	}

	public int[] sort(int[] vet) {
		int aux;
		//mudar o vet.length para o numero de passos
		for(int i = 0; i<vet.length; i++){
			for(int j = 0; j<vet.length-1; j++){
				if(vet[j] > vet[j + 1]){
					aux = vet[j];
					vet[j] = vet[j+1];
					vet[j+1] = aux;
				}
			}
		}
		return vet;
	}


}




