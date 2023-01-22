package class12;

public class hwnumber6 {
    public static void main(String[] args) {


        String[][] countries = {{"USA", "Canada", "Mexico"},
                {"Brazil", "Argentina", "Peru", "Chile"},
                {"Russia", "Spain", "Italy", "Cezka"},
                {"China", "India", "Tajikistan", "Japan"},
                {"Algeria", "Morocco", "Ghana", "somalia"},
        };
int counter=0;
        for (int i = 0; i< countries.length ; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.println(countries[i][j]);
                counter++;
            }
            System.out.println();
        }

        System.out.println("total Counties"+" "
        +counter);
    }
}