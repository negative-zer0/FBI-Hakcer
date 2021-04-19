package net.unix.fbihakcer.util;

/**
 * @author Unix
 * @since 19.04.2021
 */

public final class ConditionUtil {

    private ConditionUtil() {
    }

    public static void check(boolean bool, Runnable runnable) {
        if (!bool) {
            return;
        }

        runnable.run();
    }

}