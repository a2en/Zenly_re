package p213co.znly.core.contacts;

import android.content.Context;
import p213co.znly.core.contacts.ContactParser.ContactListener;
import p213co.znly.models.C7339i;

/* renamed from: co.znly.core.contacts.ContactManager */
class ContactManager implements ContactListener {
    private static final String TAG = "ContactManager";
    private final ContactParser parser;

    public ContactManager(Context context) {
        this.parser = new ContactParser(context);
    }

    private native void _onNext(byte[] bArr);

    public native void onCompleted();

    public native void onError();

    public void onNext(C7339i iVar) {
        try {
            _onNext(iVar.toByteArray());
        } catch (IllegalArgumentException unused) {
        }
    }

    public void parseContacts() {
        this.parser.parse(this);
    }
}
