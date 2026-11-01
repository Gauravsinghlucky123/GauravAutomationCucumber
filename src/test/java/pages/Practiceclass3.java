package pages;

public class Practiceclass3 {

	public static void main(String[] args) {

		Practiceclass3 p = new Practiceclass3();
//		p.revershString();
//		p.stringre1();
//		p.string2();
//		p.String3();
//		p.string4();
//		p.string5();
//		p.string6();
//		p.string7();
//		p.string8();
//		p.string9();
//		p.trimString();

//		p.concadination();
//		p.methodsubString();
//		p.methodSubstring1();
//		p.methodSubstring2();
//		p.methodSubstring3();
		
		p.stringmanupulate();

	}

	public void revershString() {

		String s = "Anupama";

		String rev = "";

		int len = s.length();

		for (int i = len - 1; i >= 0; i--) {

			rev = rev + s.charAt(i);

		}
		System.out.println(rev);

	}

	public void stringre1() {

		String a = "saurabh";
		String rev = "";

		int snum = a.length();

		for (int i = snum - 1; i >= 0; i--) {

			rev = rev + a.charAt(i);
		}
		System.out.println(rev);

	}

	public void string2() {

		String b = "Aarav Singh";

		String rev = "";

		int num2 = b.length();
		for (int i = num2 - 1; i >= 0; i--) {
			rev = rev + b.charAt(i);

		}
		System.out.println(rev);

	}

	public void String3() {
		String c = "Deepak patel";
		String rev = "";

		int num3 = c.length();
		System.out.println(num3);
		for (int i = num3 - 1; i >= 0; i--) {
			rev = rev + c.charAt(i);

		}
		System.out.println(rev);

	}

	public void string4() {

		String d = "Rajdeepyadev";

		String rev = "";

		int num4 = d.length();

		System.out.println(num4);

		for (int i = num4 - 1; i >= 0; i--) {

			rev = rev + d.charAt(i);

		}
		System.out.println(rev);

	}

	public void string5() {
		String e = "Abhishek singh";
		String rev = "";

		int num5 = e.length();
		System.out.println(num5);

		for (int i = num5 - 1; i >= 0; i--) {

			rev = rev + e.charAt(i);

		}

		System.out.println(rev);

	}

	public void string6() {

		String f = "Digvijay Singh";
		String rev = "";

		int num6 = f.length();

		System.out.println(num6);

		for (int i = num6 - 1; i >= 0; i--) {

			rev = rev + f.charAt(i);

		}

		System.out.println(rev);

	}

	public void string7() {

		String g = "V Link";

		String rev = "";

		int num7 = g.length();

		System.out.println(num7);

		for (int i = num7 - 1; i >= 0; i--) {

			rev = rev + g.charAt(i);

		}

		System.out.println(rev);

	}

	public void string8() {

		String h = " Shivam Singh";
		String rev = "";

		int num8 = h.length();
		System.out.println(num8);

		for (int i = num8 - 1; i >= 1; i--) {

			rev = rev + h.charAt(i);

		}
		System.out.println(rev);

	}

	public void string9() {

		String j = "Ajay Singh";

		String rev = "";

		int num9 = j.length();
		System.out.println(num9);

		for (int i = num9 - 1; i >= 0; i--) {

			rev = rev + j.charAt(i);

		}

		System.out.println(rev);

	}

	public void trimString() {

		String x = "Trade India";

		String rev = "";

		int num0 = x.length();

		System.out.println(num0);

		for (int i = num0 - 1; i >= 0; i--) {

			rev = rev + x.charAt(i);

		}
		System.out.println(rev);

	}

	public void concadination() {

		String a = "hello";
		String b = "word";
		int c = 20;
		int d = 30;

		System.out.println(a + b + c + d);

	}

	public void methodsubString() {

		String a = "Automation";

		String b = a.substring(0, 5);

		System.out.println(b);

	}

	public void methodSubstring1() {

		String a = "Automation";

		String b = a.substring(5);

		System.out.println(b);
	}

	public void methodSubstring2() {

		String a = "Hello word";

		String b = a.substring(0, 5);

		System.out.println(b);

	}

	public void methodSubstring3() {

		String a = "Hello word";

		String b = a.substring(5);

		System.out.println(b);
	}

	public void stringmanupulate() {
		
		String a = "hello";
		String b = "word";
		
	     a = a+b;
		 
     b = 	a.substring(0 , a.length()- b.length());
     System.out.println(b);
     
     a= a.substring(b.length());
     
     System.out.println(a);
     
	
		}
	
	
}
