package mergeSortExample;

import java.util.Scanner;

public class MergeSort {
	
	public void merge(int [] arrToSort,int [] aux, int fIndex,int mid, int lIndex) {
	    for(int i=0;i<=lIndex;i++) {
	    	aux[i]=arrToSort[i];
	    }
	    int i=fIndex;
	    int j=mid+1;
	    for(int k=fIndex;k<=lIndex;k++) {
	    	if(i>mid) {
	    		arrToSort[k]=aux[j++];
	    
	    	}
	    	else if(j>lIndex) {
	    		arrToSort[k]=aux[i++];
	    	}
	    	else if(aux[i]<aux[j]) {
	    	     arrToSort[k]=aux[i++];
	    	}
	    	else {
	    		arrToSort[k]=aux[j++];
	    	}
	    }
	}
	
	public void sort(int [] arrayToSort,int[] aux,int firstIndex, int lastIndex) {
		if (lastIndex<=firstIndex) {
			return;
		}
		int mid= firstIndex+(lastIndex-firstIndex)/2;
		sort(arrayToSort,aux,firstIndex,mid);
		sort(arrayToSort,aux,mid+1,lastIndex);
		merge(arrayToSort, aux,firstIndex, mid , lastIndex);
		
	}
	
	public static void main(String[] args) {
		Scanner takeUserInput = new Scanner(System.in);
		System.out.println("How many input you wish to sort?");
		int NumofInputs=takeUserInput.nextInt();
		int [] num_array= new int[NumofInputs];
		int [] aux=new int[NumofInputs];
		System.out.println("Please enter the elements");
		for(int i=0;i<NumofInputs;i++) {
			num_array[i]=takeUserInput.nextInt();
		}
		//int [] aux=new int[NumofInputs];
		MergeSort test= new MergeSort();
		test.sort(num_array,aux,0,NumofInputs-1);
		for(int elem: num_array) {
			System.out.print(elem + " ");
		}
		
	}

}
