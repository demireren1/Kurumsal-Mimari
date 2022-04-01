package intro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Don't repeat yourself
		// camelCase 
		
		String internetSubeButonu = "Ýnternet Þubesi";
		double dolarDun = 8.20;
		double dolarBugun = 8.20;
		int vade = 36; 
		boolean dustuMu = false;
		
		
		System.out.println(internetSubeButonu);
		
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar düþtü resmi");
		}else if(dolarBugun>dolarDun) {
			System.out.println("Dolar yükseldi resmi");
		}
		else {
			System.out.println("Dolar eþittir resmi");
		}
		
		String kredi1="Hýzlý Kredi";
		String kredi2="Mutlu emekli kredisi";
		String kredi3="Konut kredisi";
		String kredi4="Çiftçi kredisi";
		String kredi5="Msb kredisi";
		
		System.out.println(kredi1);
		
		String[] krediler = {"Hýzlý Kredi","Zurna Kredi",};
		
		
		for(String kredi: krediler) {
			System.out.println(kredi);
		}
		
		
		for(int i=0; i<krediler.length;i++) {
			System.out.println(krediler[i]);
		}
		
		
		
	}

}
