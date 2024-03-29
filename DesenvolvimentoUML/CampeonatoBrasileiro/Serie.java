package DesenvolvimentoUML.CampeonatoBrasileiro;

public class Serie {

	private String descricao;
	protected Campeonato campeonato;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Campeonato getCampeonato() {
		return campeonato;
	}
	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Serie [descricao=");
		builder.append(descricao);
		builder.append(", campeonato=");
		builder.append(campeonato);
		builder.append("]");
		return builder.toString();
	}

	
	
	
}
