package p213co.znly.cardgenerator;

/* renamed from: co.znly.cardgenerator.MagnumContext */
public class MagnumContext {

    /* renamed from: a */
    private long f15919a;

    public MagnumContext() {
        this.f15919a = 0;
        this.f15919a = newContext();
    }

    private native long dispose(long j);

    private native long newContext();

    /* renamed from: a */
    public void mo14213a() {
        dispose(this.f15919a);
        this.f15919a = 0;
    }
}
