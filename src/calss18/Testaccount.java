package calss18;

public class Testaccount {
    public static void main(String[] args) {
        Account account =new Account();
        account.accoutnNumber=33313242;
        account.money=8.9;
        account.deposit();

        System.out.println(account.accoutnNumber);
        System.out.println(account.money);


        System.out.println("--------Creating an object of checking account-----");

        CheckingAccount ca=new CheckingAccount();
        ca.accoutnNumber=3331345;
        ca.interests=312131;
        ca.transfer();
        ca.deposit();
        System.out.println(ca.accoutnNumber);
        System.out.println(ca.interests);

        System.out.println("---------Svaing account-------");
        
        Savings save=new Savings();
        save.accoutnNumber=312223;
        save.profit=4444;
        save.money=0;
        save.deposit();
        save.deposit();

        System.out.println(save.accoutnNumber);
        System.out.println(save.money);

        System.out.println("-----------");
        SuperSaving ss=new SuperSaving();
        ss.superSaving();
        ss.money=333333;
        System.out.println(ss.accoutnNumber);
        System.out.println(ss.money);
    }
}
