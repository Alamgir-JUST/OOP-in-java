
public class EncapsulationEx {//Main Class

	public static void main(String[] args) {
			capsulate std1 = new capsulate();
			std1.setName("Mr. X");
			std1.setRoll(140126);
			std1.setCgpa(3.50);
			
			System.out.println("Name: "+std1.getName());
			System.out.println("ROll: "+std1.getRoll());
			System.out.println("Cgpa: "+std1.getCgpa());
	}
}
