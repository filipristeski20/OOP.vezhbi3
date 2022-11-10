package vezhbabroj2;

public class MainClass {
	public static void main(String[] Args) {
		Fakultet f1 = new Fakultet();
		f1.nazivNaFakultet = "FIKT";
		f1.brojNaSmerovi = 5;
		f1.brojNaStudenti = 250;
		f1.dekan = "Pece Mitrevski";
		f1.sediste = "Bitola";
		
		f1.prvMetod();
		System.out.println("Namalen broj na studenti "+f1.vtorMetod(50));
		f1.tretMetod();
		
		Fakultet f2 = new Fakultet();
		f2.nazivNaFakultet = "TFB";
		f2.brojNaSmerovi = 4;
		f2.brojNaStudenti = 300;
		f2.dekan = "Stojance Nusev";
		f2.sediste="Bitola";
		f2.prvMetod();
		System.out.println("Namalen broj na studenti "+f2.vtorMetod(20));
		f2.tretMetod();
	}
	
	

}
