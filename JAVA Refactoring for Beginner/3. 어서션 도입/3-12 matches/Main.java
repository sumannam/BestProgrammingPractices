public class Main {
    public static boolean includeNumber(String input)
    {
    	if(input.matches(".*[0-9].*") )
    		return true;
    	else
    		return false;
    }

    public static void main(String[] args) {
        String str = " 나는 20살입니다.";
        
        if( includeNumber( str ) == true)
        	System.out.println("포함되어 있음");
        else
        	System.out.println("포함되어 있지 않음");
        
        
        System.out.println(str);
    }
}