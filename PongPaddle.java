public class PongPaddle {
    int x;
    int width;
    int y;
    int height;
    PongPaddle(int top, int left, int w, int h){
        width = w;
        height = h;
        y = top;
        x = left;
    }
    public int getBottomY(){
        return y+height-1;
    }
    public int getTopY(){
        return y;
    }
    public int getLeftX(){
        return x;
    }
    public int getRightX(){
        return x+width-1;
    }
    public void moveDown(int d){
        y = y+d;
    }
    public void moveUp(int d){
        y = y-d;
    }
}
