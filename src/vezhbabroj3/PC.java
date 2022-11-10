package vezhbabroj3;

public class PC {
	
	public int memorija, hardDisk;
    public String tipNaMemorija;

	public PC() {
		this.memorija = 2;
		this.tipNaMemorija = "DDR2";
		this.hardDisk = 160;
	}
	
	public void prvMetod(int zgolemiMemorija, int novHardDisk) {
		
		System.out.println("Memorijata bese " + this.memorija + "GB , sega iznesuva " + memorija +zgolemiMemorija + " GB.");
		System.out.println("Tipot na memorijata e " + tipNaMemorija + ".");
        System.out.println("HD ima golemina od " + novHardDisk + "GB. Prethodno iznesuvase " + this.hardDisk + " GB.");
		
	}	
	
	

}
