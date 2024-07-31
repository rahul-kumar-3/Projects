import java.util.Scanner;
public class StudentGardeCalculater {
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome! to Student Grade Calculater.");
        System.out.println("Enter the number of subjects : ");
        int numOfSubjects = sc.nextInt();
        int maxMarks = 100;
        double totalMarks = 0;
        String grade;
        if(numOfSubjects <= 0){
            System.out.println("Inavlid input , Please enter valid number of subjects. It should be greater than 0.");
        }
        else{
        for(int i = 1; i <= numOfSubjects; i++){
            System.out.println("Enter the marks obtain in subject "+i+" out of 100.");
            double obtainMarks = sc.nextDouble();

            if(obtainMarks < 0 ||obtainMarks > maxMarks){
                System.out.println(" Obtain marks should be in th range of 1 to 100 , Please enter valid obtain marks.");
                i--;
            }else{
            totalMarks += obtainMarks;
            }
        }
        double avgPercentage = totalMarks / numOfSubjects;
        System.out.println("Your total Marks is "+totalMarks+".");
        System.out.println("Your Average Percentage is "+avgPercentage+"%.");
        if(avgPercentage >= 90){
            grade ="A+";
        }
        else if(avgPercentage >= 80){
            grade = "A";
        }
        else if(avgPercentage >= 70){
            grade ="B";
        }
        else if(avgPercentage >= 60){
            grade = "C";
        }
        else if(avgPercentage >= 50){
            grade ="D";
        }
        else {
            grade ="F";
        }
        System.out.println("Your Grade is "+grade+".");
    }
    }
}

