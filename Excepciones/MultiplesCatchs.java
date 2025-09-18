public class MultiplesCatchs {
    public static void main(String[] args) {
    
    int a;
    int [] b;
    int c = args.length;
    try{
        a=10/c;// posible Excepcion aritmetica
        System.out.println("El valor de a ="+a);
        b= new int[5];
        for(int i=0; i<a; i++)
        {
            b[i]=i;
            System.out.println("/t"+ i);
        }
    }
    catch (ArithmeticException e)
    {
    System.out.println("Primera Excepcion. Divison por cero"+ e);
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
System.out.println("Segunda Excepcion. Indice fuera de limites"+e);
    }
}
}
