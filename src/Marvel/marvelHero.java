package Marvel;

public class marvelHero extends marvelChar implements movieTitle {

    protected marvelHero() {
        System.out.println("Constructor from class marvelHero");
    }

    protected marvelHero(String charName) {
        System.out.println("This is a constructor " + charName);
    }

    public void spidermanVillain() {
        System.out.println("Green Goblin is a Spiderman villain");
    }

    public void ironmanVillain() {
        System.out.println("The Mandarin is an Ironman villain");
    }

    private static void marvelSidekick() {
        System.out.println("War Machine is Ironman's sidekick");
    }

    public void titleOfMovie() {
        System.out.println("Ironman 3 is a movie title");
    }

    public static void myMarvelHero() {
        System.out.println("Thor is a marvel hero");
    }
    
    protected static String marvelMovie(String month) {
        return month;
    }

    protected static int marvelMovie(int year) {
        return year;
    }

    @Override
    public void favMarvel() {
        System.out.println("Some peoples' favorite character is Ironman");
    }


    public static void main(String[] args) {
        marvelHero hero = new marvelHero();
        hero.titleOfMovie();
        hero.favMarvel();
        marvelHero.myMarvelHero();
        marvelHero.marvelSidekick();
    }
}

interface movieTitle {
    public void titleOfMovie();
}

