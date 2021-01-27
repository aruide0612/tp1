package question2;

import java.util.Objects;

public class Geometry {
    private String type;
    private String color;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static int surface(int longueur,int largeur){ return longueur*largeur;}

    public static int perimeter(int longueur){ return longueur*4;}

    @Override
    public String toString() {
        return "Type:" + type ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Geometry geometry = (Geometry) o;
        return Objects.equals(type, geometry.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }
}
