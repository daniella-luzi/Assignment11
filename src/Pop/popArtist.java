package Pop;

public class popArtist{

    protected popArtist() {
        System.out.println("This is a constructor");
    }

    protected popArtist(String artistName) {
        System.out.println("This is a constructor with one parameter");
    }

    private void artistHeight() {
        System.out.println("She is 5 ft 1 inches tall");
    }

    public void artistPerfume() {
        System.out.println("She has a perfume called Cloud");
    }

    public static void main(String[] args) throws Exception {
        popArtist myArtist = new popArtist("Ariana Grande");
        popAlbum myAlbum = new popAlbum();
        popAlbum.myPopAlbum();
        myAlbum.titleOfSong();

        String name = popInformation("Ariana Grande");
        System.out.println(name + " is a pop artist");  
        int age = popInformation(31);
        System.out.println("She is " + age + " years old");

        String month = popAlbum.albumDate("May");
        System.out.println("The album was released in " + month);
        int year = popAlbum.albumDate(2016);
        System.out.println("The album was released in " + year);

        myArtist.artistHeight();
        myArtist.artistPerfume();
    
    }

    protected static String popInformation(String artistName){
        return artistName;
    }

    protected static int popInformation(int artistAge) {
        return artistAge;
    }

    
}
