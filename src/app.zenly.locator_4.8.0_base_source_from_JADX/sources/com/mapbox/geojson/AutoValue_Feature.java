package com.mapbox.geojson;

import com.google.gson.C11125d;
import com.google.gson.C11138i;
import com.google.gson.JsonObject;
import com.google.gson.stream.C11262a;
import com.google.gson.stream.C11264b;
import com.google.gson.stream.C11265c;
import java.io.IOException;

final class AutoValue_Feature extends C$AutoValue_Feature {

    public static final class GsonTypeAdapter extends C11138i<Feature> {
        private volatile C11138i<BoundingBox> boundingBox_adapter;
        private volatile C11138i<Geometry> geometry_adapter;
        private final C11125d gson;
        private volatile C11138i<JsonObject> jsonObject_adapter;
        private volatile C11138i<String> string_adapter;

        public GsonTypeAdapter(C11125d dVar) {
            this.gson = dVar;
        }

        public Feature read(C11262a aVar) throws IOException {
            if (aVar.peek() == C11264b.NULL) {
                aVar.mo32585o();
                return null;
            }
            aVar.mo32574b();
            String str = null;
            BoundingBox boundingBox = null;
            String str2 = null;
            Geometry geometry = null;
            JsonObject jsonObject = null;
            while (aVar.mo32579g()) {
                String n = aVar.mo32584n();
                if (aVar.peek() == C11264b.NULL) {
                    aVar.mo32585o();
                } else {
                    char c = 65535;
                    switch (n.hashCode()) {
                        case -926053069:
                            if (n.equals("properties")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 3355:
                            if (n.equals("id")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 3017257:
                            if (n.equals("bbox")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 3575610:
                            if (n.equals("type")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 1846020210:
                            if (n.equals("geometry")) {
                                c = 3;
                                break;
                            }
                            break;
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
                    } else if (c == 2) {
                        C11138i<String> iVar3 = this.string_adapter;
                        if (iVar3 == null) {
                            iVar3 = this.gson.mo32449a(String.class);
                            this.string_adapter = iVar3;
                        }
                        str2 = (String) iVar3.read(aVar);
                    } else if (c == 3) {
                        C11138i<Geometry> iVar4 = this.geometry_adapter;
                        if (iVar4 == null) {
                            iVar4 = this.gson.mo32449a(Geometry.class);
                            this.geometry_adapter = iVar4;
                        }
                        geometry = (Geometry) iVar4.read(aVar);
                    } else if (c != 4) {
                        aVar.mo32588q();
                    } else {
                        C11138i<JsonObject> iVar5 = this.jsonObject_adapter;
                        if (iVar5 == null) {
                            iVar5 = this.gson.mo32449a(JsonObject.class);
                            this.jsonObject_adapter = iVar5;
                        }
                        jsonObject = (JsonObject) iVar5.read(aVar);
                    }
                }
            }
            aVar.mo32577e();
            AutoValue_Feature autoValue_Feature = new AutoValue_Feature(str, boundingBox, str2, geometry, jsonObject);
            return autoValue_Feature;
        }

        public void write(C11265c cVar, Feature feature) throws IOException {
            if (feature == null) {
                cVar.mo32606h();
                return;
            }
            cVar.mo32598b();
            cVar.mo32599b("type");
            if (feature.type() == null) {
                cVar.mo32606h();
            } else {
                C11138i<String> iVar = this.string_adapter;
                if (iVar == null) {
                    iVar = this.gson.mo32449a(String.class);
                    this.string_adapter = iVar;
                }
                iVar.write(cVar, feature.type());
            }
            cVar.mo32599b("bbox");
            if (feature.bbox() == null) {
                cVar.mo32606h();
            } else {
                C11138i<BoundingBox> iVar2 = this.boundingBox_adapter;
                if (iVar2 == null) {
                    iVar2 = this.gson.mo32449a(BoundingBox.class);
                    this.boundingBox_adapter = iVar2;
                }
                iVar2.write(cVar, feature.bbox());
            }
            cVar.mo32599b("id");
            if (feature.mo33084id() == null) {
                cVar.mo32606h();
            } else {
                C11138i<String> iVar3 = this.string_adapter;
                if (iVar3 == null) {
                    iVar3 = this.gson.mo32449a(String.class);
                    this.string_adapter = iVar3;
                }
                iVar3.write(cVar, feature.mo33084id());
            }
            cVar.mo32599b("geometry");
            if (feature.geometry() == null) {
                cVar.mo32606h();
            } else {
                C11138i<Geometry> iVar4 = this.geometry_adapter;
                if (iVar4 == null) {
                    iVar4 = this.gson.mo32449a(Geometry.class);
                    this.geometry_adapter = iVar4;
                }
                iVar4.write(cVar, feature.geometry());
            }
            cVar.mo32599b("properties");
            if (feature.properties() == null) {
                cVar.mo32606h();
            } else {
                C11138i<JsonObject> iVar5 = this.jsonObject_adapter;
                if (iVar5 == null) {
                    iVar5 = this.gson.mo32449a(JsonObject.class);
                    this.jsonObject_adapter = iVar5;
                }
                iVar5.write(cVar, feature.properties());
            }
            cVar.mo32602d();
        }
    }

    AutoValue_Feature(String str, BoundingBox boundingBox, String str2, Geometry geometry, JsonObject jsonObject) {
        super(str, boundingBox, str2, geometry, jsonObject);
    }
}
