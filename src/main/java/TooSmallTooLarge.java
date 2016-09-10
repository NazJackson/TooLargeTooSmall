import java.util.Scanner;

/**
 * Created by nazhirjackson on 9/9/16.
 */
public class TooSmallTooLarge {

    int count = 0;
    Scanner ask =new Scanner(System.in);
    int num;
    public void ask(){

        System.out.println("Pick A Numbaaaa any Numbaaa (Between 1 & 10 tho Man)");
        num = ask.nextInt();
        ask.nextLine();
    }
    public String determine() {

        String yesNo = " ";
        int secretNum;
        secretNum = 1 + (int)(Math.random() * 10);
        int previous = 0;

        while(num != secretNum){

            if (num == secretNum) {
                yesNo = "yes";
                previous = num;

            }
            else {
                yesNo = "No";
                System.out.print("Nope Try again Man ");
                if(num > secretNum){
                    System.out.println("It Was Too Large Bruh");
                }
                else{
                    System.out.println("It Was Too small Bruh");
                }

                ask();

            }
            if(num != previous){
                count++;
            }
            previous = num;


        }
        return yesNo;
    }
    public void results(){
        System.out.println("Cool you found it in " + count + " tries");
    }




    public static void main(String[] args) {
        TooSmallTooLarge n = new TooSmallTooLarge();
        n.ask();
        n.determine();
        n.results();

    }
}
