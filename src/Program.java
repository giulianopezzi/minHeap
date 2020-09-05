import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BinaryMinHeap heap = new BinaryMinHeap();
		
		System.out.println("Criado vetor de 12 posições com os valores iniciais de {1, 3, 6, 5, 9, 8}");
		
		System.out.print("\nGostaria de adicionar mais elementos(Sim/Não)? ");
		String resposta = sc.nextLine();
		
		int maximoDeAdicoes = 6;
		while(resposta.equalsIgnoreCase("SIM") && maximoDeAdicoes > 0) {
			System.out.println("Adições disponíveis: " + maximoDeAdicoes);
			System.out.print("Digite um número inteiro: ");
			heap.insert(sc.nextInt());
			maximoDeAdicoes--;
			
			if(maximoDeAdicoes > 0) {
				System.out.print("\nGostaria de adicionar mais elementos(Sim/Não)? ");
				sc.nextLine();
				resposta = sc.nextLine();
			}
			else {
				System.out.println("\nEspaço de armazenamento esgotado!");
			}
		}
		
		System.out.print("\nVetor final:");
		System.out.println(heap);

		sc.close();
	}
}
