import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
		try (Scanner terminal = new Scanner(System.in)) {
			System.out.print("Digite o primeiro parâmetro: ");
			int parametroUm = terminal.nextInt();
			System.out.print("Digite o segundo parâmetro: ");
			int parametroDois = terminal.nextInt();
			
			try {
				//chamando o método contendo a lógica de contagem
				contar(parametroUm, parametroDois);
			
			}catch (ParametrosInvalidosException e) {
				System.out.println("O segundo par\u00E2metro deve ser maior que o primeiro.\n");
				e.printStackTrace("");
				//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
				
			}
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		if (parametroUm > parametroDois){
			throw new ParametrosInvalidosException();
			

		}else{
			int contagem = parametroDois - parametroUm;
			//realizar o for para imprimir os números com base na variável contagem

			for (int numero = 1; numero <= contagem; numero++){
				System.out.println("Imprimindo o número "+ numero);
			}
		}
		

	}
}
