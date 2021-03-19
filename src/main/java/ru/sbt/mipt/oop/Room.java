package ru.sbt.mipt.oop;

import java.util.Collection;

public class Room {
    private Collection<Light> lights;
    private Collection<NextDoor> doors;
    private String name;

    public Room(Collection<Light> lights, Collection<NextDoor> doors, String name) {
        this.lights = lights;
        this.doors = doors;
        this.name = name;
    }

    public Collection<Light> getLights() {
        return lights;
    }

    public Collection<NextDoor> getDoors() {
        return doors;
    }

    public String getName() {
        return name;
    }
}
