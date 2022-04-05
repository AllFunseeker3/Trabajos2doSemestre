package compilacioncodigos2ca;
        
public class InvPalabra {
    public  String invPalabra(String P){
        
        char l;
        P.toUpperCase();
        int tamaño = P.length();
        String R="";
        
        for(int q=0;q<tamaño;q++){
           
            l=P.charAt(q);
            
           l =P.charAt(tamaño -1-q);            
            R= R + l;
        }
    return (R);    
    }
}
