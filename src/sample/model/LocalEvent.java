package sample.model;

import java.time.LocalDate;

public class LocalEvent {
    private String description;
    private LocalDate date;

    public LocalEvent(LocalDate date, String description) {
        this.description = description;
        this.date = date;
    }


    public void setDescription(String description) {
        this.description = description;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Date: " + this.getDate() + ", Event: " + this.getDescription();
    }
}