package sample.model;

import java.util.Date;

/**
 * Created by Alexander on 03.10.2014.
 */
public class Player {

    //region Constructors
    public Player(String name, Club club, int rating, String position, int salary, Date birth, String nationality){
        this.name = name;
        this.club=club;
        this.rating=rating;
        this.position=position;
        this.salary=salary;
        this.birth=birth;
        this.nationality=nationality;
    }
    public Player(String name, int rating, String position, Date birth, String nationality){
        this.name=name;
        this.rating=rating;
        this.position=position;
        this.birth=birth;
        this.nationality=nationality;
    }

    //endregion

    //region Name
    private String name;
    public String getName(){
        return name;
    }
    //endregion

    //region Club
    private Club club;
    public Club getClub(){
        return club;
    }
    public void setClub(Club club){
        this.club=club;
    }
    //endregion

    //region Rating
    private int rating;
    public int getRating(){
        return rating;
    }
    public void setRating(int rating) throws Exception{
        if ((rating < 1) || (rating > 100)) {
            throw new Exception("Incorrect rating");
        } else {
            this.rating = rating;
        }

    }
    //endregion

    //region Position
    private String position;
    public String getPosition(){
        return position;
    }
    public void setPosition(String position){
        this.position=position;
    }
    //endregion

    //region Salary
    private int salary;
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary) {
        try {
            if (salary < 1) {
                throw new Exception("Incorrect salary");
            } else {
                this.salary = salary;
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    //endregion

    //region Price
    private int price;
    public int getPrice(){
        return price;
    }
    public void setPrice(int price) throws Exception{
        if (price<0){
            throw new Exception("Incorrect price");
        } else{
            this.price=price;
        }
    }
    //endregion

    //region Birth
    private Date birth;
    public Date getBirth(){
        return birth;
    }
    //endregion

    //region Nationality
    private String nationality;
    public String getNationality(){
        return nationality;
    }
    //endregion

    //region Favorite Club
    private Club favoriteClub;
    public Club getFavoriteClub(){return favoriteClub;}
    public void setFavoriteClub(Club favoriteClub){this.favoriteClub=favoriteClub;}
    //endregion
}
