/* Assignment #: 4
 Name: Rhea Mane
 StudentID: 1222796497
 Lecture: T/Th 1:30pm
Description: Describes a sports team
 */
public class Team {
    // defining instance variables

    private String name;
    private Coach coach;
    private String city;

    // defining default constructor
    public Team() {
        name = "?";
        coach = null;
        city = "?";
    }

    //defining overloaded constructor
    public Team(String name, Coach coach, String cityName) {
        this.name = name;
        this.coach = coach;
        this.city = cityName;
    }

    // defining required methods

    public String getName() {
        return name;
    }

    public void setName(String someName) {
        name = someName;
    }

    public Coach getCoach() {
        return coach;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String someCity) {
        city = someCity;
    }

    public void setCoach(String firstName, String lastName, int years) {
        coach.setFirstName(firstName);
        coach.setLastName(lastName);
        coach.setYears(years);
    }

    public String toString(){
        return "Team's name:\t" + name + " from " + city + "\nCoach Information:"+ coach;
    }
}
