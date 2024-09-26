public class Exame extends Procedimento {

    public Exame(){}

    public Exame(long codigo, String data, String descritivo) throws Exception {
        setCodigo(codigo);
        setData(data);
        setDescritivo(descritivo);
    }

    @Override
    public void mostrar(){
        System.out.println("EXAME>>>>>>>>>>>>>>>>");
        super.mostrar();
    }

    public void solicitar(){
        //todo
    }

    public void consultar(){
        //todo
    }
}
