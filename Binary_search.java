/*Program to find element through binary search*/
import java.util.Scanner;
public class Binary_search
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        String flag="true",flag1="false";
        int a[]=new int[30],first,i,n,element,last,mid;// All declarations,intializations.
        System.out.println("enter n");
        n=input.nextInt(); //inputing array size
        System.out.println("element");
        element=input.nextInt(); // input element to search
        System.out.println("array elements"); 
        for(i=0;i<n;i++)
        {
            a[i]=input.nextInt(); //inputting array elements
        }
        //Alogorithm Operation to finding element
        first=0;
        last=n-1;
        while(first<=last)
        {
        	mid=(last+first)/2;
        	if(element==a[mid])
        	{
        		System.out.print(mid+" is the index found");
        		break;
        	}
        	else if(element>a[mid])
        	{
        		first=mid+1;
        	}
        	else
        	{
        		last=mid-1;
        	}
        }
    }
}
