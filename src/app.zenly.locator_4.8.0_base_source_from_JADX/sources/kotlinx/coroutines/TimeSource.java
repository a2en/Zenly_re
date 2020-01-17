package kotlinx.coroutines;

public interface TimeSource {
    long currentTimeMillis();

    long nanoTime();

    void parkNanos(Object obj, long j);

    void registerTimeLoopThread();

    void trackTask();

    void unTrackTask();

    void unpark(Thread thread);

    void unregisterTimeLoopThread();

    Runnable wrapTask(Runnable runnable);
}
