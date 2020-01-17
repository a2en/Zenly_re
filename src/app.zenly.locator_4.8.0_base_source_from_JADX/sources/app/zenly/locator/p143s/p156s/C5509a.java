package app.zenly.locator.p143s.p156s;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnPreparedListener;
import app.zenly.locator.R;
import java.io.IOException;
import java.util.Map;
import kotlin.C12954o;
import kotlin.C12956q;
import kotlin.jvm.internal.C12932j;
import p214e.p228e.C7571a;

/* renamed from: app.zenly.locator.s.s.a */
public final class C5509a {

    /* renamed from: a */
    private static final C7571a<Integer, MediaPlayer> f14141a = new C7571a<>();

    /* renamed from: b */
    private static final Map<String, Integer> f14142b;

    /* renamed from: c */
    public static final C5509a f14143c = new C5509a();

    /* renamed from: app.zenly.locator.s.s.a$a */
    static final class C5510a implements OnCompletionListener {

        /* renamed from: a */
        final /* synthetic */ int f14144a;

        C5510a(int i, Context context) {
            this.f14144a = i;
        }

        public final void onCompletion(MediaPlayer mediaPlayer) {
            mediaPlayer.setOnCompletionListener(null);
            C5509a.m15625a(this.f14144a);
        }
    }

    /* renamed from: app.zenly.locator.s.s.a$b */
    static final class C5511b implements OnPreparedListener {

        /* renamed from: a */
        public static final C5511b f14145a = new C5511b();

        C5511b() {
        }

        public final void onPrepared(MediaPlayer mediaPlayer) {
            mediaPlayer.start();
        }
    }

    static {
        Integer valueOf = Integer.valueOf(R.raw.sound_emoji_bus);
        Integer valueOf2 = Integer.valueOf(R.raw.sound_emoji_sushi);
        Integer valueOf3 = Integer.valueOf(R.raw.sound_emoji_peach);
        f14142b = C12835h0.m33548a(C12954o.m33853a("Astonished", Integer.valueOf(R.raw.sound_emoji_astonished)), C12954o.m33853a("Bat", Integer.valueOf(R.raw.sound_emoji_bat)), C12954o.m33853a("BBQ", Integer.valueOf(R.raw.sound_emoji_bbq)), C12954o.m33853a("Bus", valueOf), C12954o.m33853a("Camera", Integer.valueOf(R.raw.sound_emoji_camera)), C12954o.m33853a("Candies", Integer.valueOf(R.raw.sound_emoji_candies)), C12954o.m33853a("Candle_1", Integer.valueOf(R.raw.sound_emoji_candle1)), C12954o.m33853a("Candles", Integer.valueOf(R.raw.sound_emoji_candles)), C12954o.m33853a("Candy_Cane", Integer.valueOf(R.raw.sound_emoji_candycane)), C12954o.m33853a("Car", Integer.valueOf(R.raw.sound_emoji_car)), C12954o.m33853a("Cat", Integer.valueOf(R.raw.sound_emoji_cat)), C12954o.m33853a("Cauldron", Integer.valueOf(R.raw.sound_emoji_cauldron)), C12954o.m33853a("Chili_Pepper", Integer.valueOf(R.raw.sound_emoji_chilipepper)), C12954o.m33853a("Christmas_Ball_Tree_1", Integer.valueOf(R.raw.sound_emoji_christmasballtree1)), C12954o.m33853a("Christmas_Ball_Tree_4", Integer.valueOf(R.raw.sound_emoji_christmasballtree4)), C12954o.m33853a("Christmas_Ball_Tree_6", Integer.valueOf(R.raw.sound_emoji_christmasballtree6)), C12954o.m33853a("Christmas_Tree", Integer.valueOf(R.raw.sound_emoji_christmastree)), C12954o.m33853a("Clubbing", Integer.valueOf(R.raw.sound_emoji_clubbing)), C12954o.m33853a("Coffin", Integer.valueOf(R.raw.sound_emoji_coffin)), C12954o.m33853a("Death", Integer.valueOf(R.raw.sound_emoji_death)), C12954o.m33853a("Devil_Sign", Integer.valueOf(R.raw.sound_emoji_yourock)), C12954o.m33853a("Dog", Integer.valueOf(R.raw.sound_emoji_dog)), C12954o.m33853a("Dolphin", Integer.valueOf(R.raw.sound_emoji_dolphin)), C12954o.m33853a("Donuts", Integer.valueOf(R.raw.sound_emoji_donuts)), C12954o.m33853a("Drinking_Shots", Integer.valueOf(R.raw.sound_emoji_shot)), C12954o.m33853a("Drinking_Vodka", Integer.valueOf(R.raw.sound_emoji_vodka)), C12954o.m33853a("E28FB0", Integer.valueOf(R.raw.sound_emoji_clock)), C12954o.m33853a("E29895", Integer.valueOf(R.raw.sound_emoji_coffee)), C12954o.m33853a("E29C88", Integer.valueOf(R.raw.sound_emoji_plane)), C12954o.m33853a("E29C8C", Integer.valueOf(R.raw.sound_emoji_peace)), C12954o.m33853a("E29D93", Integer.valueOf(R.raw.sound_emoji_question)), C12954o.m33853a("E29DA4", Integer.valueOf(R.raw.sound_emoji_heart)), C12954o.m33853a("E29EA1", Integer.valueOf(R.raw.sound_emoji_go)), C12954o.m33853a("E2A4B5", Integer.valueOf(R.raw.sound_emoji_come)), C12954o.m33853a("F09F8698", Integer.valueOf(R.raw.sound_emoji_sos)), C12954o.m33853a("F09F8699", Integer.valueOf(R.raw.sound_emoji_yo)), C12954o.m33853a("F09F8D86", Integer.valueOf(R.raw.sound_emoji_eggplant)), C12954o.m33853a("F09F8D94", Integer.valueOf(R.raw.sound_emoji_burger)), C12954o.m33853a("F09F8D95", Integer.valueOf(R.raw.sound_emoji_pizza)), C12954o.m33853a("F09F8DA3", valueOf2), C12954o.m33853a("F09F8DA6", Integer.valueOf(R.raw.sound_emoji_zenly)), C12954o.m33853a("F09F8DB9", Integer.valueOf(R.raw.sound_emoji_cocktail)), C12954o.m33853a("F09F8DBA", Integer.valueOf(R.raw.sound_emoji_beer)), C12954o.m33853a("F09F8DBE", Integer.valueOf(R.raw.sound_emoji_champagne)), C12954o.m33853a("F09F8DBF", Integer.valueOf(R.raw.sound_emoji_popcorn)), C12954o.m33853a("F09F8E82", Integer.valueOf(R.raw.sound_emoji_birthday)), C12954o.m33853a("F09F8E89", Integer.valueOf(R.raw.sound_emoji_party)), C12954o.m33853a("F09F8E93", Integer.valueOf(R.raw.sound_emoji_school)), C12954o.m33853a("F09F8EAE", Integer.valueOf(R.raw.sound_emoji_game)), C12954o.m33853a("F09F8EB5", Integer.valueOf(R.raw.sound_emoji_music)), C12954o.m33853a("F09F8F80", Integer.valueOf(R.raw.sound_emoji_basket)), C12954o.m33853a("F09F90A5", Integer.valueOf(R.raw.sound_emoji_duck)), C12954o.m33853a("F09F9180", Integer.valueOf(R.raw.sound_emoji_eyes)), C12954o.m33853a("F09F918D", Integer.valueOf(R.raw.sound_emoji_thumbsup)), C12954o.m33853a("F09F918E", Integer.valueOf(R.raw.sound_emoji_thumbsdown)), C12954o.m33853a("F09F91BB", Integer.valueOf(R.raw.sound_emoji_ghost)), C12954o.m33853a("F09F9284", Integer.valueOf(R.raw.sound_emoji_lipstick)), C12954o.m33853a("F09F928B", Integer.valueOf(R.raw.sound_emoji_lips)), C12954o.m33853a("F09F92A3", Integer.valueOf(R.raw.sound_emoji_bomb)), C12954o.m33853a("F09F92A9", Integer.valueOf(R.raw.sound_emoji_poop)), C12954o.m33853a("F09F92AF", Integer.valueOf(R.raw.sound_emoji_100)), C12954o.m33853a("F09F92B5", Integer.valueOf(R.raw.sound_emoji_dollars)), C12954o.m33853a("F09F948B", Integer.valueOf(R.raw.sound_emoji_battery)), C12954o.m33853a("F09F9882", Integer.valueOf(R.raw.sound_emoji_lmfao)), C12954o.m33853a("F09F988D", Integer.valueOf(R.raw.sound_emoji_love)), C12954o.m33853a("F09F988E", Integer.valueOf(R.raw.sound_emoji_cool)), C12954o.m33853a("F09F9892", Integer.valueOf(R.raw.sound_emoji_unsatisfied)), C12954o.m33853a("F09F9898", Integer.valueOf(R.raw.sound_emoji_kiss)), C12954o.m33853a("F09F98A1", Integer.valueOf(R.raw.sound_emoji_angry)), C12954o.m33853a("F09F98AD", Integer.valueOf(R.raw.sound_emoji_cry)), C12954o.m33853a("F09F98B4", Integer.valueOf(R.raw.sound_emoji_snoring)), C12954o.m33853a("F09F9A80", Integer.valueOf(R.raw.sound_emoji_rocket)), C12954o.m33853a("F09F9A84", Integer.valueOf(R.raw.sound_emoji_train)), C12954o.m33853a("F09F9A8C", valueOf), C12954o.m33853a("F09F9AAA", Integer.valueOf(R.raw.sound_emoji_door)), C12954o.m33853a("F09F9AAB", Integer.valueOf(R.raw.sound_emoji_forbiddensign)), C12954o.m33853a("F09F9AB2", Integer.valueOf(R.raw.sound_emoji_bike)), C12954o.m33853a("Flame", Integer.valueOf(R.raw.sound_emoji_flame)), C12954o.m33853a("Franky", Integer.valueOf(R.raw.sound_emoji_franky)), C12954o.m33853a("Getting_High", Integer.valueOf(R.raw.sound_emoji_cannabis)), C12954o.m33853a("Getting_Laid", Integer.valueOf(R.raw.sound_emoji_adult)), C12954o.m33853a("Gift_2", Integer.valueOf(R.raw.sound_emoji_gift2)), C12954o.m33853a("Gingerbread", Integer.valueOf(R.raw.sound_emoji_gingerbread)), C12954o.m33853a("Hatching_Chick", Integer.valueOf(R.raw.sound_emoji_hatchingchick)), C12954o.m33853a("Horny", Integer.valueOf(R.raw.sound_emoji_horny)), C12954o.m33853a("Lion", Integer.valueOf(R.raw.sound_emoji_lion)), C12954o.m33853a("Middle_Finger", Integer.valueOf(R.raw.sound_emoji_fuck)), C12954o.m33853a("Mummy", Integer.valueOf(R.raw.sound_emoji_mummy)), C12954o.m33853a("Netflix_Chill", Integer.valueOf(R.raw.sound_emoji_condom)), C12954o.m33853a("Panda", Integer.valueOf(R.raw.sound_emoji_panda)), C12954o.m33853a("Peach", valueOf3), C12954o.m33853a("Peach2", valueOf3), C12954o.m33853a("Phone", Integer.valueOf(R.raw.sound_emoji_phone)), C12954o.m33853a("Pulling_an_All_Nighter", Integer.valueOf(R.raw.sound_emoji_stone)), C12954o.m33853a("Pumpkin", Integer.valueOf(R.raw.sound_emoji_pumpkin)), C12954o.m33853a("Punch", Integer.valueOf(R.raw.sound_emoji_punch)), C12954o.m33853a("Rainbow_Poop", Integer.valueOf(R.raw.sound_emoji_rainbowpoop)), C12954o.m33853a("Recovering", Integer.valueOf(R.raw.sound_emoji_pills)), C12954o.m33853a("Reindeer_2", Integer.valueOf(R.raw.sound_emoji_reindeer2)), C12954o.m33853a("Santa", Integer.valueOf(R.raw.sound_emoji_santa)), C12954o.m33853a("Santa_Sleigh_1", Integer.valueOf(R.raw.sound_emoji_santasleigh1)), C12954o.m33853a("Satisfied", Integer.valueOf(R.raw.sound_emoji_satisfied)), C12954o.m33853a("Shopping", Integer.valueOf(R.raw.sound_emoji_shopping)), C12954o.m33853a("Skull", Integer.valueOf(R.raw.sound_emoji_skull)), C12954o.m33853a("Snowflake", Integer.valueOf(R.raw.sound_emoji_snowflex)), C12954o.m33853a("Snowman_2", Integer.valueOf(R.raw.sound_emoji_snowman2)), C12954o.m33853a("Socks_2", Integer.valueOf(R.raw.sound_emoji_socks2)), C12954o.m33853a("Space_invader", Integer.valueOf(R.raw.sound_emoji_spaceinvader)), C12954o.m33853a("Spider", Integer.valueOf(R.raw.sound_emoji_spider)), C12954o.m33853a("Sushi", valueOf2), C12954o.m33853a("Syringe", Integer.valueOf(R.raw.sound_emoji_syringe)), C12954o.m33853a("Thinking", Integer.valueOf(R.raw.sound_emoji_thinking)), C12954o.m33853a("Tombstone", Integer.valueOf(R.raw.sound_emoji_tombstone)), C12954o.m33853a("Trouble", Integer.valueOf(R.raw.sound_emoji_warninglight)), C12954o.m33853a("Umbrella", Integer.valueOf(R.raw.sound_emoji_rain)), C12954o.m33853a("Unicorn", Integer.valueOf(R.raw.sound_emoji_unicorn)), C12954o.m33853a("Witch_Hat", Integer.valueOf(R.raw.sound_emoji_witch_hat)), C12954o.m33853a("Working_Out", Integer.valueOf(R.raw.sound_emoji_workingout)), C12954o.m33853a("cornerflag", Integer.valueOf(R.raw.sound_emoji_cornerflag)), C12954o.m33853a("cup", Integer.valueOf(R.raw.sound_emoji_cup)), C12954o.m33853a("goalcage", Integer.valueOf(R.raw.sound_emoji_goalcage)), C12954o.m33853a("gooal", Integer.valueOf(R.raw.sound_emoji_goal)), C12954o.m33853a("horn", Integer.valueOf(R.raw.sound_emoji_horn)), C12954o.m33853a("kickoff", Integer.valueOf(R.raw.sound_emoji_kickoff)), C12954o.m33853a("redcard", Integer.valueOf(R.raw.sound_emoji_redcard)), C12954o.m33853a("soccerball", Integer.valueOf(R.raw.sound_emoji_soccerball)), C12954o.m33853a("soccerfield", Integer.valueOf(R.raw.sound_emoji_soccerfield)), C12954o.m33853a("soccershoes", Integer.valueOf(R.raw.sound_emoji_soccershoes)), C12954o.m33853a("whistle", Integer.valueOf(R.raw.sound_emoji_whistle)), C12954o.m33853a("yellowcard", Integer.valueOf(R.raw.sound_emoji_yellowcard)));
    }

    private C5509a() {
    }

    /* renamed from: a */
    public static final void m15626a(Context context, String str) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(str, "emojiUuid");
        f14143c.m15627a(context, str, R.raw.sound_emoji_default_received);
    }

    /* renamed from: b */
    public static final void m15629b(Context context, String str) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(str, "emojiUuid");
        f14143c.m15627a(context, str, R.raw.sound_emoji_default_sent);
    }

    /* renamed from: a */
    private final void m15627a(Context context, String str, int i) {
        Integer num = (Integer) f14142b.get(str);
        if (num != null) {
            m15628b(context, num.intValue());
        } else {
            m15628b(context, i);
        }
    }

    /* renamed from: b */
    public static final void m15628b(Context context, int i) {
        C12932j.m33818b(context, "context");
        synchronized (f14141a) {
            MediaPlayer mediaPlayer = (MediaPlayer) f14141a.get(Integer.valueOf(i));
            if (mediaPlayer == null) {
                mediaPlayer = f14143c.m15624a(context, i);
                if (mediaPlayer != null) {
                    f14141a.put(Integer.valueOf(i), mediaPlayer);
                    mediaPlayer.prepareAsync();
                } else {
                    mediaPlayer = null;
                }
            }
            if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                mediaPlayer.seekTo(0);
            }
            C12956q qVar = C12956q.f33541a;
        }
    }

    /* renamed from: a */
    public static final void m15625a(int i) {
        synchronized (f14141a) {
            MediaPlayer mediaPlayer = (MediaPlayer) f14141a.remove(Integer.valueOf(i));
            if (mediaPlayer != null) {
                mediaPlayer.release();
                C12956q qVar = C12956q.f33541a;
            }
        }
    }

    /* renamed from: a */
    private final MediaPlayer m15624a(Context context, int i) {
        try {
            MediaPlayer mediaPlayer = new MediaPlayer();
            mediaPlayer.setOnCompletionListener(new C5510a(i, context));
            mediaPlayer.setOnPreparedListener(C5511b.f14145a);
            mediaPlayer.setAudioStreamType(3);
            AssetFileDescriptor openRawResourceFd = context.getResources().openRawResourceFd(i);
            C12932j.m33815a((Object) openRawResourceFd, "descriptor");
            mediaPlayer.setDataSource(openRawResourceFd.getFileDescriptor(), openRawResourceFd.getStartOffset(), openRawResourceFd.getLength());
            return mediaPlayer;
        } catch (IOException unused) {
            return null;
        }
    }
}
