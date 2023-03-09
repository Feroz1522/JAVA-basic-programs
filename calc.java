import java.io.*;

public class calc {
    public static void main (String[]args)throws IOException
    {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int a,b;
    
    System.out.println("enter the value of a");
    a=Integer.parseInt(br.readLine());
   
    System.out.println("enter the value of b");
    b=Integer.parseInt(br.readLine());
    
    System.out.println("enter the method which u need to intialize in your program \n 1.add \n 2.sub \n 3.mul \n 4.div ");
    int ch=Integer.parseInt(br.readLine());
    
    int d;
    
    switch( ch)
    {
        
        case 1:
           d= a+b;
           System.out.println("the answer is"+ d);
            break;
        
        case 2:
           d= a-b;
           System.out.println("the answer is" + d);
           break;

        case 3:
           d= a*b;
           System.out.println("the answer is" + d);
        b   break;
        
        case 4:
            d=a/b;
            System.out.println("the answer is" + d);
            break;


    }   
    }
}
