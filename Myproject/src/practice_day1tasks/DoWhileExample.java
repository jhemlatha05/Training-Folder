package practice_day1tasks;


	
	import java.util.Scanner; 
	public class DoWhileExample { 
	public static void main(String[] args) { 
	Scanner sc = new Scanner(System.in); 
	int num; 
	do { 
	System.out.println("Enter positive number (-1 to stop): "); 
	num = sc.nextInt(); 
	} while (num != -1); 
	} 
	} 


