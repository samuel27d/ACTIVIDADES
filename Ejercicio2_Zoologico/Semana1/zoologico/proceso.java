package Semana1.zoologico;

public class proceso {
    public static void main(String[] args) {
       System.out.println("hoy tenemos en zologico"); 
       animales animales= new animales("null", null, 0, null, null, null);
       animales.presentacion();
       animales.encargados();
       System.out.println("primero vayamos con los mamiferos");
       mamiferos mamiferos= new mamiferos("null", null, 0, null, null, null);
       mamiferos.ocultar_su_olor();
       mamiferos.verificar_a_los_cachorros();
       leon Leo= new leon("null", "Pathera Leo", 1, "190kg", "1.2m", "Juan", "Leon asiatico", "1000 psi", "9kg de carne");
       Leo.presentacion2();
       Leo.metododealimenta();
       Leo.metododecaza();
       caballo caballo=new caballo("null", "Equus ferus przewalskii", 2, "350kg", "1.45m", "Juan", "caballo salvaje asiatico", "55km/h", "15kg de heno");
       caballo.presentacion2();
       caballo.heno();
       caballo.metododeescape();

       System.out.println("ahora pasemos con los reptiles");

        reptiles reptiles=new reptiles(null, null, 0, null, null, null, null);
        reptiles.humedecer_las_escamas();
        reptiles.verificar_a_los_Huevos();

       caiman caiman= new caiman("null", "Caiman yacare", 3, "65kg", "1.9m", "Jony", "33 grados celcius", "Caiman del paraguay", "1800 psi", "2kg");
       caiman.presentacion2();
       caiman.metododealimenta();
       caiman.metododecaza();

       iguana iguana= new iguana("null", "Iguana Iguana", 3, "10kg", "1m", "Jony", "33 grados celcius", "iguana comun", "33 grados celcius");
       iguana.presentacion2();
       iguana.metododealimenta();
       iguana.metododeescape();

    }
}
