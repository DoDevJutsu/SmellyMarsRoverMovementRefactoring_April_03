package com.dodevjutsu.rover.directions;

import com.dodevjutsu.rover.Coordinates;
import com.dodevjutsu.rover.Direction;

public class West extends Direction {
    @Override
    public Direction rotateRight() {
        return north();
    }

    @Override
    public Direction rotateLeft() {
        return south();
    }

    @Override
    public Coordinates displace(Coordinates coordinates, int displacement) {
        return coordinates.add(new Coordinates(-displacement, 0));
    }
}
