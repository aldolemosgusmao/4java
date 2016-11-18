class Conta {
String dono;
int numero;
double saldo;
double limite;


//Criação do método para saque de dinheiro
/*void saca (double quantidade){
    double novoSaldo = this.saldo - quantidade;
    this.saldo = novoSaldo;
}*/
//Criação de um método de depósito de dinheiro
void deposita (double quantidade){
    this.saldo += quantidade;
}

boolean saca (double quantidade){
    if (this.saldo < quantidade){
        System.out.println ("Saldo Insuficiente!");
        return false;
    } 
    else {
        this.saldo = this.saldo - quantidade;
        System.out.println ("Saque efetuado com sucesso!");
        return true;
    }
}
}