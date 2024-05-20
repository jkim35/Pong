public class PongBall {
    private double XVelocity;
    private double X;
    private double YVelocity;
    private double Y;
    private double Momentum;
    public PongBall(double initXVelocity, double initX, double initYVelocity, double initY) {
        XVelocity = initXVelocity;
        X = initX;
        YVelocity = initYVelocity;
        Y = initY;
    }
    public void bounceX(){
        XVelocity = -XVelocity;
    }
    public void bounceY(){
        YVelocity = -YVelocity;
    }
    public int getX(){
        return (int) X;
    }
    public int getY(){
        return (int) Y;
    }
    public void move(){
        X = (XVelocity)+X;
        Y = (YVelocity)+Y;
    }
}