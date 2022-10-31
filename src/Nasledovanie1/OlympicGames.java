package Nasledovanie1;

public class OlympicGames {
    String city;
    int year;
    Sportsman [] sportsmansList;
    public OlympicGames (){

    }
    public OlympicGames (String city, int year, Sportsman [] sportsmansList) {
        this.city = city;
        this.year = year;
        this.sportsmansList = sportsmansList;
    }

    public void play () {
        System.out.println("City: "+city+" "+"Year: "+year);
        for ( int i = 0; i < sportsmansList.length; i++) {
            sportsmansList[i].play();
        }
    }
}
