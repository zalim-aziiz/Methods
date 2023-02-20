package methods;

public class ifelse {

        static int myMethod(int x, int y) {
            return x + y;
        }

        static void checkprice(int price){

            if(price<=1900){
                System.out.println("You may buy the cooking OIL.");
            }else {
                System.out.println("Don't Buy, Achana nayo!!!");
            }
        }

        public static void main(String[] args) {
//            int zainab = myMethod(300, 6000);
//
//
//            System.out.println("Zainab's savings of the year is: $"+zainab);


            checkprice(1801);
            checkprice(1910);
        }

    }

