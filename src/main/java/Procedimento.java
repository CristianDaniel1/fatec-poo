public abstract class Procedimento {
    private long codigo;
    private String data;
    private String descritivo;

    public Procedimento() {}

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) throws Exception {
        if (codigo <= 0) {
            throw new Exception("codigo não pode ser menor ou igual a zero");
        } else {
            this.codigo = codigo;
        }
    }

    public String getData() {
        return data;
    }

    public void setData(String data) throws Exception {
        if (data == null) {
            throw new Exception("data inválida!");
        } else {
            this.data = data;
        }
    }

    public String getDescritivo() {
        return descritivo;
    }

    public void setDescritivo(String descritivo) throws Exception {
        if (descritivo == null) {
            throw new Exception("descritivo não pode estar vazio!");
        } else {
            this.descritivo = descritivo;
        }
    }

    public void consultar(){
        //TODO
    }

    public void mostrar(){
        System.out.println("codigo:"+ getCodigo());
        System.out.println("data:"+ getData());
        System.out.println("descritivo:"+ getDescritivo());
    }
}
