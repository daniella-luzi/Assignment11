package Pop;

public class popAlbum extends popArtist implements songTitle {

    protected popAlbum() {
        System.out.println("This is a constructor from class popAlbum");
    }

    protected popAlbum(String albumName) {
        System.out.println("This is another constructor from class popAlbum");
    }

    public static void myPopAlbum() {
        System.out.println("Dangerous Woman is a pop album");
    }
   
    private void thePopAlbum(String albumName) {
        System.out.println("This is a pop album called " + albumName);

    }

    public void titleOfSong() {
        System.out.println("Greedy is a song title");
    }


    protected static String albumDate (String month) {
        return month;
    }

    protected static int albumDate (int year) {
        return year;
    }

    @Override
    public void artistPerfume() {
        System.out.println("She has a different perfume called Moonlight");
    }
    


public static void main(String[] args) throws Exception {
    popAlbum album = new popAlbum();
    album.thePopAlbum("Sweetener");
    album.artistPerfume();
}

}

interface songTitle {
    public void titleOfSong();
}

