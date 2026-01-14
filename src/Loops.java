public class Loops {
    int i;
    int x;
    int firstnumb = 0;
    int secondnumb = 1;


    public static void main(String[] args) {
        Loops myCount = new Loops();
    }

    public Loops() {
        countUp();
        countbythrees();
        countdown();
        nestedloop();
        fibonacci();


    }

    public void countUp() {

        for (int i = 1; i < 6; i = i + 1) {
            System.out.println(i);


        }
        System.out.println();

    }

    public void countbythrees() {
        for (int i = 3; i < 16; i = i + 3) {
            System.out.println(i);


        }
        System.out.println();
    }

    public void countdown(){

        for (int i = 10; i > 0; i = i - 1) {
            System.out.println(i);


        }
        System.out.println();
        System.out.println("HAPPY LOOP YEAR!!!");

    }

    public void nestedloop() {

        for (int i = 1; i < 6; i++) {
            for (int x = 1; x <= i; x++) {

                System.out.println(i);
            }
            System.out.println( );


        }
    }
    public void fibonacci(){
        for (int i = 1; i < 20; ++i) {
            System.out.println(firstnumb + " ");
            int nextnumb = firstnumb + secondnumb;
            firstnumb = secondnumb;
            secondnumb = nextnumb;



        }



    }
}
