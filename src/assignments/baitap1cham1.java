package assignments;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Scanner;

public class baitap1cham1 {

    public static void main(String[] args) {
        Scanner ah = new Scanner(System.in);
        System.out.print("Enter fullName: ");
        String name = ah.nextLine();

        System.out.print("Enter Age: ");
        int age = ah.nextInt();

      
        String dateOfBirth = ah.nextLine();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        df.setLenient(false);
        Date date = null;
    while(true){
      System.out.print("Enter dateOfBirth (dd/MM/yyyy): ");
      ah.nextLine();
      
        try {
           date = df.parse(dateOfBirth);
           break ;
        } catch (ParseException e) {
            System.out.println("Invalid date.Please enter again.");
            return ;
 }
}
 
        System.out.print("Enter Sex: ");
        String sex = ah.next();

        System.out.print("Enter specialized field: ");
        ah.nextLine();
        String specialized = ah.nextLine();

        System.out.print("Enter GPA: ");
        double GPA = ah.nextDouble();

        System.out.print("Enter Hometown: ");
        ah.nextLine();
        String hometown = ah.nextLine();

        System.out.println("\nOutput of Information!");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("DateOfBirth (dd/MM/yyyy): " + df.format(date));
        System.out.println("Sex: " + sex);
        System.out.println("Specialized: " + specialized);
        System.out.println("GPA: " + GPA);
        System.out.println("Hometown: " + hometown);
    }
}
