import java.util.*;
class hrincred
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            long s=0,flag=0;
            int []arr=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
                s+=arr[i];
            }
            double avg=(double)s/n;
            for(int j=0;j<n;j++)
            {
                double average=(double)(s-arr[j])/(n-1);
                if(average==avg)
                {
                    flag=1;
                    System.out.println(j+1);
                    break;
                }
            }
            if(flag==0)
            System.out.println("Impossible");
        }
    }
   }
            
            
            
   
