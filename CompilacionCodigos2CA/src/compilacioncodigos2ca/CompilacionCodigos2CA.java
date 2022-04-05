package compilacioncodigos2ca;
import java.util.*;

public class CompilacionCodigos2CA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int Op;
        int N,ConPar=0,ConImp=0,ConPrimo=0;     
       
       
        
        System.out.println("Seleccione un codigo"+
                            "\n1.-Numero Par, impar y primo"
                            +"\n2.-Áreas y perimetros"
                            +"\n3.-Cambiar estructura de una palabra"
                            +"\n4.-Operaciones basicas"
                            +"\n5.-Arreglo de 10 numeros");
        Op = sc.nextInt();
        switch(Op){
            case 1: 
                for(int c=0;c<5;c++){
                    System.out.println("Introduzca un numero");
                    N=sc.nextInt();
          
                    float S= N/2;
          
                    if (N % 2 ==0){
                        ConPar++;
                        if (N % S ==0){
                            ConPrimo++;
                        }
                    }
                    else if (N % 2 ==1){
                        ConImp++;
                        if(N % S ==0){
                            ConPrimo++; 
                        }
                    }
                }    
                System.out.println("Numeros pares totales: "+ConPar+
                                   "\nNumeros impares totales: "+ConImp+
                                   "\nNumeros primos totales: "+ConPrimo);
                break;

            case 2: 
                int Opcion;
                double base, altura,al, lado;
                
                double Res;
                
                CuadradoArea CA = new CuadradoArea();
                CuadradoP CP = new CuadradoP();
                
                TrianguloA TA = new TrianguloA ();
                TrianguloP TP = new TrianguloP ();
                
                RectanguloA RA = new RectanguloA();
                RectanguloP RP = new RectanguloP();
                
                System.out.println("Áreas y perimetros de las siguientes figuras:"
                                    +"\n1.-Cuadrado"
                                    +"\n2.-Triangulo"
                                    +"\n3.-Rectangulo");
                System.out.println("Selecione uno");
                Opcion= sc.nextInt();
                switch(Opcion){
                    case 1:
                        System.out.println("Ingrese un lado");
                        lado = sc.nextDouble();
                        System.out.println("¿Que quieres calcular?"
                                            +"\n1.-Area"
                                            +"\n2.-Perimetro");
                        Opcion=sc.nextInt();
                        
                        if(Opcion==1){
                            Res = CA.A_Cuadrado(lado);
                            System.out.println("El resultado es:"+Res);
                        }
                        else if(Opcion==2){
                            Res =CP.PCuadrado(lado);
                            System.out.println("El resultado es:"+Res);
                        }
                        else{
                            System.out.println("Opcion no valida");
                        }
                        
                        break;
                    case 2:
                        System.out.println("Ingrese el valor de la base");
                        base = sc.nextDouble();
                        System.out.println("Ingrese el valor de la primer altura");
                        altura= sc.nextDouble();
                        System.out.println("Ingrese el valor de la segunda altura");
                        al=sc.nextDouble();
                        
                        
                        System.out.println("¿Que quieres calcular?"
                                            +"\n1.-Area"
                                            +"\n2.-Perimetro");
                        Opcion=sc.nextInt();
                        
                        if(Opcion==1){
                            Res = TA.ATriangulo(altura, base);
                            System.out.println("El resultado es:"+Res);
                        }
                        else if(Opcion==2){
                            Res = TP.TrianguloP(base, altura, al);
                            System.out.println("El resultado es:"+Res);
                        }
                        else{
                            System.out.println("Opcion no valida");
                        }
                        break;
                    case 3:
                        System.out.println("Ingrese el valor de la base");
                        base = sc.nextDouble();
                        System.out.println("Ingrese el valor de la primer altura");
                        altura= sc.nextDouble();
                       
                        
                        System.out.println("¿Que quieres calcular?"
                                            +"\n1.-Area"
                                            +"\n2.-Perimetro");
                        Opcion=sc.nextInt();
                        
                        if(Opcion==1){
                            Res = RA.ARectangulo(base, altura);
                            System.out.println("El resultado es:"+Res);
                        }
                        else if(Opcion==2){
                            Res = RP.RectanguloP(base, altura);
                            System.out.println("El resultado es:"+Res);
                        }
                        else{
                            System.out.println("Opcion no valida");
                        }
                        break;
                        
                }
                
                break;
            case 3:
            String RPalab,Palab;
            int opcion;
            
            Descomp_Palabra DP = new Descomp_Palabra();
            InvPalabra IP = new InvPalabra();
            SustPalabra SP = new SustPalabra();
            
                System.out.println("---Opciones---");
                System.out.println("1.-Separar vocales y consonantes"
                                    +"\n2.-Invertir palabra"
                                    +"\n3.- Sustituir letra");
                System.out.println("Seleccione una opción");
                opcion=sc.nextInt();
                 
                switch(opcion){
                    case 1:
                        System.out.println("Ingrese una palabra :D");
                        
                        Palab = sc.next();
                        
                        RPalab = DP.Descomp_Palabra(Palab);
                        System.out.println(""+RPalab);
                        
                        break;
                    case 2:
                        System.out.println("Ingrese una palabra");
                        Palab =sc.next();
                        
                        RPalab = IP.invPalabra(Palab);
                        System.out.println(""+RPalab);
                        break;    
                    case 3:
                        System.out.println("Ingrese una palabra");
                        Palab =sc.next();
                        
                        RPalab = SP.SustPalabra(Palab);
                        System.out.println(""+RPalab);
                        break;
                }
                
                break;

            case 4:
                int op, x, c,re=0; 
                double resultado;
                double a,b;

                Suma S = new Suma();
                Resta R = new Resta();
                Multiplicacion M = new Multiplicacion();
                Division D = new Division ();
                Potencia P = new Potencia ();

                System.out.println("----------Operaciones basicas----------");
                System.out.println("1.-Suma"+
                                   "\n2.-Resta"+
                                   "\n3.-Multiplicacion"+
                                   "\n4.-Division"+
                                   "\n5.-Potencia");
                System.out.println("\nSeleccione una opcción");
                op=sc.nextInt();

                switch(op){
                    case 1:
                        System.out.println("Ingrese un numero");
                        a=sc.nextDouble();
                        System.out.println("Ingrese otro numero");
                        b=sc.nextDouble();

                        resultado= S.suma(a,b);
                        System.out.println("El resultado es: "+resultado);
                        break;

                    case 2:
                        System.out.println("Ingrese un numero");
                        a=sc.nextDouble();
                        System.out.println("Ingrese otro numero");
                        b=sc.nextDouble();

                        resultado= R.Resta(a, b);
                        System.out.println("El resultado es: "+resultado);
                        break;

                    case 3:
                        System.out.println("Ingrese un numero");
                        a=sc.nextDouble();
                        System.out.println("Ingrese otro numero");
                        b=sc.nextDouble();

                        resultado= M.Multiplicacion(a, b);
                        System.out.println("El resultado es: "+resultado);
                        break;

                    case 4:
                        System.out.println("Ingrese un numero");
                        a=sc.nextDouble();
                        System.out.println("Ingrese otro numero");
                        b=sc.nextDouble();

                        resultado= D.Division(a, b);
                        System.out.println("El resultado es: "+resultado);
                        break;

                    case 5:
                        System.out.println("Ingrese un numero");
                        c=sc.nextInt();
                        System.out.println("Ingrese a que potencia sera elevado");
                        x=sc.nextInt();

                        re = P.Potencia(c, x);
                        System.out.println("El resultado es: "+re);
                        
                        break;

                    default:
                        System.out.println("Opcion no valida");
                        break;  
                }
                break;
            case 5:
                int op2, Resultado;
                int s[] = new int[10];
                int t=0;

                SumaAr Q = new SumaAr();
                InvArreglo I = new InvArreglo();
                MetodoB B = new MetodoB();

                System.out.println("----------Operaciones basicas----------");
                System.out.println("1.-Sumar Arrgelo"
                                    +"\n2.-Ordenar Arreglo"
                                    +"\n3.-Invertir Arreglo");

                System.out.println("\nSeleccione una opcción");
                op2=sc.nextInt();

                switch(op2){
                    case 1:

                        System.out.println("Ingrese 10 numeros");
                        for(t=0;t<10;t++){
                            s[t]=sc.nextInt();

                        }
                        Resultado = Q.SumaAr(s);
                        System.out.println("La suma total es: "+Resultado);

                        break;
                    case 2:

                        System.out.println("Ingrese 10 numeros");
                        for(t=0;t<10;t++){
                            s[t]=sc.nextInt();
                        }
                        Resultado = B.MBurbuja(s);
                        break;
                    case 3:

                        System.out.println("Ingrese 10 numeros");
                        for(t=0;t<10;t++){
                            s[t]=sc.nextInt();
                        }

                        System.out.println("\nArreglo invertido");
                        Resultado = I.InvArreglo(s);
                        break;

                    default:
                        System.out.println("Opcion no valida");
                }
                break;
            default:
                System.out.println("Opcion no valida");
                break;    
        }  
    }
}