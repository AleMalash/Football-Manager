package sample.model;

/**
 * Created by Alexander on 15.10.2014.
 */
public class Offer {

    //region Price
    private int price;
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price=price;
    }
    //endregion

    //region Salary
    private int salary;
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    //endregion

    //region Time of contract
    private int timeOfContract;
    public int getTimeOfContract(){
        return timeOfContract;
    }
    public void setTimeOfContract(int timeOfContract){
        this.timeOfContract=timeOfContract;
    }
    //endregion
}
