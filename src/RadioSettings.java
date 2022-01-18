/**
 * @file RadioSettings.java
 * @author Majo Gil - 20337
 * @author Guillermo Stantos - 191517
 * @author Sebastian Villatoro - 211039
 * @date 20/01/2022
 */



public class RadioSettings implements Radio {

    private double amStation;
    private double fmStation;
    private boolean turnOn;
    private final double [] amList = new double[12];
    private final double [] fmList = new double[12];
    private boolean frequency;

    
    /** 
     * Indicates if radio is on
     * @return boolean
     */
    @Override
    public boolean isOn() {
        return turnOn;
    }

    /** 
     * Turns radio on/off
     */
    @Override
    public void turnOnOff() {
        turnOn = !turnOn;
    }

    
    /** 
     * Goes to the next station
     * @param station
     */
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

    
    /** 
     * Goes to previous station
     * @param station
     */
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

    
    /** 
     * Indicates actual station
     * @return double
     */
    @Override
    public double getStation() {
        if (frequency) return amStation;
        else return fmStation;
    }

    
    /** 
     * Saves station in array
     * @param position
     * @param station
     */
    @Override
    public void saveStation(int position, double station) {
        if(frequency) amList[position] = station;
         else fmList[position] = station;
    }

    
    /** 
     * gets saved station
     * @param position
     * @return double
     */
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

    
    /** 
     * gets what frequency radio is on
     * @return boolean
     */
    @Override
    public boolean getFrequency() {
        return frequency;
    }

    /** 
     * Switches radio frequency
     */
    @Override
    public void switchAMFM() {
        frequency = !frequency;
    }

    /** 
     * Constructor
     */
    public RadioSettings(){
        turnOn = false;
        frequency = false;
        amStation = 530;
        fmStation = 87.9;
    }


}
