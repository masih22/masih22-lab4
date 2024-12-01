public class Rotor {

    
    private String rotorValues;
    private char startChar;
        
    public Rotor(String v, char c){
        this.rotorValues = new String(v);
        this.startChar = c;
        
        while(!this.rotate());
            
    }
    
    public boolean rotate(){
        //takes last character, and then concatenates the rest of the string from the start to second to last element. 
        this.rotorValues = this.rotorValues.charAt(this.rotorValues.length() - 1) + this.rotorValues.substring(0, this.rotorValues.length() - 1); 
        //checks if starting character has rotated to the front, returns true if so and false if other wise
        return this.rotorValues.charAt(0) == this.startChar;
        
              
    }
    

    public int indexOf(char c){
        return this.rotorValues.indexOf(c);
    }

    public char charAt(int idx){
        return this.rotorValues.charAt(idx);
    }
}
    
