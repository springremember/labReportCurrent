public class PointDemo {
    public static double distance(Point p1,Point p2){
        double dis = 0;
        dis = dis + ( p1.x - p2.x ) * ( p1.x - p2.x );
        dis = dis + ( p1.y - p2.y ) * ( p1.y - p2.y );
        dis = dis + ( p1.z - p2.z ) * ( p1.z - p2.z );
        dis = Math.sqrt(dis);
        return dis;
    }

    public static void main(String[] args) {
        System.out.println("两点之间距离："+distance(new Point(3.5,1.7,9.4),new Point(6.7,23.1,18)));
    }
}
