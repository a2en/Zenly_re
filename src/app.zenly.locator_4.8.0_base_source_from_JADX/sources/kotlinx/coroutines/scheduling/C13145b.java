package kotlinx.coroutines.scheduling;

import kotlin.jvm.internal.C12932j;

/* renamed from: kotlinx.coroutines.scheduling.b */
public abstract class C13145b implements Runnable {

    /* renamed from: e */
    public TaskContext f33750e;

    public C13145b(long j, TaskContext taskContext) {
        C12932j.m33818b(taskContext, "taskContext");
        this.f33750e = taskContext;
    }

    public C13145b() {
        this(0, C13144a.f33749b);
    }
}
