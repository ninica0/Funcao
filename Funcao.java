import java.util.Scanner;

public class Funcao {

	
	public static void soma(int n1, int n2) {
		Scanner sc = new Scanner(System.in);
		int r;
	
		r=n1+n2;
		System.out.println(r);
	}
	public static void sub(int n1, int n2) {
		Scanner sc = new Scanner(System.in);
		int r;
	
		r=n1-n2;
		System.out.println(r);
	}
	
	public static int multi(int n1, int n2) {
		int r;
		r= n1*n2;
		return r;
	}
	public static void calculadora(int opc, int n1, int n2) {
		switch(opc) {
		case 1: soma(n1,n2);
		break;
		case 2: sub(n1,n2);
		break;
		case 3: System.out.println(multi(n1,n2));
		}
		
	}
	public static void main(String[] args) {
		int opc, n1, n2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		n1=sc.nextInt();
		System.out.println("Digite outro número: ");
		n2= sc.nextInt();
		System.out.println("Escolha a opção\n1-Soma\n2-Subtração\n3-Multiplicação");
		opc=sc.nextInt();
		calculadora(opc, n1, n2);
	
	}
}
