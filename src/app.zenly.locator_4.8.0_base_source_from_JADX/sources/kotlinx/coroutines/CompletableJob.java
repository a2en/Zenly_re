package kotlinx.coroutines;

public interface CompletableJob extends Job {
    boolean complete();

    boolean completeExceptionally(Throwable th);
}
