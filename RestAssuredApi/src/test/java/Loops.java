public class Loops {

    public static void main(String[] args) {

        System.out.println("FOR Loop:");
        Loop_1();
        System.out.println("\n NESTED Loop:");
        Loop_2();
        System.out.println("\n Do-While Loop:");
        Loop_3();

    }
    //Java Program to execute Loop
    //which prints table of 1

        public static void Loop_1() {
            //Code of Java for loop
            for(int i=1;i<=10;i++){
                System.out.println(i);
            }
        }

        //Nested Loops
    public static void Loop_2() {
        //loop of i
        for(int i=1;i<=3;i++){
        //loop of j
            for(int j=1;j<=3;j++){
                System.out.println(i+" "+j);
            }//end of i
        }//end of j
    }

    //Do-While Loop
        public static void Loop_3() {
            int i=1;
            do{
                System.out.println(i);
                i++;
            }while(i<=10);
        }

    }
