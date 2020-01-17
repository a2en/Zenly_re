package app.zenly.locator.chat;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import androidx.core.content.C0540a;
import androidx.recyclerview.widget.RecyclerView;
import app.zenly.android.feature.polenta.graphics.drawable.SmoothRectDrawable;
import app.zenly.locator.R;
import app.zenly.locator.p143s.p151o.C5466b;
import kotlin.C12956q;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p271i.C7707a;

/* renamed from: app.zenly.locator.chat.g5 */
public final class C1995g5 {

    /* renamed from: a */
    private final int f6397a = ((int) 4278242047L);

    /* renamed from: b */
    private final int f6398b = ((int) 4278224639L);

    /* renamed from: c */
    private final int f6399c = C0540a.m2536a(this.f6402f, (int) R.color.gray_light);

    /* renamed from: d */
    private final int f6400d = C0540a.m2536a(this.f6402f, (int) R.color.gray_heavy);

    /* renamed from: e */
    private final int f6401e = C0540a.m2536a(this.f6402f, (int) R.color.transparent);

    /* renamed from: f */
    private final Context f6402f;

    /* renamed from: g */
    private final RecyclerView f6403g;

    /* renamed from: h */
    private final C2335u4 f6404h;

    public C1995g5(Context context, RecyclerView recyclerView, C2335u4 u4Var) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(recyclerView, "list");
        C12932j.m33818b(u4Var, "adapter");
        this.f6402f = context;
        this.f6403g = recyclerView;
        this.f6404h = u4Var;
    }

    /* renamed from: a */
    public final void mo7812a() {
        C7707a.m18761b("chat:updateItemsBackground");
        try {
            int childCount = this.f6403g.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.f6403g.getChildAt(i);
                int e = this.f6403g.mo5085e(childAt);
                if (e != -1) {
                    if (this.f6404h.getItemViewType(e) == 2) {
                        C2396z4 a = this.f6404h.mo8228a(e);
                        C12932j.m33815a((Object) a, "adapter.getBackgroundTint(adapterPosition)");
                        Drawable c = C0540a.m2546c(this.f6402f, R.drawable.inset_smooth_rect_gray_light_cr200);
                        if (c != null) {
                            Drawable mutate = c.mutate();
                            if (mutate != null) {
                                LayerDrawable layerDrawable = (LayerDrawable) mutate;
                                Drawable drawable = layerDrawable.getDrawable(0);
                                int i2 = C1988f5.f6388a[a.ordinal()];
                                if (i2 != 1) {
                                    if (i2 == 2) {
                                        float height = (float) this.f6403g.getHeight();
                                        C5466b bVar = C5466b.f14065a;
                                        int i3 = this.f6397a;
                                        int i4 = this.f6398b;
                                        C12932j.m33815a((Object) childAt, "child");
                                        int a2 = bVar.mo13085a(i3, i4, Math.max(0.0f, Math.min((float) childAt.getTop(), height) / height));
                                        int a3 = C5466b.f14065a.mo13085a(this.f6397a, this.f6398b, Math.max(0.0f, Math.min((float) childAt.getBottom(), height) / height));
                                        if (drawable instanceof GradientDrawable) {
                                            ((GradientDrawable) drawable).setColors(new int[]{a2, a3});
                                        } else if (drawable instanceof SmoothRectDrawable) {
                                            ((SmoothRectDrawable) drawable).setColors(new int[]{a2, a3});
                                        }
                                    } else if (i2 != 3) {
                                        if (i2 == 4) {
                                            if (drawable instanceof GradientDrawable) {
                                                ((GradientDrawable) drawable).setColor(this.f6401e);
                                            } else if (drawable instanceof SmoothRectDrawable) {
                                                ((SmoothRectDrawable) drawable).setColor(this.f6401e);
                                            }
                                        }
                                    } else if (drawable instanceof GradientDrawable) {
                                        ((GradientDrawable) drawable).setColor(this.f6399c);
                                    } else if (drawable instanceof SmoothRectDrawable) {
                                        ((SmoothRectDrawable) drawable).setColor(this.f6399c);
                                    }
                                } else if (drawable instanceof GradientDrawable) {
                                    ((GradientDrawable) drawable).setColor(this.f6400d);
                                } else if (drawable instanceof SmoothRectDrawable) {
                                    ((SmoothRectDrawable) drawable).setColor(this.f6400d);
                                }
                                View findViewById = childAt.findViewById(R.id.message_content_text);
                                C12932j.m33815a((Object) findViewById, "child.findViewById<View>….id.message_content_text)");
                                findViewById.setBackground(layerDrawable);
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
                            }
                        } else {
                            C12932j.m33814a();
                            throw null;
                        }
                    }
                }
            }
            C12956q qVar = C12956q.f33541a;
        } finally {
            C7707a.m18759a();
        }
    }
}
