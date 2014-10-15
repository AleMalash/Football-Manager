package sample.model;

/**
 * Created by Alexander on 15.10.2014.
 */
public class Match {

    //region First Team
    private Club firstTeam;
    public Club getFirstTeam(){
        return firstTeam;
    }
    public void setFirstTeam(Club firstTeam){
        this.firstTeam=firstTeam;
    }
    //endregion

    //region Second Team
    private Club secondTeam;
    public Club getSecondTeam(){
        return secondTeam;
    }
    public void setSecondTeam(Club secondTeam){
        this.secondTeam=secondTeam;
    }
    //endregion

    //region Result
    private boolean result;

    public boolean getResult(){
        return result;
    }
    public void setResult(boolean result){
        this.result=result;
    }
    //endregion
}
