
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first=0,second=0;
        int amount;


        while (true) {

            System.out.println("First: "+first+"/100");
            System.out.println("Second: "+second+"/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] partes=input.split(" ");
            amount=Integer.valueOf(partes[1]);
            switch (partes[0]){
                case "add":
                    if(first+amount>100)
                        first=100;
                    else
                        first+=amount;
                 break;   
                case "remove":
                    if(second-amount<0)
                        amount=second;
                    second-=amount;
                 break;   
                case "move":
                    if(first-amount<0 || first==0)
                        amount=first;
                    second+=amount; 
                    first-=amount;
                 break;   
            }
            

        }
    }
   

}
