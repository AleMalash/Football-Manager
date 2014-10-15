package sample.model;

import java.util.List;

/**
 * Created by Alexander on 06.10.2014.
 */
public class League {

    //region Clubs
    private List<Club> clubs;
    public List<Club> getClubs(){return clubs;}
    public void setClubs(List<Club> clubs){this.clubs=clubs;}
    //endregion

    public int match(Club firstTeam, Club secondTeam){
        int result=0;
        int ratingFirstTeam=0;
        for(int i=0;i<firstTeam.getPlayers().size();i++){
            ratingFirstTeam+=firstTeam.getPlayers().get(i).getRating();
        }
        int ratingSecondTeam=0;
        for(int i=0;i<secondTeam.getPlayers().size();i++){
            ratingSecondTeam+=secondTeam.getPlayers().get(i).getRating();
        }
        if (ratingFirstTeam>ratingSecondTeam){
            result=1;
        } else{
            if (ratingSecondTeam>ratingFirstTeam){
                result=2;
            } else{
                result=0;
            }
        }

        return result;
    }

}
