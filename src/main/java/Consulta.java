import java.util.List;

public class Consulta extends Agenda {
    private String motivo;
    private String historico;
    private List<Receita> receitas;
    private List<Exame> exames;

    public Consulta(){}

    public Consulta(int codigo, String data, String hora, Medico medico, Paciente paciente, String motivo, String historico) throws Exception {
        setData(data);
        setHora(hora);
        setCodigo(codigo);
        setMedico(medico);
        setPaciente(paciente);
        setMotivo(motivo);
        setHistorico(historico);
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) throws Exception {
        if (motivo == null) {
            throw new Exception("motivo deve ser informado!");
        } else {
            this.motivo = motivo;
        }
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) throws Exception {
        if (historico == null) {
            throw new Exception("historico inválido!");
        } else {
            this.historico = historico;
        }
    }

    public List<Receita> getReceitas() {
        return receitas;
    }

    public void setReceitas(List<Receita> receitas) {
        this.receitas = receitas;
    }

    public List<Exame> getExames() {
        return exames;
    }

    public void setExames(List<Exame> exames) {
        this.exames = exames;
    }

    @Override
    public void mostrar(){
        System.out.println("CONSULTA>>>>>>>>>>>>>>>>");
        super.mostrar();

        System.out.println("motivo:"+ getMotivo());
        System.out.println("historico:"+ getHistorico());
        for (Receita obj: getReceitas()) {
            obj.mostrar();
        }
        for(Exame obj: getExames()){
            obj.mostrar();
        }
    }

    public void marcar(){
        //todo
    }
    public void cancelar(){
        //todo
    }
    public void consultar(){
        //todo
    }
    public void realizar(){
        //todo
    }
    public void atualizar(){
        //todo
    }
}
