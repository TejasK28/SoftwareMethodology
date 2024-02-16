package PSET2;

/*
 * Problem 1:
 *      C class implements comparable class of type D
 * 
 * this succesfully compiles!
 */
class D {}

class C implements Comparable<D>
{

    @Override
    public int compareTo(D o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }

}

/*
 * Problem 2:
 * 
 * This won't compile because the a class can't implement the same
 * interface twice with different arguments
 * 
 * had to comment out the C2 clas
 */

class D2 {}

// class C2 implements Comparable<C2>, Comparable<D2>
// {

// } 


/*
 * Problem 3:
 * 
 * Wouldn't compile for the same reason as Problem 2
 */

 class A implements Comparable<A>
 {
    public int compareTo(A a) {return 0;}
 }

//  class B extends A implements Comparable<B>
//  {

//  }


/*
 * Problem 4:
 * 
 * This obviously failed because we never implemented the 
 * method
 */

interface I {void stuff();}
interface J {void stuff();}

// class F implements I,J {

// }


/*
 * Problem 5:
 * 
 * This works because the compiler cares
 * only if the requirement is satisfied
 */

 interface I2 {void stuff();}
interface J2 {void stuff();}

class F2 implements I2,J2 {

    public void stuff() {
        System.out.println("Sccessfully implemented");
    }}

/*
 * Problem 6:
 */


 /*
  * Problem 7:
  */


  /*
   * Problem 8:
   */
  

   /*
    * Problem 9:
    */

    class X implements Comparable<X> {
        public int compareTo(X o) { 
            return 0;
        }
    }
        class Z implements Comparable<Z> {

            @Override
            public int compareTo(Z o) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
            } }
        class Searcher {
            
            public static <T extends Comparable<T>> 
            boolean binarySearch(T[] list, T item) {
                return false;
            }
        
            public static void main(String[] args) {
                Z[] zs = new Z[2];
                zs[0] = new Z();
                zs[1] = new Z();
                binarySearch(zs,new Z());
            }
        }

    /*
     * Problem 10:
     */

     


public class Interface 
{
    public static void main(String[] args) {
        System.out.println("SUCCESS!");
    }
}
