package Abstraction;

public class Accountant extends Employee{

    @Override
    protected boolean mail_docs() {
        return false;
    }

    @Override
    protected void work() {

    }

    public static void main(String[] args) {
        Accountant accountant=new Accountant();
        Employee.Job job=accountant.new Job();
        job.j_Details();
        Employee.Bonus bonus= accountant.new Bonus() {
            @Override
            void b_details() {

            }

            @Override
            void b_Show() {

            }
        };
        bonus.b_display();
        bonus.b_details();

    }
}
