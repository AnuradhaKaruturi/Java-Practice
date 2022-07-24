package practice.Inheritance;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee();
        DatabaseProfessional dbPro = new DatabaseProfessional();
        Programmer pro = new Programmer();
        emp.age=15;
        emp.name="Anu";
        emp.salary=30000;
        emp.printData();
        System.out.println("--------");

        dbPro.age=10;
        dbPro.name="John";
        dbPro.salary=15000;
        dbPro.databaseTool = "SQL";
        dbPro.printData();
        System.out.println("--------");

        pro.age=20;
        pro.name="Joy";
        pro.salary=10000;
        pro.language = "English";
        pro.printData();

    }
    
}
