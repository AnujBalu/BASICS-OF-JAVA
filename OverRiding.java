import java.io.*;

class OverRiding{
  public static void main(String args[]){
    ChildClass ride = new ChildClass();
    ride.IamPerson(1);
    ride.IamPerson(7,9);
  }
}

class ParentClass{
  void IamPerson(int x){
    if (x==1){
      System.out.println("I Am A Person");
    }
  }
}

class ChildClass extends ParentClass{
  void IamPerson(int x, int y){
    if(x==y){
      System.out.println("X and Y are equal so I am a person");
    }
    else{
       System.out.println("X and Y are not equal");
    }
  }
}
