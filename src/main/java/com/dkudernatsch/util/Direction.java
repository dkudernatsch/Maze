package com.dkudernatsch.util;

/**
 * Created by dkude on 21/08/2016.
 */
public enum Direction {
    North(0), East(1), South(2), West(3);

    final int directionCode;

    Direction(int code){
        this.directionCode = code;
    }

    public int getDirectionCode() {
        return directionCode;
    }

    public static Direction getDirection(int code){
        switch (code){
            case 0:
                return North;
            case 1:
                return East;
            case 2:
                return South;
            case 3:
                return West;
            default:return null;
        }
    }

    public static Direction getDirection(int x, int y){
        if(x == 0){
            if(y < 0)
               return North;
            else
                return South;
        }
        if(y == 0) {
            if (x < 0)
                return West;
            else
                return East;
        }
        return null;
    }
}
