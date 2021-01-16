import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double vX1 = teclado.nextInt();
        double vX2 = teclado.nextInt();
        double vY1 = teclado.nextInt();
        double vY2 = teclado.nextInt();

        double angle = Math.atan2(vX2, vX1) - Math.atan2(vY2, vY1);

        System.out.println(Math.abs(Math.toDegrees(angle)));


        /*Scanner in = new Scanner(System.in);

        int vx = in.nextInt(); // x speed of your pod
        int vy = in.nextInt(); // y speed of your pod

        int ux = in.nextInt();
        int uy = in.nextInt();

        //System.out.println(Math.toDegrees(Math.acos((Math.toDegrees(Math.acos((ux * vx + vy * uy) /(Math.hypot(ux, uy) * Math.hypot(vx, vy))))))));

        System.out.println(Math.(Math.toDegrees(Math.acos((ux * vx + vy * uy) /(Math.hypot(ux, uy) * Math.hypot(vx, vy))))));
         */
    }
}