package LAB5;


public class Double {
    public float x;
    
    public Double(){
     }
     
    public Double(float x){
        this.x = x;
    }
    
    @Override
    public String toString(){
        return "    " + x;
    }
}
