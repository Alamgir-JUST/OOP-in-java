class first //First Class
{ 
    public void print_prime() 
    { 
        System.out.println("Prime"); 
    } 
} 
class second extends first //Second class inherit First class
{ 
    public void print_university() 
    { 
        System.out.println("University"); 
    } 
} 
class third extends first //Third class inherit second class
{
	public void print_bangladesh() 
    { 
        System.out.println("Bangladesh"); 
    } 
}
public class MainClass { //Main Class
	public static void main(String[] args) {
		second sec_obj = new second();
		sec_obj.print_prime();
		sec_obj.print_university();
		third thr_obj = new third(); 
		thr_obj.print_prime(); 
		thr_obj.print_bangladesh();
	}
}
