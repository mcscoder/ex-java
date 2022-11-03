package mytime;

public class MyTimeMain {
    public static void main(String[] args) {
        MyTime time = new MyTime(3, 4, 3);
        System.out.println(time);
        MyTime time1 = new MyTime(23, 59, 59);
        System.out.println(time1.nextSecond());
    }
}
