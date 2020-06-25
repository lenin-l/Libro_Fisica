/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro_fisicaapp;

/**
 *
 * @author Lenin Alexander Carrillo Imbaquingo
 */
class Libro_Fisica {
    /*Atributos*/
    private int codigo;
    private String titulo;
    private String autor;
    private int anio_edicion;

    /*Constructor*/

    public Libro_Fisica(int pCodigo,String pTitulo,String pAutor,int pAnio_Edicion){

        codigo=pCodigo;
        titulo=pTitulo;
        autor=pAutor;
        anio_edicion=pAnio_Edicion;
    }

    /*Metodos*/

    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(int codigo){
        this.codigo=codigo;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo=titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor=autor;
    }

    public int getAnio_Edicion(){
        return anio_edicion;
    }

    public void setAnio_Edicion(int anio_edicion){
        this.anio_edicion=anio_edicion;
    }

       @Override
    public String toString(){
        return "El libro de física tiene como titulo "+titulo+" se lo puede encontrar con el CODIGO: "+codigo+"--"
                + " Y fue escrito por el autor "+autor+
                 " su año de edicion es : "+anio_edicion+ " A ";
    }
}
public class Libro_FisicaApp {


    public static void main(String[] args) {
        // Creamos los objetos
        Libro_Fisica biblioteca1=new Libro_Fisica(578,"Movimiento acelerado","Albert Einstein", 1885);
        Libro_Fisica biblioteca2=new Libro_Fisica(4869,"Movimiento acelerado en el plano","Galileo Galilei", 1956);
         Libro_Fisica biblioteca3=new Libro_Fisica(668,"Movimiento acelerado en el origen","Stephen Hawking", 2000);
        //Mostramos su estado
        System.out.println(biblioteca1.toString());
        System.out.println(biblioteca2.toString());
           System.out.println(biblioteca3.toString());
        //Modificamos el Atributo NumMantenimiento del manual 11
        biblioteca1.setAnio_Edicion(70);

        //Comparamos quien tiene mas mantenimiento

       if(biblioteca1.getAnio_Edicion()<biblioteca2.getAnio_Edicion()){
            System.out.println(biblioteca1.getAutor()+" Realizo la investigacion primero");
            }else{
              System.out.println(biblioteca2.getAutor()+" Realizo la investigacion primero");
               System.out.println(biblioteca3.getAutor()+" Realizo la investigacion primero");
          }
    }
}


              