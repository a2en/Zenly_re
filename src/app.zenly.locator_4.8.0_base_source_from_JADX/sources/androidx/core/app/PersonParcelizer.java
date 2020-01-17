package androidx.core.app;

import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;
import androidx.versionedparcelable.VersionedParcelable;

public class PersonParcelizer {
    public static Person read(VersionedParcel versionedParcel) {
        Person person = new Person();
        person.f2480a = versionedParcel.mo6290a(person.f2480a, 1);
        person.f2481b = (IconCompat) versionedParcel.mo6288a(person.f2481b, 2);
        person.f2482c = versionedParcel.mo6291a(person.f2482c, 3);
        person.f2483d = versionedParcel.mo6291a(person.f2483d, 4);
        person.f2484e = versionedParcel.mo6302a(person.f2484e, 5);
        person.f2485f = versionedParcel.mo6302a(person.f2485f, 6);
        return person;
    }

    public static void write(Person person, VersionedParcel versionedParcel) {
        versionedParcel.mo6299a(false, false);
        versionedParcel.mo6309b(person.f2480a, 1);
        versionedParcel.mo6308b((VersionedParcelable) person.f2481b, 2);
        versionedParcel.mo6310b(person.f2482c, 3);
        versionedParcel.mo6310b(person.f2483d, 4);
        versionedParcel.mo6311b(person.f2484e, 5);
        versionedParcel.mo6311b(person.f2485f, 6);
    }
}
