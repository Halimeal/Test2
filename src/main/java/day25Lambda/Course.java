package day25Lambda;

public class Course {

    /*
    1)Private variables
    2) Constructor with parameters
    3)Constructor without parameters
    4) Getters
    5)Setters
    6) toString()Method

    Any class that's got above 6 features is called "POJO" class=> "Plain Old Java Object"
     */
    private String courseName;
    private int numOfStd;
    private String season;

    private double avgScore;

    public Course(String courseName, int numOfStd, String season,double avgScore){
        this.courseName=courseName;
        this.numOfStd= numOfStd;
        this.season=season;
        this.avgScore=avgScore;

    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getNumOfStd() {
        return numOfStd;
    }

    public void setNumOfStd(int numOfStd) {
        this.numOfStd = numOfStd;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", numOfStd=" + numOfStd +
                ", season='" + season + '\'' +
                ", avgScore=" + avgScore +
                '}';
    }

    public Course(){



    }
}
