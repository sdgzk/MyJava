// 判断一个整数是否是回文数。不能使用辅助空间。
public class HuiWen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HuiWen t = new HuiWen();
		boolean s = t.isPalindrome(1);
		System.out.println(s);
		boolean s1 = t.isPalindrome1(12321);
		System.out.println(s1);
	}
    public boolean isPalindrome(int x) {
    	//boolean b = false;
//    	boolean negative  = x < 0;
    	int p =x;
        if(x <0) return false;
        long r = 0;  
        while (x>0) {  
            r = r * 10 + x % 10;  
            x /= 10;  
        }  
//        if (negative) r = -r;  
        if (r > Integer.MAX_VALUE || r < Integer.MIN_VALUE) return false;  
        
        if (r==p) {
        	return true;
        }
        
        
        return false;   
    }
    
    public boolean isPalindrome1(int x) {
        int a = x, h = 1;

        if (a < 0) return false;

        while (a / h >= 10) {
            h = h * 10;
        }

        while (a > 0) {
            if (a / h != a % 10) return false;
            a = a % h;
            a = a / 10;
            h = h / 100;
        }

        return true;
    }

}
