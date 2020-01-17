package app.zenly.locator.chat.panel.emojis;

import android.view.View;
import p389io.reactivex.functions.Consumer;

/* renamed from: app.zenly.locator.chat.panel.emojis.k */
/* compiled from: lambda */
public final /* synthetic */ class C2251k implements Consumer {

    /* renamed from: e */
    private final /* synthetic */ EmojiPackController f6884e;

    /* renamed from: f */
    private final /* synthetic */ View f6885f;

    public /* synthetic */ C2251k(EmojiPackController emojiPackController, View view) {
        this.f6884e = emojiPackController;
        this.f6885f = view;
    }

    public final void accept(Object obj) {
        this.f6884e.mo8070a(this.f6885f, (Boolean) obj);
    }
}
