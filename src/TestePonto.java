import static java.lang.System.out;

public class TestePonto {
    public static void main(String[] args) {

        Ponto pt1, pt2, pt3;
        pt1 = new Ponto();
        pt2 = new Ponto(2, -1);
        pt3 = new Ponto(pt2);

        int cx1, cx2, cx3;
        int cy1, cy2, cy3;
        cx1 = pt1.getX();
        cx2 = pt2.getX();

        out.println("cx1 = " + cx1);
        out.println("cx2 = " + cx2);

        pt1.incCoord(4, 4);
        pt2.incCoord(12, -3);

        cx1 = pt1.getX();
        cx2 = pt2.getX();
        cx3 = cx1 + cx2;

        out.println("cx1 + cx2 = " + cx3);

        pt3.decCoord(10, 20);
        pt2.decCoord(5, -10);

        cy1 = pt2.getY();
        cy2 = pt3.getY();
        cy3 = cy1 + cy2;

        out.println("cy1 + cy2 = " + cy3);

    }
}