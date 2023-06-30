package entities;

public class Audio extends Multimedia implements interfaceRiproduzione {

	private int volume;
	private double durata;

	public Audio(String titolo, int volume, double durata) {
		super(titolo);
		this.volume = volume;
		this.durata = durata;
	}

	@Override
	public void player() {
		for (int i = 0; i < durata; i++) {
			String docs = " !".repeat(volume);
			System.out.println(titolo + docs);
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
}
