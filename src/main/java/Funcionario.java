public abstract class Funcionario {
    private long codigo;
    private String nome;
    private String telefone;
    private String senha;

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void acessar(){
        //TODO
    }

    public void mostrar(){
        System.out.println("codigo:"+ getCodigo());
        System.out.println("nome:"+ getNome());
        System.out.println("telefone:"+ getTelefone());
        System.out.println("senha:"+ getSenha());
    }
}
