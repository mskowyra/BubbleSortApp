
public class ArrayBub {

	private long[] a;
	private int nElems;
	
	//konstruktor, tworzymy tablice, na razie brak elementów
	public ArrayBub(int max)
	{
		a = new long[max];
		nElems = 0;
	}
	
	public void insert(long value) //wstawianie elementu do tablicy
	{
		a[nElems] = value;
		nElems++;
	}
	
	public void display() //wypisuje wartosc tablicy
	{
		for(int j=0; j<nElems; j++) //dla kazdego lementu...
			System.out.print(a[j] + " "); //..wypisujemy jego wartosc
		System.out.println("");
	}

	public void bubbleSort()
	{
		int out;
		int in;
		
		for(out=nElems-1 ; out>1 ; out--)
			for(in=0 ; in<out ; in++)
				if( a[in] > a[in+1] ) //z³a kolejnoœæ?
					swap(in, in+1);   // no to zmiana
	}
	
	private void swap(int one, int two){  //metoda zamiany
		long temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}

}
