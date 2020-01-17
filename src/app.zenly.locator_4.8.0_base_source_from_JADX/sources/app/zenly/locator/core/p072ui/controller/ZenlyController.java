package app.zenly.locator.core.p072ui.controller;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.core.view.ViewCompat;
import app.zenly.android.feature.base.app.BaseAppCompatActivity;
import app.zenly.android.feature.base.view.C1363a;
import app.zenly.android.feature.base.view.WindowInsetsListener;
import app.zenly.locator.core.app.BaseActivity;
import com.bluelinelabs.conductor.C8819d;
import com.bluelinelabs.conductor.C8819d.C8827h;
import com.bluelinelabs.conductor.C8829e;
import com.bluelinelabs.conductor.ControllerChangeHandler;
import com.bluelinelabs.conductor.p290i.C8839b;
import java.util.LinkedList;
import java.util.List;

/* renamed from: app.zenly.locator.core.ui.controller.ZenlyController */
public abstract class ZenlyController extends C8839b implements WindowInsetsListener {

    /* renamed from: K */
    private boolean f8544K;

    /* renamed from: L */
    private boolean f8545L;

    /* renamed from: M */
    private boolean f8546M;

    /* renamed from: N */
    private BaseActivity f8547N;

    /* renamed from: O */
    private List<ChangeStartedCallback> f8548O;

    /* renamed from: app.zenly.locator.core.ui.controller.ZenlyController$ChangeStartedCallback */
    public interface ChangeStartedCallback {
        void onChangeStarted();
    }

    /* renamed from: app.zenly.locator.core.ui.controller.ZenlyController$a */
    class C3096a extends C8827h {
        C3096a() {
        }

        /* renamed from: a */
        public void mo9317a(C8819d dVar, View view) {
            super.mo9317a(dVar, view);
            if (ZenlyController.this.mo7192B()) {
                ViewCompat.m2809I(view);
            }
        }

        /* renamed from: b */
        public void mo9319b(C8819d dVar, View view) {
            super.mo9319b(dVar, view);
            if (ZenlyController.this.mo7192B()) {
                C1363a.m6387a(view, ZenlyController.this);
            }
        }

        /* renamed from: b */
        public void mo9318b(C8819d dVar) {
            super.mo9318b(dVar);
            ZenlyController.this.mo23928b((C8827h) this);
        }
    }

    public ZenlyController() {
        this(null);
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public boolean mo7192B() {
        return ((BaseAppCompatActivity) mo9304A()).mo6505a();
    }

    /* renamed from: A */
    public final Activity mo9304A() {
        Activity b = mo23920b();
        if (b != null) {
            return b;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        if (mo23920b() instanceof BaseActivity) {
            this.f8547N = (BaseActivity) mo23920b();
        }
        super.mo7052b(view);
        if (!this.f8545L) {
            this.f8545L = true;
            mo7097y();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo7066c(View view) {
        C1363a.m6387a(view, null);
        super.mo7066c(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo7053d(View view) {
        this.f8547N = null;
        super.mo7053d(view);
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
    }

    /* renamed from: u */
    public BaseActivity mo9312u() {
        return this.f8547N;
    }

    /* renamed from: v */
    public boolean mo9313v() {
        return this.f8544K;
    }

    /* renamed from: w */
    public boolean mo7339w() {
        return true;
    }

    /* renamed from: x */
    public boolean mo9314x() {
        return this.f8546M;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo7097y() {
    }

    /* renamed from: z */
    public void mo9315z() {
    }

    public ZenlyController(Bundle bundle) {
        super(bundle);
        this.f8548O = new LinkedList();
        mo23911a((C8827h) new C3096a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9305a(Bundle bundle) {
        super.mo9305a(bundle);
        this.f8545L = bundle.getBoolean("state:zenlyController:wasAttached", false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo9309c(ControllerChangeHandler controllerChangeHandler, C8829e eVar) {
        super.mo9309c(controllerChangeHandler, eVar);
        this.f8546M = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo9310d(ControllerChangeHandler controllerChangeHandler, C8829e eVar) {
        super.mo9310d(controllerChangeHandler, eVar);
        this.f8546M = true;
        for (ChangeStartedCallback onChangeStarted : this.f8548O) {
            onChangeStarted.onChangeStarted();
        }
    }

    /* renamed from: a */
    public void mo9306a(ChangeStartedCallback changeStartedCallback) {
        if (!this.f8548O.contains(changeStartedCallback)) {
            this.f8548O.add(changeStartedCallback);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo9307b(Bundle bundle) {
        bundle.putBoolean("state:zenlyController:wasAttached", this.f8545L);
        super.mo9307b(bundle);
    }

    /* renamed from: d */
    public void mo9311d(boolean z) {
        this.f8544K = z;
    }

    /* renamed from: b */
    public void mo9308b(ChangeStartedCallback changeStartedCallback) {
        this.f8548O.remove(changeStartedCallback);
    }
}
