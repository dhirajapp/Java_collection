
### Using generics converts run time exceptions   
### into compile time exception. 

class Pair<T, S> {
    T x;
    S y;
}
class Test 
{ 
    public static void main(String[] args) 
    { 
        // Creating object of generic class
        Pair<Integer, String> p = new Pair<Integer, String>();
        
        // Compiles fine because
        // p being an object accepts integer
        p.x = 12;
        
        // Compiles fine because
        // p being an object accepts string
        p.y = "Dhiraj";
        
        // This shows compiler error
        // as p.x was an integer and cannot be
        // casted to a string
        String str = (String) p.x;
       System.out.print(str);
    } 
} 
