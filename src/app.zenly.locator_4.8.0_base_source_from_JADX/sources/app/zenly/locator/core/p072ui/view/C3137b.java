package app.zenly.locator.core.p072ui.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.C0657l;
import androidx.core.view.ViewCompat;
import app.zenly.android.base.widget.LinearLayout;
import app.zenly.android.feature.base.model.AvatarLoader;
import app.zenly.android.feature.base.model.AvatarLoader.Request.C1331a;
import app.zenly.locator.R;
import app.zenly.locator.core.glide.C2477e;
import app.zenly.locator.core.models.C2884f;
import java.util.Iterator;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.collections.C12844m;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.UserProto$User;

/* renamed from: app.zenly.locator.core.ui.view.b */
public final class C3137b {

    /* renamed from: app.zenly.locator.core.ui.view.b$a */
    public static final class C3138a implements OnLayoutChangeListener {

        /* renamed from: e */
        final /* synthetic */ FrameLayout f8690e;

        /* renamed from: f */
        final /* synthetic */ int f8691f;

        /* renamed from: g */
        final /* synthetic */ float f8692g;

        public C3138a(FrameLayout frameLayout, int i, float f) {
            this.f8690e = frameLayout;
            this.f8691f = i;
            this.f8692g = f;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Object obj;
            boolean z;
            C12932j.m33818b(view, "view");
            view.removeOnLayoutChangeListener(this);
            Iterator it = C0657l.m3059a(this.f8690e).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((View) obj).getVisibility() == 0) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            View view2 = (View) obj;
            if (view2 != null) {
                this.f8690e.setTranslationY(C12973l.m33892c((((((float) this.f8691f) + (this.f8692g / 2.0f)) - view2.getTranslationY()) - ((float) this.f8690e.getHeight())) / 2.0f, 0.0f));
            }
        }
    }

    /* renamed from: a */
    public static final void m9865a(LinearLayout linearLayout, List<UserProto$User> list) {
        C12932j.m33818b(linearLayout, "$this$setHorizontalAvatars");
        C12932j.m33818b(list, "users");
        linearLayout.removeAllViews();
        LayoutInflater from = LayoutInflater.from(linearLayout.getContext());
        Context context = linearLayout.getContext();
        C12932j.m33815a((Object) context, "context");
        C2477e eVar = new C2477e(context);
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i >= 0) {
                UserProto$User userProto$User = (UserProto$User) next;
                if (i < 5) {
                    View inflate = from.inflate(R.layout.item_user_avatar, linearLayout, false);
                    if (inflate != null) {
                        m9863a((ImageView) inflate, eVar, userProto$User);
                        linearLayout.addView(inflate);
                        i = i2;
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.widget.ImageView");
                    }
                } else {
                    View inflate2 = from.inflate(R.layout.item_user_avatar_count, linearLayout, false);
                    if (inflate2 != null) {
                        m9864a((TextView) inflate2, list.size(), 5);
                        linearLayout.addView(inflate2);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
                }
            } else {
                C12844m.m33616c();
                throw null;
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m9861a(FrameLayout frameLayout, AvatarLoader avatarLoader, List list, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = list.size();
        }
        if ((i2 & 8) != 0) {
            z = true;
        }
        m9860a(frameLayout, avatarLoader, list, i, z);
    }

    /* renamed from: a */
    public static final void m9860a(FrameLayout frameLayout, AvatarLoader avatarLoader, List<UserProto$User> list, int i, boolean z) {
        Object obj;
        boolean z2;
        FrameLayout frameLayout2 = frameLayout;
        AvatarLoader avatarLoader2 = avatarLoader;
        List<UserProto$User> list2 = list;
        int i2 = i;
        C12932j.m33818b(frameLayout2, "$this$setVerticalStackAvatars");
        C12932j.m33818b(avatarLoader2, "avatarLoader");
        C12932j.m33818b(list2, "users");
        LayoutInflater from = LayoutInflater.from(frameLayout.getContext());
        int childCount = frameLayout.getChildCount();
        int min = Math.min(list.size(), 3);
        boolean z3 = i2 > 3;
        if (min > childCount) {
            int i3 = min - childCount;
            for (int i4 = 0; i4 < i3; i4++) {
                frameLayout2.addView(from.inflate(R.layout.item_user_avatar_small, frameLayout2, false));
            }
        }
        if (frameLayout.getChildCount() == 3 && z3) {
            frameLayout2.addView(from.inflate(R.layout.item_user_avatar_count_small, frameLayout2, false));
        }
        Context context = frameLayout.getContext();
        C12932j.m33815a((Object) context, "context");
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.avatar_size_50_with_border);
        float f = (float) dimensionPixelSize;
        float f2 = f / 4.0f;
        float f3 = z3 ? f - f2 : 0.0f;
        int childCount2 = frameLayout.getChildCount();
        for (int i5 = 0; i5 < childCount2; i5++) {
            View childAt = frameLayout2.getChildAt(i5);
            C12932j.m33815a((Object) childAt, "getChildAt(index)");
            if (i5 == 3 && z3) {
                childAt.setVisibility(0);
                childAt.setTranslationY((((float) (-i5)) * f2) - f3);
                if (childAt != null) {
                    m9864a((TextView) childAt, i2, 3);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
                }
            } else if (i5 < list.size()) {
                childAt.setVisibility(0);
                childAt.setTranslationY(((float) (-((min - i5) - 1))) * f2);
                if (childAt != null) {
                    m9862a((ImageView) childAt, avatarLoader2, (UserProto$User) list2.get(i5));
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.ImageView");
                }
            } else {
                if (childAt instanceof ImageView) {
                    avatarLoader2.clear(frameLayout2);
                }
                childAt.setVisibility(8);
            }
        }
        if (!z) {
            return;
        }
        if (!ViewCompat.m2804D(frameLayout) || frameLayout.isLayoutRequested()) {
            frameLayout2.addOnLayoutChangeListener(new C3138a(frameLayout2, dimensionPixelSize, f3));
            return;
        }
        Iterator it = C0657l.m3059a(frameLayout).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((View) obj).getVisibility() == 0) {
                z2 = true;
                continue;
            } else {
                z2 = false;
                continue;
            }
            if (z2) {
                break;
            }
        }
        View view = (View) obj;
        if (view != null) {
            frameLayout2.setTranslationY(C12973l.m33892c((((f + (f3 / 2.0f)) - view.getTranslationY()) - ((float) frameLayout.getHeight())) / 2.0f, 0.0f));
        }
    }

    /* renamed from: a */
    private static final void m9863a(ImageView imageView, C2477e eVar, UserProto$User userProto$User) {
        eVar.load(C2884f.m9355a(userProto$User)).into(imageView);
    }

    /* renamed from: a */
    private static final void m9862a(ImageView imageView, AvatarLoader avatarLoader, UserProto$User userProto$User) {
        C1331a.m6343a(avatarLoader.load(C2884f.m9355a(userProto$User)), R.dimen.stroke_25, 0, 2, null).into(imageView);
    }

    /* renamed from: a */
    private static final void m9864a(TextView textView, int i, int i2) {
        textView.setText(textView.getContext().getString(R.string.commons_extra_count, new Object[]{Integer.valueOf(i - i2)}));
    }

    /* renamed from: a */
    public static final void m9859a(ViewGroup viewGroup, AvatarLoader avatarLoader) {
        C12932j.m33818b(viewGroup, "$this$clearAvatars");
        C12932j.m33818b(avatarLoader, "avatarLoader");
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            C12932j.m33815a((Object) childAt, "getChildAt(index)");
            if (childAt instanceof ImageView) {
                avatarLoader.clear(viewGroup);
            }
        }
    }
}
