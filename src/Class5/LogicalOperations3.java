package Class5;

public class LogicalOperations3 {
    public static void main(String[] args) {
        double mathScore = 95.2;
        double historyScore = 95.9;
        double scienceScore = 94.5;

        if (scienceScore > 90) {
            if (mathScore > 90)
                if (historyScore > 90) {
                    System.out.println("Brilliant student");
                } else {
                    System.out.println("Put more efforts please");
                }
        }

        if(10>5 || 4>6){
            System.out.println("1");
        }else{
            System.out.println("2");
        }
//part2
        String name="Adam";
        int age=31;
        if(name.equals("Adam")&& age==30){
            System.out.println("You are the Adam from batch 13");
        }else{
            System.out.println("I don't know you");
        }

        boolean isTrue=false;
        if(!isTrue){
            System.out.println(" You got it");
        }else {
            System.out.println("Need more practice");
        }


    }
}








