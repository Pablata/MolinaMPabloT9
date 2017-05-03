package models;

public class ListaOrdenadaGenerica implements Comparable<ListaOrdenadaGenerica> {


	protected int comparador;

	
	public int getComparador() {
		return comparador;
	}

	public void setComparador(int comparador) {
		this.comparador = comparador;
	}

	public ListaOrdenadaGenerica(int comparador) {
		super();
		this.comparador = comparador;
		
	}

	@Override
	public String toString() {
		return "ListaOrdenadaGenerica [comparador=" + comparador + " ]";
	}

	@Override
	public int compareTo(ListaOrdenadaGenerica arg0) {
		// TODO Auto-generated method stub
		return 0;
	}



}