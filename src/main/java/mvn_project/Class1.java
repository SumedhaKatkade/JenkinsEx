package mvn_project;

public class Class1 {

	public static void main(String[] args) {
		System.out.println("Program to multiply odd array index by 10");
		int a[] = { 11, 22, 33, 44 };
		for (int i = 1; i < a.length; i = i + 2) {
			a[i] = a[i] * 10;
		}
		System.out.println("Updated array");
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j] + " ");
		}

	}

}
