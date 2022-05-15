import  java.util.Scanner;

public class Binario{
	public static void main(String[] args) {
		
		String valor_str;
		int contador = 1;
		int resultado = 0;
		boolean error = false;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Inserte el valor en binario:");
		valor_str = scanner.nextLine();

		for (int i = 0; i < valor_str.length(); i++){
			if (valor_str.substring(valor_str.length() - i - 1, valor_str.length() - i).equals("1")){
				resultado += contador;
			}
			else if (valor_str.substring(valor_str.length() - i - 1, valor_str.length() - i).equals("0")){
				resultado += 0;
			}
			else{
				System.out.println("Error");
				error = true;
				i = valor_str.length();
			}
			contador = contador * 2;

		}

		if (error == true){
			System.out.println("El valor ingresado no es binario");
		}
		else{
			System.out.println("El resultado en decimal es:");
			System.out.println(resultado);
		}
	}
}
