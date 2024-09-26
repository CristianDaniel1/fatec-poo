public class Agenda {
    private int codigo;
    private String data;
    private String hora;
    private Medico medico;
    private Paciente paciente;

    public Agenda(){}

    public Agenda(int codigo, String data, String hora, Medico medico, Paciente paciente) throws Exception {
        setCodigo(codigo);
        setData(data);
        setHora(hora);
        setMedico(medico);
        setPaciente(paciente);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) throws Exception {
        if(codigo<=0){
            throw new Exception("informe o codigo da agenda!!!");
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

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) throws Exception {
        if (hora == null) {
            throw new Exception("hora inválida!");
        } else {
            this.hora = hora;
        }
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }


    public void mostrar(){
        System.out.println("AGENDA>>>>>>>>>>>>>>>>");
        System.out.println("codigo:"+ getCodigo());
        System.out.println("data:"+ getData());
        System.out.println("hora:"+ getHora());
        getMedico().mostrar();
        getPaciente().mostrar();
    }

    public void consultar(){
        //TODO
    }
}
