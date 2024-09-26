public class Receita extends Procedimento {
    public Receita(){}

    public Receita(long codigo, String data, String descritivo) throws Exception {
        setData(data);
        setDescritivo(descritivo);
        setCodigo(codigo);
    }

    @Override
    public void mostrar(){
        System.out.println("RECEITA>>>>>>>>>>>>>>>>");
        super.mostrar();
    }

    public void preescrever(){
        //TODO;
    }

    public void consultar(){
        //TODO
    }

}
