package ru.netology;

public class Radio {
    private int currentStation;
    private int maxStation;
    private int minStation;
    private int volume;
    private int maxVolume;
    private int minVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation){
            return;}
        if (currentStation < minStation){
            return;}
        this.currentStation = currentStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume> maxVolume){
            return;}
        if (volume < minVolume){
            return;}
        this.volume = volume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public void increaseStation(){
        int nextStation = currentStation + 1;
        if (nextStation > maxStation) {
        this.currentStation = minStation;}
        else
        this.currentStation = nextStation;
        }

    public void decreaseStation(){
        int prevStation = currentStation - 1;
        if (prevStation < minStation) {
            this.currentStation = maxStation;}
        else
        this.currentStation = prevStation;
    }
    public void increaseVolume(){
        int nextVolume = volume + 1;
        if (nextVolume > maxVolume) {
            this.volume = maxVolume;}
        else
            this.volume = nextVolume;
    }
    public void decreaseVolume(){
        int prevVolume = volume - 1;
        if (prevVolume < minVolume) {
            this.volume = minVolume;}
        else
            this.volume = prevVolume;
    }
}
