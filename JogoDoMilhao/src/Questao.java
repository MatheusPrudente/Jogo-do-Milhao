import java.util.List;
import java.util.ArrayList;

public class Questao {
	private String enunciado;
	private List<Resposta> alternativas = new ArrayList<>();

	public Questao() {
	}

	public Questao(String enunciado, List<Resposta> alternativas) {
		super();
		this.enunciado = enunciado;
		this.alternativas = alternativas;
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public List<Resposta> getAlternativas() {
		return alternativas;
	}

	public void setAlternativas(List<Resposta> alternativas) {
		this.alternativas = alternativas;
	}

}
