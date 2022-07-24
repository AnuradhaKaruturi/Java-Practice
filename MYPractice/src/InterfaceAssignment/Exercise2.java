package InterfaceAssignment;
interface Measurable{
    default double getMeasure(){
        return 5.5;
    }
}
class EmployeeM implements Measurable{
    double avg;
    double average(Measurable[] Obj){
        return avg;
    }
}
public class Exercise2 {
    
}
