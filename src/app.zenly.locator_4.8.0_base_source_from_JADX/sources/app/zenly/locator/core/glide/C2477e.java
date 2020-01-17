package app.zenly.locator.core.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.core.content.C0540a;
import app.zenly.android.feature.base.model.Avatar;
import app.zenly.android.feature.base.model.Avatar.C1327a;
import app.zenly.android.feature.base.model.Avatar.C1327a.C1329b;
import app.zenly.android.feature.base.model.AvatarLoader;
import app.zenly.android.feature.base.model.AvatarLoader.Request;
import app.zenly.android.feature.base.model.AvatarLoader.Request.C1331a;
import app.zenly.android.feature.base.model.AvatarLoader.Request.C1332b;
import app.zenly.android.feature.base.model.AvatarLoader.Request.C1333c;
import app.zenly.android.feature.base.model.C1334a;
import app.zenly.android.feature.base.model.C1334a.C1336b;
import app.zenly.locator.R;
import app.zenly.locator.core.glide.p067j.C2486a;
import app.zenly.locator.core.glide.p067j.C2488b;
import app.zenly.locator.core.glide.p067j.C2490c;
import app.zenly.locator.core.glide.p067j.C2492d;
import app.zenly.locator.core.util.C3200e0;
import com.bumptech.glide.C8859g;
import com.bumptech.glide.C8865i;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.C8978i;
import com.bumptech.glide.load.resource.bitmap.C9110f;
import com.bumptech.glide.load.resource.bitmap.C9113i;
import com.bumptech.glide.load.resource.bitmap.C9140w;
import com.bumptech.glide.request.target.C9231d;
import com.bumptech.glide.request.transition.Transition;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.C12899i;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p253a.p256f.p257a.C7674a;
import p250f.p251a.p252a.p253a.p256f.p257a.C7678c;
import p250f.p251a.p252a.p263b.p279d.C7770f;

/* renamed from: app.zenly.locator.core.glide.e */
public final class C2477e implements AvatarLoader {

    /* renamed from: a */
    private final C2485i f7449a;

    /* renamed from: b */
    private final Context f7450b;

    /* renamed from: app.zenly.locator.core.glide.e$a */
    public static final class C2478a {
        private C2478a() {
        }

        public /* synthetic */ C2478a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.core.glide.e$b */
    private static final class C2479b implements Request {

        /* renamed from: a */
        private final C2480a f7451a;

        /* renamed from: b */
        private final Context f7452b;

        /* renamed from: c */
        private final C2485i f7453c;

        /* renamed from: d */
        private final Avatar f7454d;

        /* renamed from: app.zenly.locator.core.glide.e$b$a */
        private static final class C2480a {

            /* renamed from: a */
            private C1333c f7455a;

            /* renamed from: b */
            private float f7456b;

            /* renamed from: c */
            private int f7457c;

            /* renamed from: d */
            private int f7458d;

            /* renamed from: e */
            private int f7459e;

            /* renamed from: f */
            private int f7460f;

            /* renamed from: g */
            private int f7461g;

            /* renamed from: h */
            private int f7462h;

            /* renamed from: i */
            private C1334a f7463i;

            public C2480a() {
                this(null, 0.0f, 0, 0, 0, 0, 0, 0, null, 511, null);
            }

            public C2480a(C1333c cVar, float f, int i, int i2, int i3, int i4, int i5, int i6, C1334a aVar) {
                C12932j.m33818b(cVar, "placeholderStrategy");
                this.f7455a = cVar;
                this.f7456b = f;
                this.f7457c = i;
                this.f7458d = i2;
                this.f7459e = i3;
                this.f7460f = i4;
                this.f7461g = i5;
                this.f7462h = i6;
                this.f7463i = aVar;
            }

            /* renamed from: a */
            public final void mo8484a(C1333c cVar) {
                C12932j.m33818b(cVar, "<set-?>");
                this.f7455a = cVar;
            }

            /* renamed from: b */
            public final int mo8486b() {
                return this.f7457c;
            }

            /* renamed from: c */
            public final void mo8489c(int i) {
                this.f7459e = i;
            }

            /* renamed from: d */
            public final int mo8490d() {
                return this.f7459e;
            }

            /* renamed from: e */
            public final void mo8493e(int i) {
                this.f7461g = i;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C2480a) {
                        C2480a aVar = (C2480a) obj;
                        if (C12932j.m33817a((Object) this.f7455a, (Object) aVar.f7455a) && Float.compare(this.f7456b, aVar.f7456b) == 0) {
                            if (this.f7457c == aVar.f7457c) {
                                if (this.f7458d == aVar.f7458d) {
                                    if (this.f7459e == aVar.f7459e) {
                                        if (this.f7460f == aVar.f7460f) {
                                            if (this.f7461g == aVar.f7461g) {
                                                if (!(this.f7462h == aVar.f7462h) || !C12932j.m33817a((Object) this.f7463i, (Object) aVar.f7463i)) {
                                                    return false;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return false;
                }
                return true;
            }

            /* renamed from: f */
            public final void mo8496f(int i) {
                this.f7460f = i;
            }

            /* renamed from: g */
            public final C1333c mo8497g() {
                return this.f7455a;
            }

            /* renamed from: h */
            public final float mo8498h() {
                return this.f7456b;
            }

            public int hashCode() {
                C1333c cVar = this.f7455a;
                int i = 0;
                int hashCode = (((((((((((((((cVar != null ? cVar.hashCode() : 0) * 31) + Float.valueOf(this.f7456b).hashCode()) * 31) + Integer.valueOf(this.f7457c).hashCode()) * 31) + Integer.valueOf(this.f7458d).hashCode()) * 31) + Integer.valueOf(this.f7459e).hashCode()) * 31) + Integer.valueOf(this.f7460f).hashCode()) * 31) + Integer.valueOf(this.f7461g).hashCode()) * 31) + Integer.valueOf(this.f7462h).hashCode()) * 31;
                C1334a aVar = this.f7463i;
                if (aVar != null) {
                    i = aVar.hashCode();
                }
                return hashCode + i;
            }

            /* renamed from: i */
            public final int mo8500i() {
                return this.f7460f;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("Config(placeholderStrategy=");
                sb.append(this.f7455a);
                sb.append(", roundedCorners=");
                sb.append(this.f7456b);
                sb.append(", borderSize=");
                sb.append(this.f7457c);
                sb.append(", borderColorRes=");
                sb.append(this.f7458d);
                sb.append(", fillColorRes=");
                sb.append(this.f7459e);
                sb.append(", textColorRes=");
                sb.append(this.f7460f);
                sb.append(", overrideWidth=");
                sb.append(this.f7461g);
                sb.append(", overrideHeight=");
                sb.append(this.f7462h);
                sb.append(", cornerStrategy=");
                sb.append(this.f7463i);
                sb.append(")");
                return sb.toString();
            }

            public /* synthetic */ C2480a(C1333c cVar, float f, int i, int i2, int i3, int i4, int i5, int i6, C1334a aVar, int i7, C12928f fVar) {
                int i8 = i7;
                C1333c cVar2 = (i8 & 1) != 0 ? C1333c.Initials : cVar;
                float f2 = (i8 & 2) != 0 ? -1.0f : f;
                int i9 = 0;
                int i10 = (i8 & 4) != 0 ? 0 : i;
                int i11 = (i8 & 8) != 0 ? C7674a.f19294a : i2;
                int i12 = (i8 & 16) != 0 ? C7674a.f19294a : i3;
                int i13 = (i8 & 32) != 0 ? C7674a.f19294a : i4;
                int i14 = (i8 & 64) != 0 ? 0 : i5;
                if ((i8 & 128) == 0) {
                    i9 = i6;
                }
                this(cVar2, f2, i10, i11, i12, i13, i14, i9, (i8 & 256) != 0 ? null : aVar);
            }

            /* renamed from: a */
            public final int mo8482a() {
                return this.f7458d;
            }

            /* renamed from: b */
            public final void mo8487b(int i) {
                this.f7457c = i;
            }

            /* renamed from: c */
            public final C1334a mo8488c() {
                return this.f7463i;
            }

            /* renamed from: d */
            public final void mo8491d(int i) {
                this.f7462h = i;
            }

            /* renamed from: e */
            public final int mo8492e() {
                return this.f7462h;
            }

            /* renamed from: f */
            public final int mo8495f() {
                return this.f7461g;
            }

            /* renamed from: a */
            public final void mo8483a(int i) {
                this.f7458d = i;
            }

            /* renamed from: a */
            public final void mo8485a(C1334a aVar) {
                this.f7463i = aVar;
            }
        }

        /* renamed from: app.zenly.locator.core.glide.e$b$b */
        public static final class C2481b extends C9231d<ImageView, Bitmap> {

            /* renamed from: k */
            final /* synthetic */ C12899i f7464k;

            /* renamed from: l */
            final /* synthetic */ ImageView f7465l;

            /* renamed from: m */
            final /* synthetic */ C1332b f7466m;

            C2481b(C12899i iVar, View view, C2479b bVar, Context context, ImageView imageView, C1332b bVar2) {
                this.f7464k = iVar;
                this.f7465l = imageView;
                this.f7466m = bVar2;
                super(view);
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo8503a(Drawable drawable) {
                C1332b bVar = this.f7466m;
                if (bVar != null) {
                    bVar.mo6543a();
                }
                this.f7465l.setImageBitmap(null);
                this.f7465l.setTag(R.id.avatar_loader_tag, null);
            }

            public void onLoadFailed(Drawable drawable) {
                C1332b bVar = this.f7466m;
                if (bVar != null) {
                    bVar.mo6545b();
                }
                this.f7465l.setImageDrawable(drawable);
                this.f7465l.setTag(R.id.avatar_loader_tag, null);
            }

            /* renamed from: a */
            public void onResourceReady(Bitmap bitmap, Transition<? super Bitmap> transition) {
                C12932j.m33818b(bitmap, "resource");
                C1332b bVar = this.f7466m;
                if (bVar != null) {
                    bVar.mo6544a(bitmap);
                }
                this.f7465l.setImageBitmap(bitmap);
                this.f7465l.setTag(R.id.avatar_loader_tag, this.f7464k);
            }
        }

        public C2479b(Context context, C2485i iVar, Avatar avatar) {
            Context context2 = context;
            C2485i iVar2 = iVar;
            Avatar avatar2 = avatar;
            C12932j.m33818b(context2, "context");
            C12932j.m33818b(iVar2, "glide");
            C12932j.m33818b(avatar2, "avatar");
            this.f7452b = context2;
            this.f7453c = iVar2;
            this.f7454d = avatar2;
            C2480a aVar = new C2480a(null, 0.0f, 0, 0, 0, 0, 0, 0, null, 511, null);
            this.f7451a = aVar;
        }

        /* renamed from: a */
        private final <TranscodeType> C2484h<TranscodeType> m8586a(C2484h<TranscodeType> hVar) {
            return hVar;
        }

        /* renamed from: a */
        private final C8978i m8588a(C1327a aVar) {
            C1329b b = aVar != null ? aVar.mo6527b() : null;
            if (b != null) {
                int i = C2482f.f7467a[b.ordinal()];
                if (i == 1) {
                    C8978i iVar = C8978i.f23426d;
                    C12932j.m33815a((Object) iVar, "DiskCacheStrategy.RESOURCE");
                    return iVar;
                } else if (i == 2) {
                    C8978i iVar2 = C8978i.f23423a;
                    C12932j.m33815a((Object) iVar2, "DiskCacheStrategy.ALL");
                    return iVar2;
                }
            }
            C8978i iVar3 = C8978i.f23424b;
            C12932j.m33815a((Object) iVar3, "DiskCacheStrategy.NONE");
            return iVar3;
        }

        /* renamed from: b */
        private final List<Transformation<Bitmap>> m8590b(Context context, C2480a aVar) {
            if (aVar.mo8490d() == C7674a.f19294a) {
                return C12846n.m33635a(new C2486a(C7678c.m18702a(context, (int) R.attr.zenlyAvatarPlaceholderBackground)));
            }
            if (aVar.mo8490d() != R.color.transparent) {
                return C12846n.m33635a(new C2486a(C0540a.m2536a(context, aVar.mo8490d())));
            }
            return C12848o.m33640a();
        }

        /* renamed from: c */
        private final int m8591c(Context context, C2480a aVar) {
            if (aVar.mo8482a() != C7674a.f19294a) {
                return C0540a.m2536a(context, aVar.mo8482a());
            }
            return C7678c.m18702a(context, (int) R.attr.zenlyColorBackground);
        }

        public void into(ImageView imageView) {
            C12932j.m33818b(imageView, "target");
            C1331a.m6344a((Request) this, imageView);
        }

        public Request withBorder(int i, int i2) {
            this.f7451a.mo8487b(this.f7452b.getResources().getDimensionPixelSize(i));
            this.f7451a.mo8483a(i2);
            return this;
        }

        public Request withCorners(C1334a aVar) {
            C12932j.m33818b(aVar, "cornerStrategy");
            this.f7451a.mo8485a(aVar);
            return this;
        }

        public Request withFillColor(int i) {
            this.f7451a.mo8489c(i);
            return this;
        }

        public Request withOverride(int i) {
            return C1331a.m6342a((Request) this, i);
        }

        public Request withPlaceholderStrategy(C1333c cVar) {
            C12932j.m33818b(cVar, "strategy");
            this.f7451a.mo8484a(cVar);
            return this;
        }

        public Request withTextColor(int i) {
            this.f7451a.mo8496f(i);
            return this;
        }

        public void into(ImageView imageView, C1332b bVar) {
            C12932j.m33818b(imageView, "target");
            Context context = imageView.getContext();
            C2484h a = this.f7453c.m8714a().m8683a((Object) this.f7454d).m8691a(m8588a(this.f7454d.forSize(0)));
            C12932j.m33815a((Object) a, "glide\n                .a…ategy(avatar.forSize(0)))");
            m8586a(a);
            if (this.f7451a.mo8495f() > 0 && this.f7451a.mo8492e() > 0) {
                a.m8686a(this.f7451a.mo8495f(), this.f7451a.mo8492e());
            }
            C12932j.m33815a((Object) context, "targetContext");
            List a2 = m8589a(context, this.f7451a);
            List b = m8590b(context, this.f7451a);
            Transformation a3 = m8587a(context, this.f7451a, this.f7454d);
            Object[] array = a2.toArray(new Transformation[0]);
            String str = "null cannot be cast to non-null type kotlin.Array<T>";
            if (array != null) {
                Transformation[] transformationArr = (Transformation[]) array;
                a.mo8536a((Transformation<Bitmap>[]) (Transformation[]) Arrays.copyOf(transformationArr, transformationArr.length));
                C2484h a4 = this.f7453c.m8714a();
                String str2 = "glide\n                        .asBitmap()";
                C12932j.m33815a((Object) a4, str2);
                m8586a(a4);
                C2484h a5 = a4.m8682a(Integer.valueOf(R.drawable.rect_transparent)).m8687a(C8859g.IMMEDIATE);
                Object[] array2 = C12857w.m33670b((Collection) C12857w.m33666a((Collection) b, (Object) a3), (Iterable) a2).toArray(new Transformation[0]);
                if (array2 != null) {
                    Transformation[] transformationArr2 = (Transformation[]) array2;
                    a.mo8538b((C8865i<TranscodeType>) a5.mo8536a((Transformation<Bitmap>[]) (Transformation[]) Arrays.copyOf(transformationArr2, transformationArr2.length)));
                    C2484h a6 = this.f7453c.m8714a();
                    C12932j.m33815a((Object) a6, str2);
                    m8586a(a6);
                    C2484h a7 = a6.m8682a(Integer.valueOf(R.drawable.rect_transparent));
                    Object[] array3 = C12857w.m33670b((Collection) C12857w.m33666a((Collection) b, (Object) a3), (Iterable) a2).toArray(new Transformation[0]);
                    if (array3 != null) {
                        Transformation[] transformationArr3 = (Transformation[]) array3;
                        a.mo8529a((C8865i<TranscodeType>) a7.mo8536a((Transformation<Bitmap>[]) (Transformation[]) Arrays.copyOf(transformationArr3, transformationArr3.length)));
                        C12899i iVar = new C12899i(this.f7454d, this.f7451a);
                        if (!C12932j.m33817a((Object) iVar, imageView.getTag(R.id.avatar_loader_tag))) {
                            C2481b bVar2 = new C2481b(iVar, imageView, this, context, imageView, bVar);
                            a.mo24171a(bVar2);
                            return;
                        }
                        return;
                    }
                    throw new TypeCastException(str);
                }
                throw new TypeCastException(str);
            }
            throw new TypeCastException(str);
        }

        public Request withOverride(int i, int i2) {
            this.f7451a.mo8493e(i);
            this.f7451a.mo8491d(i2);
            return this;
        }

        /* renamed from: a */
        private final List<Transformation<Bitmap>> m8589a(Context context, C2480a aVar) {
            List<Transformation<Bitmap>> list;
            C1334a c = aVar.mo8488c();
            if (c == null) {
                c = new C1336b(0.4f);
            }
            if (aVar.mo8498h() > 0.0f) {
                list = C12848o.m33643b((Object[]) new C9110f[]{new C9113i(), new C9140w((int) aVar.mo8498h())});
            } else {
                list = C12846n.m33635a(new C2490c(c));
            }
            return aVar.mo8486b() > 0 ? C12857w.m33666a((Collection) list, (Object) new C2492d(c, aVar.mo8486b(), m8591c(context, aVar))) : list;
        }

        /* renamed from: a */
        private final Transformation<Bitmap> m8587a(Context context, C2480a aVar, Avatar avatar) {
            String str;
            int i;
            if (aVar.mo8497g() == C1333c.Initials) {
                str = avatar.getInitials();
            } else {
                str = avatar.getName();
            }
            String str2 = str;
            if (aVar.mo8500i() != C7674a.f19294a) {
                i = C0540a.m2536a(context, aVar.mo8500i());
            } else {
                i = C7678c.m18702a(context, (int) R.attr.zenlyAvatarPlaceholderForegroundColor);
            }
            int i2 = i;
            Context applicationContext = context.getApplicationContext();
            C12932j.m33815a((Object) applicationContext, "context.applicationContext");
            C2488b bVar = new C2488b(applicationContext, str2, C7770f.TextAppearance_PrimaryBody, i2, 0.25f, aVar.mo8486b() + C3200e0.m10183a(context, 2));
            return bVar;
        }
    }

    static {
        new C2478a(null);
    }

    public C2477e(Context context) {
        C12932j.m33818b(context, "context");
        this.f7450b = context;
        C2485i a = C2476d.m8582a(this.f7450b);
        C12932j.m33815a((Object) a, "GlideApp.with(context)");
        this.f7449a = a;
    }

    public void clear(View view) {
        C12932j.m33818b(view, "target");
        this.f7449a.mo24176a(view);
    }

    public Request load(Avatar avatar) {
        C12932j.m33818b(avatar, "avatar");
        return new C2479b(this.f7450b, this.f7449a, avatar);
    }
}
