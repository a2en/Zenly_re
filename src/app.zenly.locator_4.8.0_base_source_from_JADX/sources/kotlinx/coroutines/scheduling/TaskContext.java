package kotlinx.coroutines.scheduling;

public interface TaskContext {
    void afterTask();

    C13146c getTaskMode();
}
