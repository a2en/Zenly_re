package com.mapbox.geojson;

import com.google.gson.C11125d;
import com.google.gson.C11138i;
import com.google.gson.stream.C11262a;
import com.google.gson.stream.C11264b;
import com.google.gson.stream.C11265c;
import java.io.IOException;

final class AutoValue_BoundingBox extends C$AutoValue_BoundingBox {

    public static final class GsonTypeAdapter extends C11138i<BoundingBox> {
        private final C11125d gson;
        private volatile C11138i<Point> point_adapter;

        public GsonTypeAdapter(C11125d dVar) {
            this.gson = dVar;
        }

        public BoundingBox read(C11262a aVar) throws IOException {
            Point point = null;
            if (aVar.peek() == C11264b.NULL) {
                aVar.mo32585o();
                return null;
            }
            aVar.mo32574b();
            Point point2 = null;
            while (aVar.mo32579g()) {
                String n = aVar.mo32584n();
                if (aVar.peek() == C11264b.NULL) {
                    aVar.mo32585o();
                } else {
                    char c = 65535;
                    int hashCode = n.hashCode();
                    if (hashCode != -1635992324) {
                        if (hashCode == 443261570 && n.equals("northeast")) {
                            c = 1;
                        }
                    } else if (n.equals("southwest")) {
                        c = 0;
                    }
                    if (c == 0) {
                        C11138i<Point> iVar = this.point_adapter;
                        if (iVar == null) {
                            iVar = this.gson.mo32449a(Point.class);
                            this.point_adapter = iVar;
                        }
                        point = (Point) iVar.read(aVar);
                    } else if (c != 1) {
                        aVar.mo32588q();
                    } else {
                        C11138i<Point> iVar2 = this.point_adapter;
                        if (iVar2 == null) {
                            iVar2 = this.gson.mo32449a(Point.class);
                            this.point_adapter = iVar2;
                        }
                        point2 = (Point) iVar2.read(aVar);
                    }
                }
            }
            aVar.mo32577e();
            return new AutoValue_BoundingBox(point, point2);
        }

        public void write(C11265c cVar, BoundingBox boundingBox) throws IOException {
            if (boundingBox == null) {
                cVar.mo32606h();
                return;
            }
            cVar.mo32598b();
            cVar.mo32599b("southwest");
            if (boundingBox.southwest() == null) {
                cVar.mo32606h();
            } else {
                C11138i<Point> iVar = this.point_adapter;
                if (iVar == null) {
                    iVar = this.gson.mo32449a(Point.class);
                    this.point_adapter = iVar;
                }
                iVar.write(cVar, boundingBox.southwest());
            }
            cVar.mo32599b("northeast");
            if (boundingBox.northeast() == null) {
                cVar.mo32606h();
            } else {
                C11138i<Point> iVar2 = this.point_adapter;
                if (iVar2 == null) {
                    iVar2 = this.gson.mo32449a(Point.class);
                    this.point_adapter = iVar2;
                }
                iVar2.write(cVar, boundingBox.northeast());
            }
            cVar.mo32602d();
        }
    }

    AutoValue_BoundingBox(Point point, Point point2) {
        super(point, point2);
    }
}
