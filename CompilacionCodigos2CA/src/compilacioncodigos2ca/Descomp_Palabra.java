package compilacioncodigos2ca;

public class Descomp_Palabra {
    public String Descomp_Palabra (String Palabra){
    char l;
    Palabra.toUpperCase();
    String V="", C="", R="";
    int tamaño=Palabra.length();
    
    for (int i=0;i<tamaño;i++){
        l=Palabra.charAt(i);
        if ((l=='a') || (l=='e') || (l=='i') || (l=='o') || (l=='u')) {
                V=V+"\n"+String.valueOf(l);
        }
        else{
            C=C+"\n"+String.valueOf(l);
        }
    }
    R="Vocales "+V+"\nConsosnantes "+C;
    return R;
    }
}
