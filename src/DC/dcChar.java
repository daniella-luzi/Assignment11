package DC;

abstract class dcChar {
    
    protected dcChar() {
        System.out.println("This is a constructor from class dcChar");
    }

    protected dcChar(String charName) {
        System.out.println("This is a constructor with a character named " + charName);
    }

    public abstract void batmanVillain();
    public abstract void supermanVillain();

    public void favDCHero() {
        System.out.println("Some peoples' favorite hero is Superman");
    }

    public void favDCVillain() {
        System.out.println("Some peoples' favorite villain is the Joker");
    }

    public static void myDCHero() {
        System.out.println("Batman is a DC hero");
    }

    public static void main(String[] args) {

        dcChar dc = new dcHero("The Flash");

        dc.favDCHero();
        dc.favDCVillain();

        String creator = dcInformation("Malcolm Wheeler-Nicholson");
        System.out.println("The creator of DC is " + creator);
        int year = dcInformation(1934);
        System.out.println("DC was created in " + year);

        String month = dcHero.dcMovie("July");
        System.out.println("The movie will release in " + month);
        int year2 = dcHero.dcMovie(2025);
        System.out.println("The movie will release in " + year2);

        String month2 = dcVillain.dcShow("September");
        System.out.println("The show released in " + month2);
        int year3 = dcVillain.dcShow(2024);
        System.out.println("The show released in " + year3);


    }

    private static String dcInformation(String creator) {
        return creator;
    }

    final static int dcInformation(int year) {
        return year;
    }
}
