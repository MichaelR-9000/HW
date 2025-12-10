public class Conditionals {
    public static void main(String[] args) {
        Conditionals MagicEightBall= new Conditionals();


    }//main method
    String question = "Will I make it to the NBA?";
    String question2 = "Will I ever become president?";
    String question3 = "Will I fail my driving test?";
    //I decided to add additional questions with additional
    // random variable
    public Conditionals(){
        int randint2 = (int)(Math.random()*3 )+1;
        if (randint2==1) {
            System.out.println(question);
        } else if(randint2==2){
            System.out.println(question2);
        }else if (randint2 ==3){
            System.out.println(question3);
        }

        int randint = (int)(Math.random() * 13)+1;
        if (randint == 1) {
            System.out.println("Absolutely");
        } else if(randint == 2) {
            System.out.println("Possibly in the near future");
        } else if (randint == 3) {
            System.out.println("As I see it yes");
        } else if (randint == 4) {
            System.out.println("As I see it no");
        } else if (randint == 5) {
            System.out.println("Too difficult to foresee");
        } else if (randint == 6) {
            System.out.println("If you're lucky, yes");
        } else if (randint == 7) {
            System.out.println("Very doubtful");
        } else if (randint == 8) {
            System.out.println("Definitely not");
        } else if (randint == 9) {
            System.out.println("It is possible");
        } else if (randint == 10) {
            System.out.println("Likely no");
        } else if (randint == 11) {
            System.out.println("NOPE");
        } else if (randint == 12) {
            System.out.println("NUH UH");
        } else if (randint == 13) {
            System.out.println("YUH HUH");
        }



    }//constructor

}
