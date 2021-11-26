/*finding first index of the element that is greater than or equal to given element*/
import java.util.Scanner;
public class First_index_cond
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        String flag="true",flag_occ="true";
        int a[]=new int[30],n,element,count=1,i,j,k,arr_elem;  // All declarations,intializations.
        System.out.println("enter n");
        n=input.nextInt(); //inputing array size
        System.out.println("enter element");
        element=input.nextInt();//inputing element
        System.out.println("elements"); 
        for(i=0;i<n;i++)
        {
            a[i]=input.nextInt(); //inputting array elements
        }
        //Alogorithm Operation finding count of duplicates
        for(i=0;i<n;i++)
        {
        	if(element<=a[i])
        	{
        		System.out.println(i+" is the index");
        		break;
        	}       	
        }
    }
}
