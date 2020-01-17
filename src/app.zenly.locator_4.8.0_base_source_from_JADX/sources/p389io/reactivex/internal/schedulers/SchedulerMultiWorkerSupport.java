package p389io.reactivex.internal.schedulers;

import p389io.reactivex.C12286f.C12289c;

/* renamed from: io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport */
public interface SchedulerMultiWorkerSupport {

    /* renamed from: io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport$WorkerCallback */
    public interface WorkerCallback {
        void onWorker(int i, C12289c cVar);
    }

    void createWorkers(int i, WorkerCallback workerCallback);
}
