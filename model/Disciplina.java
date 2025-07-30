public class Disciplina extends Pessoa {
    private String materia;

    public Disciplina (String nome, String dataNascimento, String materia) {
        super(nome, dataNascimento);
        this.materia = materia;       
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void exibirDados () {
        System.out.println("Professor " + getNome() + ", nascido em " + getDataNascimento() + ", responsável pelas aulas de " + getMateria() + ".");
    }
}