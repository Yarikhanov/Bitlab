package classandmethod1;

public class Club {
    String name;
    String country;
    int raitingPoints;
    Player[] players;

    public Club() {
        this.name = "No name";
        this.country = "No country";
        this.raitingPoints = 0;
        this.players = new Player[]{};
    }

    public Club(String name, String country, int raitingPoints, Player[] players) {
        this.name = name;
        this.country = country;
        this.raitingPoints = raitingPoints;
        this.players = players;
    }


    public void printClubData(){
        System.out.println(name+" "+country+" "+raitingPoints);
        for(int i = 0;i < players.length; i++){
            System.out.println(players[i]);
        }
    }

    public String toString() {
        return name + " " + " " + country + " " + " " + raitingPoints + " " + players;
    }
}
