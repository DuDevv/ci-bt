package game;

public class Vector2D {
    public float x;
    public float y;

    public Vector2D() {
        this.x = 0;
        this.y = 0;
    }

    public Vector2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Vector2D set(float x, float y) {
        this.x = x;
        this.y = y;
        return this;
    }
    public Vector2D set(Vector2D other){
        return this.set(other.x,other.y);
    }

    public Vector2D add(float x, float y) {

        return new Vector2D(this.x + x, this.y + y);
    }
    public Vector2D add(Vector2D other){
        return  new Vector2D(other.x,other.y);
    }

    public Vector2D addThis(float x, float y) {
        this.x += x;
        this.y += y;
        return this;
    }
    public  Vector2D addThis(Vector2D other){
        return new Vector2D(other.x,other.y);
    }

    public Vector2D substract(float x, float y) {

        return new Vector2D(this.x - x, this.y - y);
    }

    public Vector2D substract(Vector2D other){
        return new Vector2D(other.x,other.y);
    }

    public Vector2D substractThis(float x, float y) {
        this.x -= x;
        this.y -= y;
        return this;
    }
    public Vector2D substractThis(Vector2D other){
        return new Vector2D(other.x,other.y);
    }

    public Vector2D scale(float rate) {

        return new Vector2D(this.x * rate, this.y * rate);
    }

    public Vector2D scaleThis(float rate) {
        this.x *= rate;
        this.y *= rate;
        return this;
    }
    public float getlength(){
        return (float)Math.sqrt(this.x * this.y + this.y*this.y);

    }
    public Vector2D floatsetlength(float length) {
        if (this.getlength()==0){
            return this;
        }
        float rate = length / this.getlength();
        this.x =this.x*rate;
        this.y=this.y*rate;
        return this;
    }
    public float getAngle(){
        return (float)Math.atan(this.y/this.x);
    }
    public Vector2D  setAngle(float angle){
        float length = this.getlength();
        this.x = length +(float)Math.cos(angle);
        this.y = length +(float)Math.sin(angle);
        return this;
    }
    @Override
    public String toString() {
        return "game.Vector2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public void printThis() {
        System.out.println(this);
    }

    public static void main(String[] args) {
        Vector2D v1 = new Vector2D(1, 1);
        //v1 + (2, 2) = ?
        //v1 ko bi thay doi ~ v1 == (1, 1)
    }
}
