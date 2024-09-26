import java.util.List;

public class Clinica {

    public static void main(String[] args) {
        try {
            Paciente paciente = new Paciente();
            paciente.setCodigo(20);
            paciente.setCpf("1244556");
            paciente.setGenero("M");
            paciente.setIdade(20);
            paciente.setNome("Cristian Daniel");
            paciente.setTelefone("4002-8922");
            paciente.mostrar();

            Receita receita = new Receita(43, "04/2024","Receita para as dores informadas");
            Exame exame = new Exame(54, "04/2024", "O paciente sofre problemas no coração");

            Recepcionista recepcionista = new Recepcionista(19, "Emilyn Tancara", "53242323", "40028922", "6ano");
            Medico medico = new Medico(32, "Stefanny Andrade", "9s", "12344566", "Cardiologista", "9ano");

            Consulta consulta = new Consulta(16, "06/2019", "12h", medico, paciente, "Problemas no caração", "Constantes dores no coração");
            consulta.mostrar();
        }
        catch(Exception err){
            System.out.println("Ocorreu uma exceção - "+ err.getMessage());
        }
        finally {
            System.out.println("ACABOU>>>>>>>>");
        }
    }
}