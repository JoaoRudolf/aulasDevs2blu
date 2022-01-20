package principalexceptions;

public class ZeroANoveExceeption extends Exception{

	private static final long serialVersionUID = 1L;
	
	public ZeroANoveExceeption(String msg) {
		super(msg);
	}
	
	// criar excecao para lancar qdo for diferente de 0 a 9

}
