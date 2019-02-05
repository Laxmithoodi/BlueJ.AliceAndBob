/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args ){
 
Scanner read =  new Scanner (System.in);
System.out.println ("Enter your name:" );

    String x = read.nextLine();
    if (((x.equals ("Alice")) || (x.equals ("Bob")))){
    
System.out.println("Hello my name " + x );

}
else 
System.out.println("I'm not Bob or Alice" );
  }  
}
