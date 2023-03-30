package org.sam;

public class Sample {

	private void employee() {
		String name = "nisar";
		System.out.println(name);
	}

	private void employeeAddress(String Add) {
		System.out.println(Add);
	}

	public static void main(String[] args) {
		Sample s = new Sample();
		s.employeeAddress("Trichy");
	}

	private void employeeName(String name1, String name2) {
		name1 = "nandy";
		name2 = "priyanka";
		System.out.println(name1 + "/n" + name2);

	}

	private void employeeId() {
		int num = 1384;
		System.out.println(num);
	}

}
