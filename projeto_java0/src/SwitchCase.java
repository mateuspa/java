public class SwitchCase {
    public static void main(String[] args) {
		
        // Modo condicional switch/case sem break
        String plano = "T";

		switch (plano) {
			case "T": {
				System.out.println("5Gb Youtube");
			}
			case "M": {
				System.out.println("Whats e Intagram gratis");
			}
			case "B": {
				System.out.println("100 minutos de ligaçaao");
			}
            default:{
                System.out.println("");
            }
		}
	}
}