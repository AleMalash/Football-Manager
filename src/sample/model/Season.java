package sample.model;

import java.util.ArrayList;

/**
 * Created by Alexander on 13.10.2014.
 */
public class Season {

    //region Singleton
    private Season() {
    }

    private static Season instance;
    public static Season getInstance(){
        if (instance==null){
            instance=new Season();
        }
        return instance;
    }
    //endregion

    //region Transfers
    private TransferCenter transfers;

    public TransferCenter getTransfers(){
        return transfers;
    }
    public void setTransfers(TransferCenter transfers){
        this.transfers =transfers;
    }
    //endregion

    //region League
    private League league;

    public League getLeague(){
        return league;
    }
    public void setLeague(League league){
        this.league=league;
    }
    //endregion

    //region Schedule
    private ArrayList<Match> schedule;

    public ArrayList<Match> getSchedule(){
        return schedule;
    }
    public void setSchedule(ArrayList<Match> schedule){
        this.schedule=schedule;
    }
    //endregion

}
