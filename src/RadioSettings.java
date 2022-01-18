


public class RadioSettings implements Radio{

    private double amStation;
    private double fmStation;
    private boolean turnOn;
    private final double [] amList = new double[12];
    private final double [] fmList = new double[12];
    private boolean frequency;

    @Override
    public boolean isOn() {
        return turnOn;
    }

    @Override
    public void turnOnOff() {
        turnOn = !turnOn;
    }

    @Override
    public void nextStation(boolean station) {
        if (station){
            if (amStation == 1610){
                amStation = 530;
            } else {
                amStation += 10;
            }
        } else {
            if(fmStation == 107.9){
                fmStation = 87.9;
            } else {
                fmStation += 0.2;
            }
        }
    }

    @Override
    public void prevStation(boolean station) {
        if (station){
            if (amStation == 530) amStation = 1610;
             else amStation -= 10;
        } else {
            if(fmStation == 87.9) fmStation = 107.9;
             else fmStation -= 0.2;
        }
    }

    @Override
    public double getStation() {
        if (frequency) return amStation;
        else return fmStation;
    }

    @Override
    public void saveStation(int position, double station) {
        if(frequency) amList[position] = station;
         else fmList[position] = station;
    }

    @Override
    public double getSavedStation(int position) {
        if (frequency){
            amStation = amList[position];
            return amStation;
        } else {
            fmStation = fmList[position];
            return fmStation;
        }
    }

    @Override
    public boolean getFrequency() {
        return frequency;
    }

    @Override
    public void switchAMFM() {
        frequency = !frequency;
    }

    public RadioSettings(){
        turnOn = false;
        frequency = false;
        amStation = 530;
        fmStation = 87.9;
    }
}
