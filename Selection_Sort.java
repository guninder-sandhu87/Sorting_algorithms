package elementarySorts;

public class Selection_Sort {
	
	Selection_Sort(int [] a){
		
		System.out.println("unsorted list:");
		for(int num : a) {
			System.out.print(num+" ");
		}
		
		for(int i=0;i<a.length;i++) {
			int min=i;
			for(int j=i+1;j<a.length;j++) {
				if(less(a[min],a[j])==1) {
					min=j;
				}
			}
			System.out.println("new min after "+ i +"th iteration"+ a[min]);
			a=exchange(a,i,min);
		}
		System.out.println("sorted list:");
		for(int num : a) {
			System.out.print(num+" ");
		}
	}
	
	public int less(int a ,int b) {
		if(a<b) {
			return -1;
		}
		if(a>b) {
			return 1;
		}
		return 0;
	}
	
	public int[] exchange(int [] a, int i,int j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		
	
		return a;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a1= {10,4,5,6,34,46,7,23};
		Selection_Sort s=new Selection_Sort(a1);
		

	}

}
