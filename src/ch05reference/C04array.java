package ch05reference;

public class C04array {
	public static void main(String[] args) {
		int a = 5;
		int b = a;
		
		System.out.println(a);
		System.out.println(b);
		
		int[] c = { 3, 4, 5 };
		int[] d = c;
		
		System.out.println(d[1]);
		
		c[2] = 55;
		System.out.println(c[2]);
		System.out.println(d[2]);
	}
}
