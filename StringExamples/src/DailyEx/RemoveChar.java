import java.util.*;
public class RemoveChar {
			public static String charRemove(String s,char x)
			{
				s=s.replace(x, ' ');
				String res="";
				char ch[]=s.toCharArray();
				for(char c : ch) {
					if(c!=' ')
					{
						res=res+c;
					}
				}
				return res;
			}
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				System.out.print("Enter the string=");
				String str=sc.next();
				System.out.print("Enter the character to be removed= ");
				char ch=sc.next().charAt(0);
				System.out.printf("New String=",ch,charRemove(str,ch));
				
				sc.close();
			}

		}
	
