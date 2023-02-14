import java.io.*;
public class food {
    public static void main (String[]args)throws IOException
    {
        String x;
        BufferedReader br;
        br=new BufferedReader (new InputStreamReader(System.in) );


        System.out.println("based on your wish we can provide all the foods...mension it (morning-breakfast/afternoon-lunch/evening-dinner) ");
        x=br.readLine();
        if(x=="morning")
        {
            System.out.println("dosa,vada,idiyaapam");
        }
        else    if(x=="afternoon")
        {
            System.out.println("sambar,rasam,karakolambu");
        }
        else{
            System.out.println("parotta,kurma,omlete");
        }
    }
    
}
