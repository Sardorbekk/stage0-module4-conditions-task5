package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        //not("leap" if true otherwise "not leap").
        System.out.println((year % 4 == 0 && year % 100 != 0 || year % 400 == 0)? "leap":"not leap");
    }
}
