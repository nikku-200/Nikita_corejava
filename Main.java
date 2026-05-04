package q3;
class Bank{
    public double getRateOfInterest(){
        return 1.5;
    }
}
class Axis extends Bank{
    public double getRateOfInterest(){
        return 0.3;
    }
}
    class SBI extends Bank{
    public double getRateOfInterest(){
        return 0.4;
    }
}
    class ICICI extends Bank{
    public double getRateOfInterest(){
        return 0.5;
    }
}
public class Main{
    public static void main(String[] args){
        Bank bank;
        bank= new Bank();
        System.out.println(bank.getRateOfInterest());
        bank= new Axis();
        System.out.println(bank.getRateOfInterest());
        bank= new SBI();
        System.out.println(bank.getRateOfInterest());
        bank= new ICICI();
        System.out.println(bank.getRateOfInterest());
    }
}
//q.3-dynamic method dispatch 


package q12;
class Acc{
    public void CalSal(double salary){
        System.out.println("Acc" + salary);
    }
    public void CalSal(double salary,double bonus){
        System.out.println("Acc" + (salary+bonus));
    }
    public void CalSal(double salary, double bonus, double tax){
        System.out.println("Acc" + (salary+bonus-tax));
    }
}
class Emp{
    public void CalSal(double salary){
        System.out.println("Emp" + salary);
    }
    public void CalSal(double salary,double bonus){
        System.out.println("Emp" + (salary+bonus));
    }
    public void CalSal(double salary, double bonus, double tax){
        System.out.println("Emp" + (salary+bonus-tax));
    }
}

public class Main{
    public static void main(String[] args){

        Acc acc= new Acc();
        acc.CalSal(30000);
        acc.CalSal(30000,3000);
        acc.CalSal(30000,3000,300);
    
        Emp emp= new Emp();
        emp.CalSal(10000);
        emp.CalSal(10000,1000);
        emp.CalSal(10000,1000,100);
    }
}
//q.12-overidding


package q20;
class Emp{
    String name;
    int id;
    double sal;
    String address;

    public String toString(){
        return "Emp(name="+name+", id="+id+", sal="+sal+", address="+address+")";
    }

        public Emp(String name,int id,double sal, String address){
            this.name=name;
            this.id=id;
            this.sal=sal;
            this.address=address;
        }
        void displayInfo(){
            System.out.println("Name" + name);
            System.out.println("id" + id);
            System.out.println("sal" + sal);
            System.out.println("address" + address);
        }
    }
    public class Main{
        public static void main(String[] args){
            Emp emp= new Emp("nikita", 11, 120000, "kandivali");
            System.out.println(emp);
            emp.displayInfo();
        }
    }
//q.20-display & tostring


package q16;
class Manager{

    String a= "play";
    String b= "eat";

    public Manager(){
        System.out.println("Parent Constructor");
    }
    void displayInfo(){
        System.out.println("Parent class method");
    }
}
class Emp extends Manager{
    public Emp(){
        super();
        System.out.println("child");
        System.out.println(super.a);
        System.out.println(super.b);   
    }
void displayInfo(){
    super.displayInfo();
}
}
public class Main{
    public static void main(String[] args){
        Emp emp=new Emp();
        emp.displayInfo();
    }
}
//q.16-super


package q10;
class Emp{
private String name;
private double sal;
private int id;
 
public void setId(int Id){
    this.id=Id;
}
public int getId(){
    return id;
}
public void setName(String Name){
    this.name=Name;
}
public String getName(){
    return name;
}
public void setSal(double Sal){
    this.sal=Sal;
}  
public double getSal(){
    return sal;
}
}
public class Main{
    public static void main(String[] args){

        Emp emp= new Emp();

        emp.setId(1);
        emp.setName("nikita");
        emp.setSal(12000);
        System.out.println(emp.getId());
        System.out.println(emp.getName());
        System.out.println(emp.getSal());
    }
}
//q.10-pojo


package com.hospital.staff.doctor.salary;
public class Salary{
    protected double CalSal(double amt,double tax){
        return amt-tax;
    }
}
package temp;
public class Demo1 extends com.hospital.staff.doctor.salary.Salary{
    public static void main(String[] args){
        Demo1 d1= new Demo1();
        System.out.println(d1.CalSal(1000,122));
    }
}
package temp;
import com.hospital.staff.doctor.salary.Salary;
public class Demo2 extends Salary{
    Demo2 d2 = new Demo2();
     System.out.println(d2.CalSal(100,12));
}
//q.1-com....


package q4;
class Main{
    public String a="public";
    private String b="private";
    protected String c="protected";
    String d="default";

    public static void main(String[] args){
    Main main = new Main();
    System.out.println(main.a);
    System.out.println(main.b);
    System.out.println(main.c);
    System.out.println(main.d);
    }
}
class Main1{
    public static void main(String[] args){
        Main main = new Main();
        System.out.println(main.a);
        System.out.println(main.c);
        System.out.println(main.d);
    }
}
package q7temp;
import q7.Main;
public Demo extends Main{
public static void main(String[] args){
    Main main = new Main();
    System.out.println(main.a);
    System.out.println(main.c);
}
}
//q.14-3pd


package q15;
class Emp{
    String name;
    int id;
    String add;
    double sal;

    public Emp(String name,int id,String add,double sal){
        this.name=name;
        this.id=id;
        this.name=nanme;
        this.add=add;
        this.sal=sal;
    }
   public String toString(){
    return "Emp(name="+name+",id="+id+",add="+add+",sal="+sal+")";
   }

void displayInfo(){
    System.out.println("Name"+name);
    System.out.println("id"+id);
    SSystem.out.println("add"+add);
    System.out.println("sal"+sal);
}
}
public class Main{
    public static void main(String[] args){

        Emp emp= new Emp("nikita", 2, "kandiwali", 120000);
        
        emp.displayInfo();
        System.out.println(emp);
    }
}
//q.15-parameterised constructor


package q13;
class Address{
    String add1;
    String add2;

    public String toString(){
        return "Address(add1="+add1+",add2="+add2+")";
    }
    public Address(String add1,String add2){
        this.add1=add1;
        this.add2=add2;
    }
}
class Hobbies{
    String h1;
    String h2;

    public String toString(){
        return "Hobbies(h1="+h1+",h2="+h2+")";
    }
    public Hobbies(String h1,String h2){
        this.h1=h1;
        this.h2=h2;
    }
}
class Emp{
    String name;
    int id;
    Address address;
    Hobbies hobbies;

    public String toString(){
        return "Emp(name="+name+",id="+id+",address="+address+",hobbies=
        "+hobbies+")";
    }
    public Emp(String name,int id,Address address,Hobbies hobbies){
        this.name=name;
        this.id=id;
        this.address=address;
        this.hobbies=hobbies;
    }
void displayInfo(){
    System.out.println("Name"+name);
    System.out.println("Id"+id);
    System.out.println("Address"+address);
    System.out.println("Hobbies"+hobbies);
}
}
public class Main{
    public static void main(String[] args){
        Emp emp= new Emp("nikku", 1, "kandu", "travel");
        Address address = new Address("kandu", "bori");
        Hobbies hobbies= new Hobbies("eat", "play");

        System.out.println(emp);
        System.out.println(emp.address.add1);
        System.out.println(emp.hobbies.h1);
    }
}
//q.13-containment


package q11;
class Emp{
    public void CalSal(double salary){
          System.out.println("Salary" + salary);
    }
    public void CalSal(double salary,double bonus){
          System.out.println("Salary with bonus" + (salary+bonus));
    }
    public void CalSal(double salary){
          System.out.println("Salary with and tax" + (salary+bonus-tax));
    }
}
public class Main{
    public static voidmain(String[] args){
        Emp emp = new Emp();
        emp.CalSal(12000);
        emp.CalSal(120000,332);
        emp.CalSal(122333,4545,344);
    }
}
//q.11-overloading


package q11;
class Emp{
    int id;
    String name;
     
    public Emp(int id,String name){
        this.id=id;
        this.name=name;
    }
    public String toString(){
        return "Emp(id="+id+",name="+name+")";
    }
    protected void finalize() throws Throwable{
        System.out.println("object detected");
    }
}
public class Main{

    public static void main(String[] args){

        Emp emp=new Emp(1,"Pikita");

        System.out.println(emp);
        emp=null;
        System.out.println.gc();
    }
    }
//q.19-finalize method


package operation;
public Interface Srs{
void add();
void update();
void delete();
void show();
}

package operationimplementor;
import operation.Srs;
public absrtact class ProjectManager implament Srs{
}

package operationimplementor;
public class TL extends ProjectManager{
    public void add(){
    }
}
public class TL extends ProjectManager{
    public void update(){
    }
}
public class TL extends ProjectManager{
    public void delete(){
    }
}
public class TL extends ProjectManager{
    public void show(){
    }
}

package devs;
import operationimplementor.TL;
public class Dev1 extends TL{
    public void add(){
        System.out.println("Add.....");
    }
    public void update(){
        System.out.println("Update.....");
    }
    public void delete(){
        System.out.println("Delete.....");
    }
    public void show(){
        System.out.println("Show.....");
    }
}

package master;
import devs.Dev1;
import devs.Dev2;
import devs.Dev3;
import devs.Dev4;

public class Main{
public static void main(String[] args){
    Dev1.dev1= new Dev1();
    dev1.add();
    Dev1.dev2= new Dev2();
    dev1.update();
    Dev1.dev3= new Dev3();
    dev1.delete();
    Dev1.dev4= new Dev4();
    dev1.show();
}
}
//q.4-P by C


package q6;
class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class Test {
    public static void main(String[] args) {
        try {
            int age = 15;
            if (age < 18) {
                throw new MyException("Not eligible to vote");
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
//q.6-user defined


package q17;
class Test {
    void m1() {
        int a = 10 / 0; 
    }

    void m2() {
        m1();
    }

    void m3() {
        try {
            m2();
        } catch (Exception e) {
            System.out.println("Handled in m3");
        }
    }

    public static void main(String[] args) {
        new Test().m3();
    }
}
//q.17-exception propogation


package q18;
import java.util.*;

class Test {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C");

        for (String s : list) {
            System.out.println(s);
        }
    }
}//for each

Iterator<String> it = list.iterator();
while (it.hasNext()) {
    System.out.println(it.next());
}
//q.18-for each


package q9;
import java.util.*;

class Student implements Comparable<Student> {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int compareTo(Student s) {
        return this.id - s.id;
    }
}

class Test {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(2, "B"));
        list.add(new Student(1, "A"));

        Collections.sort(list);

        for (Student s : list) {
            System.out.println(s.id + " " + s.name);
        }
    }
}
//comparable 
import java.util.*;

class Test {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Banana", "Apple", "Mango");

        Collections.sort(list, new Comparator<String>() {
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });

        System.out.println(list);
    }
}//comarator
//q.9-comparable,comparator


package q8;
import java.util.*;

class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        //Add
        list.add("A");
        list.add("B");

        //Delete
        list.remove("A");

        //Update
        list.set(0, "C");

        //Search
        if (list.contains("C")) {
            System.out.println("Found");
        }

        System.out.println(list);
    }
}
//q.8-arrarlist....


package q22;
public static void main(String[] args){
    try{
        System.out.println("Threat is going to sleep")
        Thread.sleep(5000);
        System.out.println("Thread wook up after 5 sec");
    }
    catch(InterruptedException e){
        System.out.println("e");
    }
}
//q.22-Thread sleeping

package q21;
class Thread extends Thread{
    public class run(){
        System.out.println("Thread is running");
    }
}
public class Main{
    public static void main(String[] args){
        Thread thread = new Thread();
        thread();
        Thread thread = new Thread();
        thread.start();
        new thread(){
            public void run(){
            System.out.println("Thread is running");
            };
        }.start();

        new Thread(new Runnable(){
            public void run(){
            System.out.println("Thread is running");
            }
        }).start();
    }
}
//q21-thread or runnable

package q24;
class Massage{
   String message=" ";
}

public class Main{
    public static void main(String[] args){
        Message message = new Message();
        new Message(new Runnable){
            try{
                System.out.println("Waiting for the message");
                message.wait();
                System.out.println("Got the message");
            }
            catch(InterruptedException){
                e.printStackTrace();
            }
        }
    }
}.start();

new Thread(new Runnable){
    public class run(){
try{
    Thread.sleep(2000);
}
catch(InterruptedException){
    e.printStackTrace();
}
sychronised (message){
    System.out.println("Sending the message");
    messgae.notify();
}
    }
}.start();



