/*searching an element in given array(preferably finding first occurence)*/
import java.util.Scanner;
public class Duplicate
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        String flag="true";
        int a[]=new int[30],n,element,count=0,i,j,k,elm;
        System.out.println("enter n");
        n=input.nextInt();
        System.out.println("elements");
        for(i=0;i<n;i++)
        {
            a[i]=input.nextInt();
        }
        for(i=1;i<n;i++)
        {
            elm=a[i];
            for(j=0;j<i;j++)
            {
                if(elm==a[j])
                {
                    flag="false";
                }
            }
            if(flag=="true")
            {
                for(k=i+1;k<n-1;k++)
                {
                    if(elm==a[k])
                    {
                        count+=1;                        
                    }
                }
            }
            else
            {
                flag="true";
                continue;
            }
        }
        System.out.println(count+1);
    }
}
