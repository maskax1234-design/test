import java.util.*;

public class main{
    public static void main(String[] args){
        System.out.println("Please Enter your ID");
        Scanner input=new Scanner(System.in);
        int StudentID=input.nextInt();
      
        System.out.println("Please Enter your StudentName");
        String StudentName =input.next();
        System.out.println("Please Enter your Amount");
        double Amount=input.nextDouble();

        System.out.println("Please Enter your Faculty ID");
        final  short facult_Id=input.nextShort();

        System.out.println("Your ID is: " + StudentID +"Your name is: "+StudentName+", also Amount is: "+Amount+" and facult_ID is: "+facult_Id);

    }
}