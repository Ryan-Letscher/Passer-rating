import java.util.Scanner;

public class QBR {

	public static void main(String[] args) {
		Scanner Att = new Scanner(System.in);
		System.out.println("Enter attempts: ");
		Scanner Comp= new Scanner(System.in);
		System.out.println("Enter completions: ");
		Scanner Yds= new Scanner(System.in);
		System.out.println("Enter Yards: ");
		Scanner Td= new Scanner(System.in);
		System.out.println("Enter Touchdowns: ");
		Scanner Int= new Scanner(System.in);
		int A=((QBR.get.Comp()/ QBR.get.Att()) - .3) * 5;
		int B= ((QBR.get.Yds()/QBR.get.Att()) - 3) * .25;
		int C= ((QBR.get.Td()/QBR.get.Att()) * 20);
		int D= 2.375 -((QBR.get.Int()/ QBR.get.Att()) * 25 );
		int O= (("A"+"B"+"C"+"D"/6) * 100.;
		System.out.println("Passer Rating=" + int O);
				
		
		

	}

}
