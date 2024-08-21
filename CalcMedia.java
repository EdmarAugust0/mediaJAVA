package br.com.edmar;

public class CalcMedia {

	public static void main(String args[]) {
		calcMedia();
	}
	
	public static void calcMedia() {
		double note1 = 10;
		double note2 = 8.9;
		double note3 = 2.5;
		double note4 = 9.9;
		
		double media = (note1 + note2 + note3 + note4) / 4;
		System.out.println(media);
		
	}

}
