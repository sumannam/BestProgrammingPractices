// 문제: 정수를 입력 받고 그 정수가 음수인지 검사하시오.
// 음수이면 "Only Input Positive Number" 출력
// 양수이면 입력 값 출력

public class Main {
    private static boolean isNegativeInteger(int num)
    {
    	if( num < 0)
    		return true;
    	else
    		return false;
    }

    public static void main(String[] args) {
        int num = -5;
      
        if( isNegativeInteger(num))
        {
        	System.out.println("Only Input Positive Number");
        	System.exit(0);
        }
        
        System.out.println(num);
    }
}