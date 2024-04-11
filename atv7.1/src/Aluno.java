public class Aluno {
    private String nome;
    private Integer matricula;
    private Float notaProva1;
    private Float notaProva2;
    private Float notaTrabalho;
    private final Float teto;

    public Aluno(Float teto) {
        this.teto = teto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public void setNotaProva1(Float notaProva1) {
        this.notaProva1 = notaProva1;
    }

    public void setNotaProva2(Float notaProva2) {
        this.notaProva2 = notaProva2;
    }

    public void setNotaTrabalho(Float notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }

    public String getNome() {
        return nome;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public Float getNotaProva1() {
        return notaProva1;
    }

    public Float getNotaProva2() {
        return notaProva2;
    }

    public Float getNotaTrabalho() {
        return notaTrabalho;
    }

    void aprovacao (Float notaProva1, Float notaProva2, Float notaTrabalho){
        if ((notaProva1 + notaProva2 + notaTrabalho) >= 6)
            System.out.println("O aluno com a matrícula de n°: " + this.matricula +
                    "\nNome: " + this.nome + " Foi aprovado com uma nota final de: "
                    + (notaProva1 + notaProva2 + notaTrabalho));
        else if ((notaProva1 + notaProva2 + notaTrabalho) > teto)
            System.out.println("a soma das notas é maior que " + teto);
        else
            System.out.println("O aluno com a matrícula de n°: " + this.matricula +
                    "\nNome: " + this.nome + " Foi reprovado com uma nota final de: "
                    + (notaProva1 + notaProva2 + notaTrabalho));
    }
}
