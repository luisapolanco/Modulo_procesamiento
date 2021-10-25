public class Restaurante extends Usuario{

    private String direccion;
    private String nit;
    private Menu menu;

    public Restaurante(String direccion, String nit, Menu menu) {
        this.direccion = direccion;
        this.nit = nit;
        this.menu = menu;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}
