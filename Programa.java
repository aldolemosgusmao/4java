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

        Conta outraConta =  new Conta ();
        outraConta = minhaConta;

        System.out.println (minhaConta.saldo);
        outraConta.deposita(100);
        System.out.println (outraConta.saldo);

        outraConta.dono = "Jose";

        //Por ter sido atribuído o mesmo valor de referências para a variáveis esta forma de comparação induzirá a um erro, pois não está comparando o conteúdo.  Veja abaixo
        if (outraConta.dono == minhaConta.dono){
            System.out.println ("Os valores são iguais.");
            System.out.println (minhaConta.dono + "eh igual a " + outraConta.dono + "?!");
        }

        System.out.println ("Saldo de "+ minhaConta.dono + "eh de " + minhaConta.saldo);
        System.out.println ("Saldo de "+ outraConta.dono + "eh de " + outraConta.saldo);
	}
}