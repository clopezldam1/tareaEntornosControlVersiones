public class DemoAlmacen {

    public static void main(String[] args) {
//     Almacen almacen = new Almacen(8);
        
//        System.out.println("================================================================");
//        almacen.insertaProducto(new Producto("M2030", "Mesa 200x300", 2));
//        almacen.insertaProducto(new Producto("M1525", "Mesa 150x250", 3));
//        almacen.insertaProducto(new Producto("TA80N", "Taburete 80cm negro", 2));
//        almacen.insertaProducto(new Producto("TA80B", "Taburete 80cm blanco", 2));
//        almacen.insertaProducto(new Producto("SGIST", "Silla girable standar", 4));
//        almacen.insertaProducto(new Producto("SGIAB", "Silla girable abatible", 3));
//        almacen.insertaProducto(new Producto("BACOL", "Butaca acolchada", 2));
//        almacen.insertaProducto(new Producto("F2PLA", "Sofa 2 plazas", 2));
//        System.out.println("================================================================");
        
    //    Producto p = new Producto("F3PLA", "Sofa 3 plazas", 3);
        
//        if (!almacen.insertaProducto(p)){
//            System.out.println("No se ha podido insertar el " + p.getNombre());
//        }
//        p = new Producto("F2PLA", "Sofa 2 plazas", 3);
//        if (!almacen.insertaProducto(p)){
//            System.out.println("No se ha podido insertar el " + p.getNombre());
//        }
//        System.out.println("================================================================");
//        almacen.listaProductos();
//        System.out.println("================================================================");
//        String id = "F3PLA";
//        p = almacen.dameProducto(id);
//        if (p == null ) {
//            System.out.printf("No esta el producto %s.\n",id);
//        }else{
//            System.out.printf("El producto %s es '%s' y hay %d unidades.\n", id, p.getNombre(), p.getStock());
//        }
//        id = "F2PLA";
//        p = almacen.dameProducto(id);
//        if (p == null ) {
//            System.out.printf("No esta el producto %s.\n",id);
//        }else{
//            System.out.printf("El producto %s es '%s' y hay %d unidades.\n", id, p.getNombre(), p.getStock());
//        }
//        System.out.println("================================================================");
//        id = "SGIAB";
//        if (almacen.eliminaProducto(id)) {
//            System.out.printf("Producto %s borrado.\n",id);
//        }else{
//            System.out.printf("No se ha podido borrar el producto %s.\n",id);
//        }
//        id = "SGIST";
//        if (almacen.eliminaProducto(id)) {
//            System.out.printf("Producto %s borrado.\n",id);
//        }else{
//            System.out.printf("No se ha podido borrar el producto %s.\n",id);
//        }
//        id = "SIGIR";
//        if (almacen.eliminaProducto(id)) {
//            System.out.printf("Producto %s borrado.\n",id);
//        }else{
//            System.out.printf("No se ha podido borrar el producto %s.\n",id);
//        }
//        System.out.println("================================================================");
//        almacen.listaProductos();
//        System.out.println("================================================================");
//           String json = "{'id':'TA80R','nombre':'Taburete con respaldo','stock':8}";
//        p = new Producto(json);
//        almacen.insertaProducto(p);
//        json = "{'id':'ALPER','nombre':'Alfombra persa','stock':1}";
//        p = new Producto(json);
//        almacen.insertaProducto(p);
//        System.out.println("================================================================");
    Producto p1 = new Producto("TA80R","Taburete",8);
        System.out.println("\nPRODUCTO 1:");
       // String json = "{'id':'TA80R','nombre':'Taburete con respaldo','stock':8}";
     //   System.out.println(new Producto(json));
//        json = String.valueOf(json);
//        json.toString();
//        p = new Producto(json);
       // p.toString();
        System.out.println("ID:" + p1.getId());
        System.out.println("NOMBRE:" + p1.getNombre());
        System.out.println("STOCK:" + p1.getStock());
        System.out.println();
        System.out.println(p1.toString());
        System.out.println("COLABORANDO :D");
//
//        System.out.println("\nPRODUCTO 2:");
//        String json ="{'id':'ALPER','nombre':'Alfombra persa','stock':1}";
//        p1.convertir(json);
//        p1.toString();
//        Producto p2 = new Producto(json);
//        p = new Producto(json);
//        System.out.println("ID:" + p2.getId());
//        System.out.println("NOMBRE:" + p2.getNombre());
//        System.out.println("STOCK:" + p2.getStock());

        
//        System.out.println("================================================================");
//        almacen.listaProductos();
//        System.out.println("================================================================");
    }

}
