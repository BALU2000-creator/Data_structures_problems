/*Count of Duplicates and their values*/
import java.util.Scanner;
public class Duplicate_frequency
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        String flag="true",flag_occ="true";
        int a[]=new int[30],n,element,count=1,i,j,k,arr_elem;  // All declarations,intializations.
        System.out.println("enter n");
        n=input.nextInt(); //inputing array size
        System.out.println("elements"); 
        for(i=0;i<n;i++)
        {
            a[i]=input.nextInt(); //inputting array elements
        }
        //Alogorithm Operation finding count of duplicates
        for(i=0;i<n;i++)
        {
            arr_elem=a[i];
            for(j=0;j<i;j++)
            {
                if(arr_elem==a[j])
                {
                    flag="false";
                }
            }
            if(flag=="true")
            {
                for(k=i+1;k<n;k++)
                {
                    if(arr_elem==a[k])
                    {
                        count+=1; 
                        flag_occ="false";      
                    }
                }
            }
            else
            {
                flag="true";
                continue;
            }
            if(flag_occ=="false")
            {
            	flag_occ="true";
            	System.out.println(arr_elem+" occured "+count+" times");
            	count=1;
            }
        }
    }
}
