import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		mostrarRegras();

		Milhao milhao = new Milhao();
		Jogador jogador = new Jogador();

		milhao.responderQuestoesFaceis(jogador);
		milhao.responderQuestoesMedias(jogador);
		milhao.responderQuestoesDificeis(jogador);

	}

	public static void mostrarRegras() {
		Scanner s = new Scanner(System.in);

		System.out.println(" \t========= REGRAS DO JOGO  ============\n");
		System.out.println("\n\t1. O jogador respondera 8 perguntas, sendo :");
		System.out.println("\t\ta. 4 faceis");
		System.out.println("\t\tb. 3 medias");
		System.out.println("\t\tc. 1 dificil.");
		System.out.println("\t2. Cada uma com seu valor, sendo respectivamente:");
		System.out.println("\t\ta. Cada pergunta facil equivale a RS 1000");
		System.out.println("\t\tb. Cada pergunta media equivale a RS 3000");
		System.out.println("\t\tc. Cada pergunta dificil equivale a R$ 987000");
		System.out.println("\t3. Totalizando no final um milhao de reais em barras de ouro");
		System.out.println("\t4. Para responder as questoes, digite o numero da alternativa escolhida");
		System.out.println("\t5. Para responder as questoes, digite o numero da alternativa escolhida");
		System.out.println("\t6. Durante o jogo 3 tipos de ajuda poderao ser usadas, sendo:");
		System.out.println("\t\ta. pular a questao");
		System.out.println("\t\tb. eliminar 1 alternativa");
		System.out.println("\t\tc.eliminar 2 alternativas");
		System.out.println("\t7. Voce pode desistir do jogo a qualquer momento,'");
		System.out.println("\te recebera o premio ja conquistado");
		System.out.println("\t8.Caso voce desista do jogo, recebera o premio ja conquistado");
		System.out.println("\t9. Caso voce erre a questao, recebera apenas metade o premio ja conquistado");
		System.out.println("\n\t10. Boa Sorte.");
		System.out.println("");

		System.out.print("\tClique enter para continuar...");
		s.nextLine();
		System.out.print("\n");
	}
}
