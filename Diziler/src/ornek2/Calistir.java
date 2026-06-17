package ornek2;

public class Calistir {
	public static void main(String[] args) {
		Liste<Integer> liste = new Liste<>();
		liste.add(3);
		liste.add(2);
		liste.add(1);
		liste.add(5);
		liste.add(3);
		liste.add(6);
		liste.add(8);
		System.out.println(liste.get(0));
		System.out.println(liste.get(1));
		System.out.println(liste.get(2));
		System.out.println(liste.get(3));
		System.out.println(liste.get(4));
		System.out.println(liste.get(5));
		System.out.println(liste.get(6));
		liste.clear();
		System.out.println("----------------");
		liste.addFirst(3);
		liste.addFirst(2);
		liste.addFirst(1);
		liste.addFirst(5);
		liste.addFirst(3);
		liste.addFirst(6);
		liste.addFirst(8);
		System.out.println(liste.get(0));
		System.out.println(liste.get(1));
		System.out.println(liste.get(2));
		System.out.println(liste.get(3));
		System.out.println(liste.get(4));
		System.out.println(liste.get(5));
		System.out.println(liste.get(6));
		liste.add(9, 3);
		System.out.println("--------------");
		for (int i = 0; i < liste.getCount(); i++) {
			System.out.println(liste.get(i));
		}

	}
}
