package bubblesort;

import java.util.Scanner;

public class InsertionSort {
	
	public static void main(String a[]){    
            Scanner leitor = new Scanner(System.in);
            int y = leitor.nextInt();
            int[] lugar=new int[y];

            for (int j=0; j<lugar.length; j++){
                lugar[j]=leitor.nextInt(); 
            }
		
		System.out.println("Before Insertion Sort");    
		for(int i:lugar){    
			System.out.print(i+" ");    
		}    
		System.out.println();    

		InsertionSort is = new InsertionSort();
		is.sort(lugar);//sorting array using insertion sort    

		System.out.println("After Insertion Sort");    
		for(int i:lugar){    
			System.out.print(i+" ");    
		}    
	}

	public void sort(int vet[]) {  
		int n = vet.length;  
		for (int j = 1; j < n; j++) {  
			int key = vet[j];  
			int i = j-1;  
			while ( (i > -1) && ( vet [i] > key ) ) {  
				vet [i+1] = vet [i];  
				i--;  
			}  
			vet[i+1] = key;  
		}
	}
}
