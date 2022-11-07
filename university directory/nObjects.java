//Class of total number of objects

public class nObjects {
    // static variable singleton_instance 
    private static nObjects n = null; 
      
    // static method to create instance of nObjects class 
    public static nObjects getInstance() 
    { 
        if (n == null) 
            n = new nObjects(); 
  
        return n; 
    } 
} 
