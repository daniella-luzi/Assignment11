package DC;

public class dcVillain extends dcChar implements movieTitle {
    
    protected dcVillain() {
        System.out.println("Constructor from class dcVillain");
    }

    protected dcVillain(String charName) {
        System.out.println("This is a constructor " + charName);
    }

    public void batmanVillain() {
        System.out.println("The Scarecrow is a Batman villain");
    }

    public void supermanVillain() {
        System.out.println("Bizarro is a Superman villain");
    }

    public void titleOfMovie() {
        System.out.println("Suicide Squad is a movie title");
    }

    private static void dcVillainSidekick () {
        System.out.println("Harley Quinn is a sidekick");
    }

    public static void myDCVillain() {
        System.out.println("Lex Luthor is a villain");
    }

    protected static String dcShow(String month) {
        return month;
    }

    protected static int dcShow(int year) {
        return year;
    }

    @Override
    public void favDCVillain() {
        System.out.println("Some peoples' favorite villain is Poison Ivy");
    }

    public static void main(String[] args) {
        dcVillain villain = new dcVillain();
        villain.titleOfMovie();
        villain.favDCVillain();
        dcVillain.myDCVillain();
        dcVillainSidekick();
    }

}

interface movieTitle {
    public void titleOfMovie();
}
    
    

