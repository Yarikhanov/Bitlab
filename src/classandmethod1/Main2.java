package classandmethod1;

public class Main2 {
public static void main (String[]args){
    Player [] playert1 = new Player [5];
    playert1 [0] = new Player (1, "Luis", "Suarez","PFA");
    playert1 [1] = new Player (7, "Leo", "Messi","DEF");
    playert1 [2] = new Player (4, "Cri", "Ro","FRW");
    playert1 [3] = new Player (30, "Khvi", "Kvara","LFA");
    playert1 [4] = new Player (26, "Kill", "Mbape","DEF");
    Player [] playert2 = new Player [5];
    playert2 [0] = new Player (77, "Yunus", "Evkurov","PFA");
    playert2 [1] = new Player (32, "Ramz", "Abdulatip","LFA");
    playert2 [2] = new Player (10, "Neymar", "Neymar","FRW");
    playert2 [3] = new Player (5, "Anton", "Miranchuk","DEF");
    playert2 [4] = new Player (13, "Ivan", "Durak","DEF");
    Club barca = new Club ("Barca", "Spain", 10, playert1 );
    Club real = new Club("Real", "Spain", 12,playert2 );
    Club [] clubi = {barca, real};
    for (int i = 0; i < clubi.length; i++){
        clubi[i].printClubData();
    }
}
}
