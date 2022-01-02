package DSAFUNDAMENTALS;
import java.util.Scanner;
public class reverseanumber {
public static int Reverse(int num) {
	if(num<=0) {
		return num;
	}
	else {
		System.out.print(num%10);
		return Reverse(num/10);
	}
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Reverse number is ");
		Reverse(a);

	}

}
