public class TryAnidadoException {
    public static void main(String[] args) {
        try
        {
         int c= args.length;
         int a =10/c;
         System.out.println("Valor de a="+a);
         
         try
         {
        if (c==1)
        a=a/(c-1);
        if (c==2)
        {
            int [] 
                b ={100,5};
            b[3] = 0; //Genera la excepcion array
        }
    
         }
         catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Segunda Excepcion. Indice fuera del limite"+e);
         }
     
         catch(Exception e)
         {
System.out.println("Es una excepcion generica..."+e);
         }

    }
    catch(ArithmeticException e)
    {
System.out.println("Primera Excepcion. Division por cero"+e);
    }
}
}
