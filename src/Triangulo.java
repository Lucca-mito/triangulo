import java.util.Scanner;
public class Triangulo {

	public boolean existeTriangulo(int a, int b, int c) {
		return (a + b > c) && (a + c > b) && (b + c > a);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt(),
			b = input.nextInt(),
			c = input.nextInt(),
			d = input.nextInt();
		for(int i=0; i < 4; i++){
		 if (existeTriangulo(a,b,c)){
			 System.out.println("S");
		 }
		 else{
			 System.out.println("N");
		 }
		}
	}

}
