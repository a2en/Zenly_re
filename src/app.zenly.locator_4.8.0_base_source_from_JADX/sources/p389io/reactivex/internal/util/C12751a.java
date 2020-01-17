package p389io.reactivex.internal.util;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p389io.reactivex.functions.Function;

/* renamed from: io.reactivex.internal.util.a */
public enum C12751a implements Callable<List<Object>>, Function<Object, List<Object>> {
    INSTANCE;

    /* renamed from: a */
    public static <T> Callable<List<T>> m33342a() {
        return INSTANCE;
    }

    public List<Object> apply(Object obj) throws Exception {
        return new ArrayList();
    }

    public List<Object> call() throws Exception {
        return new ArrayList();
    }
}
