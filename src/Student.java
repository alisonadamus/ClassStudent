public class Student {

    private String surname;
    private String name;
    private String middleName;
    private String dateOfBirth;
    private String address;
    private String phoneNumber;
    private String faculty;
    private String course;

    public Student(String surname, String name, String middleName, String dateOfBirth,
        String address, String phoneNumber, String faculty, String course) {
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return surname + " " + name + " " + middleName + ", " + "Дата нар.: " + dateOfBirth + ", "
            + "Адреса: " + address + ", " + "Номер тел.: " + phoneNumber + ", " + " Факультет: "
            + faculty + ", " + " Курс: " + course;
    }
}
