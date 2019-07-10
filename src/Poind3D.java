import java.lang.reflect.Array;

public class Poind3D extends Poind2D {
    private float z =0.0f;

    public Poind3D() {
    }

    public Poind3D(float z) {
        this.z = z;
    }

    public Poind3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float z){
        super.setXY(getX(),getY());
        this.z = z;
    }
    public float[] getXYZ(){
        float Array[] ={super.getX(),super.getY(),this.z};
        return Array;
    }

    @Override
    public String toString() {
        return "Poind3D{" +
                "x=" +super.getX()+
                "y=" +super.getY()+
                "z=" + z +
                '}';
    }
}
