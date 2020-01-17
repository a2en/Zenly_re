package androidx.constraintlayout.motion.widget;

import android.util.Pair;
import java.util.HashMap;

/* renamed from: androidx.constraintlayout.motion.widget.b */
public class C0327b implements C0368r {

    /* renamed from: a */
    static final HashMap<Pair<Integer, Integer>, String> f1471a = new HashMap<>();

    /* renamed from: b */
    static final HashMap<String, String> f1472b = new HashMap<>();

    static {
        HashMap<Pair<Integer, Integer>, String> hashMap = f1471a;
        Integer valueOf = Integer.valueOf(4);
        String str = "layout_constraintBottom_toBottomOf";
        hashMap.put(Pair.create(valueOf, valueOf), str);
        HashMap<Pair<Integer, Integer>, String> hashMap2 = f1471a;
        Integer valueOf2 = Integer.valueOf(3);
        String str2 = "layout_constraintBottom_toTopOf";
        hashMap2.put(Pair.create(valueOf, valueOf2), str2);
        String str3 = "layout_constraintTop_toBottomOf";
        f1471a.put(Pair.create(valueOf2, valueOf), str3);
        HashMap<Pair<Integer, Integer>, String> hashMap3 = f1471a;
        Pair create = Pair.create(valueOf2, valueOf2);
        String str4 = "layout_constraintTop_toTopOf";
        hashMap3.put(create, str4);
        HashMap<Pair<Integer, Integer>, String> hashMap4 = f1471a;
        Integer valueOf3 = Integer.valueOf(6);
        String str5 = "layout_constraintStart_toStartOf";
        hashMap4.put(Pair.create(valueOf3, valueOf3), str5);
        HashMap<Pair<Integer, Integer>, String> hashMap5 = f1471a;
        Integer valueOf4 = Integer.valueOf(7);
        String str6 = "layout_constraintStart_toEndOf";
        hashMap5.put(Pair.create(valueOf3, valueOf4), str6);
        String str7 = "layout_constraintEnd_toStartOf";
        f1471a.put(Pair.create(valueOf4, valueOf3), str7);
        HashMap<Pair<Integer, Integer>, String> hashMap6 = f1471a;
        Pair create2 = Pair.create(valueOf4, valueOf4);
        String str8 = "layout_constraintEnd_toEndOf";
        hashMap6.put(create2, str8);
        HashMap<Pair<Integer, Integer>, String> hashMap7 = f1471a;
        Integer valueOf5 = Integer.valueOf(1);
        String str9 = "layout_constraintLeft_toLeftOf";
        hashMap7.put(Pair.create(valueOf5, valueOf5), str9);
        HashMap<Pair<Integer, Integer>, String> hashMap8 = f1471a;
        Integer valueOf6 = Integer.valueOf(2);
        hashMap8.put(Pair.create(valueOf5, valueOf6), "layout_constraintLeft_toRightOf");
        f1471a.put(Pair.create(valueOf6, valueOf6), "layout_constraintRight_toRightOf");
        f1471a.put(Pair.create(valueOf6, valueOf5), "layout_constraintRight_toLeftOf");
        f1471a.put(Pair.create(Integer.valueOf(5), Integer.valueOf(5)), "layout_constraintBaseline_toBaselineOf");
        f1472b.put(str, "layout_marginBottom");
        f1472b.put(str2, "layout_marginBottom");
        f1472b.put(str3, "layout_marginTop");
        f1472b.put(str4, "layout_marginTop");
        f1472b.put(str5, "layout_marginStart");
        f1472b.put(str6, "layout_marginStart");
        f1472b.put(str7, "layout_marginEnd");
        f1472b.put(str8, "layout_marginEnd");
        f1472b.put(str9, "layout_marginLeft");
        f1472b.put("layout_constraintLeft_toRightOf", "layout_marginLeft");
        f1472b.put("layout_constraintRight_toRightOf", "layout_marginRight");
        f1472b.put("layout_constraintRight_toLeftOf", "layout_marginRight");
    }

    public C0327b(MotionLayout motionLayout) {
    }
}
