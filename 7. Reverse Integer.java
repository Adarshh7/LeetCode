public class Reverse Integer {

	public static void main(String[] args) {
		int x=1534236469;
		long rev = 0;
        while(x != 0) {
            rev = rev * 10 + (x % 10);
            x /= 10;
        }
        if(rev > 2147483647||rev < -2147483647) {
            rev=0;
        }
        System.out.println(rev);
	}
