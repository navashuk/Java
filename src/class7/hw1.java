package class7;

public class hw1 {
    public static void main(String[] args) {
        //Create a boolean variable workDay and assign true create int variable day and assign it to 1
        //As long as it is workDay print “I need a day off” and increase day.
        //Once day is 6 print “I do not need a day off any more”
         boolean workDay= true;
         int day=1;
         while(workDay){
             if(day<=5){
                 System.out.println("i need a dy off");
             }else{
                 System.out.println("i do not need a day off anymore ");
                 workDay=false;
             }
         day++;
         }




    }
}
