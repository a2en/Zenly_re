package app.zenly.locator.chat.panel.emojis.gesture;

import app.zenly.locator.chat.panel.emojis.gesture.RecyclerViewItemGestureHelper.OnItemGestureListener;
import kotlin.jvm.internal.C12932j;
import p389io.reactivex.p406n.C12789c;

/* renamed from: app.zenly.locator.chat.panel.emojis.gesture.a */
public final class C2247a implements OnItemGestureListener {

    /* renamed from: a */
    private final C12789c<Integer> f6878a;

    /* renamed from: b */
    private final C12789c<Integer> f6879b;

    /* renamed from: c */
    private final C12789c<Boolean> f6880c;

    public C2247a() {
        C12789c<Integer> s = C12789c.m33462s();
        String str = "PublishSubject.create<Int>()";
        C12932j.m33815a((Object) s, str);
        this.f6878a = s;
        C12789c<Integer> s2 = C12789c.m33462s();
        C12932j.m33815a((Object) s2, str);
        this.f6879b = s2;
        C12789c<Boolean> s3 = C12789c.m33462s();
        C12932j.m33815a((Object) s3, "PublishSubject.create<Boolean>()");
        this.f6880c = s3;
    }

    /* renamed from: a */
    public final C12789c<Integer> mo8118a() {
        return this.f6878a;
    }

    /* renamed from: b */
    public final C12789c<Boolean> mo8119b() {
        return this.f6880c;
    }

    /* renamed from: c */
    public final C12789c<Integer> mo8120c() {
        return this.f6879b;
    }

    public void onClick(int i) {
        this.f6879b.onNext(Integer.valueOf(i));
    }

    public void onStartLongPress(int i) {
        this.f6878a.onNext(Integer.valueOf(i));
    }

    public void onStopLongPress(int i) {
        this.f6880c.onNext(Boolean.valueOf(false));
    }
}
