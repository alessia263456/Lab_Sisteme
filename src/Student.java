public class Student {
    Integer numarMatricol;
    String prenume, nume, formatieDeStudiu;
    Student(Integer numarMatricol, String prenume, String nume, String formatieDeStudiu)
    {
        this.numarMatricol=numarMatricol;
        this.prenume=prenume;
        this.nume=nume;
        this.formatieDeStudiu=formatieDeStudiu;
    }

    @Override
    public String toString() {
        return numarMatricol.toString()+" "+prenume+" "+nume+" "+formatieDeStudiu;
    }
}
