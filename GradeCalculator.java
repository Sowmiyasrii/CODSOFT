import java.util.Scanner;
public class GradeCalculator{
 public static void main(String [] args){
float avg,total;
char grade;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Data Structures mark:");
int ds=sc.nextInt();
System.out.println("Enter the Computer networks  mark:");
int cn=sc.nextInt();
System.out.println("Enter the Cyber Security mark:");
int cs=sc.nextInt();
System.out.println("Enter the Web programming mark:");
int wp=sc.nextInt();
System.out.println("Enter the programming in c mark:");
int pc=sc.nextInt();
System.out.println("Enter the Theory of computations mark:");
int toc=sc.nextInt();
total=ds+cn+cs+wp+pc+toc;
System.out.println("Total marks obtained by the student:"+total);
avg=total/6;
System.out.println("Average mark:"+String.format("%.2f", avg));
if(avg>90){
System.out.println("the student obtained 'O' grade");
}
else if (avg>=80 && avg<=90){
System.out.println("the student obtained 'A+' grade");
}
else if(avg>70 && avg<=80){
System.out.println("the student obtained 'A' grade");
}
else if(avg>60 && avg<=70){
System.out.println("the student obtained 'B+' grade");
}
else if(avg>50 && avg<=60){
System.out.println("the student obtained 'C+' grade");
}
else if(avg>40 && avg<=50){
System.out.println("the student obtained 'C' grade");
}
else{
System.out.println("the student obtained none  grade FAIL");
}
}
}

