import java.util.*;

class Employee {
    int empno;
    String ename;
    float basic, hra, da, netpay;

    float Calculate() {
        return basic + hra + da;
    }

    void havedata() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter empno, name, basic, hra, da: ");
        empno = sc.nextInt();
        ename = sc.next();
        basic = sc.nextFloat();
        hra = sc.nextFloat();
        da = sc.nextFloat();

        netpay = Calculate();
    }

    void dispdata() {
        System.out.println(empno + " " + ename + " " + netpay);
    }
}