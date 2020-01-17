package app.zenly.android.feature.base.model;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p253a.p256f.p257a.C7674a;

public interface AvatarLoader {

    public interface Request {

        /* renamed from: app.zenly.android.feature.base.model.AvatarLoader$Request$a */
        public static final class C1331a {
            /* renamed from: a */
            public static /* synthetic */ Request m6343a(Request request, int i, int i2, int i3, Object obj) {
                if (obj == null) {
                    if ((i3 & 2) != 0) {
                        i2 = C7674a.f19294a;
                    }
                    return request.withBorder(i, i2);
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: withBorder");
            }

            /* renamed from: a */
            public static Request m6342a(Request request, int i) {
                return request.withOverride(i, i);
            }

            /* renamed from: a */
            public static void m6344a(Request request, ImageView imageView) {
                C12932j.m33818b(imageView, "target");
                request.into(imageView, null);
            }
        }

        /* renamed from: app.zenly.android.feature.base.model.AvatarLoader$Request$b */
        public static class C1332b {
            /* renamed from: a */
            public void mo6543a() {
            }

            /* renamed from: a */
            public void mo6544a(Bitmap bitmap) {
                C12932j.m33818b(bitmap, "bitmap");
            }

            /* renamed from: b */
            public void mo6545b() {
            }
        }

        /* renamed from: app.zenly.android.feature.base.model.AvatarLoader$Request$c */
        public enum C1333c {
            Initials,
            DisplayName
        }

        void into(ImageView imageView);

        void into(ImageView imageView, C1332b bVar);

        Request withBorder(int i, int i2);

        Request withCorners(C1334a aVar);

        Request withFillColor(int i);

        Request withOverride(int i);

        Request withOverride(int i, int i2);

        Request withPlaceholderStrategy(C1333c cVar);

        Request withTextColor(int i);
    }

    void clear(View view);

    Request load(Avatar avatar);
}
