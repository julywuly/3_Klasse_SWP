package first_java_project;

public class Ganzzahlen {

	public static void main(String[] args) {
		int i = 130;
		byte b = (byte) i; // -128 - 127
		System.out.println(b); // 130->-126

		double d = 3.3554;
		float fc = (float) d;
		System.out.println(fc);
//1
		String s = "Text";
		int l = s.length();
		System.out.println(l);
//2
		int index = 200;
		if (index < s.length()) {
			char c = s.charAt(9);
			System.out.println(c);
		}
//3
		int pos = s.indexOf('x');
		System.out.println(pos);
//4
		pos = s.indexOf('e', pos++);
		System.out.println(pos);
//5
		String upper = s.toUpperCase();
		System.out.println(upper);
		String r = s.replace('e', 'x');
		System.out.println(r);
//6
		String sub = s.substring(1);
		System.out.println(sub);

	}
}
