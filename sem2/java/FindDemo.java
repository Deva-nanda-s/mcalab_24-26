import java.util.Scanner;
class NegException extends Exception{
    public NegException(String msg){
        super(msg);
    }
}

class Find{
    public static void findAvg(int sum,int count){
        if(count>0){
            System.out.println("Average:"+sum/(double)count);
        }
        else
        {
           System.out.println("no pos nums entered");
           }
    }
}

public class FindDemo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int count=0;

        System.out.println("Enter limit:");
        int n=sc.nextInt();
        
        for(int i=1;i<=n;i++){
            while(true){
                try{
                System.out.println("Enter integer to add:");
                int num=sc.nextInt();
                if(num<0){
                    throw new NegException("Neg numbers cannot be added");
                }
                 sum+=num;
                 count++;
                 break;
                }
                catch(NegException e){
                    System.out.println(e.getMessage());
                }
                }
        }
    Find.findAvg(sum,count);
    sc.close();
}}