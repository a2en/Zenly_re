package com.mapbox.geojson;

import com.google.gson.C11125d;
import com.google.gson.C11138i;
import com.google.gson.p316k.C11261a;
import com.google.gson.stream.C11262a;
import com.google.gson.stream.C11264b;
import com.google.gson.stream.C11265c;
import java.io.IOException;
import java.util.List;

final class AutoValue_GeometryCollection extends C$AutoValue_GeometryCollection {

    public static final class GsonTypeAdapter extends C11138i<GeometryCollection> {
        private volatile C11138i<BoundingBox> boundingBox_adapter;
        private final C11125d gson;
        private volatile C11138i<List<Geometry>> list__geometry_adapter;
        private volatile C11138i<String> string_adapter;

        public GsonTypeAdapter(C11125d dVar) {
            this.gson = dVar;
        }

        public GeometryCollection read(C11262a aVar) throws IOException {
            String str = null;
            if (aVar.peek() == C11264b.NULL) {
                aVar.mo32585o();
                return null;
            }
            aVar.mo32574b();
            BoundingBox boundingBox = null;
            List list = null;
            while (aVar.mo32579g()) {
                String n = aVar.mo32584n();
                if (aVar.peek() == C11264b.NULL) {
                    aVar.mo32585o();
                } else {
                    char c = 65535;
                    int hashCode = n.hashCode();
                    if (hashCode != 3017257) {
                        if (hashCode != 3575610) {
                            if (hashCode == 203916432 && n.equals("geometries")) {
                                c = 2;
                            }
                        } else if (n.equals("type")) {
                            c = 0;
                        }
                    } else if (n.equals("bbox")) {
                        c = 1;
                    }
                    if (c == 0) {
                        C11138i<String> iVar = this.string_adapter;
                        if (iVar == null) {
                            iVar = this.gson.mo32449a(String.class);
                            this.string_adapter = iVar;
                        }
                        str = (String) iVar.read(aVar);
                    } else if (c == 1) {
                        C11138i<BoundingBox> iVar2 = this.boundingBox_adapter;
                        if (iVar2 == null) {
                            iVar2 = this.gson.mo32449a(BoundingBox.class);
                            this.boundingBox_adapter = iVar2;
                        }
                        boundingBox = (BoundingBox) iVar2.read(aVar);
                    } else if (c != 2) {
                        aVar.mo32588q();
                    } else {
                        C11138i<List<Geometry>> iVar3 = this.list__geometry_adapter;
                        if (iVar3 == null) {
                            iVar3 = this.gson.mo32448a(C11261a.getParameterized(List.class, Geometry.class));
                            this.list__geometry_adapter = iVar3;
                        }
                        list = (List) iVar3.read(aVar);
                    }
                }
            }
            aVar.mo32577e();
            return new AutoValue_GeometryCollection(str, boundingBox, list);
        }

        public void write(C11265c cVar, GeometryCollection geometryCollection) throws IOException {
            if (geometryCollection == null) {
                cVar.mo32606h();
                return;
            }
            cVar.mo32598b();
            cVar.mo32599b("type");
            if (geometryCollection.type() == null) {
                cVar.mo32606h();
            } else {
                C11138i<String> iVar = this.string_adapter;
                if (iVar == null) {
                    iVar = this.gson.mo32449a(String.class);
                    this.string_adapter = iVar;
                }
                iVar.write(cVar, geometryCollection.type());
            }
            cVar.mo32599b("bbox");
            if (geometryCollection.bbox() == null) {
                cVar.mo32606h();
            } else {
                C11138i<BoundingBox> iVar2 = this.boundingBox_adapter;
                if (iVar2 == null) {
                    iVar2 = this.gson.mo32449a(BoundingBox.class);
                    this.boundingBox_adapter = iVar2;
                }
                iVar2.write(cVar, geometryCollection.bbox());
            }
            cVar.mo32599b("geometries");
            if (geometryCollection.geometries() == null) {
                cVar.mo32606h();
            } else {
                C11138i<List<Geometry>> iVar3 = this.list__geometry_adapter;
                if (iVar3 == null) {
                    iVar3 = this.gson.mo32448a(C11261a.getParameterized(List.class, Geometry.class));
                    this.list__geometry_adapter = iVar3;
                }
                iVar3.write(cVar, geometryCollection.geometries());
            }
            cVar.mo32602d();
        }
    }

    AutoValue_GeometryCollection(String str, BoundingBox boundingBox, List<Geometry> list) {
        super(str, boundingBox, list);
    }
}
