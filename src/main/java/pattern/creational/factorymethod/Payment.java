package pattern.creational.factorymethod;

/**
 * Esta interfaz es la generalización que nos permitirá instanciar objetos
 * diferentes, pero en una misma familia. Permite el polimorfismo.
 */
public interface Payment {
    void doPayment(double money);
}
