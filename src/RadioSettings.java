


public class RadioSettings implements Radio{

    private double amStation;
    private double fmStation;
    private boolean turnOn;
    private final String[] amList = new String[12];
    private final String[] fmList = new String[12];
    private boolean frequency;

    @Override
    public boolean isOn() {
        return turnOn;
    }

    @Override
    public void turnOnOff() {
        if (turnOn){
            turnOn = false;
        } else {
            turnOn = true;
        }

    }

    @Override
    public void nextStation(boolean station) {

    }

    @Override
    public void prevStation(boolean station) {

    }

    @Override
    public double getStation() {
        return 0;
    }

    @Override
    public void saveStation(int position, double station) {

    }

    @Override
    public double getSavedStation(int position) {
        return 0;
    }

    @Override
    public boolean getFrequency() {
        return false;
    }

    @Override
    public void switchAMFM() {

    }
}
