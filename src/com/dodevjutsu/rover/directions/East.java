package com.dodevjutsu.rover.directions;

import com.dodevjutsu.rover.Coordinates;
import com.dodevjutsu.rover.Direction;

public class East extends Direction {
    @Override
    public Direction rotateRight() {
        return south();
    }

    @Override
    public Direction rotateLeft() {
        return north();
    }

    @Override
    public Coordinates displace(Coordinates coordinates, int displacement) {
        return coordinates.add(new Coordinates(displacement, 0));
    }
}
