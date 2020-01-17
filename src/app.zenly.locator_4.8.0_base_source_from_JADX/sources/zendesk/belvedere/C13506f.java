package zendesk.belvedere;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import zendesk.belvedere.BelvedereUi.UiConfig;

/* renamed from: zendesk.belvedere.f */
class C13506f implements ImageStreamMvp$Model {

    /* renamed from: a */
    private final C13511h f35021a;

    /* renamed from: b */
    private final List<MediaIntent> f35022b;

    /* renamed from: c */
    private final List<MediaResult> f35023c;

    /* renamed from: d */
    private final List<MediaResult> f35024d;

    /* renamed from: e */
    private final long f35025e;

    /* renamed from: f */
    private final boolean f35026f;

    C13506f(Context context, UiConfig uiConfig) {
        this.f35021a = new C13511h(context);
        this.f35022b = uiConfig.mo38736b();
        this.f35023c = uiConfig.mo38738d();
        this.f35024d = uiConfig.mo38735a();
        this.f35025e = uiConfig.mo38737c();
        this.f35026f = uiConfig.mo38741f();
    }

    /* renamed from: a */
    private List<MediaResult> m35768a(List<MediaResult> list, List<MediaResult> list2) {
        HashSet hashSet = new HashSet(list.size());
        for (MediaResult e : list) {
            hashSet.add(e.mo38846e());
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size());
        arrayList.addAll(list);
        for (int size = list2.size() - 1; size >= 0; size--) {
            MediaResult mediaResult = (MediaResult) list2.get(size);
            if (!hashSet.contains(mediaResult.mo38846e())) {
                arrayList.add(0, mediaResult);
            }
        }
        return arrayList;
    }

    public List<MediaResult> addToSelectedItems(MediaResult mediaResult) {
        this.f35023c.add(mediaResult);
        return this.f35023c;
    }

    public MediaIntent getCameraIntent() {
        return m35769a(2);
    }

    public MediaIntent getDocumentIntent() {
        return m35769a(1);
    }

    public MediaIntent getGooglePhotosIntent() {
        MediaIntent documentIntent = getDocumentIntent();
        if (documentIntent == null) {
            return null;
        }
        Intent a = documentIntent.mo38826a();
        a.setPackage("com.google.android.apps.photos");
        a.setAction("android.intent.action.GET_CONTENT");
        return documentIntent;
    }

    public List<MediaResult> getLatestImages() {
        return m35768a(this.f35021a.mo38886a(500), m35768a(this.f35024d, this.f35023c));
    }

    public long getMaxFileSize() {
        return this.f35025e;
    }

    public List<MediaResult> getSelectedMediaResults() {
        return this.f35023c;
    }

    public boolean hasCameraIntent() {
        return getCameraIntent() != null;
    }

    public boolean hasDocumentIntent() {
        return getDocumentIntent() != null;
    }

    public boolean hasGooglePhotosIntent() {
        return getDocumentIntent() != null && this.f35021a.mo38887a("com.google.android.apps.photos");
    }

    public List<MediaResult> removeFromSelectedItems(MediaResult mediaResult) {
        this.f35023c.remove(mediaResult);
        return this.f35023c;
    }

    public boolean showFullScreenOnly() {
        return this.f35026f;
    }

    /* renamed from: a */
    private MediaIntent m35769a(int i) {
        for (MediaIntent mediaIntent : this.f35022b) {
            if (mediaIntent.mo38829c() == i) {
                return mediaIntent;
            }
        }
        return null;
    }
}
