class VariableTypes
{
   int a ; 
   static int b ;

  publc static void main(String args[])
{
  int c =30; // local variable - declared with in a main method and we have to inshalized
  VariableTypes var = new VariableTypes();
 System.out.println(b); // output =0 default value for static variable is zero
 System.out.println(c); // for local variable we have to inshalized the value output =30
 System.out.println(var .a): // error :Emp1.java:85: error: non-static variable a cannot be referenced from a static cotext
// for a variable we have to create a object
  }
}
