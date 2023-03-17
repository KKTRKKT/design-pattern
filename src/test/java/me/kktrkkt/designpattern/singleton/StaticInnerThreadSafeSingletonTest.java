package me.kktrkkt.designpattern.singleton;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static org.junit.jupiter.api.Assertions.*;

class StaticInnerThreadSafeSingletonTest {

    @Test
    public void instance_exist_only_one() {
        StaticInnerThreadSafeSingleton instance1 = StaticInnerThreadSafeSingleton.getInstance();
        assertEquals(instance1, StaticInnerThreadSafeSingleton.getInstance());
    }

    @Test
    public void safe_multi_threading () throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        List<Future<Object>> futures = executorService.invokeAll(Arrays.asList(StaticInnerThreadSafeSingleton::getInstance, StaticInnerThreadSafeSingleton::getInstance, StaticInnerThreadSafeSingleton::getInstance, StaticInnerThreadSafeSingleton::getInstance));
        List<Object> singletons = new ArrayList<>();
        for (Future<Object> future : futures) {
            singletons.add(future.get());
        }

        singletons.forEach(System.out::println);

        assertEquals(singletons.get(0), singletons.get(1));
        assertEquals(singletons.get(2), singletons.get(3));
    }
}