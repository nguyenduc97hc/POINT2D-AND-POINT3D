public class Poind2D {
    private float x =0.0f;
    private float y = 0.0f;

    public Poind2D() {
    }

    public Poind2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y){
        this.x = x;
        this.y = y;

    }
    public float[] getXY(){
         float Array[] ={this.x,this.y};
         return Array;
    }

    @Override
    public String toString() {
        return "Poind2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
