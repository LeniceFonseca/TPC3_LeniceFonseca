import static java.lang.Math.abs;

public class Ponto {
    int x;
    int y;

    public Ponto() {
        x = 0;
        y = 0;
    }

    public Ponto(int cx, int cy) {
        x = cx;
        y = cy;
    }

    public Ponto(Ponto p) {
        x = p.getX();
        y = p.getY();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void incCoord(int deltaX, int deltaY) {
        x += deltaX;
        y += deltaY;
    }

    public void decCoord(int deltaX, int deltaY) {
        x -= deltaX;
        y -= deltaY;
    }

    public boolean coordPos() {
        return x > 0 && y > 0;
    }

    public boolean simetrico() {
        return abs(x) == abs(y);
    }

}