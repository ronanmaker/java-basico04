package br.fai.projeto04;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();
	}

	private void start() {
		
		System.out.println("enviando branch para o github");
		for (int i = 0; i <5; i ++) {
			switch (i) {
			case 1:
				System.out.println("Primeira condição");
				break;
				
			case 4:
				System.out.println("Segunda Condição");
			
			default:
			System.out.println("Não encontrou nenhuma condição");
			break;
			}
		}
	}

}
