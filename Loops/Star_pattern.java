import java.util.Scanner;
public class Start_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mk = new Scanner(System.in);
		System.out.println("Enter Number of Rows: ");
		int n = mk.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n-i;j>=1;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=(i*2)-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
