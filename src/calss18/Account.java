package calss18;

public class Account {// parent class-base


        long accoutnNumber;
        double money;

       void deposit(){
            System.out.println("Deposit methods from Account class");
        }
    }


    class CheckingAccount extends Account {// kid class- derived
        double interests;

        void transfer() {
            System.out.println("Transfer methods from Checkong class");
        }
    }

        class Savings extends Account {

            double profit;

            void takeprofit(){
                System.out.println("Profit methods from savings");
            }
        }

class SuperSaving extends Savings{

    void superSaving(){
        System.out.println("Soory, you do not have super savings");
    }


}