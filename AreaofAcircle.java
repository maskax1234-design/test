import java.util.*;

public class AreaofAcircle {
    public static void main(String []args){
        System.out.println("Enter height");
        Scanner input=new Scanner(System.in);
        double heigth=input.nextDouble();
        System.out.println("Enter Width");
        double width=input.nextDouble();
        double calculate= heigth*width;
        System.out.println("Area of a circle: "+calculate);
        
        

    }
}
