package ru.sbt.mipt.oop;

public class NextDoor {
    private final String id;
    private boolean isOpen;
    private int x = 1;

    public NextDoor(boolean isOpen, String id) {
        this.isOpen = isOpen;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
}
