/* Assignment #: 4
 Name: Rhea Mane
 StudentID: 1222796497
 Lecture: T/Th 1:30pm
Description: Describes information of the coach including full name and years of experience coaching
 */
public class Coach {

    // defining instance variables

    private int yearsCoached;
    private String firstName;
    private String lastName;

    // defining default constructor

    public Coach() {
        yearsCoached = 0;
        firstName = "?";
        lastName = "?";
    }
    // defining overloaded constructor

    public Coach(String first, String last, int years) {
        yearsCoached = years;
        firstName = first;
        lastName = last;
    }
    // defining all the required methods

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String someFirstName) {
        firstName = someFirstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String someLastName) {
        lastName = someLastName;
    }

    public int getYears() {
        return yearsCoached;
    }

    public void setYears(int years) {
        yearsCoached = years;
    }

    public String toString() {
        return "\nLast Name:\t" + lastName + "\nFirst Name:\t" + firstName + "\nYears of Experience:\t" + yearsCoached + "\n";


    }
}
