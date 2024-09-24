public class Professor {
    String titulacao;
    String nome;
    int matricula;

    Professor() {
        this("", "", 0);
    }

    Professor(String titulacao, String nome, int matricula) {
        this.nome = nome;
        this.titulacao = titulacao;
        this.matricula = matricula;
    }

    String getDescricao() {
        return String.format("%s %s - mat %d", titulacao, nome, matricula);
    }
}
