package p213co.znly.zenlygocore;

/* renamed from: co.znly.zenlygocore.RxProtoObserver */
public interface RxProtoObserver {
    void completed();

    void error(Exception exc);

    void next(byte[] bArr);
}
