package zendesk.belvedere;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import zendesk.belvedere.BelvedereUi.UiConfig;
import zendesk.belvedere.p428s.C13541i;

public class ImageStream extends Fragment {

    /* renamed from: e */
    private WeakReference<KeyboardHelper> f34943e = new WeakReference<>(null);

    /* renamed from: f */
    private List<WeakReference<Listener>> f34944f = new ArrayList();

    /* renamed from: g */
    private List<WeakReference<ScrollListener>> f34945g = new ArrayList();

    /* renamed from: h */
    private C13512i f34946h = null;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public UiConfig f34947i = null;

    /* renamed from: j */
    private boolean f34948j = false;

    /* renamed from: k */
    private C13521l f34949k;

    public interface Listener {
        void onDismissed();

        void onMediaDeselected(List<MediaResult> list);

        void onMediaSelected(List<MediaResult> list);

        void onVisible();
    }

    public interface ScrollListener {
        void onScroll(int i, int i2, float f);
    }

    /* renamed from: zendesk.belvedere.ImageStream$a */
    class C13476a extends C13492c<List<MediaResult>> {
        C13476a() {
        }

        public void success(List<MediaResult> list) {
            ArrayList arrayList = new ArrayList(list.size());
            for (MediaResult mediaResult : list) {
                if (mediaResult.mo38848f() <= ImageStream.this.f34947i.mo38737c() || ImageStream.this.f34947i.mo38737c() == -1) {
                    arrayList.add(mediaResult);
                }
            }
            if (arrayList.size() != list.size()) {
                Toast.makeText(ImageStream.this.getContext(), C13541i.belvedere_image_stream_file_too_large, 0).show();
            }
            ImageStream.this.mo38777b(arrayList);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo38777b(List<MediaResult> list) {
        for (WeakReference weakReference : this.f34944f) {
            Listener listener = (Listener) weakReference.get();
            if (listener != null) {
                listener.onMediaSelected(list);
            }
        }
    }

    /* renamed from: c */
    public boolean mo38778c() {
        return this.f34946h != null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo38779d() {
        for (WeakReference weakReference : this.f34944f) {
            Listener listener = (Listener) weakReference.get();
            if (listener != null) {
                listener.onDismissed();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo38780e() {
        for (WeakReference weakReference : this.f34944f) {
            Listener listener = (Listener) weakReference.get();
            if (listener != null) {
                listener.onVisible();
            }
        }
    }

    /* renamed from: f */
    public boolean mo38781f() {
        return this.f34948j;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C13489a.m35734a(getContext()).mo38865a(i, i2, intent, new C13476a(), false);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        this.f34949k = new C13521l(getContext());
    }

    public void onPause() {
        super.onPause();
        C13512i iVar = this.f34946h;
        if (iVar != null) {
            iVar.dismiss();
            this.f34948j = true;
            return;
        }
        this.f34948j = false;
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (!this.f34949k.mo38900a(this, i, strArr, iArr)) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38774a(KeyboardHelper keyboardHelper) {
        this.f34943e = new WeakReference<>(keyboardHelper);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38775a(C13512i iVar, UiConfig uiConfig) {
        this.f34946h = iVar;
        if (uiConfig != null) {
            this.f34947i = uiConfig;
        }
    }

    /* renamed from: b */
    public KeyboardHelper mo38776b() {
        return (KeyboardHelper) this.f34943e.get();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38769a(int i, int i2, float f) {
        for (WeakReference weakReference : this.f34945g) {
            ScrollListener scrollListener = (ScrollListener) weakReference.get();
            if (scrollListener != null) {
                scrollListener.onScroll(i, i2, f);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38770a(List<MediaResult> list) {
        for (WeakReference weakReference : this.f34944f) {
            Listener listener = (Listener) weakReference.get();
            if (listener != null) {
                listener.onMediaDeselected(list);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38771a(List<MediaIntent> list, C13525d dVar) {
        this.f34949k.mo38899a((Fragment) this, list, dVar);
    }

    /* renamed from: a */
    public void mo38772a(Listener listener) {
        this.f34944f.add(new WeakReference(listener));
    }

    /* renamed from: a */
    public void mo38773a(ScrollListener scrollListener) {
        this.f34945g.add(new WeakReference(scrollListener));
    }

    /* renamed from: a */
    public void mo38768a() {
        if (mo38778c()) {
            this.f34946h.dismiss();
        }
    }
}
