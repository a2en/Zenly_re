package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.Log;
import android.util.Xml;
import androidx.constraintlayout.widget.C0467a;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.constraintlayout.motion.widget.g */
public class C0350g {

    /* renamed from: b */
    static HashMap<String, Constructor<? extends C0328c>> f1532b = new HashMap<>();

    /* renamed from: a */
    private HashMap<Integer, ArrayList<C0328c>> f1533a = new HashMap<>();

    static {
        try {
            f1532b.put("KeyAttribute", C0329d.class.getConstructor(new Class[0]));
            f1532b.put("KeyPosition", C0351h.class.getConstructor(new Class[0]));
            f1532b.put("KeyCycle", C0331e.class.getConstructor(new Class[0]));
            f1532b.put("KeyTimeCycle", C0356k.class.getConstructor(new Class[0]));
            f1532b.put("KeyTrigger", C0358l.class.getConstructor(new Class[0]));
            f1532b.put("KeySpring", C0354j.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException e) {
            Log.e("KeyFrames", "unable to load", e);
        }
    }

    public C0350g(Context context, XmlPullParser xmlPullParser) {
        C0328c cVar = null;
        try {
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType != 0) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        if (f1532b.containsKey(name)) {
                            try {
                                C0328c cVar2 = (C0328c) ((Constructor) f1532b.get(name)).newInstance(new Object[0]);
                                try {
                                    cVar2.mo2306a(context, Xml.asAttributeSet(xmlPullParser));
                                    m1517a(cVar2);
                                    cVar = cVar2;
                                } catch (Exception e) {
                                    C0328c cVar3 = cVar2;
                                    e = e;
                                    cVar = cVar3;
                                    Log.e("KeyFrames", "unable to create ", e);
                                    eventType = xmlPullParser.next();
                                }
                            } catch (Exception e2) {
                                e = e2;
                                Log.e("KeyFrames", "unable to create ", e);
                                eventType = xmlPullParser.next();
                            }
                        } else if (!(!name.equalsIgnoreCase("CustomAttribute") || cVar == null || cVar.f1477d == null)) {
                            C0467a.m2196a(context, xmlPullParser, cVar.f1477d);
                        }
                    } else if (eventType == 3) {
                        if ("KeyFrameSet".equals(xmlPullParser.getName())) {
                            return;
                        }
                    }
                }
                eventType = xmlPullParser.next();
            }
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        } catch (IOException e4) {
            e4.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m1517a(C0328c cVar) {
        if (!this.f1533a.containsKey(Integer.valueOf(cVar.f1475b))) {
            this.f1533a.put(Integer.valueOf(cVar.f1475b), new ArrayList());
        }
        ((ArrayList) this.f1533a.get(Integer.valueOf(cVar.f1475b))).add(cVar);
    }

    /* renamed from: a */
    public void mo2327a(C0361n nVar) {
        ArrayList arrayList = (ArrayList) this.f1533a.get(Integer.valueOf(nVar.f1622b));
        if (arrayList != null) {
            nVar.mo2349a(arrayList);
        }
        ArrayList arrayList2 = (ArrayList) this.f1533a.get(Integer.valueOf(-1));
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                C0328c cVar = (C0328c) it.next();
                if (cVar.mo2309a(((LayoutParams) nVar.f1621a.getLayoutParams()).f2120U)) {
                    nVar.mo2347a(cVar);
                }
            }
        }
    }
}
