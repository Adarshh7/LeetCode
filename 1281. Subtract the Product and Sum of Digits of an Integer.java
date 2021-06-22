public class Subtract the Product and Sum of Digits of an Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=234;
int s=0,p=1,n1=1,r=0;
while(n>0)
{
    n1=n%10;
    n=n/10;
    s=s+n1;
    p=p*n1;
}
r=p-s;
System.out.println(r);

	}

}
