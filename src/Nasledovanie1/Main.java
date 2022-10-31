package Nasledovanie1;
public class Main {
    public static void main(String args[]) throws Exception {
        Sportsman [] sportsmansList = new Sportsman[9];
        sportsmansList [0] = new Gymnast("Josh", 25, "Wales",180, 65, "Free");
        sportsmansList [1] = new Gymnast("Kosh", 27, "Tales",183, 66, "Free");
        sportsmansList [2] = new Gymnast("Posh", 30, "Males",184, 67, "Free");
        sportsmansList [3] = new Swimmer("Bob", 19, "Spain", "Free", 3.3);
        sportsmansList [4] = new Swimmer("Tob", 29, "Pain", "Free", 2.3);
        sportsmansList [5] = new Swimmer("Mob", 39, "Train", "Free", 1.3);
        sportsmansList [6] = new Footballer("Leo", 24, "Argentina", "FRW", "PSG");
        sportsmansList [7] = new Footballer("Meo", 27, "Sergentina", "LRW", "PG");
        sportsmansList [8] = new Footballer("Peo", 26, "Argentina", "FRW", "Barca");
        OlympicGames OG = new OlympicGames("Almaty" , 2022, sportsmansList);
        OG.play();
    }
}