import java.util.Arrays;

public class Vetor {
    private Aluno[] alunos = new Aluno[100];
    private int totalDeAlunos = 0;

    private boolean posicaoValida(int posicao){
        return posicao >= 0 && posicao <= totalDeAlunos;
    }
    public void adiciona(Aluno aluno){
        this.alunos[totalDeAlunos] = aluno;
        totalDeAlunos++;
    }

    public void adiciona(int posicao, Aluno aluno){
        if (!posicaoValida(posicao)){
            throw new IllegalArgumentException("Posicao inválida");
        }
        for (int i = totalDeAlunos -1; i >= posicao; i--){
            alunos[i+1] = alunos[i];
        }
        alunos[posicao] = aluno;
    }
    private boolean posicaoOcupada(int posicao){
        return posicao >= 0 && posicao < totalDeAlunos;
    }
    public Aluno pega(int posicao){
        if(!posicaoOcupada(posicao)){
            throw new IllegalArgumentException("posicao inválida");
        }

        return alunos[posicao];
    }

    public void remove(int posicao){
        for (int i = posicao; i < this.totalDeAlunos; i++){
            this.alunos[i] = alunos[i+1];
        }
        totalDeAlunos--;
    }

    public boolean contem(Aluno aluno){
        for (int i = 0; i < totalDeAlunos; i++){
            if (aluno.equals(alunos[i])){
                return true;
            }
        }
        return false;
    }

    public int tamanho(){
        return 0;
    }
    public String toString(){
        return Arrays.toString(alunos);
    }
}
