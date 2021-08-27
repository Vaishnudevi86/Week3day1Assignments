package week3.day1;

public class Students {
	public void getStudentsInfo(int id) {
		System.out.println("Calling method 1    " + id);
	}

	public void getStudentsInfo(int id, String name) {
		System.out.println("Calling method 2   " + id + "  Name is   " + name);
	}

	public void getStudentsInfo(int id, String name, String email, long phNo) {
		System.out.println("Calling method 3   " + id + "  Name is  " + name + "  email id is   " + email
				+ "   Phone no is  " + phNo);
	}

	public static void main(String[] args) {

		Students studObj = new Students();
		studObj.getStudentsInfo(3556);
		studObj.getStudentsInfo(2456, "Vaishnu");
		studObj.getStudentsInfo(367, "Devi ", "devivaishnu@gmail.com", 9068586889L);
	}

}
