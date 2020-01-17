package p333g.p369e.p372c.p377d;

import android.view.View;
import android.view.View.OnClickListener;
import p333g.p369e.p372c.p373b.C12107a;
import p333g.p369e.p372c.p373b.C12108b;
import p389io.reactivex.C12279e;
import p389io.reactivex.Observer;
import p389io.reactivex.p390h.C12292a;

/* renamed from: g.e.c.d.b */
final class C12116b extends C12279e<Object> {

    /* renamed from: e */
    private final View f31541e;

    /* renamed from: g.e.c.d.b$a */
    static final class C12117a extends C12292a implements OnClickListener {

        /* renamed from: f */
        private final View f31542f;

        /* renamed from: g */
        private final Observer<? super Object> f31543g;

        C12117a(View view, Observer<? super Object> observer) {
            this.f31542f = view;
            this.f31543g = observer;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo6944a() {
            this.f31542f.setOnClickListener(null);
        }

        public void onClick(View view) {
            if (!isDisposed()) {
                this.f31543g.onNext(C12107a.INSTANCE);
            }
        }
    }

    C12116b(View view) {
        this.f31541e = view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo35836a(Observer<? super Object> observer) {
        if (C12108b.m31970a(observer)) {
            C12117a aVar = new C12117a(this.f31541e, observer);
            observer.onSubscribe(aVar);
            this.f31541e.setOnClickListener(aVar);
        }
    }
}
