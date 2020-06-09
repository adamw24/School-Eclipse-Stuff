

public class Pink implements Colorable {
	private int wave;
	private boolean isPretty;
	private int opaci;
	public void wavelength(int lambda) {
		wave = lambda;
	}
	public void pretty(boolean beauty) {
		isPretty = beauty;
	}
	public void opacity(int opaque) {
		opaci = opaque;
	}
}
