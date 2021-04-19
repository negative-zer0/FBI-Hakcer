package net.unix.fbihakcer;

import net.unix.fbihakcer.util.ConditionUtil;
import java.util.stream.IntStream;

/**
 * @author Unix
 * @since 19.04.2021
 */

public class ApplicationContext {

    public static void main(String[] args) {
        println("Starting Hack...");

        IntStream.range(0, 120).forEachOrdered(i -> {
            final int value = i;
            ConditionUtil.check(i % 20 == 0, () -> println("Hacking FBI " + value + "%"));
            sleep(100L);
        });

        println("FBI Hacked Successfully");
    }

    private static void println(String text) {
        System.out.println(text);
    }

    private static void sleep(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException ignored) {}
    }

}