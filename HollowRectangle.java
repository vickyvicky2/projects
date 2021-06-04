  public class Rectangle {
 public static void main (String[] args) {
     printRectangle();
 }
 public static void printRectangle () {
     //prints rows 
     for(int rows=0; rows<4; rows++) {
         //prints columns
         for (int columns = 0; columns<5; columns++) {
             //conditions to define where asterisks go
             if (columns ==0 || columns == 4 || rows == 3 || rows == 0 ) {
                 System.out.print("*");
                 //tells program what to do when conditions above are not met
             } else {
                 System.out.print(" ");
             }
             }
             System.out.print("\n");
         }
     }
 }
