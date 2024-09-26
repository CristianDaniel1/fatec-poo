public class Recepcionista extends Funcionario {
    private String cpf;

    public Recepcionista(){}

    public Recepcionista(long codigo, String nome, String cpf, String telefone, String senha) throws Exception {
        setCodigo(codigo);
        setNome(nome);
        setTelefone(telefone);
        setSenha(senha);
        setCpf(cpf);
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

    @Override
    public void mostrar(){
        System.out.println("RECEPCIONISTA>>>>>>>>>>>>>>>>");
        super.mostrar();
        System.out.println("cpf:"+ getCpf());
    }

    public void consultar() throws Exception {
        Paciente obj = new Paciente(1,"maria","345435","4555-3455","F",30);
        obj.mostrar();
    }
}
