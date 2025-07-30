public class Aluno extends Molde {
	private String matricula;
	private String curso;
    private String turma;
	
	public Aluno(String nome, String matricula, String curso, String turma) {
		super(nome);
		this.matricula = matricula;
		this.curso = curso;
        this.turma = turma;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula ) {
		this.matricula = matricula;
	}
	
	public String getCurso () {
		return curso;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}

    public String getTurma () {
        return curso;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
	
	public void exibirDados() {
		System.out.println("Nome: " + getNome() + ", matrícula: " + matricula + ", curso: " + curso + ", turma: " + turma);
	}

}