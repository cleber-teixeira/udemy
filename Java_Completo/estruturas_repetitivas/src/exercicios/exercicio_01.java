package exercicios;

import java.util.Scanner;

/** Programa que lê a senha e retorna 'Senha Invalida' ou 'Acesso Permitido'.
 * 
 * @author Cleber Teixeira
 * @category Exercícios
 * @section 6 - Estruturas repetitivas
 * @lesson 48 - Exercícios para iniciantes - Parte 3)
 */
public class exercicio_01 {
	/* TODO Escreva um programa que repita a leitura de uma senha
	 * até que ela seja válida. Para cada leitura de senha incorreta
	 * informada, escrever a mensagem "Senha Invalida". Quando a
	 * senha for informada corretamente deve ser impressa a mensagem
	 * "Acesso Permitido" e o algoritmo encerrado. Considere que a
	 * senha correta é o valor 2002. */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int password = 0;
		int access = 2002;
		
		System.out.print("Digite a senha correta: ");
		password = sc.nextInt();
		
		while (password != access) {
			System.out.println("\nSenha Invalida");
			
			System.out.print("Digite a senha correta: ");
			password = sc.nextInt();
		}
		
		System.out.println("\nAcesso Permitido");
		
		sc.close();
		
	}
}
