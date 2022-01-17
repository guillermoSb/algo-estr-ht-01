public interface Radio {

    boolean isOn();

    void turnOnOff();

    void nextStation(boolean station);

    void prevStation(boolean station);

    double getStation();

    void saveStation(int position, double station);

    double getSavedStation(int position);

    boolean getFrequency();

    void switchAMFM();
}
