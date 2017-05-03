package main;

import java.util.*;

import models.*;

public class main  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		ListaOrdenadaGenerica l1 = new ListaOrdenadaGenerica(6);
		ListaOrdenadaGenerica l2 = new ListaOrdenadaGenerica(2);
		ListaOrdenadaGenerica l3 = new ListaOrdenadaGenerica(4);
		ListaOrdenadaGenerica l4 = new ListaOrdenadaGenerica(3);
		
		ArrayList<ListaOrdenadaGenerica> miLista =new ArrayList <ListaOrdenadaGenerica>();
	
		miLista.ensureCapacity(100);
		
		miLista.add(l1);
		miLista.add(l2);
		miLista.add(l3);
		miLista.add(l4);
	

		for (ListaOrdenadaGenerica l: miLista){
			System.out.println(l.toString());
		
		
		}
		
	}

}
