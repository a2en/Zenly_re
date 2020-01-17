package app.zenly.locator.cards.models;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import app.zenly.locator.R;
import app.zenly.locator.friendshipfacts.p099l.C3808b;
import app.zenly.locator.username.idcard.C6019a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.UserProto$BestFriend.C6918b;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.core.C7210s0;

@SuppressLint({"ParcelCreator"})
public final class BestFriendV2Card extends Card {
    public static final Creator CREATOR = new C1862b();

    /* renamed from: x */
    public static final C1861a f6084x = new C1861a(null);

    /* renamed from: i */
    private final C1863c f6085i;

    /* renamed from: j */
    private final CardUser f6086j;

    /* renamed from: k */
    private final int f6087k;

    /* renamed from: l */
    private final boolean f6088l;

    /* renamed from: m */
    private final boolean f6089m;

    /* renamed from: n */
    private final Integer f6090n;

    /* renamed from: o */
    private final int f6091o;

    /* renamed from: p */
    private final int f6092p;

    /* renamed from: q */
    private final int f6093q;

    /* renamed from: r */
    private final int f6094r;

    /* renamed from: s */
    private final int f6095s;

    /* renamed from: t */
    private final int f6096t;

    /* renamed from: u */
    private final int f6097u;

    /* renamed from: v */
    private final int f6098v;

    /* renamed from: w */
    private final boolean f6099w;

    public static final class CardUser implements Parcelable {
        public static final Creator CREATOR = new C1860a();

        /* renamed from: e */
        private final String f6100e;

        /* renamed from: f */
        private final String f6101f;

        /* renamed from: app.zenly.locator.cards.models.BestFriendV2Card$CardUser$a */
        public static class C1860a implements Creator {
            public final Object createFromParcel(Parcel parcel) {
                C12932j.m33818b(parcel, "in");
                return new CardUser(parcel.readString(), parcel.readString());
            }

            public final Object[] newArray(int i) {
                return new CardUser[i];
            }
        }

        public CardUser(String str, String str2) {
            C12932j.m33818b(str, "userUuid");
            C12932j.m33818b(str2, "username");
            this.f6100e = str;
            this.f6101f = str2;
        }

        /* renamed from: a */
        public final String mo7534a() {
            return this.f6100e;
        }

        /* renamed from: b */
        public final String mo7535b() {
            return this.f6101f;
        }

        public int describeContents() {
            return 0;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (kotlin.jvm.internal.C12932j.m33817a((java.lang.Object) r2.f6101f, (java.lang.Object) r3.f6101f) != false) goto L_0x001f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x001f
                boolean r0 = r3 instanceof app.zenly.locator.cards.models.BestFriendV2Card.CardUser
                if (r0 == 0) goto L_0x001d
                app.zenly.locator.cards.models.BestFriendV2Card$CardUser r3 = (app.zenly.locator.cards.models.BestFriendV2Card.CardUser) r3
                java.lang.String r0 = r2.f6100e
                java.lang.String r1 = r3.f6100e
                boolean r0 = kotlin.jvm.internal.C12932j.m33817a(r0, r1)
                if (r0 == 0) goto L_0x001d
                java.lang.String r0 = r2.f6101f
                java.lang.String r3 = r3.f6101f
                boolean r3 = kotlin.jvm.internal.C12932j.m33817a(r0, r3)
                if (r3 == 0) goto L_0x001d
                goto L_0x001f
            L_0x001d:
                r3 = 0
                return r3
            L_0x001f:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.cards.models.BestFriendV2Card.CardUser.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            String str = this.f6100e;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f6101f;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CardUser(userUuid=");
            sb.append(this.f6100e);
            sb.append(", username=");
            sb.append(this.f6101f);
            sb.append(")");
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            C12932j.m33818b(parcel, "parcel");
            parcel.writeString(this.f6100e);
            parcel.writeString(this.f6101f);
        }
    }

    /* renamed from: app.zenly.locator.cards.models.BestFriendV2Card$a */
    public static final class C1861a {
        private C1861a() {
        }

        /* renamed from: a */
        public static /* synthetic */ BestFriendV2Card m7407a(C1861a aVar, C7210s0 s0Var, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return aVar.mo7544a(s0Var, z);
        }

        public /* synthetic */ C1861a(C12928f fVar) {
            this();
        }

        /* renamed from: a */
        public final BestFriendV2Card mo7544a(C7210s0 s0Var, boolean z) {
            Integer num;
            boolean z2;
            boolean z3;
            int i;
            C1863c cVar;
            C12932j.m33818b(s0Var, "bestFriend");
            if (C3808b.m11290c(s0Var)) {
                C1863c cVar2 = C1863c.MUTUAL_LOVE;
                cVar = cVar2;
                i = C3808b.m11291d(s0Var);
                z3 = C3808b.m11291d(s0Var) == 0;
                num = null;
                z2 = false;
            } else {
                C1863c cVar3 = C1863c.BFF;
                C6918b facts = s0Var.getFacts();
                C12932j.m33815a((Object) facts, "bestFriend.facts");
                int currentWeekStreak = facts.getCurrentWeekStreak();
                boolean b = C3808b.m11289b(s0Var);
                cVar = cVar3;
                z2 = C3808b.m11289b(s0Var);
                i = currentWeekStreak;
                z3 = b;
                num = C3808b.m11292e(s0Var);
            }
            UserProto$User friend = s0Var.getFriend();
            String str = "bestFriend.friend";
            C12932j.m33815a((Object) friend, str);
            String uuid = friend.getUuid();
            C12932j.m33815a((Object) uuid, "bestFriend.friend.uuid");
            UserProto$User friend2 = s0Var.getFriend();
            C12932j.m33815a((Object) friend2, str);
            String username = friend2.getUsername();
            C12932j.m33815a((Object) username, "bestFriend.friend.username");
            return mo7543a(cVar, new CardUser(uuid, username), i, z3, z2, num, z);
        }

        /* renamed from: a */
        public static /* synthetic */ BestFriendV2Card m7406a(C1861a aVar, C1863c cVar, CardUser cardUser, int i, boolean z, boolean z2, Integer num, boolean z3, int i2, Object obj) {
            return aVar.mo7543a(cVar, cardUser, i, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? null : num, (i2 & 64) != 0 ? false : z3);
        }

        /* renamed from: a */
        public final BestFriendV2Card mo7543a(C1863c cVar, CardUser cardUser, int i, boolean z, boolean z2, Integer num, boolean z3) {
            C12932j.m33818b(cVar, "type");
            C12932j.m33818b(cardUser, "cardUser");
            switch (C1870a.f6141a[cVar.ordinal()]) {
                case 1:
                    BestFriendV2Card bestFriendV2Card = new BestFriendV2Card(cVar, cardUser, i, z, z2, num, 2131231590, R.string.bestFriends_cards_new_title, R.string.bestFriends_cards_new_subtitle, R.plurals.friendshipFacts_time_cards_weeks, R.color.yellow, R.color.white_o30, R.color.cerulean_blue_dark, R.color.cerulean_blue_light, z3);
                    return bestFriendV2Card;
                case 2:
                    BestFriendV2Card bestFriendV2Card2 = new BestFriendV2Card(cVar, cardUser, i, z, z2, num, 2131231452, R.string.bestFriends_cards_new_title, R.string.friendshipFacts_friendship_cards_title, R.plurals.friendshipFacts_friendship_cards_days, R.color.white, R.color.white_o70, R.color.pink, R.color.pink_light, z3);
                    return bestFriendV2Card2;
                case 3:
                    BestFriendV2Card bestFriendV2Card3 = new BestFriendV2Card(cVar, cardUser, i, z, z2, num, 2131231607, R.string.bestFriends_cards_new_title, R.string.friendshipFacts_hangouts_cards_title, R.plurals.friendshipFacts_hangouts_cards_occurrences, R.color.white, R.color.white_o70, R.color.turquoise_blue, R.color.turquoise_blue_dark, z3);
                    return bestFriendV2Card3;
                case 4:
                    BestFriendV2Card bestFriendV2Card4 = new BestFriendV2Card(cVar, cardUser, i, z, z2, num, 2131231475, R.string.friendshipFacts_mutualLove_cards_new, R.string.mutualLove_cards_new_title, R.plurals.friendshipFacts_time_cards_weeks, R.color.coral, R.color.coral_o50, R.color.coral_light, R.color.coral_dark, z3);
                    return bestFriendV2Card4;
                case 5:
                    BestFriendV2Card bestFriendV2Card5 = new BestFriendV2Card(cVar, cardUser, i, z, z2, num, 2131231585, R.string.bestFriends_cards_new_title, R.string.friendshipFacts_ghost_cards_title, R.plurals.friendshipFacts_friendship_cards_days, R.color.white, R.color.white_o70, R.color.blue_black, R.color.blue, z3);
                    return bestFriendV2Card5;
                case 6:
                    BestFriendV2Card bestFriendV2Card6 = new BestFriendV2Card(cVar, cardUser, i, z, z2, num, 2131231446, R.string.bestFriends_cards_new_title, R.string.friendshipFacts_streaks_cards_title, R.plurals.friendshipFacts_friendship_cards_days, R.color.white, R.color.white_o70, R.color.orange, R.color.orange_light, z3);
                    return bestFriendV2Card6;
                case 7:
                    BestFriendV2Card bestFriendV2Card7 = new BestFriendV2Card(cVar, cardUser, i, z, z2, num, 2131231607, R.string.bestFriends_cards_new_title, R.string.friendshipFacts_hangouts_cards_title, R.plurals.friendshipFacts_time_cards_number, R.color.white, R.color.white_o70, R.color.purple, R.color.purple_dark, z3);
                    return bestFriendV2Card7;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* renamed from: app.zenly.locator.cards.models.BestFriendV2Card$b */
    public static class C1862b implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            C12932j.m33818b(parcel2, "in");
            BestFriendV2Card bestFriendV2Card = new BestFriendV2Card((C1863c) Enum.valueOf(C1863c.class, parcel.readString()), (CardUser) CardUser.CREATOR.createFromParcel(parcel2), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
            return bestFriendV2Card;
        }

        public final Object[] newArray(int i) {
            return new BestFriendV2Card[i];
        }
    }

    /* renamed from: app.zenly.locator.cards.models.BestFriendV2Card$c */
    public enum C1863c {
        BFF,
        FRIENDSHIP,
        HANGOUT,
        MUTUAL_LOVE,
        NO_SEE,
        STREAK,
        TIME_TOGETHER
    }

    public BestFriendV2Card(C1863c cVar, CardUser cardUser, int i, boolean z, boolean z2, Integer num, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z3) {
        C1863c cVar2 = cVar;
        CardUser cardUser2 = cardUser;
        C12932j.m33818b(cVar, "type");
        C12932j.m33818b(cardUser, "cardUser");
        int i10 = (int) 3423481720L;
        super(i10, i10, true, C6019a.f15150h.mo13789b());
        this.f6085i = cVar2;
        this.f6086j = cardUser2;
        this.f6087k = i;
        this.f6088l = z;
        this.f6089m = z2;
        this.f6090n = num;
        this.f6091o = i2;
        this.f6092p = i3;
        this.f6093q = i4;
        this.f6094r = i5;
        this.f6095s = i6;
        this.f6096t = i7;
        this.f6097u = i8;
        this.f6098v = i9;
        this.f6099w = z3;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final int mo7518e() {
        return this.f6097u;
    }

    /* renamed from: f */
    public final int mo7519f() {
        return this.f6098v;
    }

    /* renamed from: g */
    public final CardUser mo7520g() {
        return this.f6086j;
    }

    public final C1863c getType() {
        return this.f6085i;
    }

    /* renamed from: h */
    public final int mo7522h() {
        return this.f6087k;
    }

    /* renamed from: i */
    public final int mo7523i() {
        return this.f6094r;
    }

    /* renamed from: j */
    public final int mo7524j() {
        return this.f6091o;
    }

    /* renamed from: k */
    public final int mo7525k() {
        return this.f6092p;
    }

    /* renamed from: l */
    public final int mo7526l() {
        return this.f6093q;
    }

    /* renamed from: m */
    public final boolean mo7527m() {
        return this.f6099w;
    }

    /* renamed from: n */
    public final int mo7528n() {
        return this.f6096t;
    }

    /* renamed from: o */
    public final Integer mo7529o() {
        return this.f6090n;
    }

    /* renamed from: p */
    public final int mo7530p() {
        return this.f6095s;
    }

    /* renamed from: q */
    public final boolean mo7531q() {
        return this.f6089m;
    }

    /* renamed from: r */
    public final boolean mo7532r() {
        return this.f6088l;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C12932j.m33818b(parcel, "parcel");
        parcel.writeString(this.f6085i.name());
        this.f6086j.writeToParcel(parcel, 0);
        parcel.writeInt(this.f6087k);
        parcel.writeInt(this.f6088l ? 1 : 0);
        parcel.writeInt(this.f6089m ? 1 : 0);
        Integer num = this.f6090n;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.f6091o);
        parcel.writeInt(this.f6092p);
        parcel.writeInt(this.f6093q);
        parcel.writeInt(this.f6094r);
        parcel.writeInt(this.f6095s);
        parcel.writeInt(this.f6096t);
        parcel.writeInt(this.f6097u);
        parcel.writeInt(this.f6098v);
        parcel.writeInt(this.f6099w ? 1 : 0);
    }
}
