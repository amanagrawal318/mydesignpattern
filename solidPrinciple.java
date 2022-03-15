
//open closed principle
// interface operation {
//     double perform();
// }
// class Addition implements operation{
//  private double x;
//  private double y;
//  public Addition(double x,double y){
//    this.x=x;this.y=y;
//  }
//  public double perform(){
//      return x+y;
//  }
// }
// class Multiplication implements operation{
//     private double x;
//     private double y;
//     public Multiplication(double x,double y){
//       this.x=x;this.y=y;
//     }
//     public double perform(){
//         return x*y;
//     }
// }
// class calculate{
//     public void getcalculate(operation op){
//         if(op==null){
//             System.out.println("Cannot perform");
//             return;
//         }
//         double rv=op.perform();
//         System.out.println(rv);
//     }
//  }
//  public class OCP {
//      public static void main(String[] args) {
//          calculate obj=new calculate();
//          obj.getcalculate(new Multiplication(2, 3));
//      }
//  }

//liskov principle
// class Ellipse {
//     private double MajorAxis;
//     private double MinorAxis;
//     public void SetMajorAxis(double majorAxis) {
//         MajorAxis = majorAxis;
//     }
//     public void SetMinorAxis(double minorAxis) {
//         MinorAxis = minorAxis;
//     }
//     public double Area() {
//         return MajorAxis * MinorAxis * Math.PI;
//     }
// }
// class Circle extends Ellipse {
//     @Override
//     public void SetMajorAxis(double majorAxis) {
//         super.SetMajorAxis(majorAxis);

//     }
//     public void SetMinorAxis(double minorAxis) {
//         super.SetMinorAxis(minorAxis);
//     }
//     public double Area() {
//         return super.Area();
//     }
// }
// class CircleArea {
//     Circle circle;
//     public CircleArea(double radius) {
//         circle = new Circle();
//         circle.SetMajorAxis(radius);
//         circle.SetMinorAxis(radius);
//     }
//     public double Area() {
//         return circle.Area();
//     }
// }
// public class LIV {
//     public static void main(String[] args) {
//         CircleArea obj = new CircleArea(10);
//         System.out.println(obj.Area());
//     }
// }

//dependency Inversion using service locator
// interface Iservice{
//     void serve();
// }
// class service implements Iservice{
//     @Override
//     public void serve() {
//         System.out.println("Service class");
//     }
// }
// class serviceLocator{
//    private static Iservice _Iservice;
//    public static Iservice getInstance(){
//        if(_Iservice==null){
//            _Iservice=new service();
//        }
//        return _Iservice;
//    }
// }
// class client {
//     private Iservice iservice;
//     public client(){
//        this.iservice=serviceLocator.getInstance();
//     }
//     public void start(){
//         System.out.println("Service started");
//         this.iservice.serve();
//     }
// }
// /**
//  * solidPrinciple
//  */
// public class solidPrinciple {
//     public static void main(String[] args) {
//         client c=new client();
//         c.start();
//     }
// }
