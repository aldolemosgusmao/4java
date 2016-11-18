class Programa {
	public static void main (String[] args){
		System.out.println ("Olah");
		Conta minhaConta = new Conta ();
		minhaConta.dono = "Joseh";
		minhaConta.saldo = 1000.00;
		System.out.println ("O saldo inicial da conta de " + minhaConta.dono + " eh de R$ " + minhaConta.saldo);

        //Sacar 100 reais

        minhaConta.saca(900);

        //depositar 1000 reais

        minhaConta.deposita(1000);
        System.out.println ("Saldo atual de R$ " + minhaConta.saldo);

        //Sacar 2000 reais
        minhaConta.saca(2000);
	}
}