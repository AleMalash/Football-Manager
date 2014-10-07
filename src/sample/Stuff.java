package sample;

import java.util.Date;

/**
 * Created by Alexander on 03.10.2014.
 */
public class Stuff {

    //region Constructors
    public Stuff(String name,String post,int rating){
        this.name=name;
        this.post=post;
        this.rating=rating;
    }
    public Stuff(String name,Club club,String post,int salary,int rating,Date timeToEnd){
        this.name=name;
        this.club=club;
        this.post=post;
        this.salary=salary;
        this.timeToEnd=timeToEnd;
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

    //region Post
    private String post;
    public String getPost(){
        return post;
    }
    public void setPost(String post){
        this.post=post;
    }
    //endregion

    //region Salary
    private int salary;
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary) throws Exception{
        if (salary<1){
            throw new Exception("Incorrect salary");
        } else{
            this.salary=salary;
        }
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

    //region Time to end
    private Date timeToEnd;
    public Date getTimeToEnd(){
        return timeToEnd;
    }
    public void setTimeToEnd(Date timeToEnd) throws Exception{
        if (timeToEnd.compareTo(sample.Main.now)<0){
            throw new Exception("Incorrect time to end");
        } else{
            this.timeToEnd=timeToEnd;
        }
    }
    //endregion
}
