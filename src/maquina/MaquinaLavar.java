package maquina;

import java.util.Scanner;

/**
 * @author Paraibah89
 *
 */
public class MaquinaLavar {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Scanner mostrarTeclado = new Scanner(System.in);
		int opcaoMenuSimulacao;
		int kg = 0;
		int duracaoLavacaoPesada = 0;
		int duracaoLavacaoNormal = 0;
		int duracaoLavacaoLeve = 0;
		int duracaoEnxague = 0;
		int duracaoCentrifuga = 0;
		int opcaoMenuEstagio;
		int numeroEstagios = 0;
		int duracaoEstagioAtual = 0;
		String modelo = "";
		String nome = "";
		String voltagem = "";
		String nomeEstagioAtual = "";
		boolean maquinaConfigurada = false;

		do {
			System.out.println("\n=====================================");
			System.out.println("MENU DE SIMULAÇÃO");
			System.out.println("=====================================\n");
			System.out.println("1 - Configurar a máquina de lavar");
			System.out.println("2 - Simular a máquina de lavar");
			System.out.println("0 - Sair");
			System.out.println("Digite o código:");
			opcaoMenuSimulacao = mostrarTeclado.nextInt();
			mostrarTeclado.nextLine();

			if (opcaoMenuSimulacao == 1) {
				System.out.println("\nDigite o modelo da máquina:");
				modelo = mostrarTeclado.nextLine();
				System.out.println("Digite o nome da máquina:");
				nome = mostrarTeclado.nextLine();
				System.out.println("Digite a voltagem da máquina (220v ou 110v ou 220/110v:");
				voltagem = mostrarTeclado.nextLine();
				System.out.println("Quantos Kg ( 7 / 10 / 15) ?");
				kg = mostrarTeclado.nextInt();
				System.out.println("Qual a duração de estágio de lavação pesada?");
				duracaoLavacaoPesada = mostrarTeclado.nextInt();
				System.out.println("Qual a duração de estágio de lavação normal?");
				duracaoLavacaoNormal = mostrarTeclado.nextInt();
				System.out.println("Qual a duração de estágio de lavação leve?");
				duracaoLavacaoLeve = mostrarTeclado.nextInt();
				System.out.println("Qual a duração de estágio de lavação enxague?");
				duracaoEnxague = mostrarTeclado.nextInt();
				System.out.println("Qual a duração de estágio de lavação centrífuga?");
				duracaoCentrifuga = mostrarTeclado.nextInt();

				System.out.println("\n=====================================");
				System.out.println("CONFIGURAÇÃO DA MÁQUINA DE LAVAR:");
				System.out.println("=====================================\n");
				System.out.println("Modelo: " + modelo);
				System.out.println("Nome: " + nome);
				System.out.println("Voltagem: " + voltagem);
				System.out.println("Quantos Kg: " + kg);
				System.out.println("Duração do estágio 1 - Lavação Pesada: " + duracaoLavacaoPesada);
				System.out.println("Duração do estágio 2 - Lavação Normal: " + duracaoLavacaoNormal);
				System.out.println("Duração do estágio 3 - Lavação Rápida: " + duracaoLavacaoLeve);
				System.out.println("Duração do estágio 4 - Enxague: " + duracaoEnxague);
				System.out.println("Duração do estágio 5 - Centrífuga: " + duracaoCentrifuga);
				maquinaConfigurada = true;

			} else if (opcaoMenuSimulacao == 2) {
				if (maquinaConfigurada == true) {
					System.out.println("\n=====================================");
					System.out.println("SIMULAÇÃO DA MÁQUINA DE LAVAR:");
					System.out.println("=====================================\n");
					System.out.println(
							"Simulando o " + modelo + " - " + nome + " - " + kg + "Kg - voltagem: " + voltagem);
					System.out.println("\n=====================================");
					System.out.println("QUAL ESTÁGIO VOCÊ DESEJA COMEÇAR?");
					System.out.println("=====================================\n");
					System.out.println("1 - Lavação Pesada");
					System.out.println("2 - Lavação Normal");
					System.out.println("3 - Lavação Leve");
					System.out.println("4 - Enxague");
					System.out.println("5 - Centrifugar");
					System.out.println("Selecione o estágio inicial:");
					opcaoMenuEstagio = mostrarTeclado.nextInt();
					mostrarTeclado.nextLine();

					numeroEstagios = 5;

					if (opcaoMenuEstagio <= 0 || opcaoMenuEstagio > 5) {
						System.out.println("Opção inválida");
					} else {

						for (int i = opcaoMenuEstagio; i <= numeroEstagios; i++) {
							if (i == 1) {
								duracaoEstagioAtual = duracaoLavacaoPesada;
								nomeEstagioAtual = "Lavação Pesada";
							}
							if (i == 2) {
								duracaoEstagioAtual = duracaoLavacaoNormal;
								nomeEstagioAtual = "Lavação Normal";
							}
							if (i == 3) {
								duracaoEstagioAtual = duracaoLavacaoLeve;
								nomeEstagioAtual = "Lavação Leve";
							}
							if (i == 4) {
								duracaoEstagioAtual = duracaoEnxague;
								nomeEstagioAtual = "Enxague";
							}
							if (i == 5) {
								duracaoEstagioAtual = duracaoCentrifuga;
								nomeEstagioAtual = "Centrifuga";
							}

							for (int j = 1; j <= duracaoEstagioAtual; j++) {
								if (j == Math.round((20 * duracaoEstagioAtual) / 100)) {
									System.out.println("Estagio " + i + " - Em " + nomeEstagioAtual + " : 20.00%");
								}
								if (j == Math.round((40 * duracaoEstagioAtual) / 100)) {
									System.out.println("Estagio " + i + " - Em " + nomeEstagioAtual + " : 40.00%");
								}
								if (j == Math.round((60 * duracaoEstagioAtual) / 100)) {
									System.out.println("Estagio " + i + " - Em " + nomeEstagioAtual + " : 60.00%");
								}
								if (j == Math.round((80 * duracaoEstagioAtual) / 100)) {
									System.out.println("Estagio " + i + " - Em " + nomeEstagioAtual + " : 80.00%");
								}
								if (j == Math.round((100 * duracaoEstagioAtual) / 100)) {
									System.out.println("Estagio " + i + " - Em " + nomeEstagioAtual + " : 100.00%");
								}
								Thread.sleep(1000);
							}
							Thread.sleep(500);
						}
						System.out.println("\nSimulação Finalizada");
					}

				} else {
					System.out.println("É necessário configurar a máquina para simular\n");
				}
			} else if (opcaoMenuSimulacao == 0) {
				System.out.println("Programa Finalizado");
				break;
			} else {
				System.out.println("Opção inválida");
			}

		} while (opcaoMenuSimulacao != 0);

	}

}
