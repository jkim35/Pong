public class PongTesting {
    public static void main(String[]args){
        PongBall ball = new PongBall(10, 0, 10, 0);
        int x = ball.getX();
        int y = ball.getY();
        System.out.println(x+" "+y);
        ball.move();
        x = ball.getX();
        y = ball.getY();
        System.out.println(x+" "+y);
        ball.bounceX();
        ball.move();
        ball.move();
        ball.move();
        x = ball.getX();
        y = ball.getY();
        System.out.println(x+" "+y);
        ball.bounceY();
        ball.move();
        ball.move();
        ball.move();
        ball.move();

        x = ball.getX();
        y = ball.getY();
        System.out.println(x+" "+y);
        ball.move();
        ball.move();
    }
}
