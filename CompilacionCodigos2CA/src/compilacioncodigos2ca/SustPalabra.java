package compilacioncodigos2ca;

public class SustPalabra {
    public String SustPalabra(String Palabra){
        String V="", C="", R="";
        char l; 
        int tamaño = Palabra.length();
        
        for(int T=0;T<tamaño;T++){
            l=Palabra.charAt(T);
            
            if(l =='a'){
                l='@';
            }
            else if(l =='e'){
                l='3';
            }
            else if(l =='i'){
                l='1';
            }
            else if(l =='o'){
                l='0';
            }
            else if(l =='u'){
                l='&';
            }
            R=R+String.valueOf(l);
        }
        
        return R;    
    }
}
