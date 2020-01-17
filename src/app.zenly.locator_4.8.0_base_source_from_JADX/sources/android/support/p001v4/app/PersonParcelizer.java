package android.support.p001v4.app;

import androidx.core.app.Person;
import androidx.versionedparcelable.VersionedParcel;

/* renamed from: android.support.v4.app.PersonParcelizer */
public final class PersonParcelizer extends androidx.core.app.PersonParcelizer {
    public static Person read(VersionedParcel versionedParcel) {
        return androidx.core.app.PersonParcelizer.read(versionedParcel);
    }

    public static void write(Person person, VersionedParcel versionedParcel) {
        androidx.core.app.PersonParcelizer.write(person, versionedParcel);
    }
}
