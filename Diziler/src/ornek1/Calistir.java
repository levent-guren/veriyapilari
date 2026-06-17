package ornek1;

public class Calistir {
	public static void main(String[] args) {
		int[] x = new int[4];
		x[0] = 2;
		x[1] = x[0] + 3;
		System.out.println(x.length);
		System.out.println(x[1]);
		String[] isimler = new String[2];
		isimler[0] = "Ali";
		x[2] = isimler[0].length();
		System.out.println(isimler[1]);
		System.out.println(isimler);
		if ("Ali" == "Ali") {
			System.out.println("Eşittir");
		} else {
			System.out.println("Eşit değildir");
		}
		System.out.println("-------------");
		String a = "Ali";
		String b = "A" + "li";
		if (a == b) {
			System.out.println("Eşittir");
		} else {
			System.out.println("Eşit değildir");
		}
		if (a == new String(b)) {
			System.out.println("Eşittir");
		} else {
			System.out.println("Eşit değildir");
		}
	}
}
