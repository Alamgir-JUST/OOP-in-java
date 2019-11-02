
public class ParameterConstructor {
	int stu_ID;
	String stu_Name;

	public ParameterConstructor(int id, String name) {
		stu_ID = id;
		stu_Name = name;
	}
	public static void main(String[] args) {
		ParameterConstructor student = new ParameterConstructor(140124, "Alamgir Hossain");
	    System.out.println("ID: "+student.stu_ID + ", Name: " + student.stu_Name);
	}
}

