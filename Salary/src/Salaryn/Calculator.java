package Salaryn;

public class Calculator {
    String name = "";
    int salary = 2297;
    int bonus = 20;
    int dayofattend =  0;
    int total = bonus + salary;

    void data (int dayofattend){
        this.dayofattend = dayofattend;
    }

    void  lastData(){
        if(dayofattend <= 10){
            bonus = 0;
            System.out.println("The employee salary is = " + salary + " and the bonus granted to the employee is " + bonus + " so the the total payment to the employee is "  + total);
        }else if(dayofattend >10 ){
            bonus = 100;
            System.out.println("The employee salary is = " + salary + " and the bonus granted to the employee is " + bonus + " so the the total payment to the employee is "  + total);

        }else if(  dayofattend > 20 && dayofattend <=29){
            bonus = 139;
            System.out.println("The employee salary is = " + salary + " and the bonus granted to the employee is " + bonus + " so the the total payment to the employee is "  + total);

        } else {
            System.out.println("The employee salary is = " + salary + " and the bonus granted to the employee is " + bonus + " so the the total payment to the employee is "  + total);

            bonus = 200;
        }
    }
}
