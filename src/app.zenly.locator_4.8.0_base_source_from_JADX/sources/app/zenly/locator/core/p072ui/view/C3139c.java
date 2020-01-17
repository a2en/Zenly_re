package app.zenly.locator.core.p072ui.view;

import android.text.SpannableString;
import android.text.Spanned;
import androidx.emoji.text.C0759g;
import app.zenly.locator.p143s.p160v.C5514a;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Map;
import kotlin.C12954o;
import kotlin.C12956q;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.core.ui.view.c */
final class C3139c {

    /* renamed from: a */
    private final Spanned f8693a;

    /* renamed from: b */
    private final Map<Integer, C0759g> f8694b;

    public C3139c(String str) {
        C12932j.m33818b(str, "input");
        this.f8693a = new SpannableString(C5514a.m15634a(str, 0, str.length(), Integer.MAX_VALUE, 1));
        Object[] spans = this.f8693a.getSpans(0, str.length(), C0759g.class);
        C12932j.m33815a((Object) spans, "emojiText.getSpans(0, in…aceEmojiSpan::class.java)");
        ArrayList arrayList = new ArrayList(spans.length);
        for (Object obj : spans) {
            C0759g gVar = (C0759g) obj;
            arrayList.add(C12954o.m33853a(Integer.valueOf(this.f8693a.getSpanStart(gVar)), gVar));
        }
        this.f8694b = C12835h0.m33546a((Iterable) arrayList);
    }

    /* renamed from: a */
    public final Spanned mo9464a() {
        return this.f8693a;
    }

    /* renamed from: a */
    public final void mo9465a(Function3<? super CharSequence, ? super Boolean, ? super Integer, C12956q> function3) {
        C12932j.m33818b(function3, "operation");
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(this.f8693a.toString());
        int first = characterInstance.first();
        int next = characterInstance.next();
        while (next != -1) {
            C0759g gVar = (C0759g) this.f8694b.get(Integer.valueOf(first));
            int spanEnd = gVar != null ? this.f8693a.getSpanEnd(gVar) : next;
            int following = characterInstance.following(next);
            function3.invoke(this.f8693a.subSequence(first, spanEnd), Boolean.valueOf(following == -1), Integer.valueOf(first));
            if (following != -1) {
                characterInstance.preceding(following);
                while (next <= spanEnd && next != -1) {
                    int i = next;
                    next = characterInstance.next();
                    first = i;
                }
            } else {
                return;
            }
        }
    }
}
