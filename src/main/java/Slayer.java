import robocode.*;
import java.awt.Color;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html

/**
 * Slayer - a robot by (your name here)
 */
public class Slayer extends Robot
{
	/**
	 * run: Slayer's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:

       // Set robot colors
        setBodyColor(java.awt.Color.blue);
        setGunColor(java.awt.Color.blue);
        setRadarColor(java.awt.Color.blue);
        setScanColor(java.awt.Color.blue);
        setBulletColor(java.awt.Color.blue);

		// Robot main loop
		//Dummy comment
		while(true) {
           setAhead(200);
            // Turn the radar
            setTurnRadarRight(360);
            // Turn right
            setTurnRight(90);
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
       // Calculate firepower based on distance
        double firePower = Math.min(3.0, getEnergy() / 4);
        // Turn gun towards the enemy
        setTurnGunRight(getHeading() - getGunHeading() + e.getBearing());
        // Fire!
        fire(firePower);
	}

    public void onHitByBullet(HitByBulletEvent e) {
        // When hit by a bullet, turn randomly to evade future shots
        setTurnRight(45 + Math.random() * 90);
        setAhead(100);
    }

    public void onHitWall(HitWallEvent e) {
        // If we hit a wall, reverse and turn to avoid getting stuck
        setBack(100);
        setTurnRight(90);
    }	
}
