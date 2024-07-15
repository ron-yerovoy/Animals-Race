/**
 * Works by:
 * Ron yerovoy 
 * 205591142
 * Ilya karazhya
 * 323221846
 */


package Olympics;
/**
 * The Medal class represents a medal awarded in a tournament.
 * It includes information about the type of medal (bronze, silver, gold),
 * the tournament in which it was awarded, and the year of the award.
 * */
public class Medal {
    public static enum type{bronze, silver, gold};
    private type place = type.bronze;
    private String tournament = "Null";
    private int year = 2024;


 /**
     * Constructs a Medal with the specified type, tournament, and year.
     * 
     * the type of the medal (bronze, silver, or gold)
     * the name of the tournament
     * the year the medal was awarded
     */
    public Medal(type place, String tournament, int year) {
        this.place = place;
        this.tournament = tournament;
        this.year = year;
    }
    /**
     * Returns a string representation of the Medal.
     * 
     * Returns a string representation of the Medal
     */
    @Override
    public String toString() {
        return "Medal{" +
                "place=" + place +
                ", tournament='" + tournament + '\'' +
                ", year=" + year +
                '}';
    }
    /**
     * Indicates whether some other object is "equal to" this one.
     * 
     * the reference object with which to compare
     * true if this object is the same as the other argument; false otherwise
     */

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Medal))
        return false;
        Medal medal = (Medal)other;
        return place.equals(medal.place) && tournament.equals(medal.tournament) && year == medal.year;
    }

}



