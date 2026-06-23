package fibonacci;

@SuppressWarnings("unused")
public class Calistir {
	public static void main(String[] args) {
		int sonuc = new Calistir().hesapla2(7);
		System.out.println(sonuc);
	}

	private int hesapla(int order) {
		if (order < 1) {
			throw new RuntimeException();
		}
		if (order == 1 || order == 2) {
			return 1;
		}

		return hesapla(order - 1) + hesapla(order - 2);
	}

	private int hesapla2(int order) {
		if (order < 1) {
			throw new RuntimeException();
		}
		if (order == 1 || order == 2) {
			return 1;
		}
		int birOnceki = 1;
		int ikiOnceki = 1;
		int siradaki = 0;
		for (int sira = 2; sira < order; sira++) {
			siradaki = birOnceki + ikiOnceki;
			ikiOnceki = birOnceki;
			birOnceki = siradaki;
		}
		return siradaki;
	}

}
