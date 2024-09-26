public class Medico extends Funcionario {
    private String crm;
    private String especialidade;

    public Medico(){}

    public Medico(long codigo, String nome, String crm, String telefone, String especialidade, String senha) throws Exception {
        setCodigo(codigo);
        setNome(nome);
        setSenha(senha);
        setTelefone(telefone);
        setCrm(crm);
        setEspecialidade(especialidade);
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) throws Exception {
        if (crm == null) {
            throw new Exception("O nome deve ser informado.");
        } else {
            this.crm = crm;
        }
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) throws Exception {
        if (especialidade == null) {
            throw new Exception("especialidade inválida!");
        } else {
            this.especialidade = especialidade;
        }
    }

    @Override
    public void mostrar(){
        System.out.println("MEDICO>>>>>>>>>>>>>>>>");
        super.mostrar();
        System.out.println("crm:"+ getCrm());
        System.out.println("especialidade:"+ getEspecialidade());
    }

    public void receitar(Consulta obj) throws Exception {
        Receita novaReceita = new Receita(1,"2024-10-09", "dipirona");
        obj.getReceitas().add(novaReceita);

        Exame novoExame = new Exame(1,"2024-09-12", "Raio x torax");
        obj.getExames().add(novoExame);
    }
}
