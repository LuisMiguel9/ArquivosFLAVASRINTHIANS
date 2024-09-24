import java.util.ArrayList;
public class Turma {
    String disciplina;
    int ano;
    int semestre;
    Professor professor;
    ArrayList<Aluno> alunos;


    Turma(String disciplina, int ano, int semestre, Professor professor) {
        this.disciplina = disciplina;
        this.ano = ano;
        this.semestre = semestre;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }


    void addAluno(Aluno aluno) {
        if (getAluno(aluno.matricula) == null) {
            alunos.add(aluno);
        } else {
            System.out.println("Aluno com matrícula " + aluno.matricula + " já está na turma.");
        }
    }


    Aluno getAluno(int matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.matricula == matricula) {
                return aluno;
            }
        }
        return null;
    }


    double getMediaIdade() {
        if (alunos.isEmpty()) {
            return 0.0;
        }

        int somaIdades = 0;
        for (Aluno aluno : alunos) {
            somaIdades += aluno.getIdade();
        }
        return somaIdades / (double) alunos.size();
    }


    String getDescricao() {
        StringBuilder descricao = new StringBuilder();
        descricao.append(String.format("Turma %s - %d/%d (Prof. %s %s - mat %d):\n",
                disciplina, ano, semestre, professor.titulacao, professor.nome, professor.matricula));

        for (int i = 0; i < alunos.size(); i++) {
            Aluno aluno = alunos.get(i);
            descricao.append(String.format("  - Aluno %d: %s (mat=%d, idade=%d)\n",
                    i + 1, aluno.nome, aluno.matricula, aluno.getIdade()));
        }

        return descricao.toString();
    }
}
