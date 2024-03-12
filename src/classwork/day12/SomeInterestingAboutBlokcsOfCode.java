package classwork.day12;

import static java.lang.Math.atan;
import static java.lang.Math.tan;

public class SomeInterestingAboutBlokcsOfCode {
    //    принадлежит классу и выполгнится в режиме компиляции
    static {
        System.out.println("1");
        ;
    }

    //    принадлежит объекту, поэтому в мэйне надо обязательно создавать
    //    объект класса new SomeInterestingAboutBlokcsOfCode()
    {
        System.out.println("2");
    }

    public static void main(String[] args) {
        new SomeInterestingAboutBlokcsOfCode();
    }
}
