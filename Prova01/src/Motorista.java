
public class Motorista {

	private int numCart;
	private int numMultasLeves;
	private int numMultasMedias;
	private int numMultasGraves;
	private int numMultasGravissimas;

	public Motorista() {
		
	}

	public Motorista(int numCart, int numMultasLeves, int numMultasMedias, int numMultasGraves,
			int numMultasGravissimas) {
		super();
		this.numCart = numCart;
		this.numMultasLeves = numMultasLeves;
		this.numMultasMedias = numMultasMedias;
		this.numMultasGraves = numMultasGraves;
		this.numMultasGravissimas = numMultasGravissimas;
	}

	public int getNumCart() {
		return numCart;
	}

	public void setNumCart(int numCart) {
		this.numCart = numCart;
	}

	public int getNumMultasLeves() {
		return numMultasLeves;
	}

	public void setNumMultasLeves(int numMultasLeves) {
		this.numMultasLeves = numMultasLeves;
	}

	public int getNumMultasMedias() {
		return numMultasMedias;
	}

	public void setNumMultasMedias(int numMultasMedias) {
		this.numMultasMedias = numMultasMedias;
	}

	public int getNumMultasGraves() {
		return numMultasGraves;
	}

	public void setNumMultasGraves(int numMultasGraves) {
		this.numMultasGraves = numMultasGraves;
	}

	public int getNumMultasGravissimas() {
		return numMultasGravissimas;
	}

	public void setNumMultasGravissimas(int numMultasGravissimas) {
		this.numMultasGravissimas = numMultasGravissimas;
	}

}
