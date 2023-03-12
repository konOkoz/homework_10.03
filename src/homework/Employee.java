package homework;

public class Employee {
    /*Создать класс Employee , содержащий следующие поля и методы:

поле имя,
поле зарплата,
поле количество рабочих часов в день,
конструктор
метод addSalary(), добавляющий 10 евро к зарплате если зарплата сотрудника меньше 500
метод addForWork(), добавляющий 5 евро к зарплате сотрудника если количество рабочих часов в день больше 6.
Создать несколько экземпляров класса с различными параметрами и вывести на экран результат работы методов
     */
   private String name;
   private int salary;
   private int hoursInDay;

    Employee(String name, int salary, int hoursInDay){
        this.name=name;
        this.salary=salary;
        this.hoursInDay=hoursInDay;
    }
 public void addSalary(){
        if (salary<500){
            salary+=10;
            System.out.println(name+"'s salary was increased to "+salary);
        }
        else {
            System.out.println(name + "'s salary is "+ salary);
        }
 }
 public void addForWork(){
        if (hoursInDay>6){
            salary+=5;
            System.out.println(name+"'s salary was increased to "+salary);
        }else {
            System.out.println(name + " working less than 7 hours in a day");
        }
 }
 public String getName(){
        return name;
 }
 public int getSalary(){
        return salary;
 }
 public int getHoursInDay(){
        return hoursInDay;
 }

}
