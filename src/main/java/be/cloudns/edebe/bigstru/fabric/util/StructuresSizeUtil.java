package be.cloudns.edebe.bigstru.fabric.util;

public final class StructuresSizeUtil {
    public static int clamp(int value, int min, int max) {
        if (min == 0)
            return Math.max(value, min);
        else
            return value;
    }
}