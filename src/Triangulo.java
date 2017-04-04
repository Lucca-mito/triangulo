import java.util.Scanner;
public class Triangulo {

	public static boolean  existeTriangulo(int a, int b, int c) {
		return (a + b > c) && (a + c > b) && (b + c > a);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt(),
			b = input.nextInt(),
			c = input.nextInt(),
			d = input.nextInt();
		for(int i=0; i < 4; i++){
		switch(i) {
		case 0:
			if (existeTriangulo(a,b,c)){
				 System.out.println("S");
			 }
			 else{
				 System.out.println("N");
			 }
		case 1:
			if (existeTriangulo(a,b,d)){
				 System.out.println("S");
			 }
			 else{
				 System.out.println("N");
			 }
		case 2:
			if (existeTriangulo(b,d,c)){
				 System.out.println("S");
			 }
			 else{
				 System.out.println("N");
			 }
		case 3:
			if (existeTriangulo(a,d,c)){
				 System.out.println("S");
			 }
			 else{
				 System.out.println("N");
			 }
		
		}
	}
	}

}
