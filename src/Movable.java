/* Car.java
 * 2019-01-31
 */

/**
 *  This interface represents a movable object that can turn in 360 degrees clock-
 *  and counter clock-wise.
 *
 * @author Seif Bourogaa
 * @author Andreas Palmqvist
 * @author Simon Lindeberg Skoglund
 */
public interface Movable {

    /**
     * Moves the object in space.
     */
    void move();

    /**
     * Turns the direction of the object counter-clock-wise.
     * @param angle the angle by which to turn the object.
     */
    void turnLeft(double angle);


    /**
     *  Turns the direction of the object clock-wise.
     * @param angle the angle which to turn the object.
     */
    void turnRight(double angle);

}
