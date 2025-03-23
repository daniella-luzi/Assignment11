package Marvel;

abstract class marvelChar{

    protected marvelChar() {
        System.out.println("Constructor from class marvelChar");
    }

    protected marvelChar(String charName) {
        System.out.println("This is a constructor " + charName);
    }

    public void favMarvel() {
        System.out.println("Some peoples' favorite character is Spiderman");
    }

    public abstract void spidermanVillain();
    public abstract void ironmanVillain();

    public static void main(String[] args) {
        marvelChar marvel = new marvelHero("Ironman");
        marvel.favMarvel();
        //marvelChar marvel2 = new marvelVillain("Loki");

        String creator = marvelInformation("Stan Lee");
        System.out.println("The creator of Marvel is " + creator);
        int year = marvelInformation(1939);
        System.out.println("Marvel was created in " + year);

        String month = marvelHero.marvelMovie("May");
        System.out.println("The movie was released in " + month);
        int year2 = marvelHero.marvelMovie(2013);
        System.out.println("The movie was released in " + year2);

        String month2 = marvelVillain.marvelShow("September");
        System.out.println("The show was released in " + month2);
        int year3 = marvelVillain.marvelShow(2024);
        System.out.println("The show was released in " + year3);
    }


    private static String marvelInformation(String creator) {
        return creator;
    }

    final static int marvelInformation(int year) {
        return year;
    }
}
