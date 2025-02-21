/*
 * 
 */
package controll;


import java.util.Timer;
import java.util.TimerTask;

public class Time {

    public int delay = 300000; // 5 minutes in milliseconds

    public void restart() {
        Timer check = new Timer();
        check.schedule(new TimerTask() {
            @Override
            public void run() {
                // Close the frame from the Gamemodeone class
                Gamemodeone.frame.dispose();
                
                // Close the frame from the Selectmode class
                Selectmode.frame.dispose();
                
                // Set the 'finished' status in the Gamemodeone class to "cancelled"
                Gamemodeone.finished = "cancelled";
                
                // Create a new Selectmode object to restart the selection mode
                new Selectmode();
            }
        }, delay); // Execution after the specified delay
    }
}

