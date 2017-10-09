package defaut;

public class Etudiant {
    private String name;
    private long numeroEtudiant;

    public Etudiant(String name, int numeroEtudiant) {
        this.name = name;
        this.numeroEtudiant = numeroEtudiant;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "name='" + name + '\'' +
                ", numeroEtudiant=" + numeroEtudiant +
                '}';
    }
}
