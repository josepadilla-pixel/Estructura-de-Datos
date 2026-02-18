public class EjecutarMoto {
    public static void main(String[] args) {
       Moto[] m = new Moto[8]; 
       m[0] = new Moto(2026, "AKT TURIN ", "Negra", 125.0, 1400.0);
       m[1] = new Moto(2025, "KAWASAKI NIJA", "Verde lima", 400.0, 25000.0);
       m[2] = new Moto(2026, "HONDA", "Rojo", 350.0, 4000.0);
       m[3] = new Moto(2027, "HONDAD C90", "DoradoNegro", 90.0, 10000.0); 
       m[4] = new Moto(2015, "Sym automatica", "Blaco", 150.0, 4500.0 );
       m[5] = new Moto(2020, "Suzuki", "Azul", 150.0  , 2350.0); 
       m[6] = new Moto(2016, "BMW", "Gris", 1200.0 , 40000.0); 
       m[7] = new Moto(2018, "HARLEY", "Negro", 1800.0, 35000.0) ;
       //operaciones con los objetos del arreglo

       // obtener el promedio de los modelo de las motos del arrglo
       int suma = 0;
       for (int i = 0; i< m.length; i++){
        suma += m[i].getModelo();
       }
       System.out.println("el promedio de los modelo de las motos del arreglo es: "+(suma / m.length));
      
       //obtener las motos que puedo compprar con un presupuesto de 20000 dolares  
       String cad = " \n";
       for (int i = 0; i < m.length; i++) {
         if(m[i].getPrecio()<=20000.0){
           cad += m[i].getMarca()+" "+m[i].getPrecio()+"\n ";
         } 
         
       }
       System.out.println("las motos que puedo comprar con 20000.0us son: "+cad);




    }
}
