package Rock;

public class rockAlbum extends rockArtist implements songTitle {

    protected rockAlbum() {
        System.out.println("This is a constructor from class rockAlbum");
    }

    protected rockAlbum(String albumName) {
        System.out.println("This is another constructor from class rockAlbum");
    }

    public static void myRockAlbum() {
        System.out.println("Ride the Lightning is a rock album");
    }

    private void theRockAlbum(String albumName) {
        System.out.println("This is a rock album called " + albumName);

    }

    public void titleOfSong() {
        System.out.println("For Whom the Bell Tolls is a song title");
    }

    protected static String albumDate(String month) {
        return month;
    }

    protected static int albumDate(int year) {
        return year;
    }

    @Override
    public void favSong() {
        System.out.println("Some peoples' favorite song in general is Blackened");
    }

    public static void main(String[] args) throws Exception {
        rockAlbum album = new rockAlbum();
        album.theRockAlbum("Ride the Lightning");
        album.favSong();
    }
    
}

interface songTitle {
    public void titleOfSong();
}


