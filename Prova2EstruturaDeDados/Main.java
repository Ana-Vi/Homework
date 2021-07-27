/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova2;
import java.util.*;

/**
 *
 * @author avbvi
 */
public class Main {
    public static void main(String[]args){
        int[] lugar={15, 11, 16, 18, 23, 5, 10, 22, 21, 12};
        /*Random gerador = new Random();
        for (int j=0; j<1000; j++){
            lugar[j]= gerador.nextInt(100000);
        }*/
        /*System.out.println("Vetor desordenado: ");
        for(int i = 0; i<lugar.length; i++){
            System.out.println(" "+lugar[i]);
        }*/
        System.out.println(" ");
        System.out.println("O que deseja fazer?");
        System.out.println("1. Bubble Sort \n2. Insertion Sort\n3. Merge Sort\n4. Quick Sort\n5. Gerar novos números\n6. Sair");
        boolean on= true;
        while (on==true){           
            Scanner leitor = new Scanner(System.in);
            int y = leitor.nextInt();
            switch(y){
                case 1:
                    //bubble sort
                    Main bs = new Main();
                    System.out.println("Foram utilizados "+bs.bsort(lugar)+" passos para ordená-lo");
                    /*System.out.println("Vetor após o Bubble Sort");
                    int[]vetbs= bs.pbsort(lugar);
                    for(int i = 0; i<vetbs.length; i++){
                        System.out.println(" "+vetbs[i]);
                    }*/
                    System.out.println("O que deseja fazer?");
                    System.out.println("1. Bubble Sort \n2. Insertion Sort\n3. Merge Sort\n4. Quick Sort\n5. Gerar novos números\n6. Sair");
                break;
                case 2:
                    //insertion sort
                    Main is = new Main();
                    System.out.println("Foram utilizados "+is.bsort(lugar)+" passos para ordená-lo");
                    /*System.out.println("Vetor após o Insertion Sort");
                    int[]vetis=is.pisort(lugar);
                    for(int j = 0; j<vetis.length; j++){
                        System.out.println(" "+vetis[j]);
                    }*/
                    System.out.println("O que deseja fazer?");
                    System.out.println("1. Bubble Sort \n2. Insertion Sort\n3. Merge Sort\n4. Quick Sort\n5. Gerar novos números\n6. Sair");
                break;
                case 3:
                    //merge sort 
                    Main ms = new Main();
                    System.out.println("Foram utilizados "+ms.msort(lugar, 0, lugar.length-1, 0)+" passos para ordená-lo");
                    /*System.out.println("Vetor após o Merge Sort");
                    int[]vetms = lugar;
                    ms.pmsort(vetms, 0, vetms.length-1);
                    for(int k = 0; k<vetms.length; k++){
                        System.out.println(" "+vetms[k]);
                    }*/
                    System.out.println("O que deseja fazer?");
                    System.out.println("1. Bubble Sort \n2. Insertion Sort\n3. Merge Sort\n4. Quick Sort\n5. Gerar novos números\n6. Sair");
                break;
                case 4:
                    //quick sort
                    Main qs = new Main();
                    System.out.println("Foram utilizados "+qs.qsort(lugar, 0, lugar.length-1, 0)+" passos para ordená-lo");
                    /*int[]vetqs = lugar;
                    qs.pqsort(vetqs, 0, vetqs.length-1);
                    for(int l = 0; l<vetqs.length; l++){
                        System.out.println(" "+vetqs[l]);
                    }*/
                    System.out.println("O que deseja fazer?");
                    System.out.println("1. Bubble Sort \n2. Insertion Sort\n3. Merge Sort\n4. Quick Sort\n5. Gerar novos números\n6. Sair");
                break;
                case 5:
                    //novos números
                    Main nn = new Main();
                    lugar = nn.novoVet(lugar);
                    System.out.println("Vetor novo, desordenado");
                    System.out.println("O que deseja fazer?");
                    System.out.println("1. Bubble Sort \n2. Insertion Sort\n3. Merge Sort\n4. Quick Sort\n5. Gerar novos números\n6. Sair");
                break;
                case 6:
                    //sair
                    System.out.println("Obrigada pelo seu tempo, tenha um ótimo dia.");
                    leitor.close();
                    on=false;
                break;
                default:
                    System.out.println("Comando inválido, escolha outro!!");
                    System.out.println("O que deseja fazer?");
                    System.out.println("1. Bubble Sort \n2. Insertion Sort\n3. Merge Sort\n4. Quick Sort\n5. Gerar novos números\n6. Sair");
                break;
            }
        }
    }
    public int[] novoVet(int[] vet){
        Random gerador = new Random();
        for (int j=0; j<1000; j++){
            vet[j]= gerador.nextInt(100000);
        }
        return vet;
    }
    public int bsort(int[] vet) {
    int aux;
    int cont=0;
	for(int i = 0; i<vet.length; i++){
            cont++;
            for(int j = 0; j<vet.length-1; j++){
                cont++;
		if(vet[j] > vet[j + 1]){
                    aux = vet[j];
                    vet[j] = vet[j+1];
                    vet[j+1] = aux;
		}
            }
	}
    return cont;
    }
    public int[] pbsort(int[] vet) {
    int aux;
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
    public int isort(int vet[]) {  
	int n = vet.length; 
        int conti=0;
	for (int j = 1; j < n; j++) {  
            int key = vet[j];  
            conti++;
            int i = j-1;  
            while ( (i > -1) && ( vet [i] > key ) ) { 
                conti++;
		vet [i+1] = vet [i];  
		i--;  
            }  
            vet[i+1] = key;  
        }
    return conti;
    }
    public int[] pisort(int vet[]) {  
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
    return vet;
    }
    public int merge(int arr[], int l, int m, int r){ 
        int cont=0;
        int n1 = m - l + 1; 
	int n2 = r - m; 
	int L[] = new int [n1]; 
	int R[] = new int [n2]; 
	for (int i=0; i<n1; ++i) {
            L[i] = arr[l + i];
            cont++;
        }
	for (int j=0; j<n2; ++j){ 
            R[j] = arr[m + 1+ j];
            cont++;
        }
	int i = 0, j = 0;  
	int k = l; 
	while (i < n1 && j < n2){ 
            if (L[i] <= R[j]){ 
		arr[k] = L[i]; 
                    i++;
                    cont++;
                    
            }else{ 
		arr[k] = R[j]; 
		j++; 
            } 
	k++; 
	} 
	while (i < n1){ 
            arr[k] = L[i]; 
            i++; 
            k++; 
            cont++;
	} 
	while (j < n2){ 
            arr[k] = R[j]; 
            j++; 
            k++; 
            cont++;
	} 
        return cont;
    } 
    
    int msort(int arr[], int l, int r, int cont){ 
        if (l < r){  
            int m = (l+r)/2; 
            cont= msort(arr, l, m, cont+1); 
            cont= msort(arr , m+1, r, cont+1); 
            cont=cont+merge(arr, l, m, r);
            return cont;
	}else return 0; 
    } 
    void pmerge(int arr[], int l, int m, int r){ 
	int n1 = m - l + 1; 
	int n2 = r - m; 
	int L[] = new int [n1]; 
	int R[] = new int [n2]; 
	for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
	for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 
	int i = 0, j = 0; 
	int k = l; 
	while (i < n1 && j < n2){ 
            if (L[i] <= R[j]){ 
		arr[k] = L[i]; 
		i++; 
            }else{ 
		arr[k] = R[j]; 
		j++; 
            } 
            k++; 
	} 
	while (i < n1){ 
            arr[k] = L[i]; 
            i++; 
            k++; 
	} 
	while (j < n2){ 
            arr[k] = R[j]; 
            j++; 
            k++; 
	} 
    } 
    void pmsort(int arr[], int l, int r){ 
        if (l < r){ 
            int m = (l+r)/2; 
            pmsort(arr, l, m); 
            pmsort(arr , m+1, r); 
            merge(arr, l, m, r); 
	} 
    }
    int partition(int arr[], int low, int high){ 
	int pivot = arr[high]; 
        int cont=0;
	int i = (low-1);
	for (int j=low; j<high; j++){ 
            cont++;
            if (arr[j] <= pivot){ 
		i++; 
		int temp = arr[i]; 
		arr[i] = arr[j]; 
		arr[j] = temp; 
            } 
	} 
       	int temp = arr[i+1]; 
	arr[i+1] = arr[high]; 
	arr[high] = temp; 
	return cont; 
    } 
    public int qsort(int arr[], int low, int high, int pi){ 
	if (low < high){ 
            qsort(arr, low, pi-1, pi+1); 
            qsort(arr, pi+1, high, pi+1); 
            pi = pi+ partition(arr, low, high); 
            
	} return pi;
    } 
    int ppartition(int arr[], int low, int high){ 
	int pivot = arr[high]; 
	int i = (low-1);
	for (int j=low; j<high; j++){  
            if (arr[j] <= pivot){ 
		i++; 
		int temp = arr[i]; 
		arr[i] = arr[j]; 
		arr[j] = temp; 
            } 
	} 
       	int temp = arr[i+1]; 
	arr[i+1] = arr[high]; 
	arr[high] = temp; 
	return i+1; 
    } 
    void pqsort(int arr[], int low, int high){ 
	if (low < high){ 
            int pi = partition(arr, low, high); 
            pqsort(arr, low, pi-1); 
            pqsort(arr, pi+1, high); 
	} 
    } 
}
