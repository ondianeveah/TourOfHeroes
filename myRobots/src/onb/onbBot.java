package onb;

import robocode.Robot;
import robocode.ScannedRobotEvent;

public class onbBot extends Robot {
	public void run() {
		turnLeft (getHeading() % 90);
		turnGunRight(90);
		while(true) {
			ahead(100);
			turnGunRight(360);
			back(100);
			turnGunRight(360);
			
		}
	}
	
	public void onScannedRobot (ScannedRobotEvent e) {
		fire(1);
	}
}
