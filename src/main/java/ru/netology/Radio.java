package ru.netology;

public class Radio {
    private int currentStation;
    private int maxStation = 10;
    private int minStation;
    private int volume;
    private int maxVolume = 100;
    private int minVolume;

    public Radio() {
    }

    public Radio(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getCurrentStation() {

        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
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
        if (volume > maxVolume) {
            return;
        }
        if (volume < minVolume) {
            return;
        }
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

    public void increaseStation() {
        if (currentStation == maxStation) {
            this.currentStation = minStation;
        } else {
            this.currentStation++;
        }
    }

    public void decreaseStation() {
        if (currentStation == minStation) {
            this.currentStation = maxStation;
        } else {
            this.currentStation--;
        }
    }

    public void increaseVolume() {
        if (volume == maxVolume) {
            return;
        }
        this.volume++;
    }

    public void decreaseVolume() {
        if (volume == minVolume) {
            return;
        }
        this.volume--;
    }
}
