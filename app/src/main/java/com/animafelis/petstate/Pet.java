package com.animafelis.petstate;

public class Pet {
    private int hunger;
    private int happiness;
    private int energy;

    public Pet() {
        hunger = 40;
        happiness = 40;
        energy = 40;
    }

    public int getHunger() {
        return hunger;
    }

    public int getHappiness() {
        return happiness;
    }

    public int getEnergy() {
        return energy;
    }

    public void feed() {
        hunger = clamp(hunger + 25);
        energy = clamp(energy + 5);
    }

    public void play() {
        happiness = clamp(happiness + 25);
        energy = clamp(energy - 15);
        hunger = clamp(hunger - 10);
    }

    public void rest() {
        energy = clamp(energy + 30);
        hunger = clamp(hunger - 5);
    }

    public void ignore() {
        happiness = clamp(happiness - 15);
        hunger = clamp(hunger - 10);
        energy = clamp(energy - 5);
    }

    private int clamp(int value) {
        if (value > 100) return 100;
        if (value < 0) return 0;
        return value;
    }

    public PetState getState() {
        if (hunger <= 20) {
            return PetState.HUNGRY;
        }
        if (energy <= 20) {
            return PetState.TIRED;
        }
        if (happiness <= 20) {
            return PetState.NEGLECTED;
        }
        if (happiness >= 60 && hunger >= 60 && energy >= 60) {
            return PetState.HAPPY;
        }
        return PetState.SAD;
    }
}
