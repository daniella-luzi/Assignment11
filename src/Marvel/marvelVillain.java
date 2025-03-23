package Marvel;

public class marvelVillain extends marvelChar implements movieTitle {
    
    protected marvelVillain() {
        System.out.println("Constructor from class marvelVillain");
    }

    protected marvelVillain(String charName) {
        System.out.println("This is a constructor " + charName);
    }

    public void spidermanVillain() {
        System.out.println("Doc Ock is a Spiderman villain");
    }

    public void ironmanVillain() {
        System.out.println("Iron Monger is an Ironman villain");
    }

    public void titleOfMovie() {
        System.out.println("Venom is a movie title");
    }

    private static void marvelVillainSidekick() {
        System.out.println("Carnage is Venom's sidekick");
    }

    public static void myMarvelVillain() {
        System.out.println("Loki is a marvel villain");
    }

    protected static String marvelShow(String month) {
        return month;
    }

    protected static int marvelShow(int year) {
        return year;
    }

    @Override
    public void favMarvel() {
        System.out.println("Some peoples' favorite character is Loki");
    }

    public static void main(String[] args) {
        marvelVillain villain = new marvelVillain();
        villain.titleOfMovie();
        villain.favMarvel();
        marvelVillain.myMarvelVillain();
        marvelVillainSidekick();
    }
}

interface movieTitle {
    public void titleOfMovie();
}
