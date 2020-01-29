import java.util.*;
class two1
{
public static void main(String[] args)
{
int i=Integer.parseInt(args[0]);
Scanner sc=new Scanner(System.in);
if(i>0)
{
System.out.print(i+" is a positive");
}
else if(i<0)
{
System.out.print(i+" is a negetive");
}
else
{
 System.out.print("0 is neither negative or positive");
}
}
}