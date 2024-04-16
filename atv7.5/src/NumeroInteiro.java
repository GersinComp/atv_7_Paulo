public class NumeroInteiro {
    private int numero;

    public NumeroInteiro() {
        this.numero = 0;
    }

    public NumeroInteiro(int numero) {
        this.numero = numero;
    }

    public void soma(int valor) {
        this.numero += valor;
    }

    public void subtrai(int valor) {
        this.numero -= valor;
    }

    public boolean numPrimo(int num) {
        if (this.numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(this.numero); i++) {
            if (this.numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int getProxPrimo() {
        int num = this.numero + 1;
        while (true) {
            if (numPrimo(num)) {
                return num;
            }
            num++;
        }
    }

    public int getNumero() {
        return numero;
    }
}
