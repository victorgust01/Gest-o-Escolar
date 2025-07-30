public class Aluno extends Pessoa {
	private String matricula;
	private String curso;
	
	public Aluno(String nome, String dataNascimento, String matricula, String curso) {
		super(nome, dataNascimento);
		this.matricula = matricula;
		this.curso = curso;
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
	
	public void exibirDados() {
		System.out.println("Aluno: " + getNome() + ", Matricula: " + matricula + ", Curso: " + curso + ", Data de Nascimento: " + getDataNascimento() );
	}

}