/*Count of Duplicates*/
import java.util.Scanner;
public class Duplicate
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        String flag="true";
        int a[]=new int[30],n,element,count=0,i,j,k,arr_elem;  // All declarations,intializations.
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
                        break;              
                    }
                }
            }
            else
            {
                flag="true";
                continue;
            }
        }
        System.out.println(count+" are the number of duplicates"); //Prints count of duplicates
    }
}
