public class ExcepcionCapturada {
    public static void main(String[] args) {
        int a,b;

        try{
            a =0;
            b =10/a; //Aqui ocurre la excepcion
            System.out.println("Esta linea de codigo ya no se lee");
        }
catch(ArithmeticException e){
System.out.println("Error, Divison entre 0" + " "+e);
}
System.out.println("Aqui continua despues de la gestion de excepcion");

    }
}
