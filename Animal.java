package pict;

interface Lion 
{
 void eat();
}

interface Child 
{
 void play();
}

class Animal implements Lion, Child 
 {
 public void eat() {
     System.out.println("The Lion is eating.");
 }

 public void play() 
   {
     System.out.println("The Child Lion is playing.");
   }
 }
public class Multiple 
{
 public static void main(String[] args) 
 {
     Animal leo= new Animal();
     leo.eat(); 
     leo.play(); 
 }
}

