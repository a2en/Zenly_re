package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import androidx.core.content.res.C0558f;
import androidx.core.graphics.drawable.C0559a;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat.C1258a;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p214e.p228e.C7571a;

/* renamed from: androidx.vectordrawable.graphics.drawable.b */
public class C1261b extends C1271g implements Animatable2Compat {

    /* renamed from: f */
    private C1264c f4688f;

    /* renamed from: g */
    private Context f4689g;

    /* renamed from: h */
    private ArgbEvaluator f4690h;

    /* renamed from: i */
    private AnimatorListener f4691i;

    /* renamed from: j */
    ArrayList<C1258a> f4692j;

    /* renamed from: k */
    final Callback f4693k;

    /* renamed from: androidx.vectordrawable.graphics.drawable.b$a */
    class C1262a implements Callback {
        C1262a() {
        }

        public void invalidateDrawable(Drawable drawable) {
            C1261b.this.invalidateSelf();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            C1261b.this.scheduleSelf(runnable, j);
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C1261b.this.unscheduleSelf(runnable);
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.b$b */
    class C1263b extends AnimatorListenerAdapter {
        C1263b() {
        }

        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(C1261b.this.f4692j);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((C1258a) arrayList.get(i)).mo6128a(C1261b.this);
            }
        }

        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(C1261b.this.f4692j);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((C1258a) arrayList.get(i)).mo6129b(C1261b.this);
            }
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.b$c */
    private static class C1264c extends ConstantState {

        /* renamed from: a */
        int f4696a;

        /* renamed from: b */
        C1272h f4697b;

        /* renamed from: c */
        AnimatorSet f4698c;

        /* renamed from: d */
        ArrayList<Animator> f4699d;

        /* renamed from: e */
        C7571a<Animator, String> f4700e;

        public C1264c(Context context, C1264c cVar, Callback callback, Resources resources) {
            if (cVar != null) {
                this.f4696a = cVar.f4696a;
                C1272h hVar = cVar.f4697b;
                if (hVar != null) {
                    ConstantState constantState = hVar.getConstantState();
                    if (resources != null) {
                        this.f4697b = (C1272h) constantState.newDrawable(resources);
                    } else {
                        this.f4697b = (C1272h) constantState.newDrawable();
                    }
                    C1272h hVar2 = this.f4697b;
                    hVar2.mutate();
                    this.f4697b = hVar2;
                    this.f4697b.setCallback(callback);
                    this.f4697b.setBounds(cVar.f4697b.getBounds());
                    this.f4697b.mo6191a(false);
                }
                ArrayList<Animator> arrayList = cVar.f4699d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f4699d = new ArrayList<>(size);
                    this.f4700e = new C7571a<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = (Animator) cVar.f4699d.get(i);
                        Animator clone = animator.clone();
                        String str = (String) cVar.f4700e.get(animator);
                        clone.setTarget(this.f4697b.mo6190a(str));
                        this.f4699d.add(clone);
                        this.f4700e.put(clone, str);
                    }
                    mo6162a();
                }
            }
        }

        /* renamed from: a */
        public void mo6162a() {
            if (this.f4698c == null) {
                this.f4698c = new AnimatorSet();
            }
            this.f4698c.playTogether(this.f4699d);
        }

        public int getChangingConfigurations() {
            return this.f4696a;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.b$d */
    private static class C1265d extends ConstantState {

        /* renamed from: a */
        private final ConstantState f4701a;

        public C1265d(ConstantState constantState) {
            this.f4701a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f4701a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f4701a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            C1261b bVar = new C1261b();
            bVar.f4706e = this.f4701a.newDrawable();
            bVar.f4706e.setCallback(bVar.f4693k);
            return bVar;
        }

        public Drawable newDrawable(Resources resources) {
            C1261b bVar = new C1261b();
            bVar.f4706e = this.f4701a.newDrawable(resources);
            bVar.f4706e.setCallback(bVar.f4693k);
            return bVar;
        }

        public Drawable newDrawable(Resources resources, Theme theme) {
            C1261b bVar = new C1261b();
            bVar.f4706e = this.f4701a.newDrawable(resources, theme);
            bVar.f4706e.setCallback(bVar.f4693k);
            return bVar;
        }
    }

    C1261b() {
        this(null, null, null);
    }

    /* renamed from: a */
    public static C1261b m6033a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        C1261b bVar = new C1261b(context);
        bVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return bVar;
    }

    /* renamed from: b */
    private static boolean m6038b(AnimatedVectorDrawable animatedVectorDrawable, C1258a aVar) {
        return animatedVectorDrawable.unregisterAnimationCallback(aVar.mo6127a());
    }

    public void applyTheme(Theme theme) {
        Drawable drawable = this.f4706e;
        if (drawable != null) {
            C0559a.m2643a(drawable, theme);
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f4706e;
        if (drawable != null) {
            return C0559a.m2647a(drawable);
        }
        return false;
    }

    public void clearAnimationCallbacks() {
        Drawable drawable = this.f4706e;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
            return;
        }
        m6034a();
        ArrayList<C1258a> arrayList = this.f4692j;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f4706e;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f4688f.f4697b.draw(canvas);
        if (this.f4688f.f4698c.isStarted()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f4706e;
        if (drawable != null) {
            return C0559a.m2651c(drawable);
        }
        return this.f4688f.f4697b.getAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f4706e;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f4688f.f4696a;
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f4706e;
        if (drawable != null) {
            return C0559a.m2652d(drawable);
        }
        return this.f4688f.f4697b.getColorFilter();
    }

    public ConstantState getConstantState() {
        Drawable drawable = this.f4706e;
        if (drawable == null || VERSION.SDK_INT < 24) {
            return null;
        }
        return new C1265d(drawable.getConstantState());
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f4706e;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f4688f.f4697b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f4706e;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f4688f.f4697b.getIntrinsicWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f4706e;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f4688f.f4697b.getOpacity();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f4706e;
        if (drawable != null) {
            C0559a.m2644a(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray a = C0558f.m2618a(resources, theme, attributeSet, C1260a.f4680e);
                    int resourceId = a.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C1272h a2 = C1272h.m6069a(resources, resourceId, theme);
                        a2.mo6191a(false);
                        a2.setCallback(this.f4693k);
                        C1272h hVar = this.f4688f.f4697b;
                        if (hVar != null) {
                            hVar.setCallback(null);
                        }
                        this.f4688f.f4697b = a2;
                    }
                    a.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C1260a.f4681f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f4689g;
                        if (context != null) {
                            m6037a(string, C1267d.m6044a(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f4688f.mo6162a();
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f4706e;
        if (drawable != null) {
            return C0559a.m2654f(drawable);
        }
        return this.f4688f.f4697b.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable = this.f4706e;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f4688f.f4698c.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = this.f4706e;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f4688f.f4697b.isStateful();
    }

    public Drawable mutate() {
        Drawable drawable = this.f4706e;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4706e;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f4688f.f4697b.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f4706e;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        return this.f4688f.f4697b.setLevel(i);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f4706e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f4688f.f4697b.setState(iArr);
    }

    public void registerAnimationCallback(C1258a aVar) {
        Drawable drawable = this.f4706e;
        if (drawable != null) {
            m6036a((AnimatedVectorDrawable) drawable, aVar);
        } else if (aVar != null) {
            if (this.f4692j == null) {
                this.f4692j = new ArrayList<>();
            }
            if (!this.f4692j.contains(aVar)) {
                this.f4692j.add(aVar);
                if (this.f4691i == null) {
                    this.f4691i = new C1263b();
                }
                this.f4688f.f4698c.addListener(this.f4691i);
            }
        }
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f4706e;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f4688f.f4697b.setAlpha(i);
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f4706e;
        if (drawable != null) {
            C0559a.m2646a(drawable, z);
        } else {
            this.f4688f.f4697b.setAutoMirrored(z);
        }
    }

    public void setTint(int i) {
        Drawable drawable = this.f4706e;
        if (drawable != null) {
            C0559a.m2650b(drawable, i);
        } else {
            this.f4688f.f4697b.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f4706e;
        if (drawable != null) {
            C0559a.m2642a(drawable, colorStateList);
        } else {
            this.f4688f.f4697b.setTintList(colorStateList);
        }
    }

    public void setTintMode(Mode mode) {
        Drawable drawable = this.f4706e;
        if (drawable != null) {
            C0559a.m2645a(drawable, mode);
        } else {
            this.f4688f.f4697b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f4706e;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f4688f.f4697b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public void start() {
        Drawable drawable = this.f4706e;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f4688f.f4698c.isStarted()) {
            this.f4688f.f4698c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = this.f4706e;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f4688f.f4698c.end();
        }
    }

    public boolean unregisterAnimationCallback(C1258a aVar) {
        Drawable drawable = this.f4706e;
        if (drawable != null) {
            m6038b((AnimatedVectorDrawable) drawable, aVar);
        }
        ArrayList<C1258a> arrayList = this.f4692j;
        if (arrayList == null || aVar == null) {
            return false;
        }
        boolean remove = arrayList.remove(aVar);
        if (this.f4692j.size() == 0) {
            m6034a();
        }
        return remove;
    }

    private C1261b(Context context) {
        this(context, null, null);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f4706e;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f4688f.f4697b.setColorFilter(colorFilter);
        }
    }

    private C1261b(Context context, C1264c cVar, Resources resources) {
        this.f4690h = null;
        this.f4691i = null;
        this.f4692j = null;
        this.f4693k = new C1262a();
        this.f4689g = context;
        if (cVar != null) {
            this.f4688f = cVar;
        } else {
            this.f4688f = new C1264c(context, cVar, this.f4693k, resources);
        }
    }

    /* renamed from: a */
    private void m6035a(Animator animator) {
        if (animator instanceof AnimatorSet) {
            ArrayList childAnimations = ((AnimatorSet) animator).getChildAnimations();
            if (childAnimations != null) {
                for (int i = 0; i < childAnimations.size(); i++) {
                    m6035a((Animator) childAnimations.get(i));
                }
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f4690h == null) {
                    this.f4690h = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f4690h);
            }
        }
    }

    /* renamed from: a */
    private void m6037a(String str, Animator animator) {
        animator.setTarget(this.f4688f.f4697b.mo6190a(str));
        if (VERSION.SDK_INT < 21) {
            m6035a(animator);
        }
        C1264c cVar = this.f4688f;
        if (cVar.f4699d == null) {
            cVar.f4699d = new ArrayList<>();
            this.f4688f.f4700e = new C7571a<>();
        }
        this.f4688f.f4699d.add(animator);
        this.f4688f.f4700e.put(animator, str);
    }

    /* renamed from: a */
    private static void m6036a(AnimatedVectorDrawable animatedVectorDrawable, C1258a aVar) {
        animatedVectorDrawable.registerAnimationCallback(aVar.mo6127a());
    }

    /* renamed from: a */
    private void m6034a() {
        AnimatorListener animatorListener = this.f4691i;
        if (animatorListener != null) {
            this.f4688f.f4698c.removeListener(animatorListener);
            this.f4691i = null;
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
