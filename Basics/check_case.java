import java.util.Scanner;

public class Check_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ss = new Scanner(System.in);
		char c = ss.next().charAt(0);
		if(c >= 'A' && c <= 'Z') {
			System.out.println(1);
		}
		else if(c >= 'a' && c <= 'z') {
			System.out.println(0);
		}
		else {
			System.out.println(-1);
		}

	}

}
