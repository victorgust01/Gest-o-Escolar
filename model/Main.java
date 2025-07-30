public class Main {
    public static void main(String[] args) {

        System.out.println("------------------------------- ALUNOS -------------------------------");
        Aluno aluno = new Aluno("Victor Gustavo", "n. 9177393", "Mecânico", "1º Ano");
        aluno.exibirDados();
        Aluno aluno2 = new Aluno("Pililiu", "n. 1995217", "Engenharia", "3º Ano");
        aluno2.exibirDados();
        Aluno aluno3 = new Aluno("Moscou", "n. 1234567", "Física", "2º Ano");
        aluno3.exibirDados();
        Aluno aluno4 = new Aluno("Cabral", "n. 7654321", "Matemática", "1º Ano");
        aluno4.exibirDados();
        Aluno aluno5 = new Aluno("Luan", "n. 1122334", "Química", "2º Ano");
        aluno5.exibirDados();

        System.out.println("------------------------------- PROFESSORES -------------------------------");
        Professor professor = new Professor("Dr. Cabral", "Projeto de Vida");
        professor.exibirDados();
        Professor professor2 = new Professor("Moscou", "Física");
        professor2.exibirDados();
        Professor professor3 = new Professor("Luan", "Química");
        professor3.exibirDados();
        Professor professor4 = new Professor("Pililiu", "Matemática");
        professor4.exibirDados();
        Professor professor5 = new Professor("Victor Gustavo", "Engenharia de Software");
        professor5.exibirDados();

        System.out.println("------------------------------- DISCIPLINAS -------------------------------");
        Disciplina disciplina = new Disciplina("Matemática", "Álgebra");
        disciplina.exibirDados();
        Disciplina disciplina2 = new Disciplina("História", "História Geral");
        disciplina2.exibirDados();
        Disciplina disciplina3 = new Disciplina("Geografia", "Geografia Física");
        disciplina3.exibirDados();
        Disciplina disciplina4 = new Disciplina("Física", "Mecânica Clássica");
        disciplina4.exibirDados();
        Disciplina disciplina5 = new Disciplina("Química", "Química Orgânica");
        disciplina5.exibirDados();

        
    }
}
