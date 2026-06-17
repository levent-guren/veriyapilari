package ornek1;

public class Calistir2 {
	public static void main(String[] args) {
		int[][] x = new int[3][];
		x[0] = new int[2];
		x[1] = new int[3];
		x[2] = x[0];
		x[1][1] = 2;
		x[2][0] = 3;
		System.out.println(x[0][0]);
		System.out.println(x[1].length);
		x = new int[2][2];
		x[1] = x[0];
		x[0] = null;
		System.out.println(x[1][1]);
		System.out.println(x[0]);
		System.out.println(x[1]);
	}
}
