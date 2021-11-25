/*searching an element in given array(preferably finding first occurence)*/
import java.util.Scanner;
public class Search_element_inarray
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        String flag="true";
        int a[]=new int[30],n,element,i;
        System.out.println("enter n");
        n=input.nextInt();
        System.out.println("element");
        element=input.nextInt();
        System.out.println("elements");
        for(i=0;i<n;i++)
        {
         //   System.out.print("j");
            a[i]=input.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(a[i]==element)
            {
                System.out.println(i);
                flag="false";
                break;
            }
        }
        if(flag=="true")
        {
            System.out.println("No such element found");
        }
    }
}
