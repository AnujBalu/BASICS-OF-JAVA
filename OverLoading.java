import java.io.*;

class OverLoading{
  public static void main(String args[]){
    OverLoading ol = new OverLoading();
    ol.area(3,2);
    ol.area(20);
    ol.area(30,40,50);
  }
  
  void area(int x){
    System.out.println("Cube of the given int : "+ x);
  }
  void area(int x, int y){
    int area = x*y;
    System.out.println("area of the rectangle: "+ area);
  }
  void area(int x, int y, int z){
    int volumes = x*x*x;
    System.out.println("Volume of Cube : "+volumes);
   }

}
