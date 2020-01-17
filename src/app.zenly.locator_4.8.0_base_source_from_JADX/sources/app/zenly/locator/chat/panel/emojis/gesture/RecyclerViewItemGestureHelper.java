package app.zenly.locator.chat.panel.emojis.gesture;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import kotlin.jvm.internal.C12932j;
import p387h.p388a.C12143a;

public final class RecyclerViewItemGestureHelper {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public boolean f6870a;

    /* renamed from: b */
    private final WeakHashMap<View, Boolean> f6871b = new WeakHashMap<>();

    /* renamed from: c */
    private int f6872c = 1;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public OnItemGestureListener f6873d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final RecyclerView f6874e;

    public interface OnItemGestureListener {
        void onClick(int i);

        void onStartLongPress(int i);

        void onStopLongPress(int i);
    }

    /* renamed from: app.zenly.locator.chat.panel.emojis.gesture.RecyclerViewItemGestureHelper$a */
    static final class C2244a implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ RecyclerViewItemGestureHelper f6875e;

        C2244a(RecyclerViewItemGestureHelper recyclerViewItemGestureHelper) {
            this.f6875e = recyclerViewItemGestureHelper;
        }

        public final void onClick(View view) {
            C12932j.m33815a((Object) view, "v");
            C12143a.m32027a("Click from %d", Integer.valueOf(view.getId()));
            OnItemGestureListener a = this.f6875e.f6873d;
            if (a != null) {
                a.onClick(this.f6875e.f6874e.mo5085e(view));
            }
        }
    }

    /* renamed from: app.zenly.locator.chat.panel.emojis.gesture.RecyclerViewItemGestureHelper$b */
    static final class C2245b implements OnLongClickListener {

        /* renamed from: e */
        final /* synthetic */ RecyclerViewItemGestureHelper f6876e;

        C2245b(RecyclerViewItemGestureHelper recyclerViewItemGestureHelper) {
            this.f6876e = recyclerViewItemGestureHelper;
        }

        public final boolean onLongClick(View view) {
            C12932j.m33815a((Object) view, "v");
            C12143a.m32027a("Long Click from %d", Integer.valueOf(view.getId()));
            this.f6876e.f6870a = true;
            this.f6876e.f6874e.requestDisallowInterceptTouchEvent(true);
            OnItemGestureListener a = this.f6876e.f6873d;
            if (a != null) {
                a.onStartLongPress(this.f6876e.f6874e.mo5085e(view));
            }
            return true;
        }
    }

    /* renamed from: app.zenly.locator.chat.panel.emojis.gesture.RecyclerViewItemGestureHelper$c */
    static final class C2246c implements OnTouchListener {

        /* renamed from: e */
        final /* synthetic */ RecyclerViewItemGestureHelper f6877e;

        C2246c(RecyclerViewItemGestureHelper recyclerViewItemGestureHelper) {
            this.f6877e = recyclerViewItemGestureHelper;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C12932j.m33815a((Object) motionEvent, "event");
            if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.f6877e.f6870a) {
                C12932j.m33815a((Object) view, "v");
                C12143a.m32027a("Motion up from %d", Integer.valueOf(view.getId()));
                this.f6877e.f6874e.requestDisallowInterceptTouchEvent(false);
                this.f6877e.f6870a = false;
                OnItemGestureListener a = this.f6877e.f6873d;
                if (a != null) {
                    a.onStopLongPress(this.f6877e.f6874e.mo5085e(view));
                }
            }
            return false;
        }
    }

    public RecyclerViewItemGestureHelper(RecyclerView recyclerView) {
        C12932j.m33818b(recyclerView, "parent");
        this.f6874e = recyclerView;
    }

    /* renamed from: a */
    public final void mo8110a(View view) {
        C12932j.m33818b(view, "view");
        if (!this.f6871b.containsKey(view)) {
            this.f6871b.put(view, Boolean.valueOf(true));
            int i = this.f6872c;
            this.f6872c = i + 1;
            view.setId(i);
            view.setOnClickListener(new C2244a(this));
            view.setHapticFeedbackEnabled(false);
            view.setOnLongClickListener(new C2245b(this));
            view.setOnTouchListener(new C2246c(this));
        }
    }

    /* renamed from: a */
    public final void mo8111a(OnItemGestureListener onItemGestureListener) {
        C12932j.m33818b(onItemGestureListener, "listener");
        this.f6873d = onItemGestureListener;
    }
}
