package lab_2;
public class Calculator {
    public int add(int val1, int val2){
        int sum = val1+ val2;
        System.out.println("addition of val1 and val2 is : " + sum);
        return sum;
    }
    public int add(int val1, int val2,int val3){
        int sum = val1+val2+val3;
        System.out.println("addition of val1, val2 and val3 is : " + sum);
        return sum;
    }
    public double add(double double_val1, double double_val2){
        double sum = double_val1+double_val2;
        System.out.println("addition of val1 and val2 is : " + sum);
        return sum;
    }
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.add(10, 20));
        System.out.println(cal.add(10, 20, 50));
        System.out.println(cal.add(20.0, 50.0));

    }}

