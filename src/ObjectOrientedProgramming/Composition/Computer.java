package ObjectOrientedProgramming.Composition;


public class Computer {


   Keyboard keyboard;

   Mouse mouse;

   Monitor monitor;


   public Computer(Keyboard myKeyboard, Mouse myMouse, Monitor monitor){

       this.keyboard = myKeyboard;
       this.mouse = myMouse;

   }

}
