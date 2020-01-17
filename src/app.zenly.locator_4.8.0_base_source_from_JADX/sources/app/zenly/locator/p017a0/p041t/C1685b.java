package app.zenly.locator.p017a0.p041t;

import android.text.Editable;
import android.text.TextWatcher;
import app.zenly.android.feature.polenta.widget.SearchBar;
import kotlin.jvm.internal.C12932j;
import p333g.p369e.p372c.C12106a;
import p389io.reactivex.Observer;
import p389io.reactivex.p390h.C12292a;

/* renamed from: app.zenly.locator.a0.t.b */
public final class C1685b extends C12106a<CharSequence> {

    /* renamed from: e */
    private final SearchBar f5732e;

    /* renamed from: app.zenly.locator.a0.t.b$a */
    private static final class C1686a extends C12292a implements TextWatcher {

        /* renamed from: f */
        private final SearchBar f5733f;

        /* renamed from: g */
        private final Observer<? super CharSequence> f5734g;

        public C1686a(SearchBar searchBar, Observer<? super CharSequence> observer) {
            C12932j.m33818b(searchBar, "view");
            C12932j.m33818b(observer, "observer");
            this.f5733f = searchBar;
            this.f5734g = observer;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo6944a() {
            this.f5733f.mo6900b((TextWatcher) this);
        }

        public void afterTextChanged(Editable editable) {
            C12932j.m33818b(editable, "s");
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C12932j.m33818b(charSequence, "s");
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C12932j.m33818b(charSequence, "s");
            if (!isDisposed()) {
                this.f5734g.onNext(charSequence);
            }
        }
    }

    public C1685b(SearchBar searchBar) {
        C12932j.m33818b(searchBar, "view");
        this.f5732e = searchBar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7298b(Observer<? super CharSequence> observer) {
        C12932j.m33818b(observer, "observer");
        C1686a aVar = new C1686a(this.f5732e, observer);
        observer.onSubscribe(aVar);
        this.f5732e.mo6898a((TextWatcher) aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public CharSequence m7019r() {
        CharSequence text = this.f5732e.getText();
        return text != null ? text : "";
    }
}
