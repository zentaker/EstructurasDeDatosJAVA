package com.ordenamiento;

/**
 * Evaluacion permanente1
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        //algoritmo secuencial 
        
      
            double elementos[]= {20, 30, 40, 10};
            double dato = 40;
           
            int conta = 3;
            int i;
            
        for (i = 0; i < conta; i++){
                if (dato == elementos[i]){
                    //System.out.println(i);                
                }          
        }

        //ordenamiento algoritmo burbuja 

         
        double elementos1[]= {20, 30, 40, 10};
      
       
        int conta1 = 4;
        int ie;

        int  j;
        double tempo;

        
        
        for(ie=0; ie<conta1-1; ie++) {
            //contador 1
           //System.out.println("tick1");

            for(j=ie+1; j<conta1; j++) {
                //contador 2
              // System.out.println("tick2");

                if (elementos1[ie] > elementos1[j]){
                    
                    tempo = elementos1[ie];
                    elementos1[ie] = elementos1[j];
                    elementos1[j] = tempo;  
                    
                          
                }
                
               

            }
           
            

        }
    /*     System.out.println(elementos1[0]);
        System.out.println(elementos1[1]);
        System.out.println(elementos1[2]);
        System.out.println(elementos1[3]);  */
        
        

        //busqueda binaria 
        int limInf, limSup;
        double medio=0;

       // Requisito ordenar el array
       double elementos2[]= {50, 60, 70, 80, 90};
       int res=0;
       double dato2=90;
       int conta2 = 5;
       


        limInf = 0;
        limSup = conta2 - 1;

        do {

           
            
           // System.out.println(limInf);
           // System.out.println(limSup);
          

            medio = Math.round((limInf + limSup) / 2.0);

              //me esta devolciendo 0 tiene que ser 1
              //System.out.println(medio);

            if (dato2 == elementos2[(int) medio]) {
                // devolver el medio
               res = (int) elementos2[(int) medio];
              // System.out.println("comparacion directa");
              // System.out.println("pocicion: " + medio);
              // System.out.println("valor:"+res);
               
            }
 
            if (dato2 < elementos2[(int) medio]) {
                limSup = (int) (medio - 1);
                //System.out.println("es menor del medio M-1");
                res = (int) elementos2[(int) medio];

            } else {
                limInf = (int) (medio + 1);
                //System.out.println("es mayor del medio M+1");
                res = (int) elementos2[(int) medio];

            }
            
          
        } while(limInf <= limSup);


        // metodo para insertar un elemento 
        
        int e;
        double elementos3[]= {50, 60, 70, 80, 90};
        int conta3 = 6;
        double pos = 2;
        double num = 40;
 

        double newarr[] = new double[conta3 + 1];
 
        for (e = 0; e < conta3; e++) {
            if (e < pos ) {
                newarr[e] = elementos3[e];
            } else if (e == pos) {
               //agregamos el valor 
                newarr[e] = num;

            } else {
                newarr[e] = elementos3[e-1];
            }

        }

 /*        
        System.out.println(newarr[0]);
        System.out.println(newarr[1]);
        System.out.println(newarr[2]);
        System.out.println(newarr[3]);
        System.out.println(newarr[4]);
        System.out.println(newarr[5]); */




        //adicionar al nodo 


        /*
         * 
         * nodo con obje
         */
    

 
        

        
                


    
      
            

        
    }

}
