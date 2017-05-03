package models;

import java.util.Comparator;

public class ListaOrdenadaComparator implements Comparator<ListaOrdenadaGenerica> {

	
	

	@Override
	public int compare(ListaOrdenadaGenerica n1, ListaOrdenadaGenerica n2) {
		return (n1.getComparador() - n2.getComparador());

		 
	}

}