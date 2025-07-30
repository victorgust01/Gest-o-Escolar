public class Professor extends Molde {
    private String disciplina;

    public Professor(String nome, String disciplina) {
        super(nome);
        this.disciplina = disciplina;
    }

        public String getDisciplina() {
            return disciplina;
        }

        public void setDisciplina(String disciplina) {
            this.disciplina = disciplina;
        }

    public void exibirDados() {
        System.out.println("Professor " + getNome() + ", responsável pela disciplina de " + disciplina + ".");
    }
}