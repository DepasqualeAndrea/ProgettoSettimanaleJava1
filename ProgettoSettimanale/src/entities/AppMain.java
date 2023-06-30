package entities;

import java.util.Scanner;

public class AppMain {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

//
		Multimedia[] music = new Multimedia[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("insert Title here:");
			String title = input.nextLine();
			System.out.println("Select type of content:");
			System.out.println("1: audio");
			System.out.println("2: video");
			System.out.println("3: img");
			int section = input.nextInt();
			input.nextLine();
			switch (section) {

			case 1:
				System.out.println("insert duration track");
				int durataFr = input.nextInt();
				input.nextLine();
				System.out.println("insert volume");
				int volFr = input.nextInt();
				input.nextLine();
				music[i] = new Audio(title, durataFr, volFr);
				break;

			case 2:
				System.out.println("insert duration track");
				int durataSc = input.nextInt();
				input.nextLine();
				System.out.println("insert volume");
				int volSc = input.nextInt();
				input.nextLine();
				System.out.println("insert bright");
				int brightSc = input.nextInt();
				input.nextLine();
				music[i] = new Video(title, durataSc, volSc, brightSc);
				break;
			case 3:
				System.out.println("insert bright");
				int brightTh = input.nextInt();
				input.nextLine();
				music[i] = new Immagine(title, brightTh);
				break;
			default:
				System.out.println("Qualcosa è andato storto! riprova");
			}
		}
		int model = -1;
		while (model != 0) {
			System.out.println("select user");
			model = input.nextInt();
			input.nextLine();
			if (model >= 1 && model <= 5) {
				Multimedia windows = music[model - 1];
				if (windows instanceof interfaceRiproduzione) {
					interfaceRiproduzione pippo = (interfaceRiproduzione) windows;
					pippo.player();
				} else if (windows instanceof Immagine) {
					Immagine pluto = (Immagine) windows;
					pluto.show();
				}
			}
		}
		input.close();
		print(music);
	}

	// function per mostrare array
	public static void print(Multimedia[] music) {
		for (int i = 0; i < music.length; i++) {
			System.out.println((i + 1) + " " + music[i].titolo);
		}

	}

}
