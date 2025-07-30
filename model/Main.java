public class Main {
    public static void main(String[] args) {
        String turma;
        Aluno aluno = new Aluno("Victor Gustavo", "12/05/2007", "n. 9177393", "Mecânico", "1º Ano");
        aluno.exibirDados();

        Professor professor = new Professor("Dr. Cabral", "29/12/1980", "Projeto de Vida");
        professor.exibirDados();
    }
}
