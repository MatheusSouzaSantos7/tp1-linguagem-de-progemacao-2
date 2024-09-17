public class TestaStaff {
    public static void main(String[] args) {
        Staff staff = new Staff("Leandro", "Rua zero", "Sem escola", 2);
        staff.setSchool("IFSP");
        System.out.println(staff.getSchool());
        staff.setPay(5);
        System.out.println(staff.getPay());
        System.out.println(staff.toString());
    }
}
