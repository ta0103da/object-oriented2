package sample.package2;

import sample.package1.ClassA;

public class ClassD extends ClassA{

    ClassA a = new ClassA();
    // a.name = "ほげほげ"; // 継承しているとアクセスできるが使えるだけ（参照はできる）

    void ClassDMethod(){
        name= "ふがふが";
        System.out.println(name);
        method();
    }


}
