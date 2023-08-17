package Ex05;

public class Turma {
    private int periodoLetivo,maxEstudantes,estudantesMatriculados;
    private String docente, disciplina;

    public Turma(int periodoLetivo, int maxEstudantes, int estudantesMatriculados, String docente, String disciplina){
        this.periodoLetivo = periodoLetivo;
        this.maxEstudantes = maxEstudantes;
        this.estudantesMatriculados = estudantesMatriculados;
        this.docente = docente;
        this.disciplina = disciplina;
    }
    //Getters e Setters
    public int getPeriodoLetivo() {
        return periodoLetivo;
    }
    public void setPeriodoLetivo(int periodoLetivo) {
        this.periodoLetivo = periodoLetivo;
    }

    public int getMaxEstudantes() {
        return maxEstudantes;
    }
    public void setMaxEstudantes(int maxEstudantes) {
        this.maxEstudantes = maxEstudantes;
    }
    public int getEstudantesMatriculados() {
        return estudantesMatriculados;
    }
    public void setEstudantesMatriculados(int estudantesMatriculados) {
        this.estudantesMatriculados = estudantesMatriculados;
    }
    public String getDocente() {
        return docente;
    }
    public void setDocente(String docente) {
        this.docente = docente;
    }
    public String getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String criarTurma(){
        return "Período Letivo: " + periodoLetivo + "\n" +
                "Máximo de Estudantes: " + maxEstudantes + "\n" +
                "Estudantes Matriculados: " + estudantesMatriculados +"\n" +
                "Docente: " + docente + "\n" +
                "Disciplina: " + disciplina + "\n";
    }
}
