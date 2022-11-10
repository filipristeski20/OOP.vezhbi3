package vezhbabroj1;

public class MainClass {
	public static void main(String[] Args) {
		Avtomobil av = new Avtomobil("Toyota","Corolla","Bela", 15000, 2002, "bt-001-AA");
		av.prvMetod();
		System.out.println(av.vtorMetod());
	}

}
