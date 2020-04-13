// Run -> Configurations... -> (오른쪽 탭) Arguments(x) -> VM Arguments -> '-ea' 입력

public class Main {
    private static boolean isNegativeInteger(int num)
    {
    	if( num < 0)
    		return true;
    	else
    		return false;
    }
    
    private static boolean isPositiveInterger(int num)
    {
    	if( num > 0)
    		return true;
    	else
    		return false;
    }

    public static void main(String[] args) {
        int num = -5;
        
        assert isPositiveInterger( num );
        
        if( isNegativeInteger(num))
        {
        	System.out.println("Only Input Positive Number");
        	System.exit(0);
        }
        
        System.out.println(num);
    }
}