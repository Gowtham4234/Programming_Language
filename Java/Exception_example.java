package Java;

import java.io.IOException;
class Testthrows1{
    void m()throws IOException{
        
        throw new IOException("device error");
    }
        

    
    void p(){
        try{
            m();
        }catch(Exception e){System.out.println("exception handled");}
    }
    public static void main(String args[]){
        Testthrows1 obj=new Testthrows1();
        obj.p();
        System.out.println("normal flow...");
    }
}
