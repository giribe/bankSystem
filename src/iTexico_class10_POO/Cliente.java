package iTexico_class10_POO;

public class Cliente extends Person {

    private int id;
    private String nombre;
    private float saldo;

    @Override
    public float getSaldo() {
        return saldo;
    }

    @Override
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public int getId() {
        return id;
    }

    @Override
    public String getNombre() {
        return nombre;
    }


}

