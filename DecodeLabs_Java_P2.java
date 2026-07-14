import java.util.Scanner;
import java.util.InputMismatchException;
public class DecodeLabs_Java_P2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String ask="";
        do{
            int subjectMarks;
            int totalSubject=0;
            int total=0;
            boolean valid=false;
            while(!valid){
                try{
                    System.out.print("Enter the total number of subject: ");
                    totalSubject=Integer.parseInt(scanner.nextLine());
                    if(totalSubject<=0){
                        System.out.println("Please enter a positive.");
                    }
                    else{
                    valid=true;
                    }
                } 
                catch(NumberFormatException e){
                System.out.println("Invalid input. Please enter a number.");
                }
            }
            int totalMarks=100*totalSubject;
            int counter=1;
            while(counter<=totalSubject){
                try{
                    System.out.print("Enter the marks of subject "+counter+": ");
                    subjectMarks=scanner.nextInt();
                    if(subjectMarks<0||subjectMarks>100){
                        System.out.println("Marks must be between 0 and 100.");
                        continue;
                    }
                    total+=subjectMarks;
                    counter++;
                }
                catch(InputMismatchException e){
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.nextLine();
                }
            }        
            double average=(double)(total*100)/totalMarks;
            System.out.println("Maximum marks:"+totalMarks);
            System.out.println("Obtain marks:"+total);
            System.out.printf("Percentage:%.2f%%",average);
            System.out.println();
            if(average>=90){
                System.out.println("You got A grade");
            }
            else if(average>=80){
                System.out.println("You got B grade");
            }
            else if(average>=70){
                System.out.println("You got C grade");
            }
            else if(average>=60){
                System.out.println("You got D grade");
            }
            else if(average>=50){
                System.out.println("You got E grade");
            }
            else{
                System.out.println("You have failed.");
            }
            do{
                System.out.print("Do you want to calulate again (yes/no):");
                ask=scanner.next().toLowerCase();
                if(!ask.equals("yes") && !ask.equals("no")){
                    System.out.println("Invalid input. Please type yes or no.");
                }
            }while(!ask.equals("yes")&&!ask.equals("no"));
            scanner.nextLine();
        }while(ask.equals("yes"));
        System.out.println("Calculator stopped.");
        scanner.close();
    }
}