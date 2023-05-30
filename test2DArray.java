import java.util.Scanner;
public class test2DArray{
	public static void acceptData(int[][] arr){
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length;j++){
			System.out.println("Enter The Vale for: ["+i+"]["+j+"]");
			arr[i][j]=sc.nextInt();
			}
		}
	}
	public static void printData(int[][] arr){
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length;j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}		
	}
	public static void main(String[] args){
		int[][] arr=new int[3][3];
		acceptData(arr);
		printData(arr);
	}
}
		