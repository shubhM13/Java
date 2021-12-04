/*

*
* *
* * *
* * * *
* * * * *


* * * * *
* * * *
* * * 
* *
*

        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *

*/
package Java;

import java.util.*;

public class Program2 {
    //attributes

    //methods

    // Main Method
    public static void main(String args[]){

        //intantiation of the classs
        Program2 object = new Program2();
        object.firstPattern();
        System.out.println();
        object.secondPatten();
        System.out.println();
        object.thirdPattern();
    }

    //1) firstPattern()
    public void firstPattern(){
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        System.out.println("*****");
    }

    //2) secondPatten()
    public void secondPatten(){
        System.out.println("*****");
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");
    }

    //3) thirdPattern()
    public void thirdPattern(){
        System.out.println("    *");
        System.out.println("   ***");
        System.out.println("  ***** ");
        System.out.println(" *******");
        System.out.println("*********");
    }

}
