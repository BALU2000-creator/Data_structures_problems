/*Program to find thr min and max in array*/
import java.util.Scanner;
public class Min_Max
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        String flag="true",flag1="false";
        int a[]=new int[30],i,min,n,max;// All declarations,intializations.
        System.out.println("enter n");
        n=input.nextInt(); //inputing array size
        System.out.println("array elements"); 
        for(i=0;i<n;i++)
        {
            a[i]=input.nextInt(); //inputting array elements
        }
        max=a[0];min=a[0];
        for(i=1;i<n;i++)
        {
        	if(a[i]>max)
        	{
        		max=a[i];
        	}
        	if(a[i]<min)
        	{
        		min=a[i];
        	}
        }
        System.out.println(min+" is the minimum in array and "+max+" is the maximum od the array"); // output
    }
}
