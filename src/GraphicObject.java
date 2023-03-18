public abstract class GraphicObject {
    int x,y;
    public GraphicObject(){
        System.out.println("Base class");
    }

    public void moveTo(int x, int y){
        System.out.println("move to x:"+x+" and y:"+y);
    }

    public abstract void draw();
    public abstract void resize();

}
