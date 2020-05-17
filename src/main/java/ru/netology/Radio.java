package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Radio {
    private int currentStation;
    private int maxStation = 10;
    private int minStation;
    private int volume;
    private int maxVolume = 100;
    private int minVolume;

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
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

    public void increaseStation() {
        if (currentStation == maxStation) {
            this.currentStation = minStation;
        } else {
            this.currentStation = ++currentStation;
        }
    }

    public void decreaseStation() {
        if (currentStation == minStation) {
            this.currentStation = maxStation;
        } else {
            this.currentStation = --currentStation;
        }
    }

    public void increaseVolume() {
        if (volume == maxVolume) {
            this.volume = maxVolume;
        } else {
            this.volume = ++volume;
        }
    }

    public void decreaseVolume() {
        if (volume == minVolume) {
            this.volume = minVolume;
        } else {
            this.volume = --volume;
        }
    }
}
