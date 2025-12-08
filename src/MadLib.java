import java.util.Random;

public class MadLib {
    public static void main(String[] args) {
        System.out.println("yo");
        MadLib myStory= new MadLib();

    }
public MadLib(){
    System.out.println("Hello");
    String classmate = "Wesley";
    String city = "Baltimore";
    String noun = "Hotdog";
    String adjective = "green";
    String pluralNoun = "Chairs";
    String pluralAnimal = "lions";
    String adverb = "Crazily ";
    Boolean trueOrFalse =true;
    double decimalBiggerThan1 = 0.88;
    int number1 = 1;
    int number2 = 2;
    int wholeNumberBetween1And4 = 2;
    int wholeNumberBetween1And30 = 20;
    String miltonTeacher = "Mr.Idsvoog";
    String miltonDean = "Mrs.Stone";
    Character letterGrade = 'f';
    String season = "spring";

    String story = "This weekend I am going camping with "
            +classmate+ ". We are going to a campsite in "
            +city+ ". I packed my "+noun+ " and "
            +pluralNoun + ".  The forecast is calling for a high of "
            +decimalBiggerThan1+ " degrees fahrenheit. So it should be a "+adverb+""
            +adjective+" day! This year, the park rangers have seen "
            +number1+ " " +pluralAnimal + " which seems kind of dangerous. "
            +miltonTeacher+" said it's " + trueOrFalse + " that "+pluralAnimal+ " eat class "
            +wholeNumberBetween1And4+ " students in the " +season+ ". But, "
            +miltonDean+ " said it actually has only happened "
            + number2+" times. Wish us luck! If we survive, we will earn a "
            +letterGrade+ "- in P.E. class, my best grade this year!only "+wholeNumberBetween1And30+
            " til christmas break!" +
            ""


            ;
    System.out.println(story);


}


}
