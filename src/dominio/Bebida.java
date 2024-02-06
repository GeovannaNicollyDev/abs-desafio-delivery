package dominio;

import enums.Bebidas;
import enums.TakeOutEatIn;
import enums.Tamanho;
import enums.TipoDeCopo;

public class Bebida {
	private TipoDeCopo tipoDeCopo;
	private Bebidas bebidas;
	private Tamanho tamanho;
	private boolean isGelo;
	private TakeOutEatIn tampa;
	private int quantidadeGelo;
	
	public Bebida(TipoDeCopo tipoDeCopo, Bebidas bebidas, Tamanho tamanho, boolean isGelo, TakeOutEatIn tampa, int quantidadeGelo) {
		super();
		this.tipoDeCopo = tipoDeCopo;
		this.bebidas = bebidas;
		this.tamanho = tamanho;
		this.isGelo = isGelo;
		this.tampa = tampa;
		this.quantidadeGelo = quantidadeGelo;
		
	}
	
	public Bebida() {
		
	}

	public TipoDeCopo getTipoDeCopo() {
		return tipoDeCopo;
	}

	public void setTipoDeCopo(TipoDeCopo tipoDeCopo) {
		this.tipoDeCopo = tipoDeCopo;
	}

	public Bebidas getBebidas() {
		return bebidas;
	}

	public void setBebidas(Bebidas bebidas) {
		this.bebidas = bebidas;
	}

	public Tamanho getTamanho() {
		return tamanho;
	}

	public void setTamanho(Tamanho tamanho) {
		this.tamanho = tamanho;
	}

	public boolean isGelo() {
		return isGelo;
	}

	public void setGelo(boolean isGelo) {
		this.isGelo = isGelo;
	}

	public TakeOutEatIn getTampa() {
		return tampa;
	}

	public void setTampa(TakeOutEatIn tampa) {
		this.tampa = tampa;
	}

	public int getQuantidadeGelo() {
		return quantidadeGelo;
	}

	public void setQuantidadeGelo(int quantidadeGelo) {
		this.quantidadeGelo = quantidadeGelo;
	}

	@Override
	public String toString() {
		return "Pedido a ser produzido:\n" + "Tipo do copo -> " + tipoDeCopo;
		// return "Bebida [tipoDeCopo=" + tipoDeCopo + ", bebidas=" + bebidas + ", tamanho=" + tamanho  + ", tampa=" + tampa.getDescricao() + ", quantidadeGelo=" + quantidadeGelo + "]";
	}
	
	
	
	
}
