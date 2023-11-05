import java.util.Scanner;

public class Interface {

    static Scanner scanner = new Scanner(System.in);
    static StudentList studentList = new StudentList();

    public static void menu() {
        mainMenu();
    }

    static void mainMenu() {
        System.out.println("Натисніть відповідну кнопку на клавіатурі щоб обрати");
        System.out.println("1.Список студентів навчального факультету");
        System.out.println("2.Список студентів для кожного факультету і курсу");
        System.out.println("3.Список студентів, що народилися після заданого року");
        System.out.println("0.Вихід.");
        switch (scanner.nextInt()) {
            case 1:
                facultyMenu();
            case 2:
                facultyAndCourseMenu();
                break;
            case 3:
                searchYearMenu();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("\u001B[31mНатисніть відповідну кнопку\u001B[0m");
                mainMenu();
        }
    }

    static void facultyMenu() {
        System.out.println("Виберіть факультет");
        System.out.println("1.Право");
        System.out.println("2.Бухгалтерський облік");
        System.out.println("3.Маркетинг");
        switch (scanner.nextInt()) {
            case 1:
                System.out.println("Студенти факультету: Право");
                studentList.studentListFromFaculty("Право");
                mainMenu();
                break;
            case 2:
                System.out.println("Студенти факультету: Бухгалтерський облік");
                studentList.studentListFromFaculty("Бухгалтерський облік");
                mainMenu();
                break;
            case 3:
                System.out.println("Студенти факультету: Маркетинг");
                studentList.studentListFromFaculty("Маркетинг");
                mainMenu();
                break;
            default:
                System.out.println("\u001B[31mНатисніть відповідну кнопку\u001B[0m");
                facultyMenu();
        }
    }

    static void facultyAndCourseMenu() {
        String course;

        System.out.println("Виберіть факультет");
        System.out.println("1.Право");
        System.out.println("2.Бухгалтерський облік");
        System.out.println("3.Маркетинг");
        switch (scanner.nextInt()) {
            case 1:
                System.out.println("Введіть номер курсу:");
                scanner.nextLine();
                course = scanner.nextLine();
                System.out.println("Студенти факультету: Право");
                studentList.studentListFromFacultyAndCourse("Право", course);
                mainMenu();
                break;
            case 2:
                System.out.println("Введіть номер курсу:");
                scanner.nextLine();
                course = scanner.nextLine();
                System.out.println("Студенти факультету: Бухгалтерський облік");
                studentList.studentListFromFacultyAndCourse("Бухгалтерський облік", course);
                mainMenu();
                break;
            case 3:
                System.out.println("Введіть номер курсу:");
                scanner.nextLine();
                course = scanner.nextLine();
                System.out.println("Студенти факультету: Маркетинг");
                studentList.studentListFromFacultyAndCourse("Маркетинг", course);
                mainMenu();
                break;
            default:
                System.out.println("\u001B[31mНатисніть відповідну кнопку\u001B[0m");
                facultyAndCourseMenu();
        }
    }

    static void searchYearMenu() {
        System.out.println("Введіть рік:");
        scanner.nextLine();
        studentList.studentListOfSearchYear(scanner.nextLine());
        mainMenu();
    }

}
