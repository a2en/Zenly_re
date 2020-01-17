package com.facebook.drawee.components;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/* renamed from: com.facebook.drawee.components.a */
public class C9586a {

    /* renamed from: b */
    private static final C9586a f24849b = new C9586a();

    /* renamed from: c */
    private static boolean f24850c = true;

    /* renamed from: a */
    private final Queue<C9587a> f24851a = new ArrayBlockingQueue(20);

    /* renamed from: com.facebook.drawee.components.a$a */
    public enum C9587a {
        ON_SET_HIERARCHY,
        ON_CLEAR_HIERARCHY,
        ON_SET_CONTROLLER,
        ON_CLEAR_OLD_CONTROLLER,
        ON_CLEAR_CONTROLLER,
        ON_INIT_CONTROLLER,
        ON_ATTACH_CONTROLLER,
        ON_DETACH_CONTROLLER,
        ON_RELEASE_CONTROLLER,
        ON_DATASOURCE_SUBMIT,
        ON_DATASOURCE_RESULT,
        ON_DATASOURCE_RESULT_INT,
        ON_DATASOURCE_FAILURE,
        ON_DATASOURCE_FAILURE_INT,
        ON_HOLDER_ATTACH,
        ON_HOLDER_DETACH,
        ON_DRAWABLE_SHOW,
        ON_DRAWABLE_HIDE,
        ON_ACTIVITY_START,
        ON_ACTIVITY_STOP,
        ON_RUN_CLEAR_CONTROLLER,
        ON_SCHEDULE_CLEAR_CONTROLLER,
        ON_SAME_CONTROLLER_SKIPPED,
        ON_SUBMIT_CACHE_HIT
    }

    private C9586a() {
    }

    /* renamed from: a */
    public static C9586a m23498a() {
        return f24850c ? new C9586a() : f24849b;
    }

    public String toString() {
        return this.f24851a.toString();
    }

    /* renamed from: a */
    public void mo25834a(C9587a aVar) {
        if (f24850c) {
            if (this.f24851a.size() + 1 > 20) {
                this.f24851a.poll();
            }
            this.f24851a.add(aVar);
        }
    }
}
