
public class BubbleSortApp {

	public static void main(String[] args) {
		
		int maxSize = 100; //rozmiar tablicy
		ArrayBub arr; //referencja do tablicy
		arr = new ArrayBub(maxSize); //tworzymy tablice
		
		arr.insert(77); //wstawiamy 10 elementow
		arr.insert(99);
		arr.insert(44);
		arr.insert(55);
		arr.insert(22);
		arr.insert(88);
		arr.insert(11);
		arr.insert(00);
		arr.insert(66);
		arr.insert(33);
		
		arr.display(); // wypisujemy je
		
		arr.bubbleSort(); //sortujemy bombelkowo
		
		arr.display();
	}

}
