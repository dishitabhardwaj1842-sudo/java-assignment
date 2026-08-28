import java.util.Scanner;
public class file{
    public static void main(String[] avgs){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter student's name:");
    String name = sc.next();
    System.out.println("Enter marks in Maths:");
    int maths_marks= sc.nextInt();
    System.out.println("Enter marks in English:");
    int english_marks= sc.nextInt();
    System.out.println("Enter marks in Science:");
    int science_marks= sc.nextInt();
    int total_marks= maths_marks+english_marks+science_marks;
    int avg_marks=total_marks/3;
    if(total_marks>40){
        System.out.println("Pass");
    }
    else{
        System.out.println("Fail");
    }
    if(total_marks>90){
        System.out.println("Distinction");
    }
    if(total_marks>95){
        System.out.println("Special award deserving student");
    }
    System.out.println("The final result is:"+ total_marks);
    






    





    


}
}