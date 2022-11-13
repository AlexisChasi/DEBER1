import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        CARRO carro=new CARRO();
        System.out.println("Marca: "+carro.getMarca());
        System.out.println("Modelo: "+carro.getModelo());
        System.out.println("Color: "+carro.getColor());
        System.out.println("Peso: "+carro.getPeso());
        System.out.println("Rin: "+carro.getRin());
        //datos modificados
        System.out.println();
        System.out.println("Datos modificados");
        System.out.println();

        carro.setMarca("KIA");
        carro.setModelo("PICANTO");
        carro.setColor("Azul");
        carro.setPeso(1.6);
        carro.setRin(12);
        System.out.println("Marca: "+carro.getMarca());
        System.out.println("Modelo: "+carro.getModelo());
        System.out.println("Color: "+carro.getColor());
        System.out.println("Peso: "+carro.getPeso()+" toneladas");
        System.out.println("Rin: "+carro.getRin());

        System.out.println("==================================");
        System.out.println();
        musica cancion=new musica();
        System.out.println( "CANCION");
        System.out.println("Genero: "+cancion.getGenero());
        System.out.println("Cancion: "+cancion.getCancion());
        System.out.println("Artista: "+cancion.getArtista());
        System.out.println();
        System.out.println("Datos modificados");
        cancion.setGenero("Salsa");
        cancion.setCancion("Ilidio");
        cancion.setArtista("Willie Colon");
    }
}