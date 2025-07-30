public class Disciplina extends Molde {
    private String materia;

    public Disciplina (String nome, String materia) {
        super(nome);
        this.materia = materia;       
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void exibirDados () {
        System.out.println("Disciplina: " + getNome() + ", matéria: " + materia);
    }
}