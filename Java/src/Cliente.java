public class Cliente extends  Usuario{
    private String direccion;
    private int celular;

    public Cliente(String direccion, int celular) {
        this.direccion = direccion;
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }
}
