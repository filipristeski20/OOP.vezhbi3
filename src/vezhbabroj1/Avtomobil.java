package vezhbabroj1;

public class Avtomobil {
	public String marka;
	public String model;
	public String boja;
	public double pominatiKm;
	public int godinaNaProzivodstvo;
	public String registracija;
	
	public Avtomobil(String marka, String model, String boja, double pominatiKm, int godinaNaProzivodstvo, String registracija) {
		this.marka=marka;
		this.model=model;
		this.boja=boja;
		this.pominatiKm=pominatiKm;
		this.godinaNaProzivodstvo=godinaNaProzivodstvo;
		this.registracija=registracija;
		
	}
	
	public void prvMetod() {
		System.out.println(this.marka+","+this.model+","+this.boja);
	}
	
	public double vtorMetod() {
		double pKm;
		pKm=this.pominatiKm + 1520.25;
		return pKm;
	}
}
