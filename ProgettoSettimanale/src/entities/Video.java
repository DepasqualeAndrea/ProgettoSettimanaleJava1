package entities;

public class Video extends Multimedia implements interfaceRiproduzione, InterfaceLuminosita {

	private int volume;
	private double durata;
	private int brightness;

	public Video(String titolo, int volume, double durata, int brightness) {
		super(titolo);
		this.volume = volume;
		this.durata = durata;
		this.brightness = brightness; // metodo per richiamare i metodi della classe astratta
	}

	@Override
	public void player() {
		for (int i = 0; i < durata; i++) {
			String docs = " !".repeat(volume);
			String vol = " *".repeat(brightness);
			System.out.println(titolo + docs + vol);
		}
	}

	@Override
	public void volumeUp() {
		if (volume > 0) {
			volume--;
		}
	}

	@Override
	public void volumeDown() {
		volume++;
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

}
