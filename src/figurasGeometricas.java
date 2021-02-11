
public abstract class figurasGeometricas implements AfigurasGeometricas {
	
	private Cor cor;
	
	public figurasGeometricas(Cor cor) {
		super ();
		this.Cor = cor;
	}
	
	public Cor getCor() {
		return cor;
	}
	
	public void setCor(Cor cor) {
		this.cor = cor;
	}
	

}
