package clase;

public class Ciudad {
    int habitamtes;
    String ciudad;

    public Ciudad(int habitamtes) {
        this.habitamtes = habitamtes;
    }

    public int getHabitamtes() {
        return habitamtes;
    }

    public void setHabitamtes(int habitamtes) {
        this.habitamtes = habitamtes;
    }

    @Override
    public String toString() {
        return "Ciudad{" +
                "habitamtes=" + habitamtes +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }
}
