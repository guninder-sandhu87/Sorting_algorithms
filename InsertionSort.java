package elementarySorts;

public class InsertionSort {
	
	InsertionSort(int [] input_array){
		System.out.println("Unsorted arrey:");
		for(int elem:input_array) {
			System.out.print(elem +" ");
		}
		sort(input_array);
	}
	public void sort(int [] unsorted_array) {
		for(int i=0;i<unsorted_array.length;i++) {
			for(int j=i;j>=1;j--) {
				if(unsorted_array[j]<unsorted_array[j-1]) {
					this.exchange(unsorted_array, j, j-1);
				}
			}
		}
		System.out.println("\nsorted arrey:");
		for(int elem:unsorted_array) {
			System.out.print(elem + " ");
		}
		
	}
	public void exchange(int [] inArray, int index1,int index2) {
		int temp=inArray[index1];
		inArray[index1]=inArray[index2];
		inArray[index2]=temp;
		
	
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [] arr= {10,20,1,3,56,34,23};
		InsertionSort insort = new InsertionSort(arr);

	}

}
