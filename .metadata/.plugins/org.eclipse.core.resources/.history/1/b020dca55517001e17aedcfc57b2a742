package entities;

public class Immagine extends Multimedia implements InterfaceLuminosita {

	private int brightness;

	public Immagine(String titolo, int brightness) {
		super(titolo);
		this.brightness = brightness; // metodo per richiamare i metodi della classe astratta
	}

	@Override
	public void lightDown() {
		if (brightness > 0) {
			brightness--;
		}
	}

	@Override
	public void lightUp() {
		brightness++;
	}

	public void show() {
		String bright = " *".repeat(brightness);
		System.out.println(titolo + bright);

	};

}
