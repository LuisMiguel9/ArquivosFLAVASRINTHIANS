import java.util.Calendar;
public class Aluno {
    String nome;
    int matricula;
    int anoNascimento;
    int ano = Calendar.getInstance().get(Calendar.YEAR);

    Aluno(){
        this("",0,0);
    }
    Aluno(String nome, int matricula, int anoNascimento){
        this.nome=nome;
        this.matricula=matricula;
        this.anoNascimento=anoNascimento;
    }

    int getIdade(){
        return ano-anoNascimento;
    }
    String getDescricao(){
        return String.format("%s (mat=%d, idade=%d)",nome,matricula,ano);
    }



}
