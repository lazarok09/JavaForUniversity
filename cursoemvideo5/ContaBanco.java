package cursoemvideo5;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    /* constructor */
    public ContaBanco(int nC, String d) {
        this.setNumConta(nC);
        this.setDono(d);
        this.setSaldo(0);
        this.setStatus(false);
    }
    /* constructor end */

    public void abrirConta(String tipo) {
        if (tipo == "cc" | tipo == "cp") {
            this.setTipo(tipo);
            this.setStatus(true);
            if (tipo == "cc") {
                this.setSaldo(50);
            } else if (tipo == "cp") {
                this.setSaldo(150);
            }
        }

    }

    public void fecharConta() {
        if (this.getSaldo() == 0) {
            this.setStatus(false);
        } else {
            System.out.println("Ocorreu um erro, parece que sua conta possui débitos ou possui dinheiro");
        }
    }

    public void depositar(float valor) {
        if (this.isStatus() == true) {
            this.setSaldo(this.getSaldo() + valor);
        } else {
            System.out.println("Ocorreu um erro, você não tem uma conta ativa");
        }
    }

    public void sacar(float valor) {
        if (this.isStatus() && this.getSaldo() >= valor) {
            this.setSaldo(getSaldo() - valor);
        }
    }

    public void pagarMensalidade() {
        if (this.getTipo() == "cc") {
            this.setSaldo(-2f);
        } else if (this.getTipo() == "cp") {
            this.setSaldo(-20f);
        }

    }

    // getters and setters
    public void getAll() {
        System.out.println("-----Executando getAll()");
        System.out.println("Nº da conta: " + this.getNumConta());
        System.out.println("Estatus da conta : " + this.isStatus());
        System.out.println("O tipo da conta : " + this.getTipo());
        System.out.println("Nome do dono da conta :  " + this.getDono());
        System.out.println("-------- SALDO-------");
        System.out.println(this.getSaldo());

    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
