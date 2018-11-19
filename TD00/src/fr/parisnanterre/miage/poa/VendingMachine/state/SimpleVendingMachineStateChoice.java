package fr.parisnanterre.miage.poa.VendingMachine.state;

/**
 * Created with IntelliJ IDEA.
 * User: pascalpoizat
 * Date: 09/12/2013
 * Time: 11:47
 * To change this template use File | Settings | File Templates.
 */
public class SimpleVendingMachineStateChoice extends SimpleVendingMachineState {
    private static SimpleVendingMachineStateChoice instance = null;

    private SimpleVendingMachineStateChoice() {
    }

    public static SimpleVendingMachineStateChoice getInstance() {
        if (instance == null)
            instance = new SimpleVendingMachineStateChoice();
        return instance;
    }

    public void give(SimpleVendingMachineContext c, int money) throws IncorrectStateException {
        throw new IncorrectStateException("impossible to give money now");
    }

    public void askCoffee(SimpleVendingMachineContext c) throws IncorrectStateException {
        System.out.println("coffee being served ...");
        c.setState(SimpleVendingMachineStateBegin.getInstance());
    }

    public void askTea(SimpleVendingMachineContext c) throws IncorrectStateException {
        System.out.println("tea being served ...");
        c.setState(SimpleVendingMachineStateBegin.getInstance());
    }

}
