public class Professor extends Pessoa {
    private String disciplina;

    public Professor(String nome, String dataNascimento, String disciplina) {
        super(nome, dataNascimento);
        this.disciplina = disciplina;
    }

        public String getDisciplina() {
            return disciplina;
        }

        public void setDisciplina(String disciplina) {
            this.disciplina = disciplina;
        }

    public void exibirDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Data de Nascimento: " + getDataNascimento());
        System.out.println("Disciplina: " + disciplina);
    }
}