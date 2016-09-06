package com.dkudernatsch.entities.movingStrategy;

import java.security.PublicKey;

/**
 * Created by dkude on 20/08/2016.
 */
public interface MovingStrategy {
    boolean move(int deltaX, int deltaY);
}
