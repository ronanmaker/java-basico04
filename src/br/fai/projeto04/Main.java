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
				System.out.println("Primeira condi��o");
				break;
				
			case 4:
				System.out.println("Segunda Condi��o");
			
			default:
			System.out.println("N�o encontrou nenhuma condi��o");
			break;
			}
		}
	}

}
