package kotlin.p413v;

import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12946x;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.reflect.KClass;

/* renamed from: kotlin.v.a */
public final class C13041a {
    /* renamed from: a */
    public static final <T> Class<T> m34047a(KClass<T> kClass) {
        C12932j.m33818b(kClass, "$this$java");
        Class<T> jClass = ((ClassBasedDeclarationContainer) kClass).getJClass();
        if (jClass != null) {
            return jClass;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<T>");
    }

    /* renamed from: b */
    public static final <T> Class<T> m34049b(KClass<T> kClass) {
        C12932j.m33818b(kClass, "$this$javaObjectType");
        Class jClass = ((ClassBasedDeclarationContainer) kClass).getJClass();
        String str = "null cannot be cast to non-null type java.lang.Class<T>";
        if (jClass.isPrimitive()) {
            String name = jClass.getName();
            if (name != null) {
                switch (name.hashCode()) {
                    case -1325958191:
                        if (name.equals("double")) {
                            jClass = Double.class;
                            break;
                        }
                        break;
                    case 104431:
                        if (name.equals("int")) {
                            jClass = Integer.class;
                            break;
                        }
                        break;
                    case 3039496:
                        if (name.equals("byte")) {
                            jClass = Byte.class;
                            break;
                        }
                        break;
                    case 3052374:
                        if (name.equals("char")) {
                            jClass = Character.class;
                            break;
                        }
                        break;
                    case 3327612:
                        if (name.equals("long")) {
                            jClass = Long.class;
                            break;
                        }
                        break;
                    case 3625364:
                        if (name.equals("void")) {
                            jClass = Void.class;
                            break;
                        }
                        break;
                    case 64711720:
                        if (name.equals("boolean")) {
                            jClass = Boolean.class;
                            break;
                        }
                        break;
                    case 97526364:
                        if (name.equals("float")) {
                            jClass = Float.class;
                            break;
                        }
                        break;
                    case 109413500:
                        if (name.equals("short")) {
                            jClass = Short.class;
                            break;
                        }
                        break;
                }
            }
            if (jClass != null) {
                return jClass;
            }
            throw new TypeCastException(str);
        } else if (jClass != null) {
            return jClass;
        } else {
            throw new TypeCastException(str);
        }
    }

    /* renamed from: a */
    public static final <T> KClass<T> m34048a(Class<T> cls) {
        C12932j.m33818b(cls, "$this$kotlin");
        return C12946x.m33834a((Class) cls);
    }
}
