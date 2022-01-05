import java.util.Scanner;

public class Milhao {
	Scanner scanner = new Scanner(System.in);
	BancoDeQuestoes bancoDeQuestoes = new BancoDeQuestoes();

	public Milhao() {
	}

	public void mostrarQuestao(Questao questao) {
		int count = 1;
		System.out.println("\t" + questao.getEnunciado());

		for (Resposta resposta : questao.getAlternativas()) {
			System.out.println("            " + count + ". " + resposta.getEnunciado());
			count++;
		}

		System.out.println("            " + count + ". Ajuda");
		count++;
		System.out.println("            " + count + ". Desistir");

	}

	public boolean ehNumero(String numeroAlternativa) {
		return numeroAlternativa.matches("[+-]?\\d*(\\.\\d+)?");
	}

	public boolean verificarResposta(Questao questao, int numeroAlternativa) {
		Resposta respostaJogador = questao.getAlternativas().get(numeroAlternativa - 1);

		if (respostaJogador.isCorreta()) {
			return true;
		}
		return false;
	}

	public void responderQuestoesFaceis(Jogador jogador) {
		int questaoRespondida = 0;
		int questaoFaceis = 4;
		double premio = 1000;
		double premioFacil = 1000;
		boolean respondido;

		while (bancoDeQuestoes.aindaTemQuestoesFaceis() && questaoRespondida < questaoFaceis) {
			Questao questao = bancoDeQuestoes.sortearQuestaoFacil();
			System.out.println("\n\t========= Pergunta valendo R$ " + premio + " ========= ");

			respondido = false;
			do {
				System.out.println("\n");
				this.mostrarQuestao(questao);
				System.out.print("\n\tResposta : ");
				String stringAlternativa = scanner.nextLine();

				if (!"".equals(stringAlternativa) && stringAlternativa != null) {
					boolean ehNumero = ehNumero(stringAlternativa);

					if (ehNumero) {
						int numeroAlternativa = Integer.parseInt(stringAlternativa);

						if (numeroAlternativa < questao.getAlternativas().size() + 2) {
							if (numeroAlternativa < questao.getAlternativas().size() + 1) {
								respondido = true;

								boolean correta = verificarResposta(questao, numeroAlternativa);

								if (correta) {
									System.out.println("\n\tVocê acertou !\n");
									jogador.setPremio(premio);

									questaoRespondida++;
									premio += premioFacil;
								} else {
									System.out.println("\n\tVocê errou!");

									if (0 < jogador.getPremio()) {
										jogador.setPremio(jogador.getPremio() / 2);
									}
									mostrarPremio(jogador);

								}
							} else if (numeroAlternativa == questao.getAlternativas().size() + 1) {
								boolean ajuda = utilizarAjuda(jogador, questao);

								if (ajuda) {
									respondido = true;
								}
							} else {
								mostrarPremio(jogador);
							}
						} else {
							System.out.println("\n\tAlternativa invalida");
						}
					} else {
						System.out.println("\n\tUtilize os numeros das alternativas");
					}
				} else {
					System.out.println("\n\tUtilize os numeros das alternativas");
				}
			} while (!respondido);
		}
	}

	public void responderQuestoesMedias(Jogador jogador) {
		int questaoRespondida = 0;
		int questaoMedias = 3;
		double premioMedio = 3000;
		double premio = jogador.getPremio() + premioMedio;
		boolean respondido;

		while (bancoDeQuestoes.aindaTemQuestoesMedias() && questaoRespondida < questaoMedias) {
			Questao questao = bancoDeQuestoes.sortearQuestaoMedia();
			System.out.println("\n\t========= Pergunta valendo R$ " + premio + " ========= ");

			respondido = false;
			do {
				System.out.println("\n");
				this.mostrarQuestao(questao);
				System.out.print("\n\tResposta : ");
				String stringAlternativa = scanner.nextLine();

				if (!"".equals(stringAlternativa) && stringAlternativa != null) {
					boolean ehNumero = ehNumero(stringAlternativa);

					if (ehNumero) {
						int numeroAlternativa = Integer.parseInt(stringAlternativa);

						if (numeroAlternativa < questao.getAlternativas().size() + 2) {
							if (numeroAlternativa < questao.getAlternativas().size() + 1) {
								respondido = true;

								boolean correta = verificarResposta(questao, numeroAlternativa);

								if (correta) {
									System.out.println("\n\tVocê acertou !\n");
									jogador.setPremio(premio);

									questaoRespondida++;
									premio += premioMedio;
								} else {
									System.out.println("\n\tVocê errou!");

									if (0 < jogador.getPremio()) {
										jogador.setPremio(jogador.getPremio() / 2);
									}
									mostrarPremio(jogador);

								}
							} else if (numeroAlternativa == questao.getAlternativas().size() + 1) {
								boolean ajuda = utilizarAjuda(jogador, questao);

								if (ajuda) {
									respondido = true;
								}
							} else {
								mostrarPremio(jogador);
							}
						} else {
							System.out.println("\n\tAlternativa invalida");
						}
					} else {
						System.out.println("\n\tUtilize os numeros das alternativas");
					}
				} else {
					System.out.println("\n\tUtilize os numeros das alternativas");
				}
			} while (!respondido);
		}
	}

	public void responderQuestoesDificeis(Jogador jogador) {
		int questaoRespondida = 0;
		int questaoDificeis = 1;
		double premioDificil = 987000;
		double premio = jogador.getPremio() + premioDificil;
		boolean respondido;

		while (bancoDeQuestoes.aindaTemQuestoesMedias() && questaoRespondida < questaoDificeis) {
			Questao questao = bancoDeQuestoes.sortearQuestaoDificil();
			System.out.println("\n\t========= Pergunta valendo R$ " + premio + " ========= ");

			respondido = false;
			do {
				System.out.println("\n");
				this.mostrarQuestao(questao);
				System.out.print("\n\tResposta : ");
				String stringAlternativa = scanner.nextLine();

				if (!"".equals(stringAlternativa) && stringAlternativa != null) {
					boolean ehNumero = ehNumero(stringAlternativa);

					if (ehNumero) {
						int numeroAlternativa = Integer.parseInt(stringAlternativa);

						if (numeroAlternativa < questao.getAlternativas().size() + 2) {
							if (numeroAlternativa < questao.getAlternativas().size() + 1) {
								respondido = true;

								boolean correta = verificarResposta(questao, numeroAlternativa);

								if (correta) {
									System.out.println("\n\tVocê acertou !\n");
									jogador.setPremio(premio);
									questaoRespondida++;
								} else {
									System.out.println("\n\tVocê errou!");

									if (0 < jogador.getPremio()) {
										jogador.setPremio(jogador.getPremio() / 2);
									}
									mostrarPremio(jogador);

								}
							} else if (numeroAlternativa == questao.getAlternativas().size() + 1) {
								boolean ajuda = utilizarAjuda(jogador, questao);

								if (ajuda) {
									respondido = true;
								}
							} else {
								mostrarPremio(jogador);
							}
						} else {
							System.out.println("\n\tAlternativa invalida");
						}
					} else {
						System.out.println("\n\tUtilize os numeros das alternativas");
					}
				} else {
					System.out.println("\n\tUtilize os numeros das alternativas");
				}
			} while (!respondido);
		}
	}

	public void mostrarPremio(Jogador jogador) {
		System.out.print("\n\tSeu premio :  R$ " + jogador.getPremio());
		System.exit(0);
	}

	public boolean utilizarAjuda(Jogador jogador, Questao questao) {
		System.out.println("\n\t========= AJUDAS DO JOGO  ============\n");

		if (jogador.getEliminarUma()) {
			System.out.println("\t1. Eliminar uma alternativa");
		} else {
			System.out.println("\t1. Eliminar uma alternativa - INDISPONIVEL");
		}

		if (jogador.getEliminarDuas()) {
			System.out.println("\t2. Eliminar duas alternativa");

		} else {
			System.out.println("\t2. Eliminar duas alternativa - INDISPONIVEL");
		}

		if (jogador.getPularQuestao()) {
			System.out.println("\t3. Pular questao");
		} else {
			System.out.println("\t3. Pular questao - INDISPONIVEL");
		}

		System.out.println("\t4. Cancelar\n");
		System.out.print("\tSelecione a ajuda : ");
		String stringAjuda = scanner.nextLine();

		boolean ehNumero = this.ehNumero(stringAjuda);

		if (ehNumero) {
			int numeroAjuda = Integer.parseInt(stringAjuda);

			if (numeroAjuda == 1 && jogador.getEliminarUma()) {
				eliminarUmaAlternativa(questao);
				jogador.setEliminarUma(false);
			} else if (numeroAjuda == 2 && jogador.getEliminarDuas()) {
				eliminarDuasAlternativas(questao);
				jogador.setEliminarDuas(false);
			} else if (numeroAjuda == 3 && jogador.getPularQuestao()) {
				jogador.setPularQuestao(false);
				return true;
			}

		}

		return false;

	}

	public void eliminarUmaAlternativa(Questao questao) {
		int eliminada = 1;

		while (0 < eliminada) {
			int sorteada = (int) (Math.random() * (3 - 1));

			if (!questao.getAlternativas().get(sorteada).isCorreta()) {
				questao.getAlternativas().remove(sorteada);
				eliminada--;
			}
		}
	}

	public void eliminarDuasAlternativas(Questao questao) {
		int eliminada = 2;

		while (0 < eliminada) {
			int sorteada = (int) (Math.random() * (3 - 1));

			if (!questao.getAlternativas().get(sorteada).isCorreta()) {
				questao.getAlternativas().remove(sorteada);
				eliminada--;
			}
		}
	}
};
