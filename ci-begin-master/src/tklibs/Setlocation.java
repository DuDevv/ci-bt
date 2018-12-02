package tklibs;

public class Setlocation {
    public float x;
    public float y;
    public Setlocation(float x, float y){
        this.x = x;
        this.y = y;
    }
    public Setlocation addThis(float x, float y){
        this.x += x;
        this.y += y;
        return this;
    }
    public Setlocation add(float x, float y){

        return new Setlocation(this.x + x, this.y + y);
    }
    public Setlocation subtractThis(float x, float y){
        this.x -= x;
        this.y -= y;
        return this;
    }
    public Setlocation subtract(float x, float y){

        return new Setlocation(this.x - x, this.y - y);
    }
    public Setlocation scaleThis(float ratio){
        this.x *= ratio;
        this.y *= ratio;
        return this;
    }
    public Setlocation scale(float x, float y){
        return new Setlocation(this.x * x, this.y *y);
    }
}