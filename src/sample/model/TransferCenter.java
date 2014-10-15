package sample.model;

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

    public void transfer(Player player, List<Club> futureClubs, List<Offer> offers){
        //Игрок смотрит на предложенную ему зарплату, а также рейтинг клуба, в который может перейти.
        //В идеале: у каждого игрока свои коэффициенты, влияющие на его заинтересованность в зарплате или рейтинге клуба.

        int[] totalInteres=new int[futureClubs.size()];
        totalInteres[0]=(int) (player.getClub().getRating()*0.4+player.getSalary()*0.6);
        for (int i=1;i<futureClubs.size();i++){
            totalInteres[i]=(int) (futureClubs.get(i).getRating()*0.4+futureClubs.get(i).getSalaryBudget()*0.2*0.6);
        }

        int max=0;
        int maxIndex=0;
        for (int j=0;j<futureClubs.size();j++){
            if (totalInteres[j]>max){
                max=totalInteres[j];
                maxIndex=j;
            }
        }

        player.setClub(futureClubs.get(maxIndex));
        player.setSalary(offers.get(maxIndex).getSalary());
        futureClubs.get(maxIndex).setTransferBudget(futureClubs.get(maxIndex).getTransferBudget()- offers.get(maxIndex).getPrice());
        futureClubs.get(maxIndex).setSalaryBudget(futureClubs.get(maxIndex).getSalaryBudget()- offers.get(maxIndex).getSalary());
        futureClubs.get(maxIndex).getPlayers().add(player);
    }
}