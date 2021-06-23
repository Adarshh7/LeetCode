public class Reverse String {

 public static void main(String[] args) {
 char s[]= {'h','e','l','l','o'};
 StringBuilder str=new StringBuilder();
 for(int i=0;i<s.length;i++)
 {
 	str.append(s[i]);	
 }
 str=str.reverse();
 String x=str.toString();
 char s1[] = x.toCharArray();
 for(int i=0;i<s.length;i++)
 {
	 s[i]=s1[i];
 }
 for(int i=0;i<s.length;i++)
 {
	 System.out.print(s[i]);
 }
 
	}
