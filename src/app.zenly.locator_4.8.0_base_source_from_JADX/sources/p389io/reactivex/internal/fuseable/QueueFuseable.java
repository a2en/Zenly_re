package p389io.reactivex.internal.fuseable;

/* renamed from: io.reactivex.internal.fuseable.QueueFuseable */
public interface QueueFuseable<T> extends SimpleQueue<T> {
    int requestFusion(int i);
}
