class OperatorOVERload { 
  
    void operator(String str1, String str2) 
    { 
        String s = str1 + str2; 
        System.out.println("Concatinated String : "+ s); 
    } 
  
    void operator(int a, int b) 
    { 
        int c = a + b; 
        System.out.println("Sum = " + c); 
    } 
} 
public class operatorOverloading {
	public static void main(String[] args) 
    { 
		OperatorOVERload obj = new OperatorOVERload(); 
        obj.operator(2, 3); 
        obj.operator("Prime ", "University"); 
    } 
}



