public class Paciente {
    private long codigo;
    private String nome;
    private String cpf;
    private String telefone;
    private String genero;
    private int idade;

    public Paciente() {}

    public Paciente(long codigo, String nome, String cpf,
                    String telefone, String genero, int idade) throws Exception {
        setCodigo(codigo);
        setNome(nome);
        setCpf(cpf);
        setTelefone(telefone);
        setGenero(genero);
        setIdade(idade);
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) throws Exception {
        if (codigo<=0) {
            throw new Exception("codigo não pode ser menor ou igual a zero");
        } else {
            this.codigo = codigo;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if (nome == null) {
            throw new Exception("O nome deve ser preenchido.");
        } else {
            this.nome = nome;
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) throws Exception {
        if (cpf == null) {
            throw new Exception("cpf inválido!");
        } else {
            this.cpf = cpf;
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) throws Exception {
        if (telefone == null) {
            throw new Exception("telefone inválido!");
        } else {
            this.telefone = telefone;
        }
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) throws Exception {
        if (genero == null) {
            throw new Exception("O gênero informado é inválido!");
        } else {
            this.genero = genero;
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) throws Exception {
        if(idade <= 0){
            throw new Exception("idade não pode ser menor ou igual a zero");
        } else {
            this.idade = idade;
        }
    }

    public void cadastrar(){
        //TODO
    }

    public void consultar(){
        //TODO
    }

    public void mostrar(){
        System.out.println("PACIENTE>>>>>>>>>>>>>>>>");
        System.out.println("codigo:"+ getCodigo());
        System.out.println("nome:"+ getNome());
        System.out.println("cpf:"+ getCpf());
        System.out.println("telefone:"+ getTelefone());
        System.out.println("genero:"+ getGenero());
        System.out.println("idade:"+ getIdade());
    }


}
