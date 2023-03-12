package homework;

public class Main {
    public static void main(String[] args) {

        int[] array ={2,2,3,7,5,6,1};

        MaxElementInArray arr = new MaxElementInArray(new int[]{1,2,3,5,3,2});
        arr.result();
        MaxElementInArray arr1 = new MaxElementInArray(array);
        arr1.result();

        Employee mark = new Employee("Mark",498,7);
        Employee john = new Employee("John",503,8);
        Employee kyle = new Employee("Kyle",500,5);

        mark.addSalary();
        mark.addForWork();
        john.addSalary();
        john.addForWork();
        kyle.addSalary();
        kyle.addForWork();
        System.out.println(kyle.getSalary());
        System.out.println(mark.getSalary());

    }
}
