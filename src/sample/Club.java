package sample;

import java.util.List;

/**
 * Created by Alexander on 03.10.2014.
 */
public class Club {

    //region Name
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    //endregion

    //region Rating
    private int rating;
    public int getRating() {return rating;}
    public void setRating(int rating) {this.rating=rating;}
    //endregion

    //region Players
    private List<Player> players;
    public List<Player> getPlayers() {return players;}
    public void setPlayers(List<Player> players) {this.players=players;}
    //endregion

    //region Stuff
    private List<Stuff> membersOfStuff;
    public List<Stuff> getMembersOfStuff() {return membersOfStuff;}
    public void setMembersOfStuff(List<Stuff> membersOfStuff) {this.membersOfStuff=membersOfStuff;}
    //endregion

    //region Transfer Budget
    private int transferBudget;
    public int getTransferBudget(){
        return transferBudget;
    }
    public void setTransferBudget(int transferBudget){
        this.transferBudget = transferBudget;
    }
    //endregion

    //region Salary Budget
    private int salaryBudget;
    public int getSalaryBudget(){return salaryBudget;}
    public void setSalaryBudget(int salaryBudget){
        this.salaryBudget=salaryBudget;
    }
    //endregion
}
