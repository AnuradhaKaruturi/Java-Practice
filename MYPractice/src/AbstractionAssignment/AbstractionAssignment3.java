package AbstractionAssignment;

abstract class Marks{
    float subj1,subj2,subj3,subj4,percentage;
    abstract double getPercentage();
}
 class StudentA extends Marks
 {

    StudentA(float s1,float s2,float s3){
      this.subj1 = s1;
      this.subj2 = s2;
      this.subj3 = s3;
     }
     double getPercentage(){
         percentage = ((subj1+subj2+subj3)/300)*100;
         return percentage;
     }
 }

 class StudentB extends Marks
 {

    StudentB(float s1,float s2,float s3,float s4){
      this.subj1 = s1;
      this.subj2 = s2;
      this.subj3 = s3;
      this.subj4 = s4;
     }
     double getPercentage(){
         percentage = ((subj1+subj2+subj3+subj4)/400)*100;
         return percentage;
     }
 }

public class AbstractionAssignment3 {
    public static void main(String[] args) {
        StudentA stuAObj = new StudentA(90,75,80);
        System.out.println(stuAObj.getPercentage()+"%");
        StudentB stuBObj = new StudentB(80,78,90,69);
        System.out.println(stuBObj.getPercentage()+"%");
    }
    
}
