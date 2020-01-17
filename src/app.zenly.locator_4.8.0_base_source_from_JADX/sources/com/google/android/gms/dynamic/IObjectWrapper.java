package com.google.android.gms.dynamic;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.common.C10447a;
import com.google.android.gms.internal.common.C10448b;

public interface IObjectWrapper extends IInterface {

    /* renamed from: com.google.android.gms.dynamic.IObjectWrapper$a */
    public static abstract class C10182a extends C10447a implements IObjectWrapper {

        /* renamed from: com.google.android.gms.dynamic.IObjectWrapper$a$a */
        public static class C10183a extends C10448b implements IObjectWrapper {
            C10183a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
            }
        }

        public C10182a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        /* renamed from: a */
        public static IObjectWrapper m25696a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof IObjectWrapper) {
                return (IObjectWrapper) queryLocalInterface;
            }
            return new C10183a(iBinder);
        }
    }
}
