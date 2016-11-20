class Funcionario {
    String nome;
    String departamento;
    String dataEntrada;
    String rg;
    double salario;

    double calculaGanhoAnual (){
        double ganhoAnual = this.salario * 12;
        System.out.println ("O ganho anual eh de R$ " + ganhoAnual);
        return ganhoAnual;
    }


    //método para aumentar salario

    double recebeAumento (double percentual){
        double aumento = this.salario * (percentual/100);
        this.salario  = this.salario + aumento;
        System.out.println ("O novo salario eh de R$ " + this.salario);
        return this.salario;

    }
}