public class TestaVetor {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("João");
        Aluno a2 = new Aluno("José");

        Vetor list  = new Vetor();
        list.adiciona(a1);
        list.adiciona(a2);

        System.out.println(list);
        System.out.println(list.contem(a1));
        Aluno a3 = new Aluno("Danilo");
        System.out.println(list.contem(a3));
        System.out.println(list.pega(158));
    }
}
