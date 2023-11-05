import java.util.Arrays;

public class StudentList {

    private static Student[] students;

    public StudentList() {
        students = new Student[]{
            new Student("Іванов", "Іван", "Іванович", "07.07.2007",
                "вул. Українська 19", "0994555918", "Право", "1"),
            new Student("Петренко", "Павло", "Дмитрович", "30.04.2006",
                "вул. Мукачівська 5", "0956534916", "Право", "2"),
            new Student("Шевченко", "Марія", "Віталівна", "12.11.2006",
                "вул. Ракоці 81", "0956732334", "Право", "2"),
            new Student("Денисенко", "Віктор", "Петрович", "10.01.2005",
                "вул. Швабська 34", "0994745378", "Бухгалтерський облік", "3"),
            new Student("Капустяк", "Василь", "Вікторович", "23.12.2006",
                "вул. 8 Березня 98", "090781112", "Бухгалтерський облік", "2"),
            new Student("Денисенко", "Вікторія", "Петрівна", "15.08.2007",
                "вул. Швабська 34", "099871113", "Бухгалтерський облік", "1"),
            new Student("Петрусяк", "Юрій", "Володимирович", "06.09.2005",
                "вул. Незалежності 56", "0957327478", "Маркетинг", "3"),
            new Student("Костяк", "Юлія", "Сергіївна", "11.03.2006",
                "вул. 8 Березня 123", "0953587475", "Маркетинг", "2"),
            new Student("Коваленко", "Кирил", "Іванович", "17.02.2005",
                "вул. Свободи 32", "0997345931", "Маркетинг", "3"),
        };
    }

    public static void studentListFromFaculty(String faculty) {
        Arrays.stream(students)
            .filter(student -> student.getFaculty().equals(faculty))
            .forEach(student -> System.out.println(student.toString()));
    }

    public void studentListFromFacultyAndCourse(String faculty, String course) {
        if (course.equals("1") || course.equals("2") || course.equals("3")) {
            Arrays.stream(students)
                .filter(student -> student.getFaculty().equals(faculty))
                .filter(student -> student.getCourse().equals(course))
                .forEach(student -> System.out.println(student.toString()));
        } else {
            System.out.println("\u001B[31mТакого курсу не існує\u001B[0m");
        }
    }

    public void studentListOfSearchYear(String year) {
        Arrays.stream(students)
            .filter(student -> student.getDateOfBirth().endsWith(year))
            .forEach(student -> System.out.println(student.toString()));
    }
}
