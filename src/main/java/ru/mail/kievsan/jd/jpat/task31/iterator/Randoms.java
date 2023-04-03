package ru.mail.kievsan.jd.jpat.task31.iterator;

import java.util.Iterator;
import java.util.Random;


public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected int min, max;

    public Randoms(int min, int max) {
        this.random = new Random();
        this.max = Math.max(min, max);
        this.min = Math.min(min, max);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                int i = max - min + 1;
                return random.nextInt(Math.abs(i)) + min;
            }
        };
    }
}
