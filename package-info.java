class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad (){
        return edad;
    }
    public void setEdad (int edad){
        this.edad = edad;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getTelefono(){
        return telefono;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public static void main (String... args){
        Persona persona = new Persona();
        persona.setEdad(25);
        persona.setNombre("Juan");
        persona.setTelefono("3508076355");
        System.out.println("La persona se llama "+persona.getNombre()+" ,tiene "+persona.getEdad()+" años y su telefono es "+persona.getTelefono());

    }
}