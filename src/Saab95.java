/* Saab95.java
 * 2019-01-31
 */

import java.awt.*;

/**
 * This is a representation of a Saab 95 car that can move around in 2D-space. This class inherits functionality from
 * <tt>Car</tt> which includes the implementation of the <tt>Movable</tt> interface.
 *
 * The Saab 95 car has two doors, 125 horsepower and has a red chassis.
 *
 * @see Car
 * @see Movable
 * @author Seif Bourogaa
 * @author Andreas Palmqvist
 * @author Simon Lindeberg Skoglund
 */
public class Saab95 extends Car {
    /**
     * A toggle which tells whether the turbo is on or off.
     */
    private boolean turboOn;

    /**
     * Constructs a Saab 95 car which has two doors, 125 horsepower and has red chassis. The turbo is set to off by
     * default.
     *
     * @see Car
     */
    public Saab95(){
        super(2, 125, Color.red, "Saab95");
        turboOn = false;
    }

    /**
     * Turns the turbo on.
     */
    public void setTurboOn(){
        turboOn = true;
    }

    /**
     * Turns the turbo off.
     */
    public void setTurboOff(){
        turboOn = false;
    }

    /**
     * Calculates a speed factor based on whether the turbo is turned on or not and based on the engine power.
     *
     * @return the speed factor calculated in this method
     */
    public double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return enginePower * 0.01 * turbo;
    }

    /**
     * Increases the current speed by a specified amount based on the current speed and the speed factor. Only
     * increases the speed if the current speed is less than the engine power of the car. If the speed becomes
     * greater than the engine power of the car then the current speed will always equal the engine power.
     *
     * @param amount the amount to increase the speed by.
     * @see Car
     * @see #speedFactor()
     */
    public void incrementSpeed(double amount){
        currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount, enginePower);
    }

    /**
     * Decreases the current speed by a specified amount based on the current speed and the speed factor. Only
     * decreases the speed if the current speed is greater than 0. If the speed decrease becomes less than 0 then the current
     * will always be 0.
     *
     * @param amount the amount to decrease the speed by.
     * @see Car
     * @see #speedFactor()
     */
    public void decrementSpeed(double amount){
        currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount, 0);
    }
}