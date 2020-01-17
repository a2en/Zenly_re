package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.C10447a;
import com.google.android.gms.internal.common.C10448b;
import com.google.android.gms.internal.common.C10449c;

public interface IAccountAccessor extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.IAccountAccessor$a */
    public static abstract class C10094a extends C10447a implements IAccountAccessor {

        /* renamed from: com.google.android.gms.common.internal.IAccountAccessor$a$a */
        public static class C10095a extends C10448b implements IAccountAccessor {
            C10095a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
            }

            public final Account getAccount() throws RemoteException {
                Parcel a = mo28274a(2, mo28273a());
                Account account = (Account) C10449c.m26838a(a, Account.CREATOR);
                a.recycle();
                return account;
            }
        }

        /* renamed from: a */
        public static IAccountAccessor m25412a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            if (queryLocalInterface instanceof IAccountAccessor) {
                return (IAccountAccessor) queryLocalInterface;
            }
            return new C10095a(iBinder);
        }
    }

    Account getAccount() throws RemoteException;
}
