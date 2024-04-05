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
			// Replace the next 4 lines with any behavior you would like
            // Move forward
            ahead(100);
            // Turn the radar
            turnRadarRight(360);
            // Turn right
            turnRight(90);
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like
		fire(1);
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
		back(10);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		back(100);
	}	
}
