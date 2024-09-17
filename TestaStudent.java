public class TestaStudent {
    public static void main(String[] args) {
        Student student = new Student("Matheus", "rua xzy", "Programa 1", 19, 0);
        System.out.println(student.getName());
        student.setAddress("Rua 2");
        System.out.println(student.getAddress());
        student.setProgram("Programa 2");;
        System.out.println(student.getProgram());
        student.setYear(20);
        System.out.println(student.getYear());
        student.setFee(2);
        System.out.println(student.getFee());
        System.out.println(student.toString());
    }
}
