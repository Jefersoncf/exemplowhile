package aula28;

public class Fluxo {

	public static void main(String[] args) {

		// FLUXO DE REPETIÇÃO
		
		int i = 0;
		/* LOOP WHILE
		EXECUTA (0) OU (N) VEZES*/
		while(i < 2) { // 0 - n 
			System.out.println(i);
			i++;
		}
			
		int a = 0;
		/* LOOP DO WHILE
		EXECUTA O BLOCO PELO MENOS UMA VEZ.*/
		do { // 1 - n (executa uma ou mais vezes)
			System.out.println(a);
			a++;
		}while(a < 2);
	}

}
