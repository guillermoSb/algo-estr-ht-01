
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    private final RadioSettings radioSettings = new RadioSettings();    // Create a RadioSettings instance

    @Test
    void retrieveStation() {
        assertNotNull(radioSettings.getStation());  // Just check that the class is returning a double as a station.
    }

    @Test
    void retrieveFrequency() {
        assertNotNull(radioSettings.getFrequency());    // Check that the class is returning a value on the frequency.
    }

    @Test
    void switchStations() {
        double currentStation = radioSettings.getStation();
        assertNotNull(currentStation, "currentStation cannot be null"); // Check if the current station exists.
        radioSettings.nextStation(radioSettings.getFrequency());    // Go to the next station on the current frequency.
        // The tests are different depending on the frequency
        if (radioSettings.getFrequency()) {
            assertTrue(radioSettings.getStation() == currentStation + 10 || radioSettings.getStation() == 530);
        } else {
            assertTrue(radioSettings.getStation() == currentStation + 0.2 ||
                                radioSettings.getStation() == 87.9);
        }
        // Assert that the back dial is working
        radioSettings.prevStation(radioSettings.getFrequency());    // Go back on the current frequency
        assertTrue(currentStation == radioSettings.getStation(),
                "The current station should be equal to the one in radioSettings");
    }

    @Test
    void switchOnState() {
        boolean currentState = radioSettings.isOn();    // Get the current state
        assertNotNull(currentState, "The current state cannot be null.");
        radioSettings.turnOnOff();  // Change the on state
        assertTrue(radioSettings.isOn() != currentState,
                "Previous state cannot be equal to current state");  // The new state cannot be equal to the prev state.
    }

    @Test
    void saveStation() {
        radioSettings.saveStation(0, 94.9); // Save a station on the first position
        assertNotNull(radioSettings.getSavedStation(0));    // Assert that the current saved station is not null.
        assertNotEquals(0, radioSettings.getSavedStation(0), "The saved station should " +
                        "not be 0.");
    }



    
}
