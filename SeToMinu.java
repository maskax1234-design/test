import  java.util.*;
public class SeToMinu {
    public static void main(String[] args){
        System.out.println("Please Enter number of seconds");
        Scanner input=new Scanner(System.in);
        int second=input.nextInt();

       int Minu= second /60;
       int reminder= second%60;
       System.out.println( Minu +" minutes & "  +reminder+" seconds");

    }
}
