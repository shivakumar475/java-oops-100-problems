/* QUESTION 99: Write a Java program to demonstrate object oriented
programming.

1. Create a class MusicBand:
   • bandName (String)
   • genre (String)

2. Create a class Singer:
   • singerName (String)
   • age (int)
   • band (MusicBand)
   • Method joinBand(MusicBand band)
   • Method displayDetails()

3. Main Class:
   • Create MusicBand object
   • Create Singer object
   • Assign band
   • Display details

Expected Output:
Singer Name: Arjit Singh
Age: 35
Band Name: Melody Makers
Genre: Pop
*/

class MusicBand {
    String bandName;
    String genre;

    public MusicBand(String bandName, String genre) {
        this.bandName = bandName;
        this.genre = genre;
    }
}

class Singer {
    String singerName;
    int age;
    MusicBand band;

    public Singer(String singerName, int age) {
        this.singerName = singerName;
        this.age = age;
    }

    public void joinBand(MusicBand band) {
        this.band = band;
    }

    public void displayDetails() {
        System.out.println("Singer Name: " + singerName);
        System.out.println("Age: " + age);
        System.out.println("Band Name: " + band.bandName);
        System.out.println("Genre: " + band.genre);
    }
}

public class Question99 {
    public static void main(String[] args) {
        MusicBand mb = new MusicBand("Melody Makers", "Pop");
        Singer s = new Singer("Arjit Singh", 35);
        s.joinBand(mb);
        s.displayDetails();
    }
}