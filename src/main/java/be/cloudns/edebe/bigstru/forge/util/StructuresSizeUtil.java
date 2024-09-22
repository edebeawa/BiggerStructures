package be.cloudns.edebe.bigstru.forge.util;

public final class StructuresSizeUtil {
    public static int clamp(int value, int min, int max) {
        if (min == 0)
            return Math.max(value, min);
        else
            return value;
    }
}