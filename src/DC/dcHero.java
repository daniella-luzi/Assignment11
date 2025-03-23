package DC;

public class dcHero extends dcChar implements movieTitle {
    
    protected dcHero() {
        System.out.println("Constructor from class dcHero");
    }

    protected dcHero(String charName) {
        System.out.println("This is a constructor " + charName);
    }


    public void batmanVillain() {
        System.out.println("The Riddler is a Batman villain");
    }

    public void supermanVillain() {
        System.out.println("Doomsday is a Superman villain");
    }

    public void titleOfMovie() {
        System.out.println("Batman: The Dark Knight is a movie title");
    }

    private static void dcSidekick() {
        System.out.println("Robin is Batman's sidekick");
    }

    public static void myDCHero() {
        System.out.println("Batman is a DC hero");
    }

    protected static String dcMovie(String month) {
        return month;
    }

    protected static int dcMovie(int year) {
        return year;
    }

    @Override
    public void favDCHero() {
        System.out.println("Some peoples' favorite hero is Aquaman");
    }

    public static void main(String[] args) {
        dcHero hero = new dcHero();
        hero.titleOfMovie();
        hero.favDCHero();
        dcHero.myDCHero();
        dcHero.dcSidekick();
    }
}

interface movieTitle {
    public void titleOfMovie();
}