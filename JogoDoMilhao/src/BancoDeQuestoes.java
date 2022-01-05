import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BancoDeQuestoes {
	private ArrayList<Questao> faceis;
	private ArrayList<Questao> medias;
	private ArrayList<Questao> dificeis;

	public BancoDeQuestoes() {
		this.faceis = new ArrayList<Questao>();
		this.medias = new ArrayList<Questao>();
		this.dificeis = new ArrayList<Questao>();

		this.criarQuestoesFaceis();
		this.criarQuestoesMedias();
		this.criarQuestoesDificeis();
	}

	public void sortearAlternativas(Questao questao) {
		List<Resposta> sorteio = questao.getAlternativas();
		List<Resposta> sorteadas = new ArrayList<Resposta>();

		Random random = new Random();

		while (0 < sorteio.size()) {
			int quantidade = sorteio.size();
			int posicao = random.nextInt(quantidade);

			Resposta sorteada = sorteio.get(posicao);
			sorteadas.add(sorteada);
			sorteio.remove(posicao);
		}

		questao.setAlternativas(sorteadas);
	}

	public Questao sortearQuestaoFacil() {
		Random random = new Random();
		int i = random.nextInt(this.faceis.size());
		Questao sorteada = this.faceis.remove(i);
		this.sortearAlternativas(sorteada);

		return sorteada;
	}

	public Questao sortearQuestaoMedia() {
		Random random = new Random();
		int i = random.nextInt(this.medias.size());
		Questao sorteada = this.medias.remove(i);
		this.sortearAlternativas(sorteada);

		return sorteada;
	}

	public Questao sortearQuestaoDificil() {
		Random random = new Random();
		int i = random.nextInt(this.dificeis.size());
		Questao sorteada = this.dificeis.remove(i);
		this.sortearAlternativas(sorteada);

		return sorteada;
	}

	public void criarQuestoesFaceis() {
		List<Resposta> alternativas = new ArrayList<>();

		Questao questao = new Questao();
		questao.setEnunciado("O conjunto de todos os ecossistemas é chamado de ? ");

		Resposta resposta = new Resposta();
		resposta.setEnunciado("Biosfera");
		resposta.setCorreta(true);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("Comunidade");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("Populacao");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("Sistemas");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		questao.setAlternativas(alternativas);
		this.faceis.add(questao);

		questao = new Questao();
		questao.setEnunciado("Qual o nome do primeiro avião de Santos Dumont ?");
		alternativas = new ArrayList<>();

		resposta = new Resposta();
		resposta.setEnunciado("PATURI");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("14 bis");
		resposta.setCorreta(true);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("CESSNA 206");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("ATR");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		questao.setAlternativas(alternativas);
		this.faceis.add(questao);

		questao = new Questao();
		questao.setEnunciado("Quantas estrelas fazem parte do Cruzeiro do Sul ?");
		alternativas = new ArrayList<>();

		resposta = new Resposta();
		resposta.setEnunciado("Sete");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("Quatro");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("Cinco");
		resposta.setCorreta(true);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("Seis");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		questao.setAlternativas(alternativas);
		this.faceis.add(questao);

		questao = new Questao();
		questao.setEnunciado("Quantas estrelas fazem parte do Cruzeiro do Sul ?");
		alternativas = new ArrayList<>();

		resposta = new Resposta();
		resposta.setEnunciado("Lua");
		resposta.setCorreta(true);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("Mimas");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("Pandora");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("Sol");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		questao.setAlternativas(alternativas);
		this.faceis.add(questao);

		questao = new Questao();
		questao.setEnunciado("A frase “Independência ou morte” foi dita por quem ? ");
		alternativas = new ArrayList<>();

		resposta = new Resposta();
		resposta.setEnunciado("Dom João V");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("Dom Filipe I");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("Dom Manuel");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("Dom pedro I");
		resposta.setCorreta(true);
		alternativas.add(resposta);

		questao.setAlternativas(alternativas);
		this.faceis.add(questao);

		questao = new Questao();
		questao.setEnunciado("Qual personagem de série de TV que grita: Gentalha, gentalha, gentalha ? ");
		alternativas = new ArrayList<>();

		resposta = new Resposta();
		resposta.setEnunciado("Quico");
		resposta.setCorreta(true);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("Seu Madruga");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("Chiquinha");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("Chaves");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		questao.setAlternativas(alternativas);
		this.faceis.add(questao);

		questao = new Questao();
		questao.setEnunciado("Aproximadamente, quanto tempo leva o período de rotação do nosso planeta?");
		alternativas = new ArrayList<>();

		resposta = new Resposta();
		resposta.setEnunciado("5 dias");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("1 dia");
		resposta.setCorreta(true);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("3 dias");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("10 dias");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		questao = new Questao();
		questao.setEnunciado("Em que ano aconteceu a Independência do Brasil ? ");
		alternativas = new ArrayList<>();

		resposta = new Resposta();
		resposta.setEnunciado("1815");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("1889");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("1900");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("1822");
		resposta.setCorreta(true);
		alternativas.add(resposta);

		questao = new Questao();
		questao.setEnunciado(
				"De acordo com uma superstição brasileira, o que acontece com uma pessoa que quebra um espelho ? ");
		alternativas = new ArrayList<>();

		resposta = new Resposta();
		resposta.setEnunciado("Sete anos de azar");
		resposta.setCorreta(true);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("Dez anos de azar");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("Dois anos de azar");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("Um anos de azar");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		questao = new Questao();
		questao.setEnunciado("Em qual país fica a Torre Eiffel ? ");
		alternativas = new ArrayList<>();

		resposta = new Resposta();
		resposta.setEnunciado("Paris");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("Franca");
		resposta.setCorreta(true);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("Londres");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("Inglaterra");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		questao = new Questao();
		questao.setEnunciado("Em relação ao meio ambiente, qual o significado dos 3 Rs ? ");
		alternativas = new ArrayList<>();

		resposta = new Resposta();
		resposta.setEnunciado("Reivindicar, Reutilizar, Reciclar");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("Reduzir, Reutilizar, Reciclar");
		resposta.setCorreta(true);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("Refletir, Reduzir, Reivindicar");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("Refletir, Retaliação, Revogar");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		questao = new Questao();
		questao.setEnunciado("Qual é a capital de Mato Grosso ? ");
		alternativas = new ArrayList<>();

		resposta = new Resposta();
		resposta.setEnunciado("Cuiaba");
		resposta.setCorreta(true);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("Porto alegre");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("Maceio");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("Curitiba");
		resposta.setCorreta(false);
		alternativas.add(resposta);
	}

	public void criarQuestoesMedias() {
		List<Resposta> alternativas = new ArrayList<>();

		Questao questao = new Questao();
		questao.setEnunciado("Qual é o maior ser vivo da Terra ? ");
		alternativas = new ArrayList<>();

		Resposta resposta = new Resposta();
		resposta = new Resposta();
		resposta.setEnunciado("Fungo");
		resposta.setCorreta(true);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("Reptil");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("Mamifero");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("Bacteria");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		questao.setAlternativas(alternativas);
		this.medias.add(questao);

		questao = new Questao();
		questao.setEnunciado("Do ponto de vista europeu, quando foi 'descoberto' o continente Americano ? ");
		alternativas = new ArrayList<>();

		resposta = new Resposta();
		resposta = new Resposta();
		resposta.setEnunciado("1490");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("1533");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("1492");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("1500");
		resposta.setCorreta(true);
		alternativas.add(resposta);

		questao.setAlternativas(alternativas);
		this.medias.add(questao);

		questao = new Questao();
		questao.setEnunciado("Como ficou conhecido o desembarque das tropas aliadas na normandia ? ");
		alternativas = new ArrayList<>();

		resposta = new Resposta();
		resposta = new Resposta();
		resposta.setEnunciado("Dia x");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("Dia fatal");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("Dia d");
		resposta.setCorreta(true);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("Dia n");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		questao.setAlternativas(alternativas);
		this.medias.add(questao);

		questao = new Questao();
		questao.setEnunciado("Qual o contrário de altruísmo ? ");
		alternativas = new ArrayList<>();

		resposta = new Resposta();
		resposta.setEnunciado("Amor");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("Egoismo");
		resposta.setCorreta(true);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("Ciume");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("Filantropia");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		questao.setAlternativas(alternativas);
		this.medias.add(questao);

		questao = new Questao();
		questao.setEnunciado("Na rosa dos ventos, qual ponto indicada a direção Setentrional ? ");
		alternativas = new ArrayList<>();

		resposta = new Resposta();
		resposta.setEnunciado("Leste");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("Oeste");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("Sul");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("Norte");
		resposta.setCorreta(true);
		alternativas.add(resposta);

		questao.setAlternativas(alternativas);
		this.medias.add(questao);

		questao = new Questao();
		questao.setEnunciado("O intrumento de orientação mais comumente utilizado é ? ");
		alternativas = new ArrayList<>();

		resposta = new Resposta();
		resposta.setEnunciado("Binoculo");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("Mapa");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("Bussola");
		resposta.setCorreta(true);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("Sol");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		questao.setAlternativas(alternativas);
		this.medias.add(questao);

		questao = new Questao();
		questao.setEnunciado("Na hierarquia da Igreja Católica, episcopal corresponde aos");
		alternativas = new ArrayList<>();

		resposta = new Resposta();
		resposta.setEnunciado("Diáconos");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("Padres");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("Bispos");
		resposta.setCorreta(true);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("Presbiteros");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		questao.setAlternativas(alternativas);
		this.medias.add(questao);

		questao = new Questao();
		questao.setEnunciado("Qual mês do ano tem 28 dias?");
		alternativas = new ArrayList<>();

		resposta = new Resposta();
		resposta.setEnunciado("Um");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("Cinco");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("Dois");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("Todos");
		resposta.setCorreta(true);
		alternativas.add(resposta);

		questao.setAlternativas(alternativas);
		this.medias.add(questao);

		questao = new Questao();
		questao.setEnunciado("O Arco do Triunfo é um monumento histórico dessa cidade ?");
		alternativas = new ArrayList<>();

		resposta = new Resposta();
		resposta.setEnunciado("Berlim");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("Roma");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("Monte carlo");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("Paris");
		resposta.setCorreta(true);
		alternativas.add(resposta);

		questao.setAlternativas(alternativas);
		this.medias.add(questao);
	}

	public void criarQuestoesDificeis() {
		List<Resposta> alternativas = new ArrayList<>();

		Questao questao = new Questao();
		questao.setEnunciado("Quem descobriu a Lei da Relatividade ? ");
		alternativas = new ArrayList<>();

		Resposta resposta = new Resposta();
		resposta = new Resposta();
		resposta.setEnunciado("Isaac Newton");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("Albert Einstein");
		resposta.setCorreta(true);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("Charles Darwin");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("Galileu Galilei");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		questao.setAlternativas(alternativas);
		this.dificeis.add(questao);

		questao = new Questao();
		questao.setEnunciado("Qual é a capital da Austrália ? ");
		alternativas = new ArrayList<>();

		resposta = new Resposta();
		resposta = new Resposta();
		resposta.setEnunciado("Sydney");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("Noosa");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("Perth");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("Camberra");
		resposta.setCorreta(true);
		alternativas.add(resposta);

		questao.setAlternativas(alternativas);
		this.dificeis.add(questao);

		questao = new Questao();
		questao.setEnunciado("Qual ano em que a  internet foi aberta a todo o Brasil ? ");
		alternativas = new ArrayList<>();

		resposta = new Resposta();
		resposta = new Resposta();
		resposta.setEnunciado("1995");
		resposta.setCorreta(true);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("1990");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("2000");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		resposta = new Resposta();
		resposta.setEnunciado("1998");
		resposta.setCorreta(false);
		alternativas.add(resposta);

		questao.setAlternativas(alternativas);
		this.dificeis.add(questao);
	}

	public boolean aindaTemQuestoesFaceis() {
		if (this.faceis.size() == 0) {
			return false;
		} else {
			return true;
		}
	}

	public boolean aindaTemQuestoesMedias() {
		if (this.faceis.size() == 0) {
			return false;
		} else {
			return true;
		}
	}

	public boolean aindaTemQuestoesDificeis() {
		if (this.faceis.size() == 0) {
			return false;
		} else {
			return true;
		}
	}
}
