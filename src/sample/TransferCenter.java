package sample;

import java.util.List;

/**
 * Created by Alexander on 03.10.2014.
 */
public class TransferCenter {

    //region Clubs
    private List<Club> clubs;
    public List<Club> getClubs(){
        return clubs;
    }
    public void setClubs(List<Club> clubs){
        this.clubs=clubs;
    }
    //endregion

    //region Free Players
    private List<Player> freePlayers;
    public List<Player> getFreePlayers(){return freePlayers;}
    public void setFreePlayers(List<Player> freePlayers){this.freePlayers=freePlayers;}
    //endregion

    public void transfer(Club currentClub, Player player, List<Club> futureClubs){
        futureClubs.add(currentClub);
    }
}
