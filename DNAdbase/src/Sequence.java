
/**
 * 
 * @author James Park Sam Larsen
 * @version 03/19/2019
 *
 */
public class Sequence {

    private int index;
    private char[] strand;
    private int length;
    private String name;
    private Sequence before;
    private Sequence after;


    /**
     * Creates a sequence out of the
     * String given. The sequences are then kept track
     * of by their index which
     * is incremented or decremented whenever we move up or
     * down a level
     * 
     * @param letters
     *            is the string given to us in the file
     */
    public Sequence(String letters) {
        index = 0;
        strand = letters.toCharArray();
        length = letters.length();
        name = letters;
        before = null;
        after = null;

    }
    /**
     * This method set the after sequence (LinkedList)
     * @param seq
     */
    public void setAfter(Sequence seq) {
        after = seq;
    }
    /**
     * This method set the before sequence (LinkedList);
     * @param seq
     */
    public void setBefore(Sequence seq) {
        before = seq;
    }

    /**
     * 
     * @return the sequences value as a string
     */
    public String giveSequence() {
        return name;
    }


    /**
     * 
     * @return the index of the sequence
     */
    public int getIndex() {
        return index;
    }


    /**
     * 
     * @return the single char in the sequence at its index
     */
    public char getIndexChar() {
        return strand[index];
    }


    /**
     * 
     * @return the length of the string
     */
    public int getLength() {
        return length;

    }


    /**
     * Moves the index forward
     */
    public void goForward() {
        if (hasNext()) {
            index++;
        }
    }


    /**
     * Used to see if we can advance or not in the sequence
     * 
     * @return true or false if we can go to the next word or not
     */
    public boolean hasNext() {
        return (index < getLength());
    }


    /**
     * Used to go back in the index when we collapse the internal node
     */
    public void goBack() {
        if (hasBack()) {
            index--;
        }

    }


    /**
     * Used to see if we can go back. Used for collapsing
     * 
     * @return if we can go back or not
     */
    public boolean hasBack() {
        return index > 0;
    }


    /**
     * Sets the index of a sequence to
     * whatever we want it to be. Only used to set
     * the index back to zero.
     * If the value was anything other than zero, the tree
     * might not function correctly
     * 
     * @param value
     *            The value
     * @return int the index
     */
    public int setIndex(int value) {
        index = value;
        return index;
    }
}
