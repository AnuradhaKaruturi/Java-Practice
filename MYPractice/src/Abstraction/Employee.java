package Abstraction;

public  abstract class Employee {
    //Variables=static+non
    private static boolean isEmployed;
    private int age;
    private String name;
    private int id;
    //Blocks=static+init
    static {
        System.out.println("--->Static block of Parent Employee abs class called");
    }
    {
        System.out.println("--->Init block of Parent Employee abs class called");
    }

    //Constructors
    public Employee() {
        System.out.println("--->Abstract Class Employee-->Employee()");
    }

    public Employee(int age, String name, int id) {
        this.age = age;
        this.name = name;
        this.id = id;
    }
    //abstract methods
    protected abstract boolean mail_docs();
    protected abstract void work();
    //Inner+nested+abstract nested+abstract Inner+Sub+Anonymous classes
    class Job{
        private String company_Name;
        private static int joining_date;

        public Job(){
            company_Name="Fly & Work";
            Job.joining_date=2015;
        }

        public Job(String company_Name) {
            this.company_Name = company_Name;
        }
        public void j_Details(){
            System.out.println("--->Job in Employee class j_details()");
            display(1,"John",35,false);
            System.out.println(company_Name+" "+Job.joining_date);
            j_Show();
        }
        static public void j_Show(){
            //display(1,"John",35,false); error
            System.out.println("--->Job in Employee class j_show()");
            System.out.println(Job.joining_date);
        }
    }
    static class Duration {
        private int experience;
        private static int year;

        public Duration(){
            System.out.println("Static Duration class in Employee->Duration()");
            experience=2;
            Duration.year=2015;
        }

        public Duration(int experience) {
            this.experience = experience;
        }
        void d_Details(){
            System.out.println("Employee->static->Duration->d_details()");
            System.out.println(Employee.isEmployed);//static is only possible of outer class
            System.out.println(experience+" "+Duration.year);
            Duration.d_Show();
           // display();//outer class non-static method
        }
        static void d_Show(){
            System.out.println("Employee->static->Duration->static->d_show()");
            System.out.println(Employee.isEmployed+" "+Duration.year);
        }

    }

    abstract class Bonus{
        private int bonus_Percent;
        private static double total_salary;
        abstract void b_details();
        abstract void b_Show();

        public int getBonus_Percent() {
            return bonus_Percent;
        }

        public void setBonus_Percent(int bonus_Percent) {
            this.bonus_Percent = bonus_Percent;
        }

        public static double getTotal_salary() {
            return total_salary;
        }

        public static void setTotal_salary(double total_salary) {
            Bonus.total_salary = total_salary;
        }
        public void b_display(){
            System.out.println(bonus_Percent+" "+total_salary);
        }
    }
    abstract class Promotion extends Bonus{
     //   private boolean isPromoted;
      //  private static String level;

        abstract void p_Details();
        abstract void p_Show();

        @Override
        void b_details() {
            System.out.println("Promotion inner class extends parent abstract class Bonus b_details()");
        }

        @Override
        void b_Show() {
            System.out.println("Promotion inner class extends parent abstract class Bonus b_show()");
        }
    }

    //setters+getters+ static & non
    public static void setIsEmployed(boolean isEmployed) {
        Employee.isEmployed = isEmployed;
    }

    public static boolean isIsEmployed() {
        return isEmployed;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    protected void display(int id,String name,int age,boolean isEmployed){
        System.out.println("--->Display() called in super class!!!");
        System.out.println(id+" "+name+" "+age+" "+isEmployed);
    }


}
