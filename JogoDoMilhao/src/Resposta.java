
public class Resposta {
	private boolean correta;
	private String enunciado;

	public Resposta() {
	}

	public Resposta(boolean correta, String enunciado) {
		super();
		this.correta = correta;
		this.enunciado = enunciado;
	}

	public boolean isCorreta() {
		return correta;
	}

	public void setCorreta(boolean correta) {
		this.correta = correta;
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}
}
