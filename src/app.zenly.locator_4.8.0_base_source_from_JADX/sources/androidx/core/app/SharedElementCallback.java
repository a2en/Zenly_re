package androidx.core.app;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Parcelable;
import android.view.View;
import java.util.List;
import java.util.Map;

public abstract class SharedElementCallback {

    public interface OnSharedElementsReadyListener {
        void onSharedElementsReady();
    }

    /* renamed from: a */
    public abstract Parcelable mo3014a(View view, Matrix matrix, RectF rectF);

    /* renamed from: a */
    public abstract View mo3015a(Context context, Parcelable parcelable);

    /* renamed from: a */
    public abstract void mo3016a(List<View> list);

    /* renamed from: a */
    public abstract void mo3017a(List<String> list, List<View> list2, OnSharedElementsReadyListener onSharedElementsReadyListener);

    /* renamed from: a */
    public abstract void mo3018a(List<String> list, List<View> list2, List<View> list3);

    /* renamed from: a */
    public abstract void mo3019a(List<String> list, Map<String, View> map);

    /* renamed from: b */
    public abstract void mo3020b(List<String> list, List<View> list2, List<View> list3);
}
