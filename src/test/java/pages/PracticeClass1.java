package pages;

public class PracticeClass1 {

	public static void main(String[] args) {
		System.out.println("Automation Testing");

		PracticeClass1 tester = new PracticeClass1();
		PracticeClass1 developer = new PracticeClass1();
		
		tester.seleniumTesting();
		tester.playWrightTesting();
		developer.javaDeveloper();
		developer.pythonDeveloper();
		tester.apiTesting();
		tester.mobileTesting();

	

	}

	public void seleniumTesting() {
		System.out.println("Automation Testing1");
	}

	public void playWrightTesting() {
		System.out.println("Automation Testing2");
	}

	public void javaDeveloper() {
		System.out.println("Automation Testing3");
	}

	public void pythonDeveloper() {
		System.out.println("Development Python Basics");
	}
	public void mobileTesting() {
		System.out.println("Software will be tested by using Appium");
	}
	
	public void apiTesting() {
		System.out.println("API Will be tested by using Rest Assured");
	}
}
