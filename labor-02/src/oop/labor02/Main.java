package oop.labor02;

import oop.labor02.bank.BankAccount;
import oop.labor02.date.DateUtil;
import oop.labor02.rectangle.Rectangle;

public class Main {
    public static void main(String[] args) {
        // 1 es feladat
//        BankAccount account1 = new BankAccount("BT543");
//        System.out.println(account1.getAccountNumber());
//        System.out.println(account1.getBalance());
//        account1.deposit(500);
//        System.out.println(account1.getBalance());
//        account1.withdraw(500);
//        System.out.println(account1.getBalance());

        //2 es feladat

        //Rectangle rectangle1= new Rectangle(6.13,4.69);
        //System.out.println(rectangle1.getLength());
        //System.out.println(rectangle1.getWidth());
        System.out.println(DateUtil.isValidDate(2000,2, 29) == true);
        System.out.println(DateUtil.isValidDate(2000,2, 30) == false);
        System.out.println(DateUtil.isValidDate(1900,2, 29) == false);
        System.out.println(DateUtil.isValidDate(1900,2, 28) == true);
        System.out.println(DateUtil.isValidDate(-1900,2, 28) == false);
        System.out.println(DateUtil.isValidDate(0,2, 28) == false);
        System.out.println(DateUtil.isValidDate(2021,2, 29) == false);
        System.out.println(DateUtil.isValidDate(2020,2, 29) == true);
        System.out.println(DateUtil.isValidDate(2020,1, 32) == false);
        System.out.println(DateUtil.isValidDate(2020,1, 0) == false);
        System.out.println(DateUtil.isValidDate(2020,0, 0) == false);
        System.out.println(DateUtil.isValidDate(2020,4, 31) == false);
        System.out.println(DateUtil.isValidDate(2020,1, 31) == true);

    }
}
