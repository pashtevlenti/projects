package ru.itis.inf301.one;

public class InvalidTotalScaleException extends Exception{
    int currentScale;
    int validScale;
    public InvalidTotalScaleException(int currentScale, int validScale) {
        this.currentScale = currentScale;
        this.validScale = validScale;
    }

}
