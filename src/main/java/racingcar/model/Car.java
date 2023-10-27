package racingcar.model;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private final String name;
    private int distance;

    public Car(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public void move() {
        int randomNumber = generateRandomNumber();
        if (randomNumber >= 4) {
            distance++;
        }
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }

    private int generateRandomNumber() {
        return Randoms.pickNumberInRange(0, 9);
    }

    @Override
    public String toString() {
        return name + " : " + "-".repeat(distance);
    }
}
