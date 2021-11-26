/*Program to find the frequency of
*/
import java.util.Scanner;
public class Frequency
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        String flag="true",flag1="false";
        int a[]=new int[30],i,key,min,max,n,c=0;;// All declarations,intializations.
        System.out.println("enter n");
        n=input.nextInt(); //inputing array size
        System.out.println("enter key");
        key=input.nextInt();
        System.out.println("array elements"); 
        for(i=0;i<n;i++)
        {
            a[i]=input.nextInt(); //inputting array elements
        }
        max=a[0];
        min=a[0];
        for(i=0;i<n;i++)
        {
        	if(key==a[i])
        	{
        		c+=1;
        	}
        }
        System.out.println(c+ " is the frequency of " +key+" in the array"); // output
    }
}
