import java.io.*;

class Constructor{
  public static void main (String args[]){
    Demo demo = new Demo();
    SubDomain1 sd = new SubDomain1(10,"ANUJ",true,7373);
    sd.result();
    demo.result();
  }
}

// With-out parameters
class Demo{
  int x;
  String y;
  boolean z;
  Demo(){
    x = 100;
    y = "Crazy_Newbie";
    z = false;
  }
  
  void result(){
    System.out.println(x+" "+y+" "+z);
  }
}

// With Parameters

class Domain1{
  int x;
  String y;
  boolean z;
  Domain1(int x, String y, boolean z){
    this.x = x;
    this.y = y;
    this.z = z;
  }
  
  void result(){
    System.out.println(x+" "+y+" "+z);
  }
}


class SubDomain1 extends Domain1{
  int numbers;
  SubDomain1(int x, String y, boolean z, int numbers){
    super(x,y,z);
    this.numbers = numbers;
  }
}
