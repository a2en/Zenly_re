package p213co.znly.core.contacts;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.provider.ContactsContract.Data;
import android.text.TextUtils;
import androidx.core.p004os.C0569g;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p213co.znly.models.C7339i;
import p213co.znly.models.C7339i.C7340a;

/* renamed from: co.znly.core.contacts.ContactParser */
public class ContactParser {
    private final HashMap<String, C7340a> contacts = new HashMap<>();
    private final ContentResolver contentResolver;
    private final AtomicBoolean hasError = new AtomicBoolean(false);
    private boolean hasName;
    private boolean hasPhone;

    /* renamed from: co.znly.core.contacts.ContactParser$ContactListener */
    public interface ContactListener {
        void onCompleted();

        void onError();

        void onNext(C7339i iVar);
    }

    /* renamed from: co.znly.core.contacts.ContactParser$ContactNameQuery */
    private interface ContactNameQuery {
        public static final int CONTACT_ID = 0;
        public static final Uri CONTENT_URI = Data.CONTENT_URI;
        public static final int DISPLAY_NAME = 1;
        public static final int FAMILY_NAME = 2;
        public static final int GIVEN_NAME = 3;
        public static final int MIDDLE_NAME = 4;
        public static final String[] PROJECTION = {"contact_id", "data1", "data3", "data2", "data5"};
        public static final String SELECTION = "mimetype = ?";
    }

    /* renamed from: co.znly.core.contacts.ContactParser$ContactPhoneQuery */
    private interface ContactPhoneQuery {
        public static final int CONTACT_ID = 0;
        public static final Uri CONTENT_URI = Phone.CONTENT_URI;
        public static final int NUMBER = 1;
        public static final String[] PROJECTION = {"contact_id", "data1"};
    }

    public ContactParser(Context context) {
        this.contentResolver = context.getContentResolver();
    }

    private static <T> T[] append(T[] tArr, T t) {
        int length = tArr.length;
        T[] copyOf = Arrays.copyOf(tArr, length + 1);
        copyOf[length] = t;
        return copyOf;
    }

    private C7340a getContact(String str) {
        C7340a aVar = (C7340a) this.contacts.get(str);
        if (aVar != null) {
            return aVar;
        }
        C7340a newBuilder = C7339i.newBuilder();
        newBuilder.mo19248b(str);
        this.contacts.put(str, newBuilder);
        return newBuilder;
    }

    private Cursor getContactNameCursor() {
        return this.contentResolver.query(ContactNameQuery.CONTENT_URI, ContactNameQuery.PROJECTION, ContactNameQuery.SELECTION, new String[]{"vnd.android.cursor.item/name"}, null);
    }

    private Cursor getContactPhoneCursor() {
        return this.contentResolver.query(ContactPhoneQuery.CONTENT_URI, ContactPhoneQuery.PROJECTION, null, null, null);
    }

    private void notifyError(ContactListener contactListener) {
        if (this.hasError.compareAndSet(false, true)) {
            contactListener.onError();
        }
    }

    private void notifyListener(ContactListener contactListener) {
        if (!this.hasError.get() && this.hasName && this.hasPhone) {
            for (C7340a build : this.contacts.values()) {
                contactListener.onNext((C7339i) build.build());
            }
            contactListener.onCompleted();
        }
    }

    private void parseNames(Cursor cursor) {
        while (cursor.moveToNext()) {
            C7340a contact = getContact(cursor.getString(0));
            String string = cursor.getString(1);
            if (!TextUtils.isEmpty(string)) {
                contact.mo19250d(string);
            }
            String string2 = cursor.getString(3);
            if (!TextUtils.isEmpty(string2)) {
                contact.mo19249c(string2);
            }
            String string3 = cursor.getString(4);
            if (!TextUtils.isEmpty(string3)) {
                contact.mo19252f(string3);
            }
            String string4 = cursor.getString(2);
            if (!TextUtils.isEmpty(string4)) {
                contact.mo19251e(string4);
            }
        }
    }

    private void parsePhones(Cursor cursor) {
        while (cursor.moveToNext()) {
            C7340a contact = getContact(cursor.getString(0));
            String string = cursor.getString(1);
            if (!TextUtils.isEmpty(string)) {
                contact.mo19247a(string);
            }
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo14600a(ContactListener contactListener) {
        C0569g.m2680a("core:contacts:parseNames");
        Cursor contactNameCursor = getContactNameCursor();
        synchronized (this.contacts) {
            if (contactNameCursor == null) {
                notifyError(contactListener);
                C0569g.m2679a();
                return;
            }
            parseNames(contactNameCursor);
            this.hasName = true;
            notifyListener(contactListener);
            contactNameCursor.close();
            C0569g.m2679a();
        }
    }

    /* renamed from: b */
    public /* synthetic */ void mo14601b(ContactListener contactListener) {
        C0569g.m2680a("core:contacts:parsePhones");
        Cursor contactPhoneCursor = getContactPhoneCursor();
        synchronized (this.contacts) {
            if (contactPhoneCursor == null) {
                notifyError(contactListener);
                return;
            }
            parsePhones(contactPhoneCursor);
            this.hasPhone = true;
            notifyListener(contactListener);
            contactPhoneCursor.close();
            C0569g.m2679a();
        }
    }

    public void parse(ContactListener contactListener) {
        this.contacts.clear();
        new Thread(new C6410b(this, contactListener)).start();
        new Thread(new C6409a(this, contactListener)).start();
    }
}
