package app.zenly.locator.cards;

import app.zenly.locator.cards.framework.CardFragment;
import app.zenly.locator.cards.framework.CardFragmentFactory;
import app.zenly.locator.cards.models.AppIconsCard;
import app.zenly.locator.cards.models.BestFriendV2Card;
import app.zenly.locator.cards.models.Card;
import app.zenly.locator.cards.models.DescendantsCard;
import app.zenly.locator.cards.models.TopPopsCard;
import app.zenly.locator.cards.models.WatcherMedalCard;
import app.zenly.locator.cards.models.WorldRankingCard;
import app.zenly.locator.cards.p045l.C1818a;
import app.zenly.locator.cards.p045l.C1827c;
import app.zenly.locator.cards.p045l.C1831e;
import app.zenly.locator.cards.p045l.C1833f;
import app.zenly.locator.cards.p045l.C1835g;
import app.zenly.locator.cards.p045l.C1840i;
import app.zenly.locator.cards.p045l.C1843k;
import app.zenly.locator.cards.p045l.C1845l;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.cards.c */
public final class C1800c implements CardFragmentFactory {

    /* renamed from: a */
    public static final C1800c f5937a = new C1800c();

    private C1800c() {
    }

    public CardFragment make(Card card) {
        C12932j.m33818b(card, "model");
        if (card instanceof DescendantsCard) {
            DescendantsCard descendantsCard = (DescendantsCard) card;
            if (descendantsCard.mo7552e() > 0) {
                return C1831e.f6047n.mo7484a(descendantsCard);
            }
            return C1833f.f6050m.mo7486a(descendantsCard);
        } else if (card instanceof WatcherMedalCard) {
            return C1840i.f6057m.mo7492a((WatcherMedalCard) card);
        } else {
            if (card instanceof TopPopsCard) {
                return C1835g.f6052o.mo7488a((TopPopsCard) card);
            }
            if (card instanceof AppIconsCard) {
                return C1818a.f6021r.mo7477a((AppIconsCard) card);
            }
            if (card instanceof WorldRankingCard) {
                WorldRankingCard worldRankingCard = (WorldRankingCard) card;
                if (worldRankingCard.mo7579g()) {
                    return C1845l.f6062o.mo7498a(worldRankingCard);
                }
                return C1843k.f6060m.mo7494a(worldRankingCard);
            } else if (card instanceof BestFriendV2Card) {
                return C1827c.f6037q.mo7481a((BestFriendV2Card) card);
            } else {
                throw new IllegalArgumentException("Unknown card");
            }
        }
    }
}
