package me.kktrkkt.designpattern.singleton;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static org.junit.jupiter.api.Assertions.*;

class EnumSingletonTest {

    @Test
    public void instance_exist_only_one() {
        EnumSingleton instance1 = EnumSingleton.INSTANCE;
        assertEquals(instance1, EnumSingleton.INSTANCE);
    }

    @Test
    public void safe_multi_threading () throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        List<Future<Object>> futures = executorService.invokeAll(Arrays.asList(()->EnumSingleton.INSTANCE, ()->EnumSingleton.INSTANCE, ()->EnumSingleton.INSTANCE, ()->EnumSingleton.INSTANCE));
        List<Object> singletons = new ArrayList<>();
        for (Future<Object> future : futures) {
            singletons.add(future.get());
        }

        singletons.forEach(System.out::println);

        assertEquals(singletons.get(0), singletons.get(1));
        assertEquals(singletons.get(2), singletons.get(3));
    }

    @Test
    public void safe_reflection (){
        Constructor<?>[] declaredConstructors = EnumSingleton.class.getDeclaredConstructors();
        for (Constructor<?> constructor : declaredConstructors) {
            constructor.setAccessible(true);
            assertThrows(IllegalArgumentException.class, () -> {
                constructor.newInstance("INSTANCE");
            });
        }
    }

    @Test
    public void safe_serializable () throws IOException, ClassNotFoundException {
        try(ObjectOutput out = new ObjectOutputStream(new FileOutputStream("EnumSingleton"))){
            out.writeObject(EnumSingleton.INSTANCE);
        }

        try(ObjectInput in = new ObjectInputStream(new FileInputStream("EnumSingleton"))) {
            assertEquals(EnumSingleton.INSTANCE, in.readObject());
        }
    }
}