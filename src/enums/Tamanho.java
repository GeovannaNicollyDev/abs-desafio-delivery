package enums;

public enum Tamanho {
	PEQUENO("350ml"),
	MEDIO("500ml"),
	GRANDE("700ml");
	
	private String tamanho;
	
	Tamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getTamanho() {
		return tamanho;
	}
}
