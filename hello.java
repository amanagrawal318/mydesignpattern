import java.util.ArrayList;
import java.util.List;
import java.util.*;
//factory design pattern

// abstract class plan{
//     protected double rate;
//     abstract void getRate();
//     public double getCalculate(int unit){
//         return rate*unit;
//     }
// }
// class HouseHoldplan extends plan{
//     @Override
//     void getRate() {
//         rate=5.0;
//     }
// }
// class CommercialPlan extends plan{
//     @Override
//     void getRate() {
//         rate=8.0;
//     }
// }
// class GetPlanFactory{
//      public plan getPlan(String str){
//          if(str==null){
//              return null;
//          }
//          else if(str.equals("household")){
//              return new HouseHoldplan();
//          }else if(str.equals("commercial")){
//              return new CommercialPlan();
//          }
//          return null;
//      }
// }
// /**
//  * hello
//  */
// public class hello {

//     public static void main(String[] args) {
//         GetPlanFactory gFactory=new GetPlanFactory();
//         plan plan= gFactory.getPlan("commercial");
//         plan.getRate();
//         System.out.println(plan.getCalculate(100));
//     }
// }

//abstract factory
// interface IMovieFactory{
//     IBollywoodMovie GetBollywoodMovie();
//     ITollywoodMovie GetTollywoodMovie();
// }
// interface IBollywoodMovie{
//     String MovieName();
// }
// class BollywoodActionMovie implements IBollywoodMovie{
//     @Override
//     public String MovieName() {
//         return "Singham";
//     }
// }
// class BollywoodComedyMovie implements IBollywoodMovie{
//     @Override
//     public String MovieName() {
//         return "Dhamaal";
//     }
// }
// class ActionMovieFactory implements IMovieFactory{
//    IBollywoodMovie bActionMovie;
//    ITollywoodMovie tActionMovie;
//    @Override
//    public IBollywoodMovie GetBollywoodMovie() {
//        bActionMovie=new BollywoodActionMovie();
//        return bActionMovie;
//    }
//    @Override
//    public ITollywoodMovie GetTollywoodMovie() {
//        tActionMovie=new TollywoodActionMovie();
//        return tActionMovie;
//    }
// }
// class ComedyMovieFactory implements IMovieFactory{
//     IBollywoodMovie bComedyMovie ;
//     ITollywoodMovie tComedyMovie;
//     @Override
//     public IBollywoodMovie GetBollywoodMovie() {
//         bComedyMovie=new BollywoodComedyMovie();
//         return bComedyMovie;
//     }
//     @Override
//     public ITollywoodMovie GetTollywoodMovie() {
//         tComedyMovie=new TollywoodComedyMovie();
//         return tComedyMovie;
//     }
//  }
// interface ITollywoodMovie{
//     String MovieName();
// }
// class TollywoodActionMovie implements ITollywoodMovie{
//     @Override
//     public String MovieName() {
//         return "KGF";
//     }
// }
// class TollywoodComedyMovie implements ITollywoodMovie{
//     @Override
//     public String MovieName() {
//         return "Lucky the Racer";
//     }
// }

// /**
//  * hello
//  */
// public class hello {

//     public static void main(String[] args) {
//         IMovieFactory iMovieFactory=new ActionMovieFactory();
//         IBollywoodMovie iBollywoodMovie=iMovieFactory.GetBollywoodMovie();
//         System.out.println(iBollywoodMovie.MovieName());

//         ITollywoodMovie iTollywoodMovie=iMovieFactory.GetTollywoodMovie();
//         System.out.println(iTollywoodMovie.MovieName());

//         IMovieFactory iMovieFactory2=new ComedyMovieFactory();
//         IBollywoodMovie iBollywoodMovie2=iMovieFactory2.GetBollywoodMovie();
//         System.out.println(iBollywoodMovie2.MovieName());

//         ITollywoodMovie iTollywoodMovie2=iMovieFactory2.GetTollywoodMovie();
//         System.out.println(iTollywoodMovie2.MovieName());
//     }
// }

//Builder pattern
// class vehicle{
//     private String engine;
//     private int wheel;
//     private int airbag;

//     public String getEngine() {
//         return engine;
//     }
//     public int getWheel() {
//         return wheel;
//     }
//     public int getAirbag() {
//         return airbag;
//     }
//     public vehicle(VehicleBuilder VehicleBuilder){
//       this.engine=VehicleBuilder.engine;
//       this.wheel=VehicleBuilder.wheel;
//       this.airbag=VehicleBuilder.airbag;
//     }
//     public static class VehicleBuilder{
//         private String engine;
//         private int wheel;
//         private int airbag;
//         VehicleBuilder(String eng,int wheel){
//             this.engine=eng;
//             this.wheel=wheel;
//         }
//         public VehicleBuilder setAirbag(int ab){
//             this.airbag=ab;
//             return this;
//         }
//         public vehicle build(){
//             return new vehicle(this);
//         }
//     }
// }

// /**
//  * hello
//  */
// public class hello {

//     public static void main(String[] args) {
//         System.out.println("Car details");
//         vehicle car=new vehicle.VehicleBuilder("1100cc", 4).setAirbag(2).build();
//         System.out.println(car.getEngine());
//         System.out.println(car.getWheel());
//         System.out.println(car.getAirbag());

//         System.out.println("Bike details");
//         vehicle bike=new vehicle.VehicleBuilder("110cc", 2).build();
//         System.out.println(bike.getEngine());
//         System.out.println(bike.getWheel());
//         System.out.println(bike.getAirbag());

//     }
// }

//prototype
// import java.util.*;
// class employees implements Cloneable{
//     private List<String> emplist;
//     public employees(){
//          emplist=new ArrayList<>();
//     }
//     public employees(List<String> list){
//         emplist=list;
//     }
//     public List<String> getEmployees(){
//         return emplist;
//     }
//     public void addData(){
//         emplist.add("Aman");
//         emplist.add("Rahul");
//         emplist.add("Sahil");
//     }
//     @Override
//     protected Object clone() throws CloneNotSupportedException {
//         List<String> list=new ArrayList<>();
//         for(String e:this.getEmployees()){
//            list.add(e);
//         }
//         return new employees(list);
//     }
// }
// /**
//  * hello
//  */
// public class hello {

//     public static void main(String[] args) throws CloneNotSupportedException {
//         employees e=new employees();
//         e.addData();
//         List<String> list1=e.getEmployees();
//         employees e1=(employees)e.clone();
//         employees e2=(employees)e.clone();
//         List<String> l2=e1.getEmployees();
//         l2.add("sachin");
//         List<String> l3=e2.getEmployees();
//         l3.add("piyush");
//         System.out.println(list1);
//         System.out.println(l2);
//         System.out.println(l3);


//     }
// }

//Adaptor design Pattern
// interface webDriver{
//     public void getElement();
//     public void selectElement();
// }
// class ChromeDriver implements webDriver{
//     @Override
//     public void getElement() {
//         System.out.println("Chromedriver get element");
//     }
//     @Override
//     public void selectElement() {
//         System.out.println("ChromeDriver select element");
//     }
// }
// class IEdriver{
//     public void findelement(){
//         System.out.println("Find Element");
//     }
//     public void searchElement(){
//         System.out.println("Search Element");
//     }
// }

// class webDriverAdaptor implements webDriver{
//     IEdriver iEdriver;
//     public webDriverAdaptor(IEdriver iEdriver){
//        this.iEdriver=iEdriver;
//     }
//     @Override
//     public void getElement() {
//         iEdriver.findelement();
//     }
//     @Override
//     public void selectElement() {
//         iEdriver.searchElement();
//     }
// }
// /**
//  * hello
//  */
// public class hello {

//     public static void main(String[] args) {
//         ChromeDriver cDriver=new ChromeDriver();
//         cDriver.getElement();
//         cDriver.selectElement();
//         IEdriver iEdriver=new IEdriver();
//         iEdriver.findelement();
//         iEdriver.searchElement();
//         webDriver wDriver=new webDriverAdaptor(iEdriver);
//         wDriver.getElement();
//         wDriver.selectElement();
//     }
// }

//bridge pattern
// interface Remote {
//     public void on();
//     public void off();
//   }
//  abstract class TV {
//     Remote remote; 
//     TV(Remote r) {
//       this.remote = r;
//     }
//     abstract void on();
//     abstract void off();
//   }
  
//   class Sony extends TV {
//     Remote remoteType;
//     Sony(Remote r) {
//       super(r);
//       this.remoteType = r;
//     }
    
//     public void on(){
//       System.out.print("Sony TV ON: ");
//       remoteType.on();
//     }
      
//     public void off(){
//       System.out.print("Sony TV OFF: ");
//       remoteType.off();
//     }
//   }
      
//   class Philips extends TV {
//     Remote remoteType;
    
//     Philips(Remote r) {
//       super(r);
//       this.remoteType = r;
//     }
    
//     public void on(){
//       System.out.print("Philips TV ON: ");
//       remoteType.on();
//     }
      
//     public void off(){
//       System.out.print("Philips TV OFF: ");
//       remoteType.off();
//     }
//   }
  
  
  
//   class OldRemote implements Remote {
  
//     @Override
//     public void on() {
//       System.out.println("ON with Old Remote");
//     }
  
//     @Override
//     public void off() {
//       System.out.println("OFF with old Remote");
//     }
    
//   }
  
//   class NewRemote implements Remote {
  
//     @Override
//     public void on() {
//       System.out.println("ON with New Remote");
//     }
  
//     @Override
//     public void off() {
//       System.out.println("OFF with New Remote");
//     }
    
//   }
  
//   public class bridge {
//     public static void main(String[] args) {
//       TV sonyOldRemote = new Sony(new OldRemote());
//       sonyOldRemote.on();
//       sonyOldRemote.off();
//       System.out.println();
      
//       TV sonyNewRemote = new Sony(new NewRemote());
//       sonyNewRemote.on();
//       sonyNewRemote.off();
//       System.out.println();
      
//       TV philipsOldRemote = new Philips(new OldRemote());
//       philipsOldRemote.on();
//       philipsOldRemote.off();
//       System.out.println();
      
//       TV philipsNewRemote = new Philips(new NewRemote());
//       philipsNewRemote.on();
//       philipsNewRemote.off();   
//     }
//   }

//composite pattern
// interface Employee{
//     int getId();
//     String getName();
//     double getSalary();
//     void print();
//     void add(Employee e);
//     void remove(Employee e);
//     Employee getchild(int i);
// }
// class manager implements Employee{
//     private int Id;
//     private String name;
//     private double salary;
//     manager(int Id,String name, double sal){
//         this.Id=Id;
//         this.name=name;
//         this.salary=sal;
//     }
//     List<Employee> list=new ArrayList<>();
//     @Override
//     public int getId() {
//         return this.Id;
//     }
//     @Override
//     public String getName() {
//         return this.name;
//     }
//     @Override
//     public double getSalary() {
//         return this.salary;
//     }
//     @Override
//     public void add(Employee e) {
//         list.add(e);
//     }
//     @Override
//     public void remove(Employee e) {
//         list.remove(e);
//     }
//     @Override
//     public Employee getchild(int i) {
//         return list.get(i);
//     }
//     @Override
//     public void print() {
//         System.out.println("********************************");
//         System.out.println("Employee ID "+ this.Id);
//         System.out.println("Employee Name "+this.name);
//         System.out.println("Employee Salry "+this.salary);
//         System.out.println("********************************");
//         for (Employee employee : list) {
//             employee.print();
//         }
//     }
// }
// class Cashier implements Employee{
//     private int Id;
//     private String name;
//     private double salary;
//     Cashier(int Id,String name, double sal){
//         this.Id=Id;
//         this.name=name;
//         this.salary=sal;
//     }
//     @Override
//     public int getId() {
//         return this.Id;
//     }
//     @Override
//     public String getName() {
//         return this.name;
//     }
//     @Override
//     public double getSalary() {
//         return this.salary;
//     }
//     @Override
//     public void add(Employee e) {
//        //leaf 
//     }
//     @Override
//     public void remove(Employee e) {
//         //leaf
//     }
//     @Override
//     public Employee getchild(int i) {
//         return null;
//     }
//     @Override
//     public void print() {
//         System.out.println("********************************");
//         System.out.println("Employee ID "+ this.Id);
//         System.out.println("Employee Name "+this.name);
//         System.out.println("Employee Salry "+this.salary);
//         System.out.println("********************************");
//     }
// }
// class Accountant implements Employee{
//     private int Id;
//     private String name;
//     private double salary;
//     Accountant(int Id,String name, double sal){
//         this.Id=Id;
//         this.name=name;
//         this.salary=sal;
//     }
   
//     @Override
//     public int getId() {
//         return this.Id;
//     }
//     @Override
//     public String getName() {
//         return this.name;
//     }
//     @Override
//     public double getSalary() {
//         return this.salary;
//     }
//     @Override
//     public void add(Employee e) {
//         //leaf
//     }
//     @Override
//     public void remove(Employee e) {
//         //leaf
//     }
//     @Override
//     public Employee getchild(int i) {
//         return null;
//     }
//     @Override
//     public void print() {
//         System.out.println("********************************");
//         System.out.println("Employee ID "+ this.Id);
//         System.out.println("Employee Name "+this.name);
//         System.out.println("Employee Salry "+this.salary);
//         System.out.println("********************************");
//     }
// }
// /**
//  * hello
//  */
// public class hello {

//     public static void main(String[] args) {
//         Employee manager=new manager(101, "Aman", 50000);
//         Employee emp1=new Cashier(102, "Rahul", 30000);
//         Employee emp2= new Accountant(103, "sahil", 40000);

//         manager.add(emp1);
//         manager.add(emp2);
//         manager.print();
//     }
// }

//decorator pattern
// interface food{
//     String prepareFood();
//     int getFoodPrice();
// }
// class vegFood implements food{
//     @Override
//     public String prepareFood() {
//         return "Veg food ";
//     }
//     @Override
//     public int getFoodPrice() {
//         return 100;
//     }
// }

// abstract class foodDecorator implements food{
//     food newfood;
//     foodDecorator(food nfood){
//         this.newfood=nfood;
//     }
//     @Override
//     public String prepareFood() {
//         return newfood.prepareFood();
//     }
//     @Override
//     public int getFoodPrice() {
//         return newfood.getFoodPrice();
//     }
// }
// class nonvegFood extends foodDecorator{
//     nonvegFood(food f){
//         super(f);
//     }
//     @Override
//     public String prepareFood() {
//         return super.prepareFood()+" with chicken and egg curry";
//     }
//     @Override
//     public int getFoodPrice() {
//         return super.getFoodPrice()+100;
//     }
// }
// class chineseFood extends foodDecorator{
//     chineseFood(food f){
//         super(f);
//     }
//     @Override
//     public String prepareFood() {
//         return super.prepareFood()+" With chinese noodles";
//     }
//     @Override
//     public int getFoodPrice() {
//         return super.getFoodPrice()+50;
//     }
// }
// /**
//  * hello
//  */
// public class hello {

//     public static void main(String[] args) {
//         vegFood f1=new vegFood();
//         System.out.println(f1.prepareFood());
//         System.out.println(f1.getFoodPrice());
//         food f2=new nonvegFood(f1);
//         System.out.println(f2.prepareFood());
//         System.out.println(f2.getFoodPrice());

//         food f3=new chineseFood(f1);
//         System.out.println(f3.prepareFood());
//         System.out.println(f3.getFoodPrice());
//     }

// }


//facade
// interface MobileShop{
//     public void modelNo();
//     int getPrice();
// }
// class Iphone implements MobileShop{
//     @Override
//     public void modelNo() {
//         System.out.println("Iphone 13 Pro");
//     }
//     @Override
//     public int getPrice() {
//         return 120000;
//     }
// }
// class Samsung implements MobileShop{
//     @Override
//     public void modelNo() {
//         System.out.println("Samsung galaxy a2");
//     }
//     @Override
//     public int getPrice() {
//         return 50000;
//     }
// }
// class vivo implements MobileShop{
//     @Override
//     public void modelNo() {
//         System.out.println("Vivo V23");
//     }
//     @Override
//     public int getPrice() {
//         return 20000;
//     }
// }
// class Shopkeeper{
//     private MobileShop iphone;
//     private MobileShop samsung;
//     private MobileShop vivo;
//     Shopkeeper(){
//         iphone=new Iphone();
//         samsung=new Samsung();
//         vivo=new vivo();
//     }
//     public void IphoneSale(){
//         iphone.modelNo();
//         System.out.println(iphone.getPrice());
//     }
//     public void SamsungSale(){
//         samsung.modelNo();
//         System.out.println(samsung.getPrice());
//     }
//     public void VivoSale(){
//         vivo.modelNo();
//         System.out.println(vivo.getPrice());
//     }

// }
// /**
//  * hello
//  */
// public class hello {

//     public static void main(String[] args) {
//         Shopkeeper shop=new Shopkeeper();
//         shop.IphoneSale();
//         shop.SamsungSale();
//         shop.VivoSale();
//     }
// }

//flyweight
interface player{
    void assignWeapon(String s);
    void mission();
}
class Terrorist implements player{
    private final String task;
    private String weapon;
    Terrorist(){
        task="Plant a bomb";
    }
    @Override
    public void assignWeapon(String s) {
        weapon=s;
    }
    @Override
    public void mission() {
        System.out.println("Terrorist with weapon "+weapon+" | task Is "+task);
    }
}

class counterTerrorist implements player{
    private final String task;
    private String weapon;
    counterTerrorist(){
        task="Diffuse bomb";
    }
    @Override
    public void assignWeapon(String s) {
        weapon=s;
    }
    @Override
    public void mission() {
        System.out.println("CounterTerrorist with weapon "+weapon+" | task Is "+task);
    }
}
class playerFactory{
    public static HashMap<String,player> hm=new HashMap<>();
    public static player getPlayer(String type){
        player p=null;
        if(hm.containsKey(type)){
            p=hm.get(type);
        }else{
            switch(type){
                case "terrorist" :
                 System.out.println("Terrorist created");
                 p=new Terrorist();
                 break;
                case "counterterrorist" :
                 System.out.println("counterTerrorist");
                 p=new counterTerrorist();
                 break;
                default :
                 System.out.println("Wront type");
            }
            hm.put(type, p);
        }
        return p;
    }
}
public class hello{
    private static String[] playerType =
                    {"terrorist", "counterterrorist"};
    private static String[] weapons =
      {"AK-47", "Maverick", "Gut Knife", "Desert Eagle"};
      public static void main(String[] args) {
          for(int i=0;i<10;i++){
              player p=playerFactory.getPlayer(getRandomType());
              
              p.assignWeapon(getRandWeapon());
              p.mission();
          }
      }
      public static String getRandomType(){
          Random r=new Random();

          int randInt=r.nextInt(playerType.length);
          return playerType[randInt];
      }
      public static String getRandWeapon(){
        Random r=new Random();

        int randInt=r.nextInt(weapons.length);
        return weapons[randInt];
    }
}
