package extructurasdedatos;

public class Arreglos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] diasemana = { "lunes", "martes", "mircoles", "jueves", "viernes", "sabado", "domingo" };
		System.out.println(diasemana[1]);

		String[] diasemana2 = new String[7];
		diasemana2[5] = "viernes";
		System.out.println(diasemana2[5]);
		System.out.println(diasemana2.length);

		for (int i = 0; i < diasemana.length; i++) {
			System.out.println("el dia de la semana es = " + diasemana[i]);
		}
		System.out.println("**************************************************");
		for (int i = 0; i < diasemana2.length; i++) {
			System.out.println("el dia de la semana es = " + diasemana2[i]);
		}	
		System.out.println("**************************************************");
		for (int i = 0; i < diasemana.length; i++) {
		 diasemana2[i]=diasemana[i];
		}
		 System.err.println("+++++++++++++++++++++++++++++++++");
		 for (int i = 0; i < diasemana2.length; i++) {
				System.out.println("el dia de la semana es = " + diasemana2[i]);
			}	
	}

}
