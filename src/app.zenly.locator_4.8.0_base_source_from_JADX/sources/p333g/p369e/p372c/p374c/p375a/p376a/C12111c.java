package p333g.p369e.p372c.p374c.p375a.p376a;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1076n;
import p333g.p369e.p372c.p373b.C12108b;
import p389io.reactivex.C12279e;
import p389io.reactivex.Observer;
import p389io.reactivex.p390h.C12292a;

/* renamed from: g.e.c.c.a.a.c */
final class C12111c extends C12279e<C12110b> {

    /* renamed from: e */
    private final RecyclerView f31536e;

    /* renamed from: g.e.c.c.a.a.c$a */
    final class C12112a extends C12292a {

        /* renamed from: f */
        private final RecyclerView f31537f;

        /* renamed from: g */
        final C1076n f31538g;

        /* renamed from: g.e.c.c.a.a.c$a$a */
        class C12113a extends C1076n {

            /* renamed from: a */
            final /* synthetic */ Observer f31539a;

            C12113a(C12111c cVar, Observer observer) {
                this.f31539a = observer;
            }

            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                if (!C12112a.this.isDisposed()) {
                    this.f31539a.onNext(C12110b.m31974a(recyclerView, i, i2));
                }
            }
        }

        C12112a(C12111c cVar, RecyclerView recyclerView, Observer<? super C12110b> observer) {
            this.f31537f = recyclerView;
            this.f31538g = new C12113a(cVar, observer);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo6944a() {
            this.f31537f.mo5066b(this.f31538g);
        }
    }

    C12111c(RecyclerView recyclerView) {
        this.f31536e = recyclerView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo35836a(Observer<? super C12110b> observer) {
        if (C12108b.m31970a(observer)) {
            C12112a aVar = new C12112a(this, this.f31536e, observer);
            observer.onSubscribe(aVar);
            this.f31536e.mo5047a(aVar.f31538g);
        }
    }
}
