import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      int first = n/100;
      int last = n%10;
      int sum = first+last;
      System.out.println(sum);
	}
}