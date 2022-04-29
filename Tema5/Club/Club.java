package Club;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Store details of club memberships.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Club {
    // Define any necessary fields here ...
    public static ArrayList<Membership> members = new ArrayList<>();

    /**
     * Constructor for objects of class Club
     */
    public Club() {
        // Initialise any fields here ...

    }

    /**
     * Add a new member to the club's list of members.
     * 
     * @param member The member object to be added.
     */
    public void join(Membership member) {
        members.add(member);
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers() {
        return members.size();
    }

    /**
     * Define the number of members of a
     * specificied month
     * 
     * @param month The month in which the member joined
     * @return The number of members who joined
     *         that month
     */


    public int purge(int month) {
        int membersOfTheMonth = 0;

        if (month > 12 || month < 1) {
            System.out.println("El mes de annexo no puede ser superior al mes actual");
        }

        else {
            for (Membership member : members) {
                if (member.getMonth() == month) {
                    membersOfTheMonth++;
                }
            }

        }
        return membersOfTheMonth;

    }

    public int joinedInMonth(int month) {
        int membersOfTheMonth = 0;
        Iterator<Membership> it = members.iterator();

        while (it.hasNext()) {
            int memberMonth = it.next().getMonth();
            if (memberMonth == month) {
                it.remove();
                membersOfTheMonth++;
            }
        }
        return membersOfTheMonth;

    }
}
