package app.zenly.locator.p143s.p160v;

import android.content.Context;
import androidx.core.provider.C0574a;
import androidx.emoji.text.C0746d;
import androidx.emoji.text.EmojiCompat;
import androidx.emoji.text.EmojiCompat.C0735c;
import androidx.emoji.text.EmojiCompat.C0736d;
import app.zenly.locator.R;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.s.v.a */
public final class C5514a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static boolean f14146a;

    /* renamed from: b */
    public static final C5514a f14147b = new C5514a();

    /* renamed from: app.zenly.locator.s.v.a$a */
    public static final class C5515a extends C0736d {
        C5515a() {
        }

        /* renamed from: a */
        public void mo3706a() {
            C5514a.f14146a = true;
        }
    }

    private C5514a() {
    }

    /* renamed from: a */
    public static final void m15635a(Context context) {
        C12932j.m33818b(context, "context");
        C0746d dVar = new C0746d(context, new C0574a(context.getString(R.string.config_emojicompat_font_authority), context.getString(R.string.config_emojicompat_font_package), context.getString(R.string.config_emojicompat_font_name), (int) R.array.com_google_android_gms_fonts_certs));
        dVar.mo3705a(new C5515a());
        EmojiCompat.m3430a((C0735c) dVar);
    }

    /* renamed from: a */
    public static final boolean m15637a(String str) {
        C12932j.m33818b(str, "input");
        return f14146a && EmojiCompat.m3433e().mo3692a((CharSequence) str);
    }

    /* renamed from: a */
    public static final CharSequence m15634a(CharSequence charSequence, int i, int i2, int i3, int i4) {
        C12932j.m33818b(charSequence, "input");
        if (!f14146a) {
            return charSequence;
        }
        CharSequence a = EmojiCompat.m3433e().mo3688a(charSequence, i, i2, i3, i4);
        C12932j.m33815a((Object) a, "EmojiCompat.get().proces… maxEmojiCount, strategy)");
        return a;
    }
}
