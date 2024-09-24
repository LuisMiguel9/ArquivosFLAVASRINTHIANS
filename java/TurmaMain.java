public class TurmaMain {
    public static void main(String[] args) {

        Professor professor = new Professor("Dr.", "Henry Walton Jones Jr", 1982);


        Turma turma = new Turma("Parapsicologia", 2010, 2, professor);


        Aluno aluno1 = new Aluno("Egon Spengler", 4350, 1980);
        Aluno aluno2 = new Aluno("Peter Venkman", 4361, 1976);
        Aluno aluno3 = new Aluno("Raymond Stantz", 4372, 1978);


        turma.addAluno(aluno1);
        turma.addAluno(aluno2);
        turma.addAluno(aluno3);


        System.out.println(turma.getDescricao());


        System.out.println("Média de idade dos alunos: " + turma.getMediaIdade());
    }
}
