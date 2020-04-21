public class Main {
    public static boolean includeApabetL(String input)
    {
    	if(input.indexOf("l") > -1)
    		return true;
    	else
    		return false;
    }

    public static void main(String[] args) {
        String str = "Hi";
        
        if( includeApabetL( str ) == true)
        	System.out.println("포함되어 있음");
        else
        	System.out.println("포함되어 있지 않음");
        
        
        System.out.println(str);
    }
}