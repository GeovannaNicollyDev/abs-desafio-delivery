package enums;

public enum TakeOutEatIn {
	TAKE_OUT("Tampa sem furo para a viagem"),
	EAT_IN("Tampa com furo para beber no estabelecimento");
	
	private String descricao;

	private TakeOutEatIn(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
	
}
