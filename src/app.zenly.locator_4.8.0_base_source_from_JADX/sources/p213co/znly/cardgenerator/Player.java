package p213co.znly.cardgenerator;

import android.content.res.AssetManager;

/* renamed from: co.znly.cardgenerator.Player */
public class Player {

    /* renamed from: a */
    private long f15920a = 0;

    public Player(AssetManager assetManager, int i, int i2) {
        nativeSetAndroidAssetManager(assetManager);
        this.f15920a = newPlayer(i, i2);
    }

    private native long animationDuration(long j);

    private native void dispose(long j);

    private native void draw(long j, long j2);

    private native boolean load(long j, String str, String[][] strArr);

    private native void nativeSetAndroidAssetManager(AssetManager assetManager);

    private native long newPlayer(int i, int i2);

    private native void setPlayCount(long j, int i);

    /* renamed from: a */
    public void mo14216a(long j) {
        draw(this.f15920a, j);
    }

    /* renamed from: b */
    public void mo14218b() {
        dispose(this.f15920a);
        this.f15920a = 0;
    }

    /* renamed from: a */
    public boolean mo14217a(String str, String[][] strArr) {
        return load(this.f15920a, str, strArr);
    }

    /* renamed from: a */
    public long mo14214a() {
        return animationDuration(this.f15920a);
    }

    /* renamed from: a */
    public void mo14215a(int i) {
        setPlayCount(this.f15920a, i);
    }
}
