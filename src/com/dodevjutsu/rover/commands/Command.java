package com.dodevjutsu.rover.commands;

import com.dodevjutsu.rover.Vector;

interface Command {
    Vector apply(Vector vector);
}
