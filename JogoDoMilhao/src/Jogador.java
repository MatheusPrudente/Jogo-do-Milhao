
public class Jogador {
	private double premio;
	private boolean eliminarUma;
	private boolean eliminarDuas;
	private boolean pularQuestao;
	
	public Jogador() {
		this.premio = 0.0;
		this.eliminarUma = true;
		this.eliminarDuas = true;
		this.pularQuestao = true;
	}

	public double getPremio() {
		return premio;
	}

	public void setPremio(double premio) {
		this.premio = premio;
	}

	public boolean getEliminarUma() {
		return eliminarUma;
	}

	public void setEliminarUma(boolean eliminarUma) {
		this.eliminarUma = eliminarUma;
	}

	public boolean getEliminarDuas() {
		return eliminarDuas;
	}

	public void setEliminarDuas(boolean eliminarDuas) {
		this.eliminarDuas = eliminarDuas;
	}

	public boolean getPularQuestao() {
		return pularQuestao;
	}

	public void setPularQuestao(boolean pularQuestao) {
		this.pularQuestao = pularQuestao;
	}

}
