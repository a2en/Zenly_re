package app.zenly.locator.userprofile.p198me.p201i;

import android.content.Context;
import com.airbnb.lottie.C8506c;
import com.airbnb.lottie.C8507d;
import com.airbnb.lottie.C8533h;
import com.airbnb.lottie.LottieListener;
import kotlin.C12956q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.userprofile.me.i.a */
public final class C6099a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C8533h<C8506c> f15340a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C8506c f15341b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f15342c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Function1<C8506c, C12956q> f15343d;

    /* renamed from: app.zenly.locator.userprofile.me.i.a$a */
    public static final class C6100a implements LottieListener<C8506c> {

        /* renamed from: a */
        final /* synthetic */ C6099a f15344a;

        C6100a(C6099a aVar) {
            this.f15344a = aVar;
        }

        /* renamed from: a */
        public void onResult(C8506c cVar) {
            C12932j.m33818b(cVar, "result");
            this.f15344a.f15341b = cVar;
            if (this.f15344a.f15342c) {
                this.f15344a.f15343d.invoke(cVar);
            }
            this.f15344a.f15340a.mo23034d(this);
        }
    }

    public C6099a(Context context, int i, Function1<? super C8506c, C12956q> function1) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(function1, "actionPlay");
        this.f15343d = function1;
        this.f15340a = C8507d.m19679a(context, i);
        m16880b();
    }

    /* renamed from: b */
    private final void m16880b() {
        this.f15340a.mo23032b(new C6100a(this));
    }

    /* renamed from: a */
    public final void mo13926a() {
        this.f15342c = true;
        C8506c cVar = this.f15341b;
        if (cVar != null) {
            this.f15343d.invoke(cVar);
        }
    }
}
