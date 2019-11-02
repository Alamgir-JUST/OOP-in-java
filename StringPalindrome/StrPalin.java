package StringPalindrome;
class PalinCheker{  
	public static boolean isPalindrome(String str){  
	    StringBuilder sb=new StringBuilder(str);  
	    sb.reverse();  
	    String rev=sb.toString();  
	    if(str.equals(rev)){  
	        return true;  
	    }else{  
	        return false;  
	    }  
	}  
}  
public class StrPalin {

	public static void main(String[] args) {
		System.out.println(PalinCheker.isPalindrome("MADAM"));
		System.out.println(PalinCheker.isPalindrome("Prime"));
	}

}

