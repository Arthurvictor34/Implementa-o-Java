public class Venda implements IcalcularValores {

    @Override
    public double calcularPeso(double peso, double valor) {
        return peso * valor;
    }

    @Override
    public double calcularCusto(double custo, double quantidade) {
        return custo * quantidade;
    }
    
}
