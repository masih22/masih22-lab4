public class Enigma{

    private String rotorInit[] = {"#GNUAHOVBIPWCJQXDKRYELSZFMT",
        "#EJOTYCHMRWAFKPUZDINSXBGLQV",
        "#BDFHJLNPRTVXZACEGIKMOQSUWY",
        "#NWDKHGXZVRIFJBLMAOPSCYUTQE",
        "#TGOWHLIFMCSZYRVXQABUPEJKND"};


    private Rotor rotors[];
        
    public Enigma(int id1, int id2, int id3, String start){

        rotors = new Rotor[3];
        rotors[0] = new Rotor(rotorInit[id1-1], start.charAt(0)); //inner
        rotors[1] = new Rotor(rotorInit[id2-1], start.charAt(1)); //middle
        rotors[2] = new Rotor(rotorInit[id3-1], start.charAt(2)); //outer
        
    }


    public String decrypt(String message){
        //creates an empty string that represents text to decrypt
        String newMessage = "";
        //both boolean will be used for checking to see if middle or outer rotors need to be rotated
        boolean inner;
        boolean middleBol = false;
        //for loop going through message we want to decrypt
        for(int i = 0; i < message.length(); i++) {
            //gets char at i of message
            char c = message.charAt(i);
            //finds index char c in the outer rotor
            int index1 = rotors[2].indexOf(c);
            //find char in middle rotor at corresponding index1
            char middle = rotors[1].charAt(index1);
            //find char middle index on outer rotor
            int outerIdx = rotors[2].indexOf(middle);
            //find char at alligned outerIdx inside the inner rotor
            char output = rotors[0].charAt(outerIdx);
            //add to message
            newMessage += output;
            //rotate
            inner = rotors[0].rotate();
            //if inner rotor has completed a full rotation, rotate the middle rotor once
            if(inner)
                middleBol = rotors[1].rotate();
            //if middle rotor has completed a full rotation, rotate the outer rotor once
            if(middleBol)
                rotors[2].rotate();
        }
        //return decrypted message
        return newMessage;
    }


    
    public String encrypt(String message){
        //creates an empty string that represents text to encrypt
        String newMessage = "";
        //both boolean will be used for checking to see if middle or outer rotors need to be rotated
        boolean inner;
        boolean middleBol = false;
        //for loop going through message we want to decrypt
        for(int i = 0; i < message.length(); i++){
            //gets char at i of message
            char c = message.charAt(i);
            //finds index of char c at inner rotor
            int index1 = rotors[0].indexOf(c);
            //find alligned character at index1 in outer rotor
            char outer = rotors[2].charAt(index1);
            //find index of char outer in middle rotor
            int middleIdx = rotors[1].indexOf(outer);
            //find char at middleIdx in outer rotor
            char output = rotors[2].charAt(middleIdx);
            //add to message
            newMessage += output;
            //rotate
            inner = rotors[0].rotate();
            //if inner rotor has completed a full rotation, rotate the middle rotor once
            if(inner)
                middleBol = rotors[1].rotate();
            //if middle rotor has completed a full rotation, rotate the outer rotor once
            if(middleBol)
                rotors[2].rotate();
        }
        //return encrypted text
        return newMessage;
    }

    
    private void rotate(){
        if(rotors[0].rotate()){
            if(rotors[1].rotate()){
                rotors[2].rotate();
            }
        }
    }
    
}
