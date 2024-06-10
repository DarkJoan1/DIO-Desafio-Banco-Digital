
public class Terminal {
    
    public static void main(String[] args) {
           
	Cliente giovanna = new Cliente();
	giovanna.setNome("Giovanna");
	
	Conta cc = new ContaCorrente(giovanna);
	Conta poupanca = new ContaPoupanca(giovanna);
	cc.depositar(100);
	cc.transferir(100, poupanca);
	
	cc.imprimirExtrato();
	poupanca.imprimirExtrato();
    
    }
    
}
