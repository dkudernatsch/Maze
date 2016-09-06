package com.dkudernatsch.util;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Created by dkude on 19/08/2016.
 */
public interface Factorizable<T> {
    Supplier<? extends T> getFactory();
}
