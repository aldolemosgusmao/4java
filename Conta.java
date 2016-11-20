class Conta {
String dono;
int numero;
double saldo;
double limite;
Cliente titutar;

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

boolean transfere (Conta destino, double quantidade) {
    if (this.saldo < quantidade){
        System.out.println ("Saldo insuficiente!");
        return false;
    }else {
        this.saldo = this.saldo - quantidade;
        destino.saldo = destino.saldo + quantidade;
        System.out.println ("Transferência efetuada como sucesso!");
        return true;
    }
}
}
