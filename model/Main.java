public class Main {
    public static void main(String[] args) {
        
        Aluno aluno = new Aluno("Victor Gustavo", "12/05/2007", "n. 9177393", "Mecânico", "1º Ano");
        aluno.exibirDados();

        Aluno aluno2 = new Aluno("Pililiu", "25/09/2006", "n. 1995217", "Engenharia", "3º Ano");
        aluno2.exibirDados();

        Professor professor = new Professor("Dr. Cabral", "29/12/1980", "Projeto de Vida");
        professor.exibirDados();

        Professor professor2 = new Professor("Moscou", "17/03/2025", "Física");
        professor2.exibirDados();

        Disciplina disciplina = new Disciplina("Matemática", "Século VI a.C.", "Álgebra");
        disciplina.exibirDados();

        Disciplina disciplina2 = new Disciplina("História", "Século XX a.C.", "História Geral");
        disciplina2.exibirDados();

        
    }
}
