/*Count of Unique elements with out using any builtins*/
import java.util.Scanner;
public class Unique
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        String flag="true",flag1="false";
        int a[]=new int[30],n,element,count=0,c=0,i,j,k,arr_elem;  // All declarations,intializations.
        System.out.println("enter n");
        n=input.nextInt(); //inputing array size
        System.out.println("elements"); 
        for(i=0;i<n;i++)
        {
            a[i]=input.nextInt(); //inputting array elements
        }
        //Alogorithm Operation finding count of Uniques
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
                        flag1="true";
                        break;
                    }
                }
                if(flag1=="false")
                {
                	c+=1;
                }
                else
                {
                	flag1="false";
                }    
            }
            else
            {
                flag="true";
                continue;
            }
        }
        System.out.println(count+c+" are the number of uniques"); //Prints count of uniques
    }
}
