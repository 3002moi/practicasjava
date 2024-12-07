package extructurasdedatos;

import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lista=new ArrayList<>();
		lista.add("hertor");
		lista.add("carlos");
		lista.add("moises");
		lista.add("raul");
		lista.add("ramiro");
		lista.add("rigo");
		lista.add("daniel");
		lista.add("hector");
		lista.add("vivi");
		lista.add("monze");
		System.out.println("el nombre es:  "+ lista.get(7));
	for (int i=0; i<lista.size();i++) {
		System.out.println("el nombre por lista   es:  "+ lista.get(i));
		boolean esigual= lista.get(i).equalsIgnoreCase("hector");
		System.out.println("el nombre es igual = "+esigual);
	}
	 System.err.println("+++++++++++++++++++++++++++++++++");
	lista.removeAll(lista);
	for (int i=0; i<lista.size();i++) {
		System.out.println("el nombre por lista   es:  "+ lista.get(i));
		boolean esigual= lista.get(i).equalsIgnoreCase("hector");
		System.out.println("el nombre es igual ="+esigual);
	}
	
	}
}
