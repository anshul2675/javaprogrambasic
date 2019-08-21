import java.util.Scanner;

public class modifier {
	public static void main(String args[]){
		int a[]= new int[5];int i;
		Scanner in = new Scanner(System.in);
		System.out.println("enter element");
		
		
		for(i=0;i<a.length;i++){
			a[i]=in.nextInt();;
		}
		for(i=0;i<a.length;i++)
			System.out.println("array"+a[i]);
		
		
	}
	
	
	
	
	

}
