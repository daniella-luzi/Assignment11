package Rock;

public class rockArtist {

    protected rockArtist() {
        System.out.println("This is a constructor from class rockArtist");
    }

    private rockArtist(String name) {
        System.out.println("This is a constructor with a parameter from class rockArtist");
    }

    final void sing() {
        System.out.println("This is a final method sing() from class rockArtist");
    }

    final void playGuitar() {
        System.out.println("This is a final method playGuitar() from class rockArtist");
    }

    public void favSong() {
        System.out.println("Some people's favorite song is Master of Puppets");
    }

    public static void main(String[] args) throws Exception {
        rockArtist myArtist = new rockArtist("Another rock artist is Avenged Sevenfold");
        rockAlbum myAlbum = new rockAlbum();
        rockAlbum.myRockAlbum();
        myAlbum.titleOfSong();

        String name = rockInformation("Metallica");
        System.out.println(name + " is a rock artist");
        int age = rockInformation(44);
        System.out.println("The band is about " + age + " years old");

        String month = rockAlbum.albumDate("July");
        System.out.println("The album was released in " + month);
        int year = rockAlbum.albumDate(1984);
        System.out.println("The album was released in " + year);

        myArtist.sing();
        myArtist.playGuitar();
    }

    final static String rockInformation(String artistName) {
        return artistName;
    }

    final static int rockInformation(int bandAge) {
        return bandAge;
    }
}
