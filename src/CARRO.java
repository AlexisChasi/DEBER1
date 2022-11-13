public class CARRO {
    String marca,modelo,color;
    double peso,rin;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getRin() {
        return rin;
    }

    public void setRin(double rin) {
        this.rin = rin;
    }

    public   CARRO (){
        marca="chevrolet";
        modelo="Aveo";
        color="rojo";
        peso=1.4;
        rin=14;
}

}